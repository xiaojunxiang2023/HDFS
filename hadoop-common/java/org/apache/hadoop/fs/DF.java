package org.apache.hadoop.fs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.util.Shell;

import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;

public class DF extends Shell {

  private final String dirPath;
  private final File dirFile;
  private String filesystem;
  private String mount;
  
  private final ArrayList<String> output;

  public DF(File path, Configuration conf) throws IOException {
    this(path, conf.getLong(CommonConfigurationKeys.FS_DF_INTERVAL_KEY,
        CommonConfigurationKeysPublic.FS_DF_INTERVAL_DEFAULT));
  }

  public DF(File path, long dfInterval) throws IOException {
    super(dfInterval);
    this.dirPath = path.getCanonicalPath();
    this.dirFile = new File(this.dirPath);
    this.output = new ArrayList<>();
  }

  /// ACCESSORS

  /** @return a string indicating which filesystem volume we're checking. */
  public String getFilesystem() throws IOException {
    run();
    verifyExitCode();
    parseOutput();
    return filesystem;
  }

  /** @return the capacity of the measured filesystem in bytes. */
  public long getCapacity() {
    return dirFile.getTotalSpace();
  }

  /** @return the total used space on the filesystem in bytes. */
  public long getUsed() {
    return dirFile.getTotalSpace() - dirFile.getFreeSpace();
  }

  /** @return the usable space remaining on the filesystem in bytes. */
  public long getAvailable() {
    return dirFile.getUsableSpace();
  }

  /** @return the amount of the volume full, as a percent. */
  public int getPercentUsed() {
    double cap = (double) getCapacity();
    double used = (cap - (double) getAvailable());
    return (int) (used * 100.0 / cap);
  }

  /** @return the filesystem mount point for the indicated volume */
  public String getMount() throws IOException {
    // Abort early if specified path does not exist
    if (!dirFile.exists()) {
      throw new FileNotFoundException("Specified path " + dirFile.getPath()
          + "does not exist");
    }

    run();
    verifyExitCode();
    parseOutput();

    return mount;
  }
  
  @Override
  public String toString() {
    return
      "df -k " + mount +"\n" +
      filesystem + "\t" +
      getCapacity() / 1024 + "\t" +
      getUsed() / 1024 + "\t" +
      getAvailable() / 1024 + "\t" +
      getPercentUsed() + "%\t" +
      mount;
  }

  @Override
  protected String[] getExecString() {
    return new String[] {"bash","-c","exec 'df' '-k' '-P' '" + dirPath 
            + "' 2>/dev/null"};
  }

  @Override
  protected void parseExecResult(BufferedReader lines) throws IOException {
    output.clear();
    String line = lines.readLine();
    while (line != null) {
      output.add(line);
      line = lines.readLine();
    }
  }
  
  @VisibleForTesting
  protected void parseOutput() throws IOException {
    if (output.size() < 2) {
      StringBuilder sb = new StringBuilder("Fewer lines of output than expected");
      if (output.size() > 0) {
        sb.append(": ").append(output.get(0));
      }
      throw new IOException(sb.toString());
    }
    
    String line = output.get(1);
    StringTokenizer tokens =
      new StringTokenizer(line, " \t\n\r\f%");
    
    try {
      this.filesystem = tokens.nextToken();
    } catch (NoSuchElementException e) {
      throw new IOException("Unexpected empty line");
    }
    if (!tokens.hasMoreTokens()) {            // for long filesystem name
      if (output.size() > 2) {
        line = output.get(2);
      } else {
        throw new IOException("Expecting additional output after line: "
            + line);
      }
      tokens = new StringTokenizer(line, " \t\n\r\f%");
    }

    try {
      Long.parseLong(tokens.nextToken()); // capacity
      Long.parseLong(tokens.nextToken()); // used
      Long.parseLong(tokens.nextToken()); // available
      Integer.parseInt(tokens.nextToken()); // pct used
      this.mount = tokens.nextToken();
    } catch (NoSuchElementException | NumberFormatException e) {
      throw new IOException("Could not parse line: " + line);
    }
  }

  private void verifyExitCode() throws IOException {
    if (getExitCode() != 0) {
      StringBuilder sb =
          new StringBuilder("df could not be run successfully: ");
      for (String line : output) {
        sb.append(line);
      }
      throw new IOException(sb.toString());
    }
  }

  public static void main(String[] args) throws Exception {
    String path = ".";
    if (args.length > 0)
      path = args[0];

    System.out.println(new DF(new File(path),
        CommonConfigurationKeysPublic.FS_DF_INTERVAL_DEFAULT).toString());
  }
}
