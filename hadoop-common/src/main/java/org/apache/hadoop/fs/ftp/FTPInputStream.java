package org.apache.hadoop.fs.ftp;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.hadoop.fs.FSInputStream;
import org.apache.hadoop.fs.FileSystem;

import java.io.IOException;
import java.io.InputStream;

public class FTPInputStream extends FSInputStream {

  InputStream wrappedStream;
  FTPClient client;
  FileSystem.Statistics stats;
  boolean closed;
  long pos;

  public FTPInputStream(InputStream stream, FTPClient client,
                        FileSystem.Statistics stats) {
    if (stream == null) {
      throw new IllegalArgumentException("Null InputStream");
    }
    if (client == null || !client.isConnected()) {
      throw new IllegalArgumentException("FTP client null or not connected");
    }
    this.wrappedStream = stream;
    this.client = client;
    this.stats = stats;
    this.pos = 0;
    this.closed = false;
  }

  @Override
  public long getPos() throws IOException {
    return pos;
  }

  // We don't support seek.
  @Override
  public void seek(long pos) throws IOException {
    throw new IOException("Seek not supported");
  }

  @Override
  public boolean seekToNewSource(long targetPos) throws IOException {
    throw new IOException("Seek not supported");
  }

  @Override
  public synchronized int read() throws IOException {
    if (closed) {
      throw new IOException("Stream closed");
    }

    int byteRead = wrappedStream.read();
    if (byteRead >= 0) {
      pos++;
    }
    if (stats != null && byteRead >= 0) {
      stats.incrementBytesRead(1);
    }
    return byteRead;
  }

  @Override
  public synchronized int read(byte buf[], int off, int len) throws IOException {
    if (closed) {
      throw new IOException("Stream closed");
    }

    int result = wrappedStream.read(buf, off, len);
    if (result > 0) {
      pos += result;
    }
    if (stats != null && result > 0) {
      stats.incrementBytesRead(result);
    }

    return result;
  }

  @Override
  public synchronized void close() throws IOException {
    if (closed) {
      return;
    }
    super.close();
    closed = true;
    if (!client.isConnected()) {
      throw new FTPException("Client not connected");
    }

    boolean cmdCompleted = client.completePendingCommand();
    client.logout();
    client.disconnect();
    if (!cmdCompleted) {
      throw new FTPException("Could not complete transfer, Reply Code - "
          + client.getReplyCode());
    }
  }

  // Not supported.

  @Override
  public boolean markSupported() {
    return false;
  }

  @Override
  public void mark(int readLimit) {
    // Do nothing
  }

  @Override
  public void reset() throws IOException {
    throw new IOException("Mark not supported");
  }
}
