package org.apache.hadoop.hdfs.client.impl;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.RemoteIterator;
import org.apache.hadoop.hdfs.DFSClient;
import org.apache.hadoop.hdfs.protocol.CorruptFileBlocks;

import java.io.IOException;
import java.util.NoSuchElementException;

/**
 * Provides an iterator interface for listCorruptFileBlocks.
 * This class is used by DistributedFileSystem and Hdfs.
 */
public class CorruptFileBlockIterator implements RemoteIterator<Path> {
  private final DFSClient dfs;
  private final String path;

  private String[] files = null;
  private int fileIdx = 0;
  private String cookie = null;
  private Path nextPath = null;

  private int callsMade = 0;

  public CorruptFileBlockIterator(DFSClient dfs, Path path) throws IOException {
    this.dfs = dfs;
    this.path = path2String(path);
    loadNext();
  }

  /**
   * @return the number of calls made to the DFSClient.
   * This is for debugging and testing purposes.
   */
  public int getCallsMade() {
    return callsMade;
  }

  private String path2String(Path path) {
    return path.toUri().getPath();
  }

  private Path string2Path(String string) {
    return new Path(string);
  }

  private void loadNext() throws IOException {
    if (files == null || fileIdx >= files.length) {
      CorruptFileBlocks cfb = dfs.listCorruptFileBlocks(path, cookie);
      files = cfb.getFiles();
      cookie = cfb.getCookie();
      fileIdx = 0;
      callsMade++;
    }

    if (fileIdx >= files.length) {
      // received an empty response
      // there are no more corrupt file blocks
      nextPath = null;
    } else {
      nextPath = string2Path(files[fileIdx]);
      fileIdx++;
    }
  }


  @Override
  public boolean hasNext() {
    return nextPath != null;
  }


  @Override
  public Path next() throws IOException {
    if (!hasNext()) {
      throw new NoSuchElementException("No more corrupt file blocks");
    }

    Path result = nextPath;
    loadNext();

    return result;
  }
}
