package org.apache.hadoop.ha;

import org.slf4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Class responsible for pumping the streams of the subprocess
 * out to log4j. stderr is pumped to WARN level and stdout is
 * pumped to INFO level
 */
class StreamPumper {
  enum StreamType {
    STDOUT, STDERR;
  }

  private final Logger log;
  
  final Thread thread;
  final String logPrefix;
  final StreamPumper.StreamType type;
  private final InputStream stream;
  private boolean started = false;
  
  StreamPumper(final Logger log, final String logPrefix,
      final InputStream stream, final StreamType type) {
    this.log = log;
    this.logPrefix = logPrefix;
    this.stream = stream;
    this.type = type;
    
    thread = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          pump();
        } catch (Throwable t) {
          ShellCommandFencer.LOG.warn(logPrefix +
              ": Unable to pump output from " + type,
              t);
        }
      }
    }, logPrefix + ": StreamPumper for " + type);
    thread.setDaemon(true);
  }
  
  void join() throws InterruptedException {
    assert started;
    thread.join();
  }

  void start() {
    assert !started;
    thread.start();
    started = true;
  }

  protected void pump() throws IOException {
    InputStreamReader inputStreamReader = new InputStreamReader(
        stream, StandardCharsets.UTF_8);
    BufferedReader br = new BufferedReader(inputStreamReader);
    String line = null;
    while ((line = br.readLine()) != null) {
      if (type == StreamType.STDOUT) {
        log.info(logPrefix + ": " + line);
      } else {
        log.warn(logPrefix + ": " + line);          
      }
    }
  }
}
