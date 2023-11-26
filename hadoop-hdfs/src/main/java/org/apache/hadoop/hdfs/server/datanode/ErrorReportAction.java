package org.apache.hadoop.hdfs.server.datanode;

import java.io.IOException;

import org.apache.hadoop.hdfs.protocolPB.DatanodeProtocolClientSideTranslatorPB;
import org.apache.hadoop.hdfs.server.protocol.DatanodeRegistration;
import org.apache.hadoop.ipc.RemoteException;


/**
 * A ErrorReportAction is an instruction issued by BPOfferService to 
 * BPServiceActor about a particular block encapsulated in errorMessage.
 */
public class ErrorReportAction implements BPServiceActorAction {

  final int errorCode;
  final String errorMessage;
  
  public ErrorReportAction(int errorCode, String errorMessage) {
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
  }
  
  @Override
  public void reportTo(DatanodeProtocolClientSideTranslatorPB bpNamenode, 
    DatanodeRegistration bpRegistration) throws BPServiceActorActionException {
    try {
      bpNamenode.errorReport(bpRegistration, errorCode, errorMessage);
    } catch (RemoteException re) {
      DataNode.LOG.info("trySendErrorReport encountered RemoteException  "
          + "errorMessage: " + errorMessage + "  errorCode: " + errorCode, re);
    } catch(IOException e) {
      throw new BPServiceActorActionException("Error reporting "
          + "an error to namenode.", e);
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + errorCode;
    result = prime * result
        + ((errorMessage == null) ? 0 : errorMessage.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || !(obj instanceof ErrorReportAction)) {
      return false;
    }
    ErrorReportAction other = (ErrorReportAction) obj;
    if (errorCode != other.errorCode) {
      return false;
    }
    if (errorMessage == null) {
      if (other.errorMessage != null) {
        return false;
      }
    } else if (!errorMessage.equals(other.errorMessage)) {
      return false;
    }
    return true;
  }
}
