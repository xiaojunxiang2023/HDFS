package org.apache.hadoop.hdfs.server.federation.router;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.util.Time;
import org.eclipse.jetty.util.ajax.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// 连接管理器，管理着连接、用户、连接池
public class ConnectionManager {

  private static final Logger LOG = LoggerFactory.getLogger(ConnectionManager.class);

  private final Configuration conf;

  // 每个 user的限制
  private final int minSize = 1;
  private final int maxSize;
  private final float minActiveRatio;

  // 为特定用户关闭连接池的频率
  private final long poolCleanupPeriodMs;

  // 关闭连接的频率
  private final long connectionCleanupPeriodMs;

  // 每个用户都有一个连接池
  private final Map<ConnectionPoolId, ConnectionPool> pools;

  private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
  private final Lock readLock = readWriteLock.readLock();
  private final Lock writeLock = readWriteLock.writeLock();

  // Queue for 创建新连接 
  private final BlockingQueue<ConnectionPool> creatorQueue;
  private final int creatorQueueMaxSize;

  // 异步创建新连接，是自己的内部类 
  private final ConnectionCreator creator;

  // 清理异常的 连接池
  private final ScheduledThreadPoolExecutor cleaner =
      new ScheduledThreadPoolExecutor(1);

  private boolean running = false;


  /**
   * Creates a proxy client connection pool manager.
   *
   * @param config Configuration for the connections.
   */
  public ConnectionManager(Configuration config) {
    this.conf = config;

    // Configure minimum, maximum and active connection pools
    this.maxSize = this.conf.getInt(
        RBFConfigKeys.DFS_ROUTER_NAMENODE_CONNECTION_POOL_SIZE,
        RBFConfigKeys.DFS_ROUTER_NAMENODE_CONNECTION_POOL_SIZE_DEFAULT);
    this.minActiveRatio = this.conf.getFloat(
        RBFConfigKeys.DFS_ROUTER_NAMENODE_CONNECTION_MIN_ACTIVE_RATIO,
        RBFConfigKeys.DFS_ROUTER_NAMENODE_CONNECTION_MIN_ACTIVE_RATIO_DEFAULT);

    // Map with the connections indexed by UGI and Namenode
    this.pools = new HashMap<>();

    // Create connections in a thread asynchronously
    this.creatorQueueMaxSize = this.conf.getInt(
        RBFConfigKeys.DFS_ROUTER_NAMENODE_CONNECTION_CREATOR_QUEUE_SIZE,
        RBFConfigKeys.DFS_ROUTER_NAMENODE_CONNECTION_CREATOR_QUEUE_SIZE_DEFAULT
    );
    this.creatorQueue = new ArrayBlockingQueue<>(this.creatorQueueMaxSize);
    this.creator = new ConnectionCreator(this.creatorQueue);
    this.creator.setDaemon(true);

    // Cleanup periods
    this.poolCleanupPeriodMs = this.conf.getLong(
        RBFConfigKeys.DFS_ROUTER_NAMENODE_CONNECTION_POOL_CLEAN,
        RBFConfigKeys.DFS_ROUTER_NAMENODE_CONNECTION_POOL_CLEAN_DEFAULT);
    LOG.info("Cleaning connection pools every {} seconds",
        TimeUnit.MILLISECONDS.toSeconds(this.poolCleanupPeriodMs));
    this.connectionCleanupPeriodMs = this.conf.getLong(
        RBFConfigKeys.DFS_ROUTER_NAMENODE_CONNECTION_CLEAN_MS,
        RBFConfigKeys.DFS_ROUTER_NAMENODE_CONNECTION_CLEAN_MS_DEFAULT);
    LOG.info("Cleaning connections every {} seconds",
        TimeUnit.MILLISECONDS.toSeconds(this.connectionCleanupPeriodMs));
  }

  /**
   * Start the connection manager.
   */
  public void start() {
    // Start the thread that creates connections asynchronously
    this.creator.start();

    // Schedule a task to remove stale connection pools and sockets
    long recyleTimeMs = Math.min(
        poolCleanupPeriodMs, connectionCleanupPeriodMs);
    LOG.info("Cleaning every {} seconds",
        TimeUnit.MILLISECONDS.toSeconds(recyleTimeMs));
    this.cleaner.scheduleAtFixedRate(
        new CleanupTask(), 0, recyleTimeMs, TimeUnit.MILLISECONDS);

    // Mark the manager as running
    this.running = true;
  }

