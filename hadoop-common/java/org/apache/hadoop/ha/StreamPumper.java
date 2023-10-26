package org.apache.hadoop.ha;

import org.apache.hadoop.ha.fence.ShellCommandFencer;
import org.slf4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

// stdout给予 INFO，stderr给与 WARN
public class StreamPumper {
  
  public enum StreamType {
    STDOUT, STDERR;
  }

  private final Logger log;
  
  public final Thread thread;
  public final String logPrefix;
  public final StreamPumper.StreamType type;
  private final InputStream stream;

  public StreamPumper(final Logger log, final String logPrefix,
                      final InputStream stream, final StreamType type) {
    this.log = log;
    this.logPrefix = logPrefix;
    this.stream = stream;
    this.type = type;
    
    thread = new Thread(() -> {
      try {
        pump();
      } catch (Throwable t) {
        ShellCommandFencer.LOG.warn(logPrefix +
            ": Unable to pump output from " + type,
            t);
      }
    }, logPrefix + ": StreamPumper for " + type);
    thread.setDaemon(true);
  }
  
  public void join() throws InterruptedException {
    thread.join();
  }

  public void start() {
    thread.start();
    boolean started = true;
  }

  protected void pump() throws IOException {
    InputStreamReader inputStreamReader = new InputStreamReader(
        stream, StandardCharsets.UTF_8);
    BufferedReader br = new BufferedReader(inputStreamReader);
    String line;
    while ((line = br.readLine()) != null) {
      if (type == StreamType.STDOUT) {
        log.info(logPrefix + ": " + line);
      } else {
        log.warn(logPrefix + ": " + line);          
      }
    }
  }
}
