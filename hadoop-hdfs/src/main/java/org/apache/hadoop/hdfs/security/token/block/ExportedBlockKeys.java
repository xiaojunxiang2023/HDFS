package org.apache.hadoop.hdfs.security.token.block;

import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableFactories;
import org.apache.hadoop.io.WritableFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Object for passing block keys
 */
public class ExportedBlockKeys implements Writable {
  public static final ExportedBlockKeys DUMMY_KEYS = new ExportedBlockKeys();
  private boolean isBlockTokenEnabled;
  private long keyUpdateInterval;
  private long tokenLifetime;
  private final BlockKey currentKey;
  private BlockKey[] allKeys;

  public ExportedBlockKeys() {
    this(false, 0, 0, new BlockKey(), new BlockKey[0]);
  }

  public ExportedBlockKeys(boolean isBlockTokenEnabled, long keyUpdateInterval,
                           long tokenLifetime, BlockKey currentKey, BlockKey[] allKeys) {
    this.isBlockTokenEnabled = isBlockTokenEnabled;
    this.keyUpdateInterval = keyUpdateInterval;
    this.tokenLifetime = tokenLifetime;
    this.currentKey = currentKey == null ? new BlockKey() : currentKey;
    this.allKeys = allKeys == null ? new BlockKey[0] : allKeys;
  }

  public boolean isBlockTokenEnabled() {
    return isBlockTokenEnabled;
  }

  public long getKeyUpdateInterval() {
    return keyUpdateInterval;
  }

  public long getTokenLifetime() {
    return tokenLifetime;
  }

  public BlockKey getCurrentKey() {
    return currentKey;
  }

  public BlockKey[] getAllKeys() {
    return allKeys;
  }

  // ///////////////////////////////////////////////
  // Writable
  // ///////////////////////////////////////////////
  static { // register a ctor
    WritableFactories.setFactory(ExportedBlockKeys.class,
        new WritableFactory() {
          @Override
          public Writable newInstance() {
            return new ExportedBlockKeys();
          }
        });
  }

  /**
   */
  @Override
  public void write(DataOutput out) throws IOException {
    out.writeBoolean(isBlockTokenEnabled);
    out.writeLong(keyUpdateInterval);
    out.writeLong(tokenLifetime);
    currentKey.write(out);
    out.writeInt(allKeys.length);
    for (int i = 0; i < allKeys.length; i++) {
      allKeys[i].write(out);
    }
  }

  /**
   */
  @Override
  public void readFields(DataInput in) throws IOException {
    isBlockTokenEnabled = in.readBoolean();
    keyUpdateInterval = in.readLong();
    tokenLifetime = in.readLong();
    currentKey.readFields(in);
    this.allKeys = new BlockKey[in.readInt()];
    for (int i = 0; i < allKeys.length; i++) {
      allKeys[i] = new BlockKey();
      allKeys[i].readFields(in);
    }
  }

}
