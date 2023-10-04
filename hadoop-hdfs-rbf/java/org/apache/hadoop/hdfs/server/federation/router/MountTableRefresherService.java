package org.apache.hadoop.hdfs.server.federation.router;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.server.federation.store.MountTableStore;
import org.apache.hadoop.hdfs.server.federation.store.RouterStore;
import org.apache.hadoop.hdfs.server.federation.store.StateStoreUnavailableException;
import org.apache.hadoop.hdfs.server.federation.store.StateStoreUtils;
import org.apache.hadoop.hdfs.server.federation.store.records.RouterState;
import org.apache.hadoop.net.NetUtils;
import org.apache.hadoop.security.SecurityUtil;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.service.AbstractService;
import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;
import org.apache.hadoop.thirdparty.com.google.common.cache.*;
import org.apache.hadoop.thirdparty.com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

// 当 MountTableStore的挂载表节点发生变化时，便会调用这个类进行刷新缓存，
// 如果是在本地就直接调用 loadCache，反之则 RPC调用 involved

// 为了提升性能，每个 refreshed都分配了一个线程（MountTableRefresherThread），并且所有的连接（RouterClient）都被缓存了
public class MountTableRefresherService extends AbstractService {
  private static final String ROUTER_CONNECT_ERROR_MSG =
      "Router {} connection failed. Mount table cache will not refresh.";
  private static final Logger LOG = LoggerFactory.getLogger(MountTableRefresherService.class);

  // 本地的 router
  private final Router router;
  private MountTableStore mountTableStore;
  private String localAdminAddress;
  private long cacheUpdateTimeout;

  // 缓存：host:port -> RouterClient
  private LoadingCache<String, RouterClient> routerClientsCache;

  private ScheduledExecutorService clientCacheCleanerScheduler;

  public MountTableRefresherService(Router router) {
    super(MountTableRefresherService.class.getSimpleName());
    this.router = router;
  }

  @Override
  protected void serviceInit(Configuration conf) throws Exception {
    super.serviceInit(conf);
    this.mountTableStore = getMountTableStore();
    this.mountTableStore.setRefreshService(this);
    this.localAdminAddress = StateStoreUtils.getHostPortString(router.getAdminServerAddress());
    this.cacheUpdateTimeout = conf.getTimeDuration(
        RBFConfigKeys.MOUNT_TABLE_CACHE_UPDATE_TIMEOUT,
        RBFConfigKeys.MOUNT_TABLE_CACHE_UPDATE_TIMEOUT_DEFAULT,
        TimeUnit.MILLISECONDS);
    long routerClientMaxLiveTime = conf.getTimeDuration(
        RBFConfigKeys.MOUNT_TABLE_CACHE_UPDATE_CLIENT_MAX_TIME,
        RBFConfigKeys.MOUNT_TABLE_CACHE_UPDATE_CLIENT_MAX_TIME_DEFAULT,
        TimeUnit.MILLISECONDS);
    routerClientsCache = CacheBuilder.newBuilder()
        .expireAfterWrite(routerClientMaxLiveTime, TimeUnit.MILLISECONDS)
        .removalListener(getClientRemover()).build(getClientCreator());

    initClientCacheCleaner(routerClientMaxLiveTime);
  }

  private void initClientCacheCleaner(long routerClientMaxLiveTime) {
    clientCacheCleanerScheduler =
        Executors.newSingleThreadScheduledExecutor(new ThreadFactoryBuilder()
        .setNameFormat("MountTableRefresh_ClientsCacheCleaner")
        .setDaemon(true).build());

    clientCacheCleanerScheduler.scheduleWithFixedDelay(
        () -> routerClientsCache.cleanUp(), routerClientMaxLiveTime,
        routerClientMaxLiveTime, TimeUnit.MILLISECONDS);
  }

  // 创建一个 Remove Listener
  private RemovalListener<String, RouterClient> getClientRemover() {
    return new RemovalListener<String, RouterClient>() {
      @Override
      public void onRemoval(RemovalNotification<String, RouterClient> notification) {
          closeRouterClient(notification.getValue());
      }
    };
  }

  @VisibleForTesting
  protected void closeRouterClient(RouterClient client) {
    try {
      client.close();
    } catch (IOException e) {
      LOG.error("Error while closing RouterClient", e);
    }
  }

