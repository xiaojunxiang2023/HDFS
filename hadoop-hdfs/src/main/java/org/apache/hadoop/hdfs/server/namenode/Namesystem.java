package org.apache.hadoop.hdfs.server.namenode;

import org.apache.hadoop.hdfs.server.blockmanagement.BlockCollection;
import org.apache.hadoop.hdfs.server.namenode.ha.HAContext;
import org.apache.hadoop.hdfs.util.RwLock;

import java.io.IOException;

/** Namesystem operations. */
public interface Namesystem extends RwLock, SafeMode {
  /** Is this name system running? */
  boolean isRunning();

  BlockCollection getBlockCollection(long id);

  FSDirectory getFSDirectory();

  void startSecretManagerIfNecessary();

  boolean isInSnapshot(long blockCollectionID);

  CacheManager getCacheManager();

  HAContext getHAContext();

  /**
   * @return Whether the namenode is transitioning to active state and is in the
   *         middle of the starting active services.
   */
  boolean inTransitionToActive();

  /**
   * Remove xAttr from the inode.
   * @param id
   * @param xattrName
   * @throws IOException
   */
  void removeXattr(long id, String xattrName) throws IOException;
}
