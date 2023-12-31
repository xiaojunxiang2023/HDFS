package org.apache.hadoop.security;

import javax.security.sasl.Sasl;
import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslException;
import javax.security.sasl.SaslServer;
import java.io.*;

/**
 * A SaslOutputStream is composed of an OutputStream and a SaslServer (or
 * SaslClient) so that write() methods first process the data before writing
 * them out to the underlying OutputStream. The SaslServer (or SaslClient)
 * object must be fully initialized before being used by a SaslOutputStream.
 */
public class SaslOutputStream extends OutputStream {

  private final OutputStream outStream;
  // processed data ready to be written out
  private byte[] saslToken;

  private final SaslClient saslClient;
  private final SaslServer saslServer;
  // buffer holding one byte of incoming data
  private final byte[] ibuffer = new byte[1];
  private final boolean useWrap;

  /**
   * Constructs a SASLOutputStream from an OutputStream and a SaslServer <br>
   * Note: if the specified OutputStream or SaslServer is null, a
   * NullPointerException may be thrown later when they are used.
   *
   * @param outStream
   *          the OutputStream to be processed
   * @param saslServer
   *          an initialized SaslServer object
   */
  public SaslOutputStream(OutputStream outStream, SaslServer saslServer) {
    this.saslServer = saslServer;
    this.saslClient = null;
    String qop = (String) saslServer.getNegotiatedProperty(Sasl.QOP);
    this.useWrap = qop != null && !"auth".equalsIgnoreCase(qop);
    if (useWrap) {
      this.outStream = new BufferedOutputStream(outStream, 64 * 1024);
    } else {
      this.outStream = outStream;
    }
  }

  /**
   * Constructs a SASLOutputStream from an OutputStream and a SaslClient <br>
   * Note: if the specified OutputStream or SaslClient is null, a
   * NullPointerException may be thrown later when they are used.
   *
   * @param outStream
   *          the OutputStream to be processed
   * @param saslClient
   *          an initialized SaslClient object
   */
  public SaslOutputStream(OutputStream outStream, SaslClient saslClient) {
    this.saslServer = null;
    this.saslClient = saslClient;
    String qop = (String) saslClient.getNegotiatedProperty(Sasl.QOP);
    this.useWrap = qop != null && !"auth".equalsIgnoreCase(qop);
    if (useWrap) {
      this.outStream = new BufferedOutputStream(outStream, 64 * 1024);
    } else {
      this.outStream = outStream;
    }
  }

  /**
   * Disposes of any system resources or security-sensitive information Sasl
   * might be using.
   *
   * @exception SaslException
   *              if a SASL error occurs.
   */
  private void disposeSasl() throws SaslException {
    if (saslClient != null) {
      saslClient.dispose();
    }
    if (saslServer != null) {
      saslServer.dispose();
    }
  }

  /**
   * Writes the specified byte to this output stream.
   *
   * @param b
   *          the <code>byte</code>.
   * @exception IOException
   *              if an I/O error occurs.
   */
  @Override
  public void write(int b) throws IOException {
    if (!useWrap) {
      outStream.write(b);
      return;
    }
    ibuffer[0] = (byte) b;
    write(ibuffer, 0, 1);
  }

  /**
   * Writes <code>b.length</code> bytes from the specified byte array to this
   * output stream.
   * <p>
   * The <code>write</code> method of <code>SASLOutputStream</code> calls the
   * <code>write</code> method of three arguments with the three arguments
   * <code>b</code>, <code>0</code>, and <code>b.length</code>.
   *
   * @param b
   *          the data.
   * @exception NullPointerException
   *              if <code>b</code> is null.
   * @exception IOException
   *              if an I/O error occurs.
   */
  @Override
  public void write(byte[] b) throws IOException {
    write(b, 0, b.length);
  }

  /**
   * Writes <code>len</code> bytes from the specified byte array starting at
   * offset <code>off</code> to this output stream.
   *
   * @param inBuf
   *          the data.
   * @param off
   *          the start offset in the data.
   * @param len
   *          the number of bytes to write.
   * @exception IOException
   *              if an I/O error occurs.
   */
  @Override
  public void write(byte[] inBuf, int off, int len) throws IOException {
    if (!useWrap) {
      outStream.write(inBuf, off, len);
      return;
    }
    try {
      if (saslServer != null) { // using saslServer
        saslToken = saslServer.wrap(inBuf, off, len);
      } else { // using saslClient
        saslToken = saslClient.wrap(inBuf, off, len);
      }
    } catch (SaslException se) {
      try {
        disposeSasl();
      } catch (SaslException ignored) {
      }
      throw se;
    }
    if (saslToken != null) {
      ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
      DataOutputStream dout = new DataOutputStream(byteOut);
      dout.writeInt(saslToken.length);
      outStream.write(byteOut.toByteArray());
      outStream.write(saslToken, 0, saslToken.length);
      saslToken = null;
    }
  }

  /**
   * Flushes this output stream
   *
   * @exception IOException
   *              if an I/O error occurs.
   */
  @Override
  public void flush() throws IOException {
    outStream.flush();
  }

  /**
   * Closes this output stream and releases any system resources associated with
   * this stream.
   *
   * @exception IOException
   *              if an I/O error occurs.
   */
  @Override
  public void close() throws IOException {
    disposeSasl();
    outStream.close();
  }
}