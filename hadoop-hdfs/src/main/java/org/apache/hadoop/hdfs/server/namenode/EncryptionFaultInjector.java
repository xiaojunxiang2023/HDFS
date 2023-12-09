package org.apache.hadoop.hdfs.server.namenode;

import java.io.IOException;

/**
 * Used to inject certain faults for testing.
 */
public class EncryptionFaultInjector {

  public static EncryptionFaultInjector instance =
      new EncryptionFaultInjector();


  public static EncryptionFaultInjector getInstance() {
    return instance;
  }


  public void startFileNoKey() throws IOException {
  }


  public void startFileBeforeGenerateKey() throws IOException {
  }


  public void startFileAfterGenerateKey() throws IOException {
  }


  public void reencryptEncryptedKeys() throws IOException {
  }


  public void reencryptUpdaterProcessOneTask() throws IOException {
  }


  public void reencryptUpdaterProcessCheckpoint() throws IOException {
  }


  public void ensureKeyIsInitialized() throws IOException {
  }
}