  // 创建一个 RouterClient并且缓存起来
  private CacheLoader<String, RouterClient> getClientCreator() {
    return new CacheLoader<String, RouterClient>() {
      public RouterClient load(String adminAddress) throws IOException {
        InetSocketAddress routerSocket = NetUtils.createSocketAddr(adminAddress);
        Configuration config = getConfig();
        return createRouterClient(routerSocket, config);
      }
    };
  }

  @VisibleForTesting
  protected RouterClient createRouterClient(InetSocketAddress routerSocket,
      Configuration config) throws IOException {
    return SecurityUtil.doAsLoginUser(() -> {
      if (UserGroupInformation.isSecurityEnabled()) {
        UserGroupInformation.getLoginUser().checkTGTAndReloginFromKeytab();
      }
      return new RouterClient(routerSocket, config);
    });
  }

  @Override
  protected void serviceStart() throws Exception {
    super.serviceStart();
  }

  @Override
  protected void serviceStop() throws Exception {
    super.serviceStop();
    clientCacheCleanerScheduler.shutdown();
    // remove and close all admin clients
    routerClientsCache.invalidateAll();
  }

  private MountTableStore getMountTableStore() throws IOException {
    MountTableStore mountTblStore = router.getStateStore().getRegisteredRecordStore(MountTableStore.class);
    if (mountTblStore == null) {
      throw new IOException("Mount table state store is not available.");
    }
    return mountTblStore;
  }

  public void refresh() throws StateStoreUnavailableException {
    RouterStore routerStore = router.getRouterStateManager();

    try {
      routerStore.loadCache(true);
    } catch (IOException e) {
      LOG.warn("RouterStore load cache failed,", e);
    }

    List<RouterState> cachedRecords = routerStore.getCachedRecords();
    List<MountTableRefresherThread> refreshThreads = new ArrayList<>();
    for (RouterState routerState : cachedRecords) {
      // adminAddress相当于 router的地址
      String adminAddress = routerState.getAdminAddress();
      if (adminAddress == null || adminAddress.length() == 0) {
        continue;
      }
      
      if (routerState.getStatus() != RouterServiceState.RUNNING) {
        LOG.info("Router {} is not running. Mount table cache will not refresh.", routerState.getAddress());
        // remove if RouterClient is cached.
        removeFromCache(adminAddress);
      } else if (isLocalAdmin(adminAddress)) {
        // local的，不需要 RPC调用，不需要 RouterClient
        refreshThreads.add(getLocalRefresher(adminAddress));
      } else {
        try {
          RouterClient client = routerClientsCache.get(adminAddress);
          refreshThreads.add(new MountTableRefresherThread(client.getMountTableManager(), adminAddress));
        } catch (ExecutionException execExcep) {
          LOG.warn(ROUTER_CONNECT_ERROR_MSG, adminAddress, execExcep);
        }
      }
    }
    if (!refreshThreads.isEmpty()) {
      invokeRefresh(refreshThreads);
    }
  }

  // 获得一个本地的 MountTableRefresherThread
  @VisibleForTesting
  protected MountTableRefresherThread getLocalRefresher(String adminAddress) {
    return new MountTableRefresherThread(router.getAdminServer(), adminAddress);
  }

  private void removeFromCache(String adminAddress) {
    routerClientsCache.invalidate(adminAddress);
  }

  private void invokeRefresh(List<MountTableRefresherThread> refreshThreads) {
    CountDownLatch countDownLatch = new CountDownLatch(refreshThreads.size());
    for (MountTableRefresherThread refThread : refreshThreads) {
      refThread.setCountDownLatch(countDownLatch);
      refThread.start();
    }
    try {
      boolean allReqCompleted = countDownLatch.await(cacheUpdateTimeout, TimeUnit.MILLISECONDS);
      if (!allReqCompleted) {
        LOG.warn("Not all router admins updated their cache");
      }
    } catch (InterruptedException e) {
      LOG.error("Mount table cache refresher was interrupted.", e);
    }
    logResult(refreshThreads);
  }

  private boolean isLocalAdmin(String adminAddress) {
    return adminAddress.contentEquals(localAdminAddress);
  }

  private void logResult(List<MountTableRefresherThread> refreshThreads) {
    int successCount = 0;
    int failureCount = 0;
    for (MountTableRefresherThread mountTableRefreshThread : refreshThreads) {
      if (mountTableRefreshThread.isSuccess()) {
        successCount++;
      } else {
        failureCount++;
        // 失败了就移除 RouterClient
        removeFromCache(mountTableRefreshThread.getAdminAddress());
      }
    }
    LOG.info("Mount table entries cache refresh successCount={},failureCount={}", successCount, failureCount);
  }
}
