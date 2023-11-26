package org.apache.hadoop.util;

import org.apache.hadoop.util.DiskChecker.DiskErrorException;

import java.io.File;

/**
 * BasicDiskValidator is a wrapper around {@link DiskChecker}.
 */
public class BasicDiskValidator implements DiskValidator {
  public static final String NAME = "basic";

  @Override
  public void checkStatus(File dir) throws DiskErrorException {
    DiskChecker.checkDir(dir);
  }
}
