package org.apache.hadoop.util;

import org.apache.hadoop.util.DiskChecker.DiskErrorException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * ReadWriteDiskValidator is the class to check a directory by to create a file,
 * write some bytes into it, read back, and verify if they are identical.
 * Read time and write time are recorded and put into an
 * {@link ReadWriteDiskValidatorMetrics}.
 */
public class ReadWriteDiskValidator implements DiskValidator {

  public static final String NAME = "read-write";
  private static final Random RANDOM = new Random();

  @Override
  public void checkStatus(File dir) throws DiskErrorException {
    ReadWriteDiskValidatorMetrics metric =
        ReadWriteDiskValidatorMetrics.getMetric(dir.toString());
    Path tmpFile = null;
    try {
      if (!dir.isDirectory()) {
        metric.diskCheckFailed();
        throw new DiskErrorException(dir + " is not a directory!");
      }

      // check the directory presence and permission.
      DiskChecker.checkDir(dir);

      // create a tmp file under the dir
      tmpFile = Files.createTempFile(dir.toPath(), "test", "tmp");

      // write 16 bytes into the tmp file
      byte[] inputBytes = new byte[16];
      RANDOM.nextBytes(inputBytes);
      long startTime = System.nanoTime();
      Files.write(tmpFile, inputBytes);
      long writeLatency = TimeUnit.MICROSECONDS.convert(
          System.nanoTime() - startTime, TimeUnit.NANOSECONDS);
      metric.addWriteFileLatency(writeLatency);

      // read back
      startTime = System.nanoTime();
      byte[] outputBytes = Files.readAllBytes(tmpFile);
      long readLatency = TimeUnit.MICROSECONDS.convert(
          System.nanoTime() - startTime, TimeUnit.NANOSECONDS);
      metric.addReadFileLatency(readLatency);

      // validation
      if (!Arrays.equals(inputBytes, outputBytes)) {
        metric.diskCheckFailed();
        throw new DiskErrorException("Data in file has been corrupted.");
      }
    } catch (IOException e) {
      metric.diskCheckFailed();
      throw new DiskErrorException("Disk Check failed!", e);
    } finally {
      // delete the file
      if (tmpFile != null) {
        try {
          Files.delete(tmpFile);
        } catch (IOException e) {
          metric.diskCheckFailed();
          throw new DiskErrorException("File deletion failed!", e);
        }
      }
    }
  }
}
