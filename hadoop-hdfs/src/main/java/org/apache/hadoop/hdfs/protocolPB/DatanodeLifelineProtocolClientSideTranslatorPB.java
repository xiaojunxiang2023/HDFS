package org.apache.hadoop.hdfs.protocolPB;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.protocol.proto.DatanodeProtocolProtos.HeartbeatRequestProto;
import org.apache.hadoop.hdfs.server.protocol.DatanodeLifelineProtocol;
import org.apache.hadoop.hdfs.server.protocol.DatanodeRegistration;
import org.apache.hadoop.hdfs.server.protocol.StorageReport;
import org.apache.hadoop.hdfs.server.protocol.VolumeFailureSummary;
import org.apache.hadoop.ipc.*;
import org.apache.hadoop.net.NetUtils;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * This class is the client side translator to translate the requests made on
 * {@link DatanodeLifelineProtocol} interfaces to the RPC server implementing
 * {@link DatanodeLifelineProtocolPB}.
 */
public class DatanodeLifelineProtocolClientSideTranslatorPB implements
    ProtocolMetaInterface, DatanodeLifelineProtocol, Closeable {

  /** RpcController is not used and hence is set to null. */
  private static final RpcController NULL_CONTROLLER = null;

  private final DatanodeLifelineProtocolPB rpcProxy;

  public DatanodeLifelineProtocolClientSideTranslatorPB(
      InetSocketAddress nameNodeAddr, Configuration conf) throws IOException {
    RPC.setProtocolEngine(conf, DatanodeLifelineProtocolPB.class,
        ProtobufRpcEngine2.class);
    UserGroupInformation ugi = UserGroupInformation.getCurrentUser();
    rpcProxy = createNamenode(nameNodeAddr, conf, ugi);
  }

  private static DatanodeLifelineProtocolPB createNamenode(
      InetSocketAddress nameNodeAddr, Configuration conf,
      UserGroupInformation ugi) throws IOException {
    return RPC.getProxy(DatanodeLifelineProtocolPB.class,
        RPC.getProtocolVersion(DatanodeLifelineProtocolPB.class), nameNodeAddr,
        ugi, conf,
        NetUtils.getSocketFactory(conf, DatanodeLifelineProtocolPB.class));
  }

  @Override
  public void close() throws IOException {
    RPC.stopProxy(rpcProxy);
  }

  @Override
  public void sendLifeline(DatanodeRegistration registration,
                           StorageReport[] reports, long cacheCapacity, long cacheUsed,
                           int xmitsInProgress, int xceiverCount, int failedVolumes,
                           VolumeFailureSummary volumeFailureSummary) throws IOException {
    HeartbeatRequestProto.Builder builder = HeartbeatRequestProto.newBuilder()
        .setRegistration(PBHelper.convert(registration))
        .setXmitsInProgress(xmitsInProgress).setXceiverCount(xceiverCount)
        .setFailedVolumes(failedVolumes);
    builder.addAllReports(PBHelperClient.convertStorageReports(reports));
    if (cacheCapacity != 0) {
      builder.setCacheCapacity(cacheCapacity);
    }
    if (cacheUsed != 0) {
      builder.setCacheUsed(cacheUsed);
    }
    if (volumeFailureSummary != null) {
      builder.setVolumeFailureSummary(PBHelper.convertVolumeFailureSummary(
          volumeFailureSummary));
    }
    try {
      rpcProxy.sendLifeline(NULL_CONTROLLER, builder.build());
    } catch (ServiceException se) {
      throw ProtobufHelper.getRemoteException(se);
    }
  }

  @Override // ProtocolMetaInterface
  public boolean isMethodSupported(String methodName)
      throws IOException {
    return RpcClientUtil.isMethodSupported(rpcProxy,
        DatanodeLifelineProtocolPB.class, RPC.RpcKind.RPC_PROTOCOL_BUFFER,
        RPC.getProtocolVersion(DatanodeLifelineProtocolPB.class), methodName);
  }
}
