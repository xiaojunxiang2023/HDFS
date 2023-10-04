package org.apache.hadoop.hdfs.protocol.datatransfer.sasl;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.hdfs.security.token.block.DataEncryptionKey;

/**
 * Creates a new {@link DataEncryptionKey} on demand.
 */
@InterfaceAudience.Private
public interface DataEncryptionKeyFactory {

  /**
   * Creates a new DataEncryptionKey.
   *
   * @return DataEncryptionKey newly created
   * @throws IOException for any error
   */
  DataEncryptionKey newDataEncryptionKey() throws IOException;
}
