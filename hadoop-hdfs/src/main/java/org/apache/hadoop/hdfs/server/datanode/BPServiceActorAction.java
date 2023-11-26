package org.apache.hadoop.hdfs.server.datanode;

import org.apache.hadoop.hdfs.protocolPB.DatanodeProtocolClientSideTranslatorPB;
import org.apache.hadoop.hdfs.server.protocol.DatanodeRegistration;

/**
 * Base class for BPServiceActor class
 * Issued by BPOfferSerivce class to tell BPServiceActor 
 * to take several actions.
 */
public interface BPServiceActorAction {
  public void reportTo(DatanodeProtocolClientSideTranslatorPB bpNamenode,
    DatanodeRegistration bpRegistration) throws BPServiceActorActionException;
}
