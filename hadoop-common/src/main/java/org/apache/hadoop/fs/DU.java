package org.apache.hadoop.fs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;
import org.apache.hadoop.util.Shell;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class DU extends CachingGetSpaceUsed {
  private final DUShell duShell;

  @VisibleForTesting
  public DU(File path, long interval, long jitter, long initialUsed)
      throws IOException {
    super(path, interval, jitter, initialUsed);
    this.duShell = new DUShell();
  }

  public DU(CachingGetSpaceUsed.Builder builder) throws IOException {
    this(builder.getPath(),
        builder.getInterval(),
        builder.getJitter(),
        builder.getInitialUsed());
  }

  @Override
  protected synchronized void refresh() {
    try {
      duShell.startRefresh();
    } catch (IOException ioe) {
      LOG.warn("Could not get disk usage information for path {}",
          getDirPath(), ioe);
    }
  }

  private final class DUShell extends Shell {
    void startRefresh() throws IOException {
      run();
    }

    @Override
    public String toString() {
      return
          "du -sk " + getDirPath() + "\n" + used.get() + "\t" + getDirPath();
    }

    @Override
    protected String[] getExecString() {
      return new String[]{"du", "-sk", getDirPath()};
    }

    @Override
    protected void parseExecResult(BufferedReader lines) throws IOException {
      String line = lines.readLine();
      if (line == null) {
        throw new IOException("Expecting a line not the end of stream");
      }
      String[] tokens = line.split("\t");
      if (tokens.length == 0) {
        throw new IOException("Illegal du output");
      }
      setUsed(Long.parseLong(tokens[0]) * 1024);
    }

  }


  public static void main(String[] args) throws Exception {
    String path = ".";
    if (args.length > 0) {
      path = args[0];
    }

    GetSpaceUsed du = new GetSpaceUsed.Builder().setPath(new File(path))
        .setConf(new Configuration())
        .build();
    String duResult = du.toString();
    System.out.println(duResult);
  }
}
