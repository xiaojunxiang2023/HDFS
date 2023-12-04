package org.apache.hadoop.hdfs.protocol.datatransfer.sasl;

import org.apache.hadoop.hdfs.security.token.block.DataEncryptionKey;

import java.io.IOException;

/**
 * Creates a new {@link DataEncryptionKey} on demand.
 */
public interface DataEncryptionKeyFactory {

  /**
   * Creates a new DataEncryptionKey.
   *
   * @return DataEncryptionKey newly created
   * @throws IOException for any error
   */
  DataEncryptionKey newDataEncryptionKey() throws IOException;
}
