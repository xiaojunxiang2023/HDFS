package org.apache.hadoop.fs;

import org.apache.commons.codec.binary.Hex;
import org.apache.hadoop.crypto.CipherSuite;
import org.apache.hadoop.crypto.CryptoProtocolVersion;

import java.io.Serializable;

import static org.apache.hadoop.thirdparty.com.google.common.base.Preconditions.checkArgument;
import static org.apache.hadoop.thirdparty.com.google.common.base.Preconditions.checkNotNull;

/**
 * FileEncryptionInfo encapsulates all the encryption-related information for
 * an encrypted file.
 */
public class FileEncryptionInfo implements Serializable {

  private static final long serialVersionUID = 0x156abe03;

  private final CipherSuite cipherSuite;
  private final CryptoProtocolVersion version;
  private final byte[] edek;
  private final byte[] iv;
  private final String keyName;
  private final String ezKeyVersionName;

  /**
   * Create a FileEncryptionInfo.
   *
   * @param suite CipherSuite used to encrypt the file
   * @param edek encrypted data encryption key (EDEK) of the file
   * @param iv initialization vector (IV) used to encrypt the file
   * @param keyName name of the key used for the encryption zone
   * @param ezKeyVersionName name of the KeyVersion used to encrypt the
   *                         encrypted data encryption key.
   */
  public FileEncryptionInfo(final CipherSuite suite,
                            final CryptoProtocolVersion version, final byte[] edek,
                            final byte[] iv, final String keyName, final String ezKeyVersionName) {
    checkNotNull(suite);
    checkNotNull(version);
    checkNotNull(edek);
    checkNotNull(iv);
    checkNotNull(keyName);
    checkNotNull(ezKeyVersionName);
    checkArgument(iv.length == suite.getAlgorithmBlockSize(),
        "Unexpected IV length");
    this.cipherSuite = suite;
    this.version = version;
    this.edek = edek;
    this.iv = iv;
    this.keyName = keyName;
    this.ezKeyVersionName = ezKeyVersionName;
  }

  /**
   * @return {@link org.apache.hadoop.crypto.CipherSuite} used to encrypt
   * the file.
   */
  public CipherSuite getCipherSuite() {
    return cipherSuite;
  }

  /**
   * @return {@link org.apache.hadoop.crypto.CryptoProtocolVersion} to use
   * to access the file.
   */
  public CryptoProtocolVersion getCryptoProtocolVersion() {
    return version;
  }

  /**
   * @return encrypted data encryption key (EDEK) for the file
   */
  public byte[] getEncryptedDataEncryptionKey() {
    return edek;
  }

  /**
   * @return initialization vector (IV) for the cipher used to encrypt the file
   */
  public byte[] getIV() {
    return iv;
  }

  /**
   * @return name of the encryption zone key.
   */
  public String getKeyName() {
    return keyName;
  }

  /**
   * @return name of the encryption zone KeyVersion used to encrypt the
   * encrypted data encryption key (EDEK).
   */
  public String getEzKeyVersionName() {
    return ezKeyVersionName;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("{")
        .append("cipherSuite: " + cipherSuite)
        .append(", cryptoProtocolVersion: " + version)
        .append(", edek: " + Hex.encodeHexString(edek))
        .append(", iv: " + Hex.encodeHexString(iv))
        .append(", keyName: " + keyName)
        .append(", ezKeyVersionName: " + ezKeyVersionName)
        .append("}");
    return builder.toString();
  }

  /**
   * A frozen version of {@link #toString()} to be backward compatible.
   * When backward compatibility is not needed, use {@link #toString()}, which
   * provides more info and is supposed to evolve.
   * Don't change this method except for major revisions.
   *
   * NOTE:
   * Currently this method is used by CLI for backward compatibility.
   */
  public String toStringStable() {
    StringBuilder builder = new StringBuilder("{")
        .append("cipherSuite: " + cipherSuite)
        .append(", cryptoProtocolVersion: " + version)
        .append(", edek: " + Hex.encodeHexString(edek))
        .append(", iv: " + Hex.encodeHexString(iv))
        .append(", keyName: " + keyName)
        .append(", ezKeyVersionName: " + ezKeyVersionName)
        .append("}");
    return builder.toString();
  }
}
