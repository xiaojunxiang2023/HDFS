package org.apache.hadoop.hdfs.server.federation.store.driver.impl;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.server.federation.metrics.StateStoreMetrics;
import org.apache.hadoop.hdfs.server.federation.store.driver.StateStoreSerializer;
import org.apache.hadoop.hdfs.server.federation.store.records.BaseRecord;

import java.io.IOException;
import java.util.Collection;

/**
 * State Store driver that stores a serialization of the records. The serializer
 * is pluggable.
 */
public abstract class StateStoreSerializableImpl extends StateStoreBaseImpl {

  /** Mark for slashes in path names. */
  protected static final String SLASH_MARK = "0SLASH0";
  /** Mark for colon in path names. */
  protected static final String COLON_MARK = "_";

  /** Default serializer for this driver. */
  private StateStoreSerializer serializer;


  @Override
  public boolean init(final Configuration config, final String id,
                      final Collection<Class<? extends BaseRecord>> records,
                      final StateStoreMetrics metrics) {
    boolean ret = super.init(config, id, records, metrics);

    this.serializer = StateStoreSerializer.getSerializer(config);

    return ret;
  }

  /**
   * Serialize a record using the serializer.
   * @param record Record to serialize.
   * @return Byte array with the serialization of the record.
   */
  protected <T extends BaseRecord> byte[] serialize(T record) {
    return serializer.serialize(record);
  }

  /**
   * Serialize a record using the serializer.
   * @param record Record to serialize.
   * @return String with the serialization of the record.
   */
  protected <T extends BaseRecord> String serializeString(T record) {
    return serializer.serializeString(record);
  }

  /**
   * Creates a record from an input data string.
   * @param data Serialized text of the record.
   * @param clazz Record class.
   * @param includeDates If dateModified and dateCreated are serialized.
   * @return The created record.
   * @throws IOException
   */
  protected <T extends BaseRecord> T newRecord(
      String data, Class<T> clazz, boolean includeDates) throws IOException {
    return serializer.deserialize(data, clazz);
  }

  /**
   * Get the primary key for a record. If we don't want to store in folders, we
   * need to remove / from the name.
   *
   * @param record Record to get the primary key for.
   * @return Primary key for the record.
   */
  protected static String getPrimaryKey(BaseRecord record) {
    String primaryKey = record.getPrimaryKey();
    primaryKey = primaryKey.replaceAll("/", SLASH_MARK);
    primaryKey = primaryKey.replaceAll(":", COLON_MARK);
    return primaryKey;
  }
}