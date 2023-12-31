package org.apache.hadoop.fs;

import org.apache.hadoop.conf.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URLStreamHandlerFactory;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Factory for URL stream handlers.
 *
 * There is only one handler whose job is to create UrlConnections. A
 * FsUrlConnection relies on FileSystem to choose the appropriate FS
 * implementation.
 *
 * Before returning our handler, we make sure that FileSystem knows an
 * implementation for the requested scheme/protocol.
 */
public class FsUrlStreamHandlerFactory implements
    URLStreamHandlerFactory {

  private static final Logger LOG =
      LoggerFactory.getLogger(FsUrlStreamHandlerFactory.class);

  /**
   * These are the protocols with MUST NOT be exported, as doing so
   * would conflict with the standard URL handlers registered by
   * the JVM. Many things will break.
   */
  public static final String[] UNEXPORTED_PROTOCOLS = {
      "http", "https"
  };

  // The configuration holds supported FS implementation class names.
  private Configuration conf;

  // This map stores whether a protocol is know or not by FileSystem
  private Map<String, Boolean> protocols =
      new ConcurrentHashMap<String, Boolean>();

  // The URL Stream handler
  private java.net.URLStreamHandler handler;

  public FsUrlStreamHandlerFactory() {
    this(new Configuration());
  }

  public FsUrlStreamHandlerFactory(Configuration conf) {
    this.conf = new Configuration(conf);
    // force init of FileSystem code to avoid HADOOP-9041
    try {
      FileSystem.getFileSystemClass("file", conf);
    } catch (IOException io) {
      throw new RuntimeException(io);
    }
    this.handler = new FsUrlStreamHandler(this.conf);
    for (String protocol : UNEXPORTED_PROTOCOLS) {
      protocols.put(protocol, false);
    }
  }

  @Override
  public java.net.URLStreamHandler createURLStreamHandler(String protocol) {
    LOG.debug("Creating handler for protocol {}", protocol);
    if (!protocols.containsKey(protocol)) {
      boolean known = true;
      try {
        Class<? extends FileSystem> impl
            = FileSystem.getFileSystemClass(protocol, conf);
        LOG.debug("Found implementation of {}: {}", protocol, impl);
      } catch (IOException ex) {
        known = false;
      }
      protocols.put(protocol, known);
    }
    if (protocols.get(protocol)) {
      LOG.debug("Using handler for protocol {}", protocol);
      return handler;
    } else {
      // FileSystem does not know the protocol, let the VM handle this
      LOG.debug("Unknown protocol {}, delegating to default implementation",
          protocol);
      return null;
    }
  }

}
