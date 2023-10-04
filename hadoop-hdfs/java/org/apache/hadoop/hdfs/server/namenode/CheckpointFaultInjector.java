package org.apache.hadoop.hdfs.server.namenode;

import java.io.File;
import java.io.IOException;

/**
 * Utility class to faciliate some fault injection tests for the checkpointing
 * process.
 */
public class CheckpointFaultInjector {
  public static CheckpointFaultInjector instance =
      new CheckpointFaultInjector();

  public static CheckpointFaultInjector getInstance() {
    return instance;
  }

  public static void set(CheckpointFaultInjector instance) {
    CheckpointFaultInjector.instance = instance;
  }
  public void beforeGetImageSetsHeaders() throws IOException {}
  public void afterSecondaryCallsRollEditLog() throws IOException {}
  public void duringMerge() throws IOException {}
  public void afterSecondaryUploadsNewImage() throws IOException {}
  public void aboutToSendFile(File localfile) throws IOException {}

  public boolean shouldSendShortFile(File localfile) {
    return false;
  }
  public boolean shouldCorruptAByte(File localfile) {
    return false;
  }
  
  public void afterMD5Rename() throws IOException {}
  public void beforeEditsRename() throws IOException {}

  public void duringUploadInProgess() throws InterruptedException, IOException {
  }

}
