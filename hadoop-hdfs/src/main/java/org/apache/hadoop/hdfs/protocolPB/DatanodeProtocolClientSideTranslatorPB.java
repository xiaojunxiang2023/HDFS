package org.apache.hadoop.hdfs.protocolPB;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.protocol.*;
import org.apache.hadoop.hdfs.protocol.proto.DatanodeProtocolProtos.*;
import org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto;
import org.apache.hadoop.hdfs.server.protocol.*;
import org.apache.hadoop.hdfs.server.protocol.NamespaceInfo.Capability;
import org.apache.hadoop.ipc.*;
import org.apache.hadoop.net.NetUtils;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;

import javax.annotation.Nonnull;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.List;

/**
 * This class is the client side translator to translate the requests made on
 * {@link DatanodeProtocol} interfaces to the RPC server implementing
 * {@link DatanodeProtocolPB}.
 */
public class DatanodeProtocolClientSideTranslatorPB implements
    ProtocolMetaInterface, DatanodeProtocol, Closeable {

  /** RpcController is not used and hence is set to null */
  private final DatanodeProtocolPB rpcProxy;
  private static final VersionRequestProto VOID_VERSION_REQUEST =
      VersionRequestProto.newBuilder().build();
  private final static RpcController NULL_CONTROLLER = null;


  public DatanodeProtocolClientSideTranslatorPB(DatanodeProtocolPB rpcProxy) {
    this.rpcProxy = rpcProxy;
  }

  public DatanodeProtocolClientSideTranslatorPB(InetSocketAddress nameNodeAddr,
                                                Configuration conf) throws IOException {
    RPC.setProtocolEngine(conf, DatanodeProtocolPB.class,
        ProtobufRpcEngine2.class);
    UserGroupInformation ugi = UserGroupInformation.getCurrentUser();
    rpcProxy = createNamenode(nameNodeAddr, conf, ugi);
  }

  private static DatanodeProtocolPB createNamenode(
      InetSocketAddress nameNodeAddr, Configuration conf,
      UserGroupInformation ugi) throws IOException {
    return RPC.getProxy(DatanodeProtocolPB.class,
        RPC.getProtocolVersion(DatanodeProtocolPB.class), nameNodeAddr, ugi,
        conf, NetUtils.getSocketFactory(conf, DatanodeProtocolPB.class));
  }

  @Override
  public void close() throws IOException {
    RPC.stopProxy(rpcProxy);
  }

  @Override
  public DatanodeRegistration registerDatanode(DatanodeRegistration registration
  ) throws IOException {
    RegisterDatanodeRequestProto.Builder builder = RegisterDatanodeRequestProto
        .newBuilder().setRegistration(PBHelper.convert(registration));
    RegisterDatanodeResponseProto resp;
    try {
      resp = rpcProxy.registerDatanode(NULL_CONTROLLER, builder.build());
    } catch (ServiceException se) {
      throw ProtobufHelper.getRemoteException(se);
    }
    return PBHelper.convert(resp.getRegistration());
  }

  @Override
  public HeartbeatResponse sendHeartbeat(DatanodeRegistration registration,
                                         StorageReport[] reports, long cacheCapacity, long cacheUsed,
                                         int xmitsInProgress, int xceiverCount, int failedVolumes,
                                         VolumeFailureSummary volumeFailureSummary,
                                         boolean requestFullBlockReportLease,
                                         @Nonnull SlowPeerReports slowPeers,
                                         @Nonnull SlowDiskReports slowDisks)
      throws IOException {
    HeartbeatRequestProto.Builder builder = HeartbeatRequestProto.newBuilder()
        .setRegistration(PBHelper.convert(registration))
        .setXmitsInProgress(xmitsInProgress).setXceiverCount(xceiverCount)
        .setFailedVolumes(failedVolumes)
        .setRequestFullBlockReportLease(requestFullBlockReportLease);
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
    if (slowPeers.haveSlowPeers()) {
      builder.addAllSlowPeers(PBHelper.convertSlowPeerInfo(slowPeers));
    }
    if (slowDisks.haveSlowDisks()) {
      builder.addAllSlowDisks(PBHelper.convertSlowDiskInfo(slowDisks));
    }

    HeartbeatResponseProto resp;
    try {
      resp = rpcProxy.sendHeartbeat(NULL_CONTROLLER, builder.build());
    } catch (ServiceException se) {
      throw ProtobufHelper.getRemoteException(se);
    }
    DatanodeCommand[] cmds = new DatanodeCommand[resp.getCmdsList().size()];
    int index = 0;
    for (DatanodeCommandProto p : resp.getCmdsList()) {
      cmds[index] = PBHelper.convert(p);
      index++;
    }
    RollingUpgradeStatus rollingUpdateStatus = null;
    // Use v2 semantics if available.
    if (resp.hasRollingUpgradeStatusV2()) {
      rollingUpdateStatus = PBHelperClient.convert(resp.getRollingUpgradeStatusV2());
    } else if (resp.hasRollingUpgradeStatus()) {
      rollingUpdateStatus = PBHelperClient.convert(resp.getRollingUpgradeStatus());
    }
    return new HeartbeatResponse(cmds, PBHelper.convert(resp.getHaStatus()),
        rollingUpdateStatus, resp.getFullBlockReportLeaseId());
  }

  @Override
  public DatanodeCommand blockReport(DatanodeRegistration registration,
                                     String poolId, StorageBlockReport[] reports,
                                     BlockReportContext context)
      throws IOException {
    BlockReportRequestProto.Builder builder = BlockReportRequestProto
        .newBuilder().setRegistration(PBHelper.convert(registration))
        .setBlockPoolId(poolId);

    boolean useBlocksBuffer = registration.getNamespaceInfo()
        .isCapabilitySupported(Capability.STORAGE_BLOCK_REPORT_BUFFERS);

    for (StorageBlockReport r : reports) {
      StorageBlockReportProto.Builder reportBuilder = StorageBlockReportProto
          .newBuilder().setStorage(PBHelperClient.convert(r.getStorage()));
      BlockListAsLongs blocks = r.getBlocks();
      if (useBlocksBuffer) {
        reportBuilder.setNumberOfBlocks(blocks.getNumberOfBlocks());
        reportBuilder.addAllBlocksBuffers(blocks.getBlocksBuffers());
      } else {
        for (long value : blocks.getBlockListAsLongs()) {
          reportBuilder.addBlocks(value);
        }
      }
      builder.addReports(reportBuilder.build());
    }
    builder.setContext(PBHelper.convert(context));
    BlockReportResponseProto resp;
    try {
      resp = rpcProxy.blockReport(NULL_CONTROLLER, builder.build());
    } catch (ServiceException se) {
      throw ProtobufHelper.getRemoteException(se);
    }
    return resp.hasCmd() ? PBHelper.convert(resp.getCmd()) : null;
  }

  @Override
  public DatanodeCommand cacheReport(DatanodeRegistration registration,
                                     String poolId, List<Long> blockIds) throws IOException {
    CacheReportRequestProto.Builder builder =
        CacheReportRequestProto.newBuilder()
            .setRegistration(PBHelper.convert(registration))
            .setBlockPoolId(poolId);
    for (Long blockId : blockIds) {
      builder.addBlocks(blockId);
    }

    CacheReportResponseProto resp;
    try {
      resp = rpcProxy.cacheReport(NULL_CONTROLLER, builder.build());
    } catch (ServiceException se) {
      throw ProtobufHelper.getRemoteException(se);
    }
    if (resp.hasCmd()) {
      return PBHelper.convert(resp.getCmd());
    }
    return null;
  }

  @Override
  public void blockReceivedAndDeleted(DatanodeRegistration registration,
                                      String poolId, StorageReceivedDeletedBlocks[] receivedAndDeletedBlocks)
      throws IOException {
    BlockReceivedAndDeletedRequestProto.Builder builder =
        BlockReceivedAndDeletedRequestProto.newBuilder()
            .setRegistration(PBHelper.convert(registration))
            .setBlockPoolId(poolId);
    for (StorageReceivedDeletedBlocks storageBlock : receivedAndDeletedBlocks) {
      StorageReceivedDeletedBlocksProto.Builder repBuilder =
          StorageReceivedDeletedBlocksProto.newBuilder();
      repBuilder.setStorageUuid(storageBlock.getStorage().getStorageID());  // Set for wire compatibility.
      repBuilder.setStorage(PBHelperClient.convert(storageBlock.getStorage()));
      for (ReceivedDeletedBlockInfo rdBlock : storageBlock.getBlocks()) {
        repBuilder.addBlocks(PBHelper.convert(rdBlock));
      }
      builder.addBlocks(repBuilder.build());
    }
    try {
      rpcProxy.blockReceivedAndDeleted(NULL_CONTROLLER, builder.build());
    } catch (ServiceException se) {
      throw ProtobufHelper.getRemoteException(se);
    }
  }

  @Override
  public void errorReport(DatanodeRegistration registration, int errorCode,
                          String msg) throws IOException {
    ErrorReportRequestProto req = ErrorReportRequestProto.newBuilder()
        .setRegistartion(PBHelper.convert(registration))
        .setErrorCode(errorCode).setMsg(msg).build();
    try {
      rpcProxy.errorReport(NULL_CONTROLLER, req);
    } catch (ServiceException se) {
      throw ProtobufHelper.getRemoteException(se);
    }
  }

  @Override
  public NamespaceInfo versionRequest() throws IOException {
    try {
      return PBHelper.convert(rpcProxy.versionRequest(NULL_CONTROLLER,
          VOID_VERSION_REQUEST).getInfo());
    } catch (ServiceException e) {
      throw ProtobufHelper.getRemoteException(e);
    }
  }

  @Override
  public void reportBadBlocks(LocatedBlock[] blocks) throws IOException {
    ReportBadBlocksRequestProto.Builder builder = ReportBadBlocksRequestProto
        .newBuilder();
    for (int i = 0; i < blocks.length; i++) {
      builder.addBlocks(i, PBHelperClient.convertLocatedBlock(blocks[i]));
    }
    ReportBadBlocksRequestProto req = builder.build();
    try {
      rpcProxy.reportBadBlocks(NULL_CONTROLLER, req);
    } catch (ServiceException se) {
      throw ProtobufHelper.getRemoteException(se);
    }
  }

  @Override
  public void commitBlockSynchronization(ExtendedBlock block,
                                         long newgenerationstamp, long newlength, boolean closeFile,
                                         boolean deleteblock, DatanodeID[] newtargets, String[] newtargetstorages
  ) throws IOException {
    CommitBlockSynchronizationRequestProto.Builder builder =
        CommitBlockSynchronizationRequestProto.newBuilder()
            .setBlock(PBHelperClient.convert(block)).setNewGenStamp(newgenerationstamp)
            .setNewLength(newlength).setCloseFile(closeFile)
            .setDeleteBlock(deleteblock);
    for (int i = 0; i < newtargets.length; i++) {
      if (newtargets[i] == null) {
        continue;
      }
      builder.addNewTaragets(PBHelperClient.convert(newtargets[i]));
      builder.addNewTargetStorages(newtargetstorages[i]);
    }
    CommitBlockSynchronizationRequestProto req = builder.build();
    try {
      rpcProxy.commitBlockSynchronization(NULL_CONTROLLER, req);
    } catch (ServiceException se) {
      throw ProtobufHelper.getRemoteException(se);
    }
  }

  @Override // ProtocolMetaInterface
  public boolean isMethodSupported(String methodName)
      throws IOException {
    return RpcClientUtil.isMethodSupported(rpcProxy, DatanodeProtocolPB.class,
        RPC.RpcKind.RPC_PROTOCOL_BUFFER,
        RPC.getProtocolVersion(DatanodeProtocolPB.class), methodName);
  }
}
