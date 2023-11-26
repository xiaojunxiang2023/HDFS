package org.apache.hadoop.ipc.protocolPB;

import java.io.IOException;

import org.apache.hadoop.ipc.RefreshCallQueueProtocol;
import org.apache.hadoop.ipc.proto.RefreshCallQueueProtocolProtos.RefreshCallQueueRequestProto;
import org.apache.hadoop.ipc.proto.RefreshCallQueueProtocolProtos.RefreshCallQueueResponseProto;

import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;

public class RefreshCallQueueProtocolServerSideTranslatorPB implements
    RefreshCallQueueProtocolPB {

  private final RefreshCallQueueProtocol impl;

  private final static RefreshCallQueueResponseProto
  VOID_REFRESH_CALL_QUEUE_RESPONSE = RefreshCallQueueResponseProto
      .newBuilder().build();

  public RefreshCallQueueProtocolServerSideTranslatorPB(
      RefreshCallQueueProtocol impl) {
    this.impl = impl;
  }

  @Override
  public RefreshCallQueueResponseProto refreshCallQueue(
      RpcController controller, RefreshCallQueueRequestProto request)
      throws ServiceException {
    try {
      impl.refreshCallQueue();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_REFRESH_CALL_QUEUE_RESPONSE;
  }
}
