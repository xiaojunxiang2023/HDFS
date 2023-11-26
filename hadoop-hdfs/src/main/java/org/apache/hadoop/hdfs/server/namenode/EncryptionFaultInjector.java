package org.apache.hadoop.hdfs.server.namenode;

import java.io.IOException;

import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;

/**
 * Used to inject certain faults for testing.
 */
public class EncryptionFaultInjector {
  @VisibleForTesting
  public static EncryptionFaultInjector instance =
      new EncryptionFaultInjector();

  @VisibleForTesting
  public static EncryptionFaultInjector getInstance() {
    return instance;
  }

  @VisibleForTesting
  public void startFileNoKey() throws IOException {}

  @VisibleForTesting
  public void startFileBeforeGenerateKey() throws IOException {}

  @VisibleForTesting
  public void startFileAfterGenerateKey() throws IOException {}

  @VisibleForTesting
  public void reencryptEncryptedKeys() throws IOException {}

  @VisibleForTesting
  public void reencryptUpdaterProcessOneTask() throws IOException {}

  @VisibleForTesting
  public void reencryptUpdaterProcessCheckpoint() throws IOException {}

  @VisibleForTesting
  public void ensureKeyIsInitialized() throws IOException {}
}
