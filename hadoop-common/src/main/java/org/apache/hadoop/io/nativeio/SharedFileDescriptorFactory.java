package org.apache.hadoop.io.nativeio;

import org.apache.commons.lang3.SystemUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * A factory for creating shared file descriptors inside a given directory.
 * Typically, the directory will be /dev/shm or /tmp.
 *
 * We will hand out file descriptors that correspond to unlinked files residing
 * in that directory.  These file descriptors are suitable for sharing across
 * multiple processes and are both readable and writable.
 *
 * Because we unlink the temporary files right after creating them, a JVM crash
 * usually does not leave behind any temporary files in the directory.  However,
 * it may happen that we crash right after creating the file and before
 * unlinking it.  In the constructor, we attempt to clean up after any such
 * remnants by trying to unlink any temporary files created by previous
 * SharedFileDescriptorFactory instances that also used our prefix.
 */
public class SharedFileDescriptorFactory {
  public static final Logger LOG =
      LoggerFactory.getLogger(SharedFileDescriptorFactory.class);
  private final String prefix;
  private final String path;

  public static String getLoadingFailureReason() {
    if (!NativeIO.isAvailable()) {
      return "NativeIO is not available.";
    }
    if (!SystemUtils.IS_OS_UNIX) {
      return "The OS is not UNIX.";
    }
    return null;
  }

  /**
   * Create a new SharedFileDescriptorFactory.
   *
   * @param prefix       The prefix to prepend to all the file names created
   *                       by this factory.
   * @param paths        An array of paths to use.  We will try each path in 
   *                       succession, and return a factory using the first 
   *                       usable path.
   * @return The factory.
   * @throws IOException If a factory could not be created for any reason.
   */
  public static SharedFileDescriptorFactory create(String prefix,
                                                   String paths[]) throws IOException {
    String loadingFailureReason = getLoadingFailureReason();
    if (loadingFailureReason != null) {
      throw new IOException(loadingFailureReason);
    }
    if (paths.length == 0) {
      throw new IOException("no SharedFileDescriptorFactory paths were " +
          "configured.");
    }
    StringBuilder errors = new StringBuilder();
    String strPrefix = "";
    for (String path : paths) {
      try {
        FileInputStream fis =
            new FileInputStream(createDescriptor0(prefix + "test", path, 1));
        fis.close();
        deleteStaleTemporaryFiles0(prefix, path);
        return new SharedFileDescriptorFactory(prefix, path);
      } catch (IOException e) {
        errors.append(strPrefix).append("Error creating file descriptor in ").
            append(path).append(": ").append(e.getMessage());
        strPrefix = ", ";
      }
    }
    throw new IOException(errors.toString());
  }

  /**
   * Create a SharedFileDescriptorFactory.
   *
   * @param prefix    Prefix to add to all file names we use.
   * @param path      Path to use.
   */
  private SharedFileDescriptorFactory(String prefix, String path) {
    this.prefix = prefix;
    this.path = path;
  }

  public String getPath() {
    return path;
  }

  /**
   * Create a shared file descriptor which will be both readable and writable.
   *
   * @param info           Information to include in the path of the 
   *                         generated descriptor.
   * @param length         The starting file length.
   *
   * @return The file descriptor, wrapped in a FileInputStream.
   * @throws IOException   If there was an I/O or configuration error creating
   *                         the descriptor.
   */
  public FileInputStream createDescriptor(String info, int length)
      throws IOException {
    return new FileInputStream(
        createDescriptor0(prefix + info, path, length));
  }

  /**
   * Delete temporary files in the directory, NOT following symlinks.
   */
  private static native void deleteStaleTemporaryFiles0(String prefix,
                                                        String path) throws IOException;

  /**
   * Create a file with O_EXCL, and then resize it to the desired size.
   */
  private static native FileDescriptor createDescriptor0(String prefix,
                                                         String path, int length) throws IOException;
}