  /**
   * Stop the connection manager by closing all the pools.
   */
  public void close() {
    this.creator.shutdown();
    this.cleaner.shutdown();
    this.running = false;

    writeLock.lock();
    try {
      for (ConnectionPool pool : this.pools.values()) {
        pool.close();
      }
      this.pools.clear();
    } finally {
      writeLock.unlock();
    }
  }

  /**
   * Fetches the next available proxy client in the pool. Each client connection
   * is reserved for a single user and cannot be reused until free.
   *
   * @param ugi User group information.
   * @param nnAddress Namenode address for the connection.
   * @param protocol Protocol for the connection.
   * @return Proxy client to connect to nnId as UGI.
   * @throws IOException If the connection cannot be obtained.
   */
  public ConnectionContext getConnection(UserGroupInformation ugi,
                                         String nnAddress, Class<?> protocol) throws IOException {

    // Check if the manager is shutdown
    if (!this.running) {
      LOG.error(
          "Cannot get a connection to {} because the manager isn't running",
          nnAddress);
      return null;
    }

    // Try to get the pool if created
    ConnectionPoolId connectionId =
        new ConnectionPoolId(ugi, nnAddress, protocol);
    ConnectionPool pool = null;
    readLock.lock();
    try {
      pool = this.pools.get(connectionId);
    } finally {
      readLock.unlock();
    }

    // Create the pool if not created before
    if (pool == null) {
      writeLock.lock();
      try {
        pool = this.pools.get(connectionId);
        if (pool == null) {
          pool = new ConnectionPool(
              this.conf, nnAddress, ugi, this.minSize, this.maxSize,
              this.minActiveRatio, protocol);
          this.pools.put(connectionId, pool);
        }
      } finally {
        writeLock.unlock();
      }
    }

    ConnectionContext conn = pool.getConnection();

    // Add a new connection to the pool if it wasn't usable
    if (conn == null || !conn.isUsable()) {
      if (!this.creatorQueue.offer(pool)) {
        LOG.error("Cannot add more than {} connections at the same time",
            this.creatorQueueMaxSize);
      }
    }

    if (conn != null && conn.isClosed()) {
      LOG.error("We got a closed connection from {}", pool);
      conn = null;
    }

    return conn;
  }

  /**
   * Get the number of connection pools.
   *
   * @return Number of connection pools.
   */
  public int getNumConnectionPools() {
    readLock.lock();
    try {
      return pools.size();
    } finally {
      readLock.unlock();
    }
  }

  /**
   * Get number of open connections.
   *
   * @return Number of open connections.
   */
  public int getNumConnections() {
    int total = 0;
    readLock.lock();
    try {
      for (ConnectionPool pool : this.pools.values()) {
        total += pool.getNumConnections();
      }
    } finally {
      readLock.unlock();
    }
    return total;
  }

  /**
   * Get number of active connections.
   *
   * @return Number of active connections.
   */
  public int getNumActiveConnections() {
    int total = 0;
    readLock.lock();
    try {
      for (ConnectionPool pool : this.pools.values()) {
        total += pool.getNumActiveConnections();
      }
    } finally {
      readLock.unlock();
    }
    return total;
  }

  /**
   * Get the number of connections to be created.
   *
   * @return Number of connections to be created.
   */
  public int getNumCreatingConnections() {
    return this.creatorQueue.size();
  }

  /**
   * Get a JSON representation of the connection pool.
   *
   * @return JSON representation of all the connection pools.
   */
  public String getJSON() {
    final Map<String, String> info = new TreeMap<>();
    readLock.lock();
    try {
      for (Entry<ConnectionPoolId, ConnectionPool> entry :
          this.pools.entrySet()) {
        ConnectionPoolId connectionPoolId = entry.getKey();
        ConnectionPool pool = entry.getValue();
        info.put(connectionPoolId.toString(), pool.getJSON());
      }
    } finally {
      readLock.unlock();
    }
    return JSON.toString(info);
  }


