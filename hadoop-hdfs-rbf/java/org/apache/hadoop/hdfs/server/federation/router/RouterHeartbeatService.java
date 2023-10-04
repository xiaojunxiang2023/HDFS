package org.apache.hadoop.hdfs.server.federation.router;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.server.federation.store.*;
import org.apache.hadoop.hdfs.server.federation.store.protocol.RouterHeartbeatRequest;
import org.apache.hadoop.hdfs.server.federation.store.protocol.RouterHeartbeatResponse;
import org.apache.hadoop.hdfs.server.federation.store.records.BaseRecord;
import org.apache.hadoop.hdfs.server.federation.store.records.RouterState;
import org.apache.hadoop.hdfs.server.federation.store.records.StateStoreVersion;
import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Service to periodically update the Router current state in the State Store.
 */
public class RouterHeartbeatService extends PeriodicService {

  private static final Logger LOG =
      LoggerFactory.getLogger(RouterHeartbeatService.class);

  /** Router we are hearbeating. */
  private final Router router;

  /**
   * Create a new Router heartbeat service.
   *
   * @param router Router to heartbeat.
   */
  public RouterHeartbeatService(Router router) {
    super(RouterHeartbeatService.class.getSimpleName());
    this.router = router;
  }

  /**
   * Trigger the update of the Router state asynchronously.
   */
  protected void updateStateAsync() {
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        updateStateStore();
      }
    }, "Router Heartbeat Async");
    thread.setDaemon(true);
    thread.start();
  }

  /**
   * Update the state of the Router in the State Store.
   */
  @VisibleForTesting
  synchronized void updateStateStore() {
    String routerId = router.getRouterId();
    if (routerId == null) {
      LOG.error("Cannot heartbeat for router: unknown router id");
      return;
    }
    if (isStoreAvailable()) {
      RouterStore routerStore = router.getRouterStateManager();
      try {
        RouterState record = RouterState.newInstance(
            routerId, router.getStartTime(), router.getRouterState());
        StateStoreVersion stateStoreVersion = StateStoreVersion.newInstance(
            getStateStoreVersion(MembershipStore.class),
            getStateStoreVersion(MountTableStore.class));
        record.setStateStoreVersion(stateStoreVersion);
        // if admin server not started then hostPort will be empty
        String hostPort =
            StateStoreUtils.getHostPortString(router.getAdminServerAddress());
        record.setAdminAddress(hostPort);
        RouterHeartbeatRequest request =
            RouterHeartbeatRequest.newInstance(record);
        RouterHeartbeatResponse response = routerStore.routerHeartbeat(request);
        if (!response.getStatus()) {
          LOG.warn("Cannot heartbeat router {}", routerId);
        } else {
          LOG.debug("Router heartbeat for router {}", routerId);
        }
      } catch (IOException e) {
        LOG.error("Cannot heartbeat router {}", routerId, e);
      }
    } else {
      LOG.warn("Cannot heartbeat router {}: State Store unavailable", routerId);
    }
  }

  /**
   * Get the version of the data in the State Store.
   *
   * @param clazz Class in the State Store.
   * @return Version of the data.
   */
  private <R extends BaseRecord, S extends RecordStore<R>>
      long getStateStoreVersion(final Class<S> clazz) {
    long version = -1;
    try {
      StateStoreService stateStore = router.getStateStore();
      S recordStore = stateStore.getRegisteredRecordStore(clazz);
      if (recordStore != null) {
        if (recordStore instanceof CachedRecordStore) {
          CachedRecordStore<R> cachedRecordStore =
              (CachedRecordStore<R>) recordStore;
          List<R> records = cachedRecordStore.getCachedRecords();
          for (BaseRecord record : records) {
            if (record.getDateModified() > version) {
              version = record.getDateModified();
            }
          }
        }
      }
    } catch (Exception e) {
      LOG.error("Cannot get version for {}", clazz, e);
    }
    return version;
  }

  @Override
  protected void serviceInit(Configuration conf) throws Exception {

    long interval = conf.getTimeDuration(
        RBFConfigKeys.DFS_ROUTER_HEARTBEAT_STATE_INTERVAL_MS,
        RBFConfigKeys.DFS_ROUTER_HEARTBEAT_STATE_INTERVAL_MS_DEFAULT,
        TimeUnit.MILLISECONDS);
    this.setIntervalMs(interval);

    super.serviceInit(conf);
  }

  @Override
  public void periodicInvoke() {
    updateStateStore();
  }

  private boolean isStoreAvailable() {
    if (router.getRouterStateManager() == null) {
      return false;
    }
    if (router.getStateStore() == null) {
      return false;
    }
    return router.getStateStore().isDriverReady();
  }
}
