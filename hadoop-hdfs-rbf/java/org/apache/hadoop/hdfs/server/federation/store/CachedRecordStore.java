package org.apache.hadoop.hdfs.server.federation.store;

import org.apache.hadoop.hdfs.server.federation.metrics.StateStoreMetrics;
import org.apache.hadoop.hdfs.server.federation.store.driver.StateStoreDriver;
import org.apache.hadoop.hdfs.server.federation.store.records.BaseRecord;
import org.apache.hadoop.hdfs.server.federation.store.records.QueryResult;
import org.apache.hadoop.util.Time;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 将数据缓存在内存中
 */
public abstract class CachedRecordStore<R extends BaseRecord>
        extends RecordStore<R> implements StateStoreCache {

    private static final Logger LOG =
            LoggerFactory.getLogger(CachedRecordStore.class);


    // 不是强制刷新时，自动刷新缓存 的最小时间间隔
    private static final long MIN_UPDATE_MS = 500;

    // 缓存中 保存的数据
    private List<R> records = new ArrayList<>();

    private long timestamp = -1;

    // 缓存是否初始化
    private boolean initialized = false;

    // 上一次被更新的时间戳
    private long lastUpdate = -1;

    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final Lock readLock = readWriteLock.readLock();
    private final Lock writeLock = readWriteLock.writeLock();

    // 加载缓存时 是否覆盖过期的值
    private boolean override = false;


    protected CachedRecordStore(Class<R> clazz, StateStoreDriver driver) {
        this(clazz, driver, false);
    }

    protected CachedRecordStore(
            Class<R> clazz, StateStoreDriver driver, boolean over) {
        super(clazz, driver);

        this.override = over;
    }

    // 检查缓存是否已经初始化
    private void checkCacheAvailable() throws StateStoreUnavailableException {
        if (!this.initialized) {
            throw new StateStoreUnavailableException(
                    "Cached State Store not initialized, " +
                            getRecordClass().getSimpleName() + " records not valid");
        }
    }

    @Override
    public boolean loadCache(boolean force) throws IOException {
        if (force || isUpdateTime()) {
            List<R> newRecords = null;
            long t = -1;
            try {
                // 从 StateStoreDriver中获取数据
                QueryResult<R> result = getDriver().get(getRecordClass());
                newRecords = result.getRecords();
                t = result.getTimestamp();

                // If we have any expired record, update the State Store
                if (this.override) {
                    overrideExpiredRecords(result);
                }
            } catch (IOException e) {
                LOG.error("Cannot get \"{}\" records from the State Store",
                        getRecordClass().getSimpleName());
                this.initialized = false;
                return false;
            }

            // Update cache atomically
            writeLock.lock();
            try {
                this.records.clear();
                this.records.addAll(newRecords);
                this.timestamp = t;
                this.initialized = true;
            } finally {
                writeLock.unlock();
            }

            // 更新指标：records.size()
            StateStoreMetrics metrics = getDriver().getMetrics();
            if (metrics != null) {
                String recordName = getRecordClass().getSimpleName();
                metrics.setCacheSize(recordName, this.records.size());
            }

            lastUpdate = Time.monotonicNow();
        }
        return true;
    }

    // 是否到了 可以更新缓存的时候了
    private boolean isUpdateTime() {
        return Time.monotonicNow() - lastUpdate > MIN_UPDATE_MS;
    }

    /**
     * 过期数据：
     *  更新 StateSore中的数据
     *  删除 StateSore和缓存中的数据
     */
    public void overrideExpiredRecords(QueryResult<R> query) throws IOException {
        // 待更新的数据，更新 StateSore中的这些数据
        // ?【从 StateStore 中取得数据又进行更新到 StateStore？且为什么不更新缓存中的这些数据？判断过期后更新是什么意思，跟谁比较看出更新了？】
        List<R> commitRecords = new ArrayList<>();
        // 待删除的数据，StateSore 和 缓存中 都进行删除
        List<R> deleteRecords = new ArrayList<>();
        List<R> newRecords = query.getRecords();
        long currentDriverTime = query.getTimestamp();
        if (newRecords == null || currentDriverTime <= 0) {
            LOG.error("Cannot check overrides for record");
            return;
        }

        for (R record : newRecords) {
            if (record.shouldBeDeleted(currentDriverTime)) {
                String recordName = StateStoreUtils.getRecordName(record.getClass());
                if (getDriver().remove(record)) {
                    deleteRecords.add(record);
                    LOG.info("Deleted State Store record {}: {}", recordName, record);
                } else {
                    LOG.warn("Couldn't delete State Store record {}: {}", recordName, record);
                }
            } else if (record.checkExpired(currentDriverTime)) {
                String recordName = StateStoreUtils.getRecordName(record.getClass());
                LOG.info("Override State Store record {}: {}", recordName, record);
                commitRecords.add(record);
            }
        }
        if (commitRecords.size() > 0) {
            getDriver().putAll(commitRecords, true, false);
        }
        if (deleteRecords.size() > 0) {
            newRecords.removeAll(deleteRecords);
        }
    }

    // 更新缓存中某个 record的值
    public void overrideExpiredRecord(R record) throws IOException {
        List<R> newRecords = new ArrayList<>();
        newRecords.add(record);
        long time = getDriver().getTime();
        QueryResult<R> query = new QueryResult<>(newRecords, time);
        overrideExpiredRecords(query);
    }

    // 获取缓存中 所有的数据（拷贝的副本）
    public List<R> getCachedRecords() throws StateStoreUnavailableException {
        checkCacheAvailable();
        List<R> ret = new LinkedList<R>();
        this.readLock.lock();
        try {
            ret.addAll(this.records);
        } finally {
            this.readLock.unlock();
        }
        return ret;
    }

    // 获取缓存中 所有的数据 以及对应的时间戳（拷贝的副本）
    protected QueryResult<R> getCachedRecordsAndTimeStamp()
            throws StateStoreUnavailableException {
        checkCacheAvailable();

        this.readLock.lock();
        try {
            return new QueryResult<R>(this.records, this.timestamp);
        } finally {
            this.readLock.unlock();
        }
    }
}
