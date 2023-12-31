package org.apache.hadoop.ipc.protocolPB;

import org.apache.hadoop.ipc.GenericRefreshProtocol;
import org.apache.hadoop.ipc.RefreshResponse;
import org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto;
import org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto;
import org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto;
import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class GenericRefreshProtocolServerSideTranslatorPB implements
    GenericRefreshProtocolPB {

  private final GenericRefreshProtocol impl;

  public GenericRefreshProtocolServerSideTranslatorPB(
      GenericRefreshProtocol impl) {
    this.impl = impl;
  }

  @Override
  public GenericRefreshResponseCollectionProto refresh(
      RpcController controller, GenericRefreshRequestProto request)
      throws ServiceException {
    try {
      List<String> argList = request.getArgsList();
      String[] args = argList.toArray(new String[argList.size()]);

      if (!request.hasIdentifier()) {
        throw new ServiceException("Request must contain identifier");
      }

      Collection<RefreshResponse> results = impl.refresh(request.getIdentifier(), args);

      return pack(results);
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  // Convert a collection of RefreshResponse objects to a
  // RefreshResponseCollection proto
  private GenericRefreshResponseCollectionProto pack(
      Collection<RefreshResponse> responses) {
    GenericRefreshResponseCollectionProto.Builder b =
        GenericRefreshResponseCollectionProto.newBuilder();

    for (RefreshResponse response : responses) {
      GenericRefreshResponseProto.Builder respBuilder =
          GenericRefreshResponseProto.newBuilder();
      respBuilder.setExitStatus(response.getReturnCode());
      respBuilder.setUserMessage(response.getMessage());
      respBuilder.setSenderName(response.getSenderName());

      // Add to collection
      b.addResponses(respBuilder);
    }

    return b.build();
  }
}
