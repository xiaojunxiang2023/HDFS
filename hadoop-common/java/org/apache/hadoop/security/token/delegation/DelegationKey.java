package org.apache.hadoop.security.token.delegation;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;

import javax.crypto.SecretKey;

import org.apache.avro.reflect.Nullable;
import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableUtils;

/**
 * Key used for generating and verifying delegation tokens
 */
@InterfaceAudience.LimitedPrivate({"HDFS", "MapReduce"})
@InterfaceStability.Evolving
public class DelegationKey implements Writable {
  private int keyId;
  private long expiryDate;
  @Nullable
  private byte[] keyBytes = null;
  private static final int MAX_KEY_LEN = 1024 * 1024;

  /** Default constructore required for Writable */
  public DelegationKey() {
    this(0, 0L, (SecretKey)null);
  }

  public DelegationKey(int keyId, long expiryDate, SecretKey key) {
    this(keyId, expiryDate, key != null ? key.getEncoded() : null);
  }
  
  public DelegationKey(int keyId, long expiryDate, byte[] encodedKey) {
    this.keyId = keyId;
    this.expiryDate = expiryDate;
    if (encodedKey != null) {
      if (encodedKey.length > MAX_KEY_LEN) {
        throw new RuntimeException("can't create " + encodedKey.length +
            " byte long DelegationKey.");
      }
      this.keyBytes = encodedKey;
    }
  }

  public int getKeyId() {
    return keyId;
  }

  public long getExpiryDate() {
    return expiryDate;
  }

  public SecretKey getKey() {
    if (keyBytes == null || keyBytes.length == 0) {
      return null;
    } else {
      SecretKey key = AbstractDelegationTokenSecretManager.createSecretKey(keyBytes);
      return key;
    }
  }
  
  public byte[] getEncodedKey() {
    return keyBytes;
  }

  public void setExpiryDate(long expiryDate) {
    this.expiryDate = expiryDate;
  }

  /**
   */
  @Override
  public void write(DataOutput out) throws IOException {
    WritableUtils.writeVInt(out, keyId);
    WritableUtils.writeVLong(out, expiryDate);
    if (keyBytes == null) {
      WritableUtils.writeVInt(out, -1);
    } else {
      WritableUtils.writeVInt(out, keyBytes.length);
      out.write(keyBytes);
    }
  }

  /**
   */
  @Override
  public void readFields(DataInput in) throws IOException {
    keyId = WritableUtils.readVInt(in);
    expiryDate = WritableUtils.readVLong(in);
    int len = WritableUtils.readVIntInRange(in, -1, MAX_KEY_LEN);
    if (len == -1) {
      keyBytes = null;
    } else {
      keyBytes = new byte[len];
      in.readFully(keyBytes);
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (expiryDate ^ (expiryDate >>> 32));
    result = prime * result + Arrays.hashCode(keyBytes);
    result = prime * result + keyId;
    return result;
  }

  @Override
  public boolean equals(Object right) {
    if (this == right) {
      return true;
    } else if (right == null || getClass() != right.getClass()) {
      return false;
    } else {
      DelegationKey r = (DelegationKey) right;
      return keyId == r.keyId &&
             expiryDate == r.expiryDate &&
             Arrays.equals(keyBytes, r.keyBytes);
    }
  }

}