  Map<ConnectionPoolId, ConnectionPool> getPools() {
    return this.pools;
  }

  /**
   * Clean the unused connections for this pool.
   *
   * @param pool Connection pool to cleanup.
   */

  void cleanup(ConnectionPool pool) {
    if (pool.getNumConnections() > pool.getMinSize()) {
      // Check if the pool hasn't been active in a while or not 50% are used
      long timeSinceLastActive = Time.now() - pool.getLastActiveTime();
      int total = pool.getNumConnections();
      int active = pool.getNumActiveConnections();
      float poolMinActiveRatio = pool.getMinActiveRatio();
      if (timeSinceLastActive > connectionCleanupPeriodMs ||
          active < poolMinActiveRatio * total) {
        // Remove and close 1 connection
        List<ConnectionContext> conns = pool.removeConnections(1);
        for (ConnectionContext conn : conns) {
          conn.close();
        }
        LOG.debug("Removed connection {} used {} seconds ago. " +
                "Pool has {}/{} connections", pool.getConnectionPoolId(),
            TimeUnit.MILLISECONDS.toSeconds(timeSinceLastActive),
            pool.getNumConnections(), pool.getMaxSize());
      }
    }
  }

  /**
   * Removes stale connections not accessed recently from the pool. This is
   * invoked periodically.
   */
  private class CleanupTask implements Runnable {

    @Override
    public void run() {
      long currentTime = Time.now();
      List<ConnectionPoolId> toRemove = new LinkedList<>();

      // Look for stale pools
      readLock.lock();
      try {
        for (Entry<ConnectionPoolId, ConnectionPool> entry : pools.entrySet()) {
          ConnectionPool pool = entry.getValue();
          long lastTimeActive = pool.getLastActiveTime();
          boolean isStale =
              currentTime > (lastTimeActive + poolCleanupPeriodMs);
          if (lastTimeActive > 0 && isStale) {
            // Remove this pool
            LOG.debug("Closing and removing stale pool {}", pool);
            pool.close();
            ConnectionPoolId poolId = entry.getKey();
            toRemove.add(poolId);
          } else {
            // Keep this pool but clean connections inside
            LOG.debug("Cleaning up {}", pool);
            cleanup(pool);
          }
        }
      } finally {
        readLock.unlock();
      }

      // Remove stale pools
      if (!toRemove.isEmpty()) {
        writeLock.lock();
        try {
          for (ConnectionPoolId poolId : toRemove) {
            pools.remove(poolId);
          }
        } finally {
          writeLock.unlock();
        }
      }
    }
  }

  /**
   * Thread that creates connections asynchronously.
   */
  static class ConnectionCreator extends Thread {
    /** If the creator is running. */
    private boolean running = true;
    /** Queue to push work to. */
    private BlockingQueue<ConnectionPool> queue;

    ConnectionCreator(BlockingQueue<ConnectionPool> blockingQueue) {
      super("Connection creator");
      this.queue = blockingQueue;
    }

    @Override
    public void run() {
      while (this.running) {
        try {
          ConnectionPool pool = this.queue.take();
          try {
            int total = pool.getNumConnections();
            int active = pool.getNumActiveConnections();
            float poolMinActiveRatio = pool.getMinActiveRatio();
            if (pool.getNumConnections() < pool.getMaxSize() &&
                active >= poolMinActiveRatio * total) {
              ConnectionContext conn = pool.newConnection();
              pool.addConnection(conn);
            } else {
              LOG.debug("Cannot add more than {} connections to {}",
                  pool.getMaxSize(), pool);
            }
          } catch (IOException e) {
            LOG.error("Cannot create a new connection", e);
          }
        } catch (InterruptedException e) {
          LOG.error("The connection creator was interrupted");
          this.running = false;
        } catch (Throwable e) {
          LOG.error("Fatal error caught by connection creator ", e);
        }
      }
    }

    /**
     * Stop this connection creator.
     */
    public void shutdown() {
      this.running = false;
      this.interrupt();
    }
  }
}
