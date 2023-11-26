package org.apache.hadoop.hdfs.protocol.datatransfer.sasl;

import static org.apache.hadoop.hdfs.protocol.datatransfer.sasl.DataTransferSaslUtil.SASL_TRANSFER_MAGIC_NUMBER;

import java.io.IOException;

/**
 * Indicates that SASL protocol negotiation expected to read a pre-defined magic
 * number, but the expected value was not seen.
 */
public class InvalidMagicNumberException extends IOException {

  private static final long serialVersionUID = 1L;
  private final boolean handshake4Encryption;

  /**
   * Creates a new InvalidMagicNumberException.
   *
   * @param magicNumber expected value
   */
  public InvalidMagicNumberException(final int magicNumber, 
      final boolean handshake4Encryption) {
    super(String.format("Received %x instead of %x from client.",
        magicNumber, SASL_TRANSFER_MAGIC_NUMBER));
    this.handshake4Encryption = handshake4Encryption;
  }
  
  /**
   * Return true if it's handshake for encryption
   * 
   * @return boolean true if it's handshake for encryption
   */
  public boolean isHandshake4Encryption() {
    return handshake4Encryption;
  }
}
