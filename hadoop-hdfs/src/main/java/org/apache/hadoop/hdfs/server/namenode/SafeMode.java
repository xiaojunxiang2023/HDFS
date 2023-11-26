package org.apache.hadoop.hdfs.server.namenode;

/** SafeMode related operations. */
public interface SafeMode {
  /** Is the system in safe mode? */
  public boolean isInSafeMode();

  /**
   * Is the system in startup safe mode, i.e. the system is starting up with
   * safe mode turned on automatically?
   */
  public boolean isInStartupSafeMode();
}
