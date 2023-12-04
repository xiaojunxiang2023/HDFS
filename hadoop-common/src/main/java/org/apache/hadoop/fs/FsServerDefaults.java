package org.apache.hadoop.fs;

import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableFactories;
import org.apache.hadoop.io.WritableFactory;
import org.apache.hadoop.io.WritableUtils;
import org.apache.hadoop.util.DataChecksum;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/****************************************************
 * Provides server default configuration values to clients.
 *
 ****************************************************/
public class FsServerDefaults implements Writable {

  static { // register a ctor
    WritableFactories.setFactory(FsServerDefaults.class, new WritableFactory() {
      @Override
      public Writable newInstance() {
        return new FsServerDefaults();
      }
    });
  }

  private long blockSize;
  private int bytesPerChecksum;
  private int writePacketSize;
  private short replication;
  private int fileBufferSize;
  private boolean encryptDataTransfer;
  private long trashInterval;
  private DataChecksum.Type checksumType;
  private String keyProviderUri;
  private byte storagepolicyId;

  public FsServerDefaults() {
  }

  public FsServerDefaults(long blockSize, int bytesPerChecksum,
                          int writePacketSize, short replication, int fileBufferSize,
                          boolean encryptDataTransfer, long trashInterval,
                          DataChecksum.Type checksumType) {
    this(blockSize, bytesPerChecksum, writePacketSize, replication,
        fileBufferSize, encryptDataTransfer, trashInterval, checksumType,
        null, (byte) 0);
  }

  public FsServerDefaults(long blockSize, int bytesPerChecksum,
                          int writePacketSize, short replication, int fileBufferSize,
                          boolean encryptDataTransfer, long trashInterval,
                          DataChecksum.Type checksumType, String keyProviderUri) {
    this(blockSize, bytesPerChecksum, writePacketSize, replication,
        fileBufferSize, encryptDataTransfer, trashInterval, checksumType,
        keyProviderUri, (byte) 0);
  }

  public FsServerDefaults(long blockSize, int bytesPerChecksum,
                          int writePacketSize, short replication, int fileBufferSize,
                          boolean encryptDataTransfer, long trashInterval,
                          DataChecksum.Type checksumType,
                          String keyProviderUri, byte storagepolicy) {
    this.blockSize = blockSize;
    this.bytesPerChecksum = bytesPerChecksum;
    this.writePacketSize = writePacketSize;
    this.replication = replication;
    this.fileBufferSize = fileBufferSize;
    this.encryptDataTransfer = encryptDataTransfer;
    this.trashInterval = trashInterval;
    this.checksumType = checksumType;
    this.keyProviderUri = keyProviderUri;
    this.storagepolicyId = storagepolicy;
  }

  public long getBlockSize() {
    return blockSize;
  }

  public int getBytesPerChecksum() {
    return bytesPerChecksum;
  }

  public int getWritePacketSize() {
    return writePacketSize;
  }

  public short getReplication() {
    return replication;
  }

  public int getFileBufferSize() {
    return fileBufferSize;
  }

  public boolean getEncryptDataTransfer() {
    return encryptDataTransfer;
  }

  public long getTrashInterval() {
    return trashInterval;
  }

  public DataChecksum.Type getChecksumType() {
    return checksumType;
  }

  /* null means old style namenode.
   * "" (empty string) means namenode is upgraded but EZ is not supported.
   * some string means that value is the key provider.
   */
  public String getKeyProviderUri() {
    return keyProviderUri;
  }

  public byte getDefaultStoragePolicyId() {
    return storagepolicyId;
  }

  // /////////////////////////////////////////
  // Writable
  // /////////////////////////////////////////
  @Override
  public void write(DataOutput out) throws IOException {
    out.writeLong(blockSize);
    out.writeInt(bytesPerChecksum);
    out.writeInt(writePacketSize);
    out.writeShort(replication);
    out.writeInt(fileBufferSize);
    WritableUtils.writeEnum(out, checksumType);
    out.writeByte(storagepolicyId);
  }

  @Override
  public void readFields(DataInput in) throws IOException {
    blockSize = in.readLong();
    bytesPerChecksum = in.readInt();
    writePacketSize = in.readInt();
    replication = in.readShort();
    fileBufferSize = in.readInt();
    checksumType = WritableUtils.readEnum(in, DataChecksum.Type.class);
    storagepolicyId = in.readByte();
  }
}
