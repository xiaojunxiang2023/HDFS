package org.apache.hadoop.hdfs.protocolPB;

import org.apache.hadoop.hdfs.protocol.ReconfigurationProtocol;
import org.apache.hadoop.hdfs.protocol.proto.ReconfigurationProtocolProtos.*;
import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;

import java.io.IOException;

/**
 * This class is used on the server side. Calls come across the wire for the
 * for protocol {@link ReconfigurationProtocolPB}.
 * This class translates the PB data types
 * to the native data types used inside the NN/DN as specified in the generic
 * ReconfigurationProtocol.
 */
public class ReconfigurationProtocolServerSideTranslatorPB implements
    ReconfigurationProtocolPB {

  private final ReconfigurationProtocol impl;

  private static final StartReconfigurationResponseProto START_RECONFIG_RESP =
      StartReconfigurationResponseProto.newBuilder().build();

  public ReconfigurationProtocolServerSideTranslatorPB(
      ReconfigurationProtocol impl) {
    this.impl = impl;
  }

  @Override
  public StartReconfigurationResponseProto startReconfiguration(
      RpcController controller, StartReconfigurationRequestProto request)
      throws ServiceException {
    try {
      impl.startReconfiguration();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return START_RECONFIG_RESP;
  }

  @Override
  public ListReconfigurablePropertiesResponseProto listReconfigurableProperties(
      RpcController controller,
      ListReconfigurablePropertiesRequestProto request)
      throws ServiceException {
    try {
      return ReconfigurationProtocolServerSideUtils
          .listReconfigurableProperties(impl.listReconfigurableProperties());
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetReconfigurationStatusResponseProto getReconfigurationStatus(
      RpcController unused, GetReconfigurationStatusRequestProto request)
      throws ServiceException {
    try {
      return ReconfigurationProtocolServerSideUtils
          .getReconfigurationStatus(impl.getReconfigurationStatus());
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }
}
