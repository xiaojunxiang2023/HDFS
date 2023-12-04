package org.apache.hadoop.hdfs.security.token.block;

import org.apache.hadoop.security.token.delegation.DelegationKey;

import javax.crypto.SecretKey;

/**
 * Key used for generating and verifying block tokens
 */
public class BlockKey extends DelegationKey {

  public BlockKey() {
    super();
  }

  public BlockKey(int keyId, long expiryDate, SecretKey key) {
    super(keyId, expiryDate, key);
  }

  public BlockKey(int keyId, long expiryDate, byte[] encodedKey) {
    super(keyId, expiryDate, encodedKey);
  }
}
