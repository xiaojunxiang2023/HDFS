package org.apache.hadoop.fs;

import java.io.File;
import org.apache.hadoop.util.Shell;

public class DUHelper {

  private int fileCount=0;
  private double usage = 0;
  private long folderSize = -1;

  private DUHelper() {

  }

  public static long getFolderUsage(String folder) {
    return new DUHelper().calculateFolderSize(folder);
  }

  private long calculateFolderSize(String folder) {
    if (folder == null)
      throw new IllegalArgumentException("folder");
    File f = new File(folder);
    return folderSize = getFileSize(f);
  }

  public long getFileCount() {
    return fileCount;
  }

  public double getUsage() {
    return usage;
  }

  private long getFileSize(File folder) {

    //Counting the total folders
    long foldersize = 0;
    if (folder.isFile())
      return folder.length();
    File[] filelist = folder.listFiles();
    if (filelist == null) {
      return 0;
    }
    for (File file : filelist) {
      if (file.isDirectory()) {
        foldersize += getFileSize(file);
      } else {
        fileCount++; //Counting the total files
        foldersize += file.length();
      }
    }
    return foldersize;    
  }

  public static void main(String[] args) {
    if (Shell.WINDOWS)
      System.out.println("Windows: "+ DUHelper.getFolderUsage(args[0]));
    else
      System.out.println("Other: " + DUHelper.getFolderUsage(args[0]));
  }
}