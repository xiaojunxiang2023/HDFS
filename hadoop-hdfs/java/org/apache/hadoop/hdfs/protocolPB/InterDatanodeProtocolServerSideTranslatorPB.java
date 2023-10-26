package org.apache.hadoop.hdfs.protocolPB;

import java.io.IOException;
import org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto;
import org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto;
import org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto;
import org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto;
import org.apache.hadoop.hdfs.server.protocol.BlockRecoveryCommand.RecoveringBlock;
import org.apache.hadoop.hdfs.server.protocol.InterDatanodeProtocol;
import org.apache.hadoop.hdfs.server.protocol.ReplicaRecoveryInfo;

import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;

/**
 * Implementation for protobuf service that forwards requests
 * received on {@link InterDatanodeProtocolPB} to the
 * {@link InterDatanodeProtocol} server implementation.
 */
public class InterDatanodeProtocolServerSideTranslatorPB implements
    InterDatanodeProtocolPB {
  private final InterDatanodeProtocol impl;

  public InterDatanodeProtocolServerSideTranslatorPB(InterDatanodeProtocol impl) {
    this.impl = impl;
  }

  @Override
  public InitReplicaRecoveryResponseProto initReplicaRecovery(
      RpcController unused, InitReplicaRecoveryRequestProto request)
      throws ServiceException {
    RecoveringBlock b = PBHelper.convert(request.getBlock());
    ReplicaRecoveryInfo r;
    try {
      r = impl.initReplicaRecovery(b);
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    
    if (r == null) {
      return InitReplicaRecoveryResponseProto.newBuilder()
          .setReplicaFound(false)
          .build();
    } else {
      return InitReplicaRecoveryResponseProto.newBuilder()
          .setReplicaFound(true)
          .setBlock(PBHelperClient.convert(r))
          .setState(PBHelper.convert(r.getOriginalReplicaState())).build();
    }
  }

  @Override
  public UpdateReplicaUnderRecoveryResponseProto updateReplicaUnderRecovery(
      RpcController unused, UpdateReplicaUnderRecoveryRequestProto request)
      throws ServiceException {
    final String storageID;
    try {
      storageID = impl.updateReplicaUnderRecovery(
          PBHelperClient.convert(request.getBlock()), request.getRecoveryId(),
          request.getNewBlockId(), request.getNewLength());
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return UpdateReplicaUnderRecoveryResponseProto.newBuilder()
        .setStorageUuid(storageID).build();
  }
}
