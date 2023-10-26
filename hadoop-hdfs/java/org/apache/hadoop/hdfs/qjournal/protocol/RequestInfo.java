package org.apache.hadoop.hdfs.qjournal.protocol;
import org.apache.hadoop.hdfs.server.common.HdfsServerConstants;
public class RequestInfo {
  private final String jid;
  private long epoch;
  private long ipcSerialNumber;
  private final long committedTxId;
  private final String nameServiceId;
  
  public RequestInfo(String jid, String nameServiceId,
                     long epoch, long ipcSerialNumber,
                     long committedTxId) {
    this.jid = jid;
    this.nameServiceId = nameServiceId;
    this.epoch = epoch;
    this.ipcSerialNumber = ipcSerialNumber;
    this.committedTxId = committedTxId;
  }

  public String getNameServiceId() {
    return nameServiceId;
  }

  public long getEpoch() {
    return epoch;
  }

  public void setEpoch(long epoch) {
    this.epoch = epoch;
  }
  
  public String getJournalId() {
    return jid;
  }

  public long getIpcSerialNumber() {
    return ipcSerialNumber;
  }

  public void setIpcSerialNumber(long ipcSerialNumber) {
    this.ipcSerialNumber = ipcSerialNumber;
  }

  public long getCommittedTxId() {
    return committedTxId;
  }

  public boolean hasCommittedTxId() {
    return (committedTxId != HdfsServerConstants.INVALID_TXID);
  }
}
