package org.apache.hadoop.fs;

import java.io.File;
import org.apache.hadoop.util.Shell;

public class DUHelper {

  private int folderCount=0;
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

  public String check(String folder) {
    if (folder == null)
      throw new IllegalArgumentException("folder");
    File f = new File(folder);

    folderSize = getFileSize(f);
    usage = 1.0*(f.getTotalSpace() - f.getFreeSpace())/ f.getTotalSpace();
    return String.format("used %d files %d disk in use %f", folderSize, fileCount, usage);
  }

  public long getFileCount() {
    return fileCount;
  }

  public double getUsage() {
    return usage;
  }

  private long getFileSize(File folder) {

    folderCount++;
    //Counting the total folders
    long foldersize = 0;
    if (folder.isFile())
      return folder.length();
    File[] filelist = folder.listFiles();
    if (filelist == null) {
      return 0;
    }
    for (int i = 0; i < filelist.length; i++) {
      if (filelist[i].isDirectory()) {
        foldersize += getFileSize(filelist[i]);
      } else {
        fileCount++; //Counting the total files
        foldersize += filelist[i].length();
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