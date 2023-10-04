package org.apache.hadoop.hdfs.protocolPB;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.hdfs.protocol.proto.DatanodeProtocolProtos.HeartbeatRequestProto;
import org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.LifelineResponseProto;
import org.apache.hadoop.hdfs.server.protocol.DatanodeLifelineProtocol;
import org.apache.hadoop.hdfs.server.protocol.StorageReport;
import org.apache.hadoop.hdfs.server.protocol.VolumeFailureSummary;

import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;

/**
 * Implementation for protobuf service that forwards requests
 * received on {@link DatanodeLifelineProtocolPB} to the
 * {@link DatanodeLifelineProtocol} server implementation.
 */
@InterfaceAudience.Private
public class DatanodeLifelineProtocolServerSideTranslatorPB implements
    DatanodeLifelineProtocolPB {

  private static final LifelineResponseProto VOID_LIFELINE_RESPONSE_PROTO =
      LifelineResponseProto.newBuilder().build();

  private final DatanodeLifelineProtocol impl;

  public DatanodeLifelineProtocolServerSideTranslatorPB(
      DatanodeLifelineProtocol impl) {
    this.impl = impl;
  }

  @Override
  public LifelineResponseProto sendLifeline(RpcController controller,
      HeartbeatRequestProto request) throws ServiceException {
    try {
      final StorageReport[] report = PBHelperClient.convertStorageReports(
          request.getReportsList());
      VolumeFailureSummary volumeFailureSummary =
          request.hasVolumeFailureSummary() ?
              PBHelper.convertVolumeFailureSummary(
                  request.getVolumeFailureSummary()) : null;
      impl.sendLifeline(PBHelper.convert(request.getRegistration()), report,
          request.getCacheCapacity(), request.getCacheUsed(),
          request.getXmitsInProgress(), request.getXceiverCount(),
          request.getFailedVolumes(), volumeFailureSummary);
      return VOID_LIFELINE_RESPONSE_PROTO;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }
}
