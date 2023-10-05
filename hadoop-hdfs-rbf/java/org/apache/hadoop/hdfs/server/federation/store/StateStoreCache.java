package org.apache.hadoop.hdfs.server.federation.store;

import java.io.IOException;

public interface StateStoreCache {

    /**
     * 从 State Store 中加载缓存. 被 StateStoreCacheUpdateService所调用
     *
     * 传参：是否强制加载
     * 返回值：是否成功
     */
    boolean loadCache(boolean force) throws IOException;
}
