package org.apache.hadoop.hdfs.server.datanode;

/**
 * Used for injecting call backs in {@link VolumeScanner}
 * and {@link BlockScanner} tests.
 * Calls into this are a no-op in production code.
 */

public class VolumeScannerCBInjector {
  private static VolumeScannerCBInjector instance =
      new VolumeScannerCBInjector();

  public static VolumeScannerCBInjector get() {
    return instance;
  }

  public static void set(VolumeScannerCBInjector injector) {
    instance = injector;
  }

  public void preSavingBlockIteratorTask(final VolumeScanner volumeScanner) {
  }

  public void shutdownCallBack(final VolumeScanner volumeScanner) {
  }

  public void terminationCallBack(final VolumeScanner volumeScanner) {
  }
}
