package org.apache.hadoop.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A helper to load the native hadoop code i.e. libhadoop.so.
 * This handles the fallback to either the bundled libhadoop-Linux-i386-32.so
 * or the default java implementations where appropriate.
 *
 */
public final class NativeCodeLoader {

  private static final Logger LOG =
      LoggerFactory.getLogger(NativeCodeLoader.class);

  private static boolean nativeCodeLoaded = false;

  static {
    // Try to load native hadoop library and set fallback flag appropriately
    if (LOG.isDebugEnabled()) {
      LOG.debug("Trying to load the custom-built native-hadoop library...");
    }
    try {
      System.loadLibrary("hadoop");
      LOG.debug("Loaded the native-hadoop library");
      nativeCodeLoaded = true;
    } catch (Throwable t) {
      // Ignore failure to load
      if (LOG.isDebugEnabled()) {
        LOG.debug("Failed to load native-hadoop with error: " + t);
        LOG.debug("java.library.path=" +
            System.getProperty("java.library.path"));
      }
    }

    if (!nativeCodeLoaded) {
      LOG.warn("Unable to load native-hadoop library for your platform... " +
          "using builtin-java classes where applicable");
    }
  }

  private NativeCodeLoader() {
  }

  /**
   * Check if native-hadoop code is loaded for this platform.
   *
   * @return <code>true</code> if native-hadoop is loaded, 
   *         else <code>false</code>
   */
  public static boolean isNativeCodeLoaded() {
    return nativeCodeLoaded;
  }

  /**
   * Returns true only if this build was compiled with support for ISA-L.
   */
  public static native boolean buildSupportsIsal();

  /**
   * Returns true only if this build was compiled with support for ZStandard.
   */
  public static native boolean buildSupportsZstd();

  /**
   * Returns true only if this build was compiled with support for openssl.
   */
  public static native boolean buildSupportsOpenssl();

  public static native String getLibraryName();

}
