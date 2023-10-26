package org.apache.hadoop.hdfs.server.protocol;
import org.apache.hadoop.ha.HAServiceProtocol.HAServiceState;
import org.apache.hadoop.hdfs.server.common.HdfsServerConstants;
public class NNHAStatusHeartbeat {

  private final HAServiceState state;
  private long txid = HdfsServerConstants.INVALID_TXID;
  
  public NNHAStatusHeartbeat(HAServiceState state, long txid) {
    this.state = state;
    this.txid = txid;
  }

  public HAServiceState getState() {
    return state;
  }
  
  public long getTxId() {
    return txid;
  }
}
