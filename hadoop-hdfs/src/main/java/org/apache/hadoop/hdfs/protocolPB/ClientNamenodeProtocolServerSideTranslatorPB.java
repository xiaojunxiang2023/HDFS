package org.apache.hadoop.hdfs.protocolPB;

import org.apache.hadoop.fs.BatchedRemoteIterator.BatchedEntries;
import org.apache.hadoop.fs.ContentSummary;
import org.apache.hadoop.fs.CreateFlag;
import org.apache.hadoop.fs.FsServerDefaults;
import org.apache.hadoop.fs.Options.Rename;
import org.apache.hadoop.fs.QuotaUsage;
import org.apache.hadoop.fs.permission.FsCreateModes;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.ha.proto.HAServiceProtocolProtos;
import org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAServiceStateProto;
import org.apache.hadoop.ha.status.HAServiceProtocol;
import org.apache.hadoop.hdfs.AddBlockFlag;
import org.apache.hadoop.hdfs.protocol.*;
import org.apache.hadoop.hdfs.protocol.OpenFilesIterator.OpenFilesType;
import org.apache.hadoop.hdfs.protocol.proto.AclProtos.*;
import org.apache.hadoop.hdfs.protocol.proto.ClientNamenodeProtocolProtos.*;
import org.apache.hadoop.hdfs.protocol.proto.ClientNamenodeProtocolProtos.GetBlockLocationsResponseProto.Builder;
import org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.*;
import org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.*;
import org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.*;
import org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.*;
import org.apache.hadoop.hdfs.security.token.block.DataEncryptionKey;
import org.apache.hadoop.hdfs.security.token.delegation.DelegationTokenIdentifier;
import org.apache.hadoop.io.EnumSetWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.ipc.RemoteException;
import org.apache.hadoop.security.proto.SecurityProtos.*;
import org.apache.hadoop.security.token.Token;
import org.apache.hadoop.thirdparty.protobuf.ByteString;
import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/**
 * This class is used on the server side. Calls come across the wire for the
 * for protocol {@link ClientNamenodeProtocolPB}.
 * This class translates the PB data types
 * to the native data types used inside the NN as specified in the generic
 * ClientProtocol.
 */
public class ClientNamenodeProtocolServerSideTranslatorPB implements
    ClientNamenodeProtocolPB {
  final private ClientProtocol server;
  static final DeleteSnapshotResponseProto VOID_DELETE_SNAPSHOT_RESPONSE =
      DeleteSnapshotResponseProto.newBuilder().build();
  static final RenameSnapshotResponseProto VOID_RENAME_SNAPSHOT_RESPONSE =
      RenameSnapshotResponseProto.newBuilder().build();
  static final AllowSnapshotResponseProto VOID_ALLOW_SNAPSHOT_RESPONSE =
      AllowSnapshotResponseProto.newBuilder().build();
  static final DisallowSnapshotResponseProto VOID_DISALLOW_SNAPSHOT_RESPONSE =
      DisallowSnapshotResponseProto.newBuilder().build();
  static final GetSnapshottableDirListingResponseProto
      NULL_GET_SNAPSHOTTABLE_DIR_LISTING_RESPONSE =
      GetSnapshottableDirListingResponseProto.newBuilder().build();
  static final SetStoragePolicyResponseProto VOID_SET_STORAGE_POLICY_RESPONSE =
      SetStoragePolicyResponseProto.newBuilder().build();
  static final UnsetStoragePolicyResponseProto
      VOID_UNSET_STORAGE_POLICY_RESPONSE =
      UnsetStoragePolicyResponseProto.newBuilder().build();

  private static final CreateResponseProto VOID_CREATE_RESPONSE =
      CreateResponseProto.newBuilder().build();

  private static final SetPermissionResponseProto VOID_SET_PERM_RESPONSE =
      SetPermissionResponseProto.newBuilder().build();

  private static final SetOwnerResponseProto VOID_SET_OWNER_RESPONSE =
      SetOwnerResponseProto.newBuilder().build();

  private static final AbandonBlockResponseProto VOID_ADD_BLOCK_RESPONSE =
      AbandonBlockResponseProto.newBuilder().build();

  private static final ReportBadBlocksResponseProto VOID_REP_BAD_BLOCK_RESPONSE =
      ReportBadBlocksResponseProto.newBuilder().build();

  private static final ConcatResponseProto VOID_CONCAT_RESPONSE =
      ConcatResponseProto.newBuilder().build();

  private static final Rename2ResponseProto VOID_RENAME2_RESPONSE =
      Rename2ResponseProto.newBuilder().build();

  private static final GetListingResponseProto VOID_GETLISTING_RESPONSE =
      GetListingResponseProto.newBuilder().build();

  private static final GetBatchedListingResponseProto
      VOID_GETBATCHEDLISTING_RESPONSE =
      GetBatchedListingResponseProto.newBuilder()
          .setStartAfter(ByteString.copyFromUtf8(""))
          .setHasMore(false)
          .build();

  private static final RenewLeaseResponseProto VOID_RENEWLEASE_RESPONSE =
      RenewLeaseResponseProto.newBuilder().build();

  private static final RefreshNodesResponseProto VOID_REFRESHNODES_RESPONSE =
      RefreshNodesResponseProto.newBuilder().build();

  private static final FinalizeUpgradeResponseProto VOID_FINALIZEUPGRADE_RESPONSE =
      FinalizeUpgradeResponseProto.newBuilder().build();

  private static final MetaSaveResponseProto VOID_METASAVE_RESPONSE =
      MetaSaveResponseProto.newBuilder().build();

  private static final GetFileInfoResponseProto VOID_GETFILEINFO_RESPONSE =
      GetFileInfoResponseProto.newBuilder().build();

  private static final GetLocatedFileInfoResponseProto
      VOID_GETLOCATEDFILEINFO_RESPONSE =
      GetLocatedFileInfoResponseProto.newBuilder().build();

  private static final GetFileLinkInfoResponseProto VOID_GETFILELINKINFO_RESPONSE =
      GetFileLinkInfoResponseProto.newBuilder().build();

  private static final SetQuotaResponseProto VOID_SETQUOTA_RESPONSE =
      SetQuotaResponseProto.newBuilder().build();

  private static final FsyncResponseProto VOID_FSYNC_RESPONSE =
      FsyncResponseProto.newBuilder().build();

  private static final SetTimesResponseProto VOID_SETTIMES_RESPONSE =
      SetTimesResponseProto.newBuilder().build();

  private static final CreateSymlinkResponseProto VOID_CREATESYMLINK_RESPONSE =
      CreateSymlinkResponseProto.newBuilder().build();

  private static final UpdatePipelineResponseProto
      VOID_UPDATEPIPELINE_RESPONSE =
      UpdatePipelineResponseProto.newBuilder().build();

  private static final CancelDelegationTokenResponseProto
      VOID_CANCELDELEGATIONTOKEN_RESPONSE =
      CancelDelegationTokenResponseProto.newBuilder().build();

  private static final SetBalancerBandwidthResponseProto
      VOID_SETBALANCERBANDWIDTH_RESPONSE =
      SetBalancerBandwidthResponseProto.newBuilder().build();

  private static final SetAclResponseProto
      VOID_SETACL_RESPONSE = SetAclResponseProto.getDefaultInstance();

  private static final ModifyAclEntriesResponseProto
      VOID_MODIFYACLENTRIES_RESPONSE = ModifyAclEntriesResponseProto
      .getDefaultInstance();

  private static final RemoveAclEntriesResponseProto
      VOID_REMOVEACLENTRIES_RESPONSE = RemoveAclEntriesResponseProto
      .getDefaultInstance();

  private static final RemoveDefaultAclResponseProto
      VOID_REMOVEDEFAULTACL_RESPONSE = RemoveDefaultAclResponseProto
      .getDefaultInstance();

  private static final RemoveAclResponseProto
      VOID_REMOVEACL_RESPONSE = RemoveAclResponseProto.getDefaultInstance();

  private static final SetXAttrResponseProto
      VOID_SETXATTR_RESPONSE = SetXAttrResponseProto.getDefaultInstance();

  private static final RemoveXAttrResponseProto
      VOID_REMOVEXATTR_RESPONSE = RemoveXAttrResponseProto.getDefaultInstance();

  private static final CheckAccessResponseProto
      VOID_CHECKACCESS_RESPONSE = CheckAccessResponseProto.getDefaultInstance();

  private static final SatisfyStoragePolicyResponseProto
      VOID_SATISFYSTORAGEPOLICY_RESPONSE = SatisfyStoragePolicyResponseProto
      .getDefaultInstance();

  /**
   * Constructor
   *
   * @param server - the NN server
   * @throws IOException
   */
  public ClientNamenodeProtocolServerSideTranslatorPB(ClientProtocol server)
      throws IOException {
    this.server = server;
  }

  @Override
  public GetBlockLocationsResponseProto getBlockLocations(
      RpcController controller, GetBlockLocationsRequestProto req)
      throws ServiceException {
    try {
      LocatedBlocks b = server.getBlockLocations(req.getSrc(), req.getOffset(),
          req.getLength());
      Builder builder = GetBlockLocationsResponseProto
          .newBuilder();
      if (b != null) {
        builder.setLocations(PBHelperClient.convert(b)).build();
      }
      return builder.build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetServerDefaultsResponseProto getServerDefaults(
      RpcController controller, GetServerDefaultsRequestProto req)
      throws ServiceException {
    try {
      FsServerDefaults result = server.getServerDefaults();
      return GetServerDefaultsResponseProto.newBuilder()
          .setServerDefaults(PBHelperClient.convert(result))
          .build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }


  @Override
  public CreateResponseProto create(RpcController controller,
                                    CreateRequestProto req) throws ServiceException {
    try {
      FsPermission masked = req.hasUnmasked() ?
          FsCreateModes.create(PBHelperClient.convert(req.getMasked()),
              PBHelperClient.convert(req.getUnmasked())) :
          PBHelperClient.convert(req.getMasked());
      HdfsFileStatus result = server.create(req.getSrc(),
          masked, req.getClientName(),
          PBHelperClient.convertCreateFlag(req.getCreateFlag()), req.getCreateParent(),
          (short) req.getReplication(), req.getBlockSize(),
          PBHelperClient.convertCryptoProtocolVersions(
              req.getCryptoProtocolVersionList()),
          req.getEcPolicyName(), req.getStoragePolicy());

      if (result != null) {
        return CreateResponseProto.newBuilder().setFs(PBHelperClient.convert(result))
            .build();
      }
      return VOID_CREATE_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public AppendResponseProto append(RpcController controller,
                                    AppendRequestProto req) throws ServiceException {
    try {
      EnumSetWritable<CreateFlag> flags = req.hasFlag() ?
          PBHelperClient.convertCreateFlag(req.getFlag()) :
          new EnumSetWritable<>(EnumSet.of(CreateFlag.APPEND));
      LastBlockWithStatus result = server.append(req.getSrc(),
          req.getClientName(), flags);
      AppendResponseProto.Builder builder = AppendResponseProto.newBuilder();
      if (result.getLastBlock() != null) {
        builder.setBlock(PBHelperClient.convertLocatedBlock(
            result.getLastBlock()));
      }
      if (result.getFileStatus() != null) {
        builder.setStat(PBHelperClient.convert(result.getFileStatus()));
      }
      return builder.build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public SetReplicationResponseProto setReplication(RpcController controller,
                                                    SetReplicationRequestProto req) throws ServiceException {
    try {
      boolean result =
          server.setReplication(req.getSrc(), (short) req.getReplication());
      return SetReplicationResponseProto.newBuilder().setResult(result).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }


  @Override
  public SetPermissionResponseProto setPermission(RpcController controller,
                                                  SetPermissionRequestProto req) throws ServiceException {
    try {
      server.setPermission(req.getSrc(), PBHelperClient.convert(req.getPermission()));
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_SET_PERM_RESPONSE;
  }

  @Override
  public SetOwnerResponseProto setOwner(RpcController controller,
                                        SetOwnerRequestProto req) throws ServiceException {
    try {
      server.setOwner(req.getSrc(),
          req.hasUsername() ? req.getUsername() : null,
          req.hasGroupname() ? req.getGroupname() : null);
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_SET_OWNER_RESPONSE;
  }

  @Override
  public AbandonBlockResponseProto abandonBlock(RpcController controller,
                                                AbandonBlockRequestProto req) throws ServiceException {
    try {
      server.abandonBlock(PBHelperClient.convert(req.getB()), req.getFileId(),
          req.getSrc(), req.getHolder());
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_ADD_BLOCK_RESPONSE;
  }

  @Override
  public AddBlockResponseProto addBlock(RpcController controller,
                                        AddBlockRequestProto req) throws ServiceException {

    try {
      List<DatanodeInfoProto> excl = req.getExcludeNodesList();
      List<String> favor = req.getFavoredNodesList();
      EnumSet<AddBlockFlag> flags =
          PBHelperClient.convertAddBlockFlags(req.getFlagsList());
      LocatedBlock result = server.addBlock(
          req.getSrc(),
          req.getClientName(),
          req.hasPrevious() ? PBHelperClient.convert(req.getPrevious()) : null,
          (excl == null || excl.size() == 0) ? null : PBHelperClient.convert(excl
              .toArray(new DatanodeInfoProto[excl.size()])), req.getFileId(),
          (favor == null || favor.size() == 0) ? null : favor
              .toArray(new String[favor.size()]),
          flags);
      return AddBlockResponseProto.newBuilder()
          .setBlock(PBHelperClient.convertLocatedBlock(result)).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetAdditionalDatanodeResponseProto getAdditionalDatanode(
      RpcController controller, GetAdditionalDatanodeRequestProto req)
      throws ServiceException {
    try {
      List<DatanodeInfoProto> existingList = req.getExistingsList();
      List<String> existingStorageIDsList = req.getExistingStorageUuidsList();
      List<DatanodeInfoProto> excludesList = req.getExcludesList();
      LocatedBlock result = server.getAdditionalDatanode(req.getSrc(),
          req.getFileId(), PBHelperClient.convert(req.getBlk()),
          PBHelperClient.convert(existingList.toArray(
              new DatanodeInfoProto[existingList.size()])),
          existingStorageIDsList.toArray(
              new String[existingStorageIDsList.size()]),
          PBHelperClient.convert(excludesList.toArray(
              new DatanodeInfoProto[excludesList.size()])),
          req.getNumAdditionalNodes(), req.getClientName());
      return GetAdditionalDatanodeResponseProto.newBuilder().setBlock(
          PBHelperClient.convertLocatedBlock(result))
          .build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public CompleteResponseProto complete(RpcController controller,
                                        CompleteRequestProto req) throws ServiceException {
    try {
      boolean result =
          server.complete(req.getSrc(), req.getClientName(),
              req.hasLast() ? PBHelperClient.convert(req.getLast()) : null,
              req.hasFileId() ? req.getFileId() : HdfsConstants.GRANDFATHER_INODE_ID);
      return CompleteResponseProto.newBuilder().setResult(result).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public ReportBadBlocksResponseProto reportBadBlocks(RpcController controller,
                                                      ReportBadBlocksRequestProto req) throws ServiceException {
    try {
      List<LocatedBlockProto> bl = req.getBlocksList();
      server.reportBadBlocks(PBHelperClient.convertLocatedBlocks(
          bl.toArray(new LocatedBlockProto[bl.size()])));
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_REP_BAD_BLOCK_RESPONSE;
  }

  @Override
  public ConcatResponseProto concat(RpcController controller,
                                    ConcatRequestProto req) throws ServiceException {
    try {
      List<String> srcs = req.getSrcsList();
      server.concat(req.getTrg(), srcs.toArray(new String[srcs.size()]));
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_CONCAT_RESPONSE;
  }

  @Override
  public RenameResponseProto rename(RpcController controller,
                                    RenameRequestProto req) throws ServiceException {
    try {
      boolean result = server.rename(req.getSrc(), req.getDst());
      return RenameResponseProto.newBuilder().setResult(result).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public Rename2ResponseProto rename2(RpcController controller,
                                      Rename2RequestProto req) throws ServiceException {
    // resolve rename options
    ArrayList<Rename> optionList = new ArrayList<Rename>();
    if (req.getOverwriteDest()) {
      optionList.add(Rename.OVERWRITE);
    }
    if (req.hasMoveToTrash() && req.getMoveToTrash()) {
      optionList.add(Rename.TO_TRASH);
    }

    if (optionList.isEmpty()) {
      optionList.add(Rename.NONE);
    }

    try {
      server.rename2(req.getSrc(), req.getDst(),
          optionList.toArray(new Rename[optionList.size()]));
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_RENAME2_RESPONSE;
  }

  @Override
  public TruncateResponseProto truncate(RpcController controller,
                                        TruncateRequestProto req) throws ServiceException {
    try {
      boolean result = server.truncate(req.getSrc(), req.getNewLength(),
          req.getClientName());
      return TruncateResponseProto.newBuilder().setResult(result).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public DeleteResponseProto delete(RpcController controller,
                                    DeleteRequestProto req) throws ServiceException {
    try {
      boolean result = server.delete(req.getSrc(), req.getRecursive());
      return DeleteResponseProto.newBuilder().setResult(result).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public MkdirsResponseProto mkdirs(RpcController controller,
                                    MkdirsRequestProto req) throws ServiceException {
    try {
      FsPermission masked = req.hasUnmasked() ?
          FsCreateModes.create(PBHelperClient.convert(req.getMasked()),
              PBHelperClient.convert(req.getUnmasked())) :
          PBHelperClient.convert(req.getMasked());
      boolean result = server.mkdirs(req.getSrc(), masked,
          req.getCreateParent());
      return MkdirsResponseProto.newBuilder().setResult(result).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetListingResponseProto getListing(RpcController controller,
                                            GetListingRequestProto req) throws ServiceException {
    try {
      DirectoryListing result = server.getListing(
          req.getSrc(), req.getStartAfter().toByteArray(),
          req.getNeedLocation());
      if (result != null) {
        return GetListingResponseProto.newBuilder().setDirList(
            PBHelperClient.convert(result)).build();
      } else {
        return VOID_GETLISTING_RESPONSE;
      }
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetBatchedListingResponseProto getBatchedListing(
      RpcController controller,
      GetBatchedListingRequestProto request) throws ServiceException {
    try {
      BatchedDirectoryListing result = server.getBatchedListing(
          request.getPathsList().toArray(new String[]{}),
          request.getStartAfter().toByteArray(),
          request.getNeedLocation());
      if (result != null) {
        GetBatchedListingResponseProto.Builder builder =
            GetBatchedListingResponseProto.newBuilder();
        for (HdfsPartialListing partialListing : result.getListings()) {
          BatchedDirectoryListingProto.Builder listingBuilder =
              BatchedDirectoryListingProto.newBuilder();
          if (partialListing.getException() != null) {
            RemoteException ex = partialListing.getException();
            RemoteExceptionProto.Builder rexBuilder =
                RemoteExceptionProto.newBuilder();
            rexBuilder.setClassName(ex.getClassName());
            if (ex.getMessage() != null) {
              rexBuilder.setMessage(ex.getMessage());
            }
            listingBuilder.setException(rexBuilder.build());
          } else {
            for (HdfsFileStatus f : partialListing.getPartialListing()) {
              listingBuilder.addPartialListing(PBHelperClient.convert(f));
            }
          }
          listingBuilder.setParentIdx(partialListing.getParentIdx());
          builder.addListings(listingBuilder);
        }
        builder.setHasMore(result.hasMore());
        builder.setStartAfter(ByteString.copyFrom(result.getStartAfter()));
        return builder.build();
      } else {
        return VOID_GETBATCHEDLISTING_RESPONSE;
      }
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public RenewLeaseResponseProto renewLease(RpcController controller,
                                            RenewLeaseRequestProto req) throws ServiceException {
    try {
      server.renewLease(req.getClientName());
      return VOID_RENEWLEASE_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public RecoverLeaseResponseProto recoverLease(RpcController controller,
                                                RecoverLeaseRequestProto req) throws ServiceException {
    try {
      boolean result = server.recoverLease(req.getSrc(), req.getClientName());
      return RecoverLeaseResponseProto.newBuilder().setResult(result).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public RestoreFailedStorageResponseProto restoreFailedStorage(
      RpcController controller, RestoreFailedStorageRequestProto req)
      throws ServiceException {
    try {
      boolean result = server.restoreFailedStorage(req.getArg());
      return RestoreFailedStorageResponseProto.newBuilder().setResult(result)
          .build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetFsStatsResponseProto getFsStats(RpcController controller,
                                            GetFsStatusRequestProto req) throws ServiceException {
    try {
      return PBHelperClient.convert(server.getStats());
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetFsReplicatedBlockStatsResponseProto getFsReplicatedBlockStats(
      RpcController controller, GetFsReplicatedBlockStatsRequestProto request)
      throws ServiceException {
    try {
      return PBHelperClient.convert(server.getReplicatedBlockStats());
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetFsECBlockGroupStatsResponseProto getFsECBlockGroupStats(RpcController rpcController, GetFsECBlockGroupStatsRequestProto getFsECBlockGroupStatsRequestProto) throws ServiceException {
    return null;
  }


  @Override
  public GetDatanodeReportResponseProto getDatanodeReport(
      RpcController controller, GetDatanodeReportRequestProto req)
      throws ServiceException {
    try {
      List<? extends DatanodeInfoProto> result = PBHelperClient.convert(server
          .getDatanodeReport(PBHelperClient.convert(req.getType())));
      return GetDatanodeReportResponseProto.newBuilder()
          .addAllDi(result).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetDatanodeStorageReportResponseProto getDatanodeStorageReport(
      RpcController controller, GetDatanodeStorageReportRequestProto req)
      throws ServiceException {
    try {
      List<DatanodeStorageReportProto> reports = PBHelperClient.convertDatanodeStorageReports(
          server.getDatanodeStorageReport(PBHelperClient.convert(req.getType())));
      return GetDatanodeStorageReportResponseProto.newBuilder()
          .addAllDatanodeStorageReports(reports)
          .build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetPreferredBlockSizeResponseProto getPreferredBlockSize(
      RpcController controller, GetPreferredBlockSizeRequestProto req)
      throws ServiceException {
    try {
      long result = server.getPreferredBlockSize(req.getFilename());
      return GetPreferredBlockSizeResponseProto.newBuilder().setBsize(result)
          .build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public SetSafeModeResponseProto setSafeMode(RpcController controller,
                                              SetSafeModeRequestProto req) throws ServiceException {
    try {
      boolean result = server.setSafeMode(PBHelperClient.convert(req.getAction()),
          req.getChecked());
      return SetSafeModeResponseProto.newBuilder().setResult(result).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public SaveNamespaceResponseProto saveNamespace(RpcController controller,
                                                  SaveNamespaceRequestProto req) throws ServiceException {
    try {
      final long timeWindow = req.hasTimeWindow() ? req.getTimeWindow() : 0;
      final long txGap = req.hasTxGap() ? req.getTxGap() : 0;
      boolean saved = server.saveNamespace(timeWindow, txGap);
      return SaveNamespaceResponseProto.newBuilder().setSaved(saved).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public RollEditsResponseProto rollEdits(RpcController controller,
                                          RollEditsRequestProto request) throws ServiceException {
    try {
      long txid = server.rollEdits();
      return RollEditsResponseProto.newBuilder()
          .setNewSegmentTxId(txid)
          .build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }


  @Override
  public RefreshNodesResponseProto refreshNodes(RpcController controller,
                                                RefreshNodesRequestProto req) throws ServiceException {
    try {
      server.refreshNodes();
      return VOID_REFRESHNODES_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }

  }

  @Override
  public FinalizeUpgradeResponseProto finalizeUpgrade(RpcController controller,
                                                      FinalizeUpgradeRequestProto req) throws ServiceException {
    try {
      server.finalizeUpgrade();
      return VOID_FINALIZEUPGRADE_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public UpgradeStatusResponseProto upgradeStatus(
      RpcController controller, UpgradeStatusRequestProto req)
      throws ServiceException {
    try {
      final boolean isUpgradeFinalized = server.upgradeStatus();
      UpgradeStatusResponseProto.Builder b =
          UpgradeStatusResponseProto.newBuilder();
      b.setUpgradeFinalized(isUpgradeFinalized);
      return b.build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public RollingUpgradeResponseProto rollingUpgrade(RpcController controller,
                                                    RollingUpgradeRequestProto req) throws ServiceException {
    try {
      final RollingUpgradeInfo info = server.rollingUpgrade(
          PBHelperClient.convert(req.getAction()));
      final RollingUpgradeResponseProto.Builder b = RollingUpgradeResponseProto.newBuilder();
      if (info != null) {
        b.setRollingUpgradeInfo(PBHelperClient.convert(info));
      }
      return b.build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public ListCorruptFileBlocksResponseProto listCorruptFileBlocks(
      RpcController controller, ListCorruptFileBlocksRequestProto req)
      throws ServiceException {
    try {
      CorruptFileBlocks result = server.listCorruptFileBlocks(
          req.getPath(), req.hasCookie() ? req.getCookie() : null);
      return ListCorruptFileBlocksResponseProto.newBuilder()
          .setCorrupt(PBHelperClient.convert(result))
          .build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public MetaSaveResponseProto metaSave(RpcController controller,
                                        MetaSaveRequestProto req) throws ServiceException {
    try {
      server.metaSave(req.getFilename());
      return VOID_METASAVE_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }

  }

  @Override
  public GetFileInfoResponseProto getFileInfo(RpcController controller,
                                              GetFileInfoRequestProto req) throws ServiceException {
    try {
      HdfsFileStatus result = server.getFileInfo(req.getSrc());

      if (result != null) {
        return GetFileInfoResponseProto.newBuilder().setFs(
            PBHelperClient.convert(result)).build();
      }
      return VOID_GETFILEINFO_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetLocatedFileInfoResponseProto getLocatedFileInfo(
      RpcController controller, GetLocatedFileInfoRequestProto req)
      throws ServiceException {
    try {
      HdfsFileStatus result = server.getLocatedFileInfo(req.getSrc(),
          req.getNeedBlockToken());
      if (result != null) {
        return GetLocatedFileInfoResponseProto.newBuilder().setFs(
            PBHelperClient.convert(result)).build();
      }
      return VOID_GETLOCATEDFILEINFO_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetFileLinkInfoResponseProto getFileLinkInfo(RpcController controller,
                                                      GetFileLinkInfoRequestProto req) throws ServiceException {
    try {
      HdfsFileStatus result = server.getFileLinkInfo(req.getSrc());
      if (result != null) {
        return GetFileLinkInfoResponseProto.newBuilder().setFs(
            PBHelperClient.convert(result)).build();
      } else {
        return VOID_GETFILELINKINFO_RESPONSE;
      }

    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetContentSummaryResponseProto getContentSummary(
      RpcController controller, GetContentSummaryRequestProto req)
      throws ServiceException {
    try {
      ContentSummary result = server.getContentSummary(req.getPath());
      return GetContentSummaryResponseProto.newBuilder()
          .setSummary(PBHelperClient.convert(result)).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public SetQuotaResponseProto setQuota(RpcController controller,
                                        SetQuotaRequestProto req) throws ServiceException {
    try {
      server.setQuota(req.getPath(), req.getNamespaceQuota(),
          req.getStoragespaceQuota(),
          req.hasStorageType() ?
              PBHelperClient.convertStorageType(req.getStorageType()) : null);
      return VOID_SETQUOTA_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public FsyncResponseProto fsync(RpcController controller,
                                  FsyncRequestProto req) throws ServiceException {
    try {
      server.fsync(req.getSrc(), req.getFileId(),
          req.getClient(), req.getLastBlockLength());
      return VOID_FSYNC_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public SetTimesResponseProto setTimes(RpcController controller,
                                        SetTimesRequestProto req) throws ServiceException {
    try {
      server.setTimes(req.getSrc(), req.getMtime(), req.getAtime());
      return VOID_SETTIMES_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public CreateSymlinkResponseProto createSymlink(RpcController controller,
                                                  CreateSymlinkRequestProto req) throws ServiceException {
    try {
      server.createSymlink(req.getTarget(), req.getLink(),
          PBHelperClient.convert(req.getDirPerm()), req.getCreateParent());
      return VOID_CREATESYMLINK_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetLinkTargetResponseProto getLinkTarget(RpcController controller,
                                                  GetLinkTargetRequestProto req) throws ServiceException {
    try {
      String result = server.getLinkTarget(req.getPath());
      GetLinkTargetResponseProto.Builder builder = GetLinkTargetResponseProto
          .newBuilder();
      if (result != null) {
        builder.setTargetPath(result);
      }
      return builder.build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public UpdateBlockForPipelineResponseProto updateBlockForPipeline(
      RpcController controller, UpdateBlockForPipelineRequestProto req)
      throws ServiceException {
    try {
      LocatedBlockProto result = PBHelperClient.convertLocatedBlock(
          server.updateBlockForPipeline(PBHelperClient.convert(req.getBlock()),
              req.getClientName()));
      return UpdateBlockForPipelineResponseProto.newBuilder().setBlock(result)
          .build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public UpdatePipelineResponseProto updatePipeline(RpcController controller,
                                                    UpdatePipelineRequestProto req) throws ServiceException {
    try {
      List<DatanodeIDProto> newNodes = req.getNewNodesList();
      List<String> newStorageIDs = req.getStorageIDsList();
      server.updatePipeline(req.getClientName(),
          PBHelperClient.convert(req.getOldBlock()),
          PBHelperClient.convert(req.getNewBlock()),
          PBHelperClient.convert(newNodes.toArray(new DatanodeIDProto[newNodes.size()])),
          newStorageIDs.toArray(new String[newStorageIDs.size()]));
      return VOID_UPDATEPIPELINE_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetDelegationTokenResponseProto getDelegationToken(
      RpcController controller, GetDelegationTokenRequestProto req)
      throws ServiceException {
    try {
      Token<DelegationTokenIdentifier> token = server
          .getDelegationToken(new Text(req.getRenewer()));
      GetDelegationTokenResponseProto.Builder rspBuilder =
          GetDelegationTokenResponseProto.newBuilder();
      if (token != null) {
        rspBuilder.setToken(PBHelperClient.convert(token));
      }
      return rspBuilder.build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public RenewDelegationTokenResponseProto renewDelegationToken(
      RpcController controller, RenewDelegationTokenRequestProto req)
      throws ServiceException {
    try {
      long result = server.renewDelegationToken(PBHelperClient
          .convertDelegationToken(req.getToken()));
      return RenewDelegationTokenResponseProto.newBuilder()
          .setNewExpiryTime(result).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public CancelDelegationTokenResponseProto cancelDelegationToken(
      RpcController controller, CancelDelegationTokenRequestProto req)
      throws ServiceException {
    try {
      server.cancelDelegationToken(PBHelperClient.convertDelegationToken(req
          .getToken()));
      return VOID_CANCELDELEGATIONTOKEN_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public SetBalancerBandwidthResponseProto setBalancerBandwidth(
      RpcController controller, SetBalancerBandwidthRequestProto req)
      throws ServiceException {
    try {
      server.setBalancerBandwidth(req.getBandwidth());
      return VOID_SETBALANCERBANDWIDTH_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetDataEncryptionKeyResponseProto getDataEncryptionKey(
      RpcController controller, GetDataEncryptionKeyRequestProto request)
      throws ServiceException {
    try {
      GetDataEncryptionKeyResponseProto.Builder builder =
          GetDataEncryptionKeyResponseProto.newBuilder();
      DataEncryptionKey encryptionKey = server.getDataEncryptionKey();
      if (encryptionKey != null) {
        builder.setDataEncryptionKey(PBHelperClient.convert(encryptionKey));
      }
      return builder.build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public CreateSnapshotResponseProto createSnapshot(RpcController controller,
                                                    CreateSnapshotRequestProto req) throws ServiceException {
    try {
      final CreateSnapshotResponseProto.Builder builder
          = CreateSnapshotResponseProto.newBuilder();
      final String snapshotPath = server.createSnapshot(req.getSnapshotRoot(),
          req.hasSnapshotName() ? req.getSnapshotName() : null);
      if (snapshotPath != null) {
        builder.setSnapshotPath(snapshotPath);
      }
      return builder.build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public DeleteSnapshotResponseProto deleteSnapshot(RpcController controller,
                                                    DeleteSnapshotRequestProto req) throws ServiceException {
    try {
      server.deleteSnapshot(req.getSnapshotRoot(), req.getSnapshotName());
      return VOID_DELETE_SNAPSHOT_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public AllowSnapshotResponseProto allowSnapshot(RpcController controller,
                                                  AllowSnapshotRequestProto req) throws ServiceException {
    try {
      server.allowSnapshot(req.getSnapshotRoot());
      return VOID_ALLOW_SNAPSHOT_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public DisallowSnapshotResponseProto disallowSnapshot(RpcController controller,
                                                        DisallowSnapshotRequestProto req) throws ServiceException {
    try {
      server.disallowSnapshot(req.getSnapshotRoot());
      return VOID_DISALLOW_SNAPSHOT_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public RenameSnapshotResponseProto renameSnapshot(RpcController controller,
                                                    RenameSnapshotRequestProto request) throws ServiceException {
    try {
      server.renameSnapshot(request.getSnapshotRoot(),
          request.getSnapshotOldName(), request.getSnapshotNewName());
      return VOID_RENAME_SNAPSHOT_RESPONSE;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetSnapshottableDirListingResponseProto getSnapshottableDirListing(
      RpcController controller, GetSnapshottableDirListingRequestProto request)
      throws ServiceException {
    try {
      SnapshottableDirectoryStatus[] result = server
          .getSnapshottableDirListing();
      if (result != null) {
        return GetSnapshottableDirListingResponseProto.newBuilder().
            setSnapshottableDirList(PBHelperClient.convert(result)).build();
      } else {
        return NULL_GET_SNAPSHOTTABLE_DIR_LISTING_RESPONSE;
      }
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetSnapshotDiffReportResponseProto getSnapshotDiffReport(
      RpcController controller, GetSnapshotDiffReportRequestProto request)
      throws ServiceException {
    try {
      SnapshotDiffReport report = server.getSnapshotDiffReport(
          request.getSnapshotRoot(), request.getFromSnapshot(),
          request.getToSnapshot());
      return GetSnapshotDiffReportResponseProto.newBuilder()
          .setDiffReport(PBHelperClient.convert(report)).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetSnapshotDiffReportListingResponseProto getSnapshotDiffReportListing(
      RpcController controller,
      GetSnapshotDiffReportListingRequestProto request)
      throws ServiceException {
    try {
      SnapshotDiffReportListing report = server
          .getSnapshotDiffReportListing(request.getSnapshotRoot(),
              request.getFromSnapshot(), request.getToSnapshot(),
              request.getCursor().getStartPath().toByteArray(),
              request.getCursor().getIndex());
      //request.getStartPath(), request.getIndex());
      return GetSnapshotDiffReportListingResponseProto.newBuilder()
          .setDiffReport(PBHelperClient.convert(report)).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public IsFileClosedResponseProto isFileClosed(
      RpcController controller, IsFileClosedRequestProto request)
      throws ServiceException {
    try {
      boolean result = server.isFileClosed(request.getSrc());
      return IsFileClosedResponseProto.newBuilder().setResult(result).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public AddCacheDirectiveResponseProto addCacheDirective(
      RpcController controller, AddCacheDirectiveRequestProto request)
      throws ServiceException {
    try {
      long id = server.addCacheDirective(
          PBHelperClient.convert(request.getInfo()),
          PBHelperClient.convertCacheFlags(request.getCacheFlags()));
      return AddCacheDirectiveResponseProto.newBuilder().
          setId(id).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public ModifyCacheDirectiveResponseProto modifyCacheDirective(
      RpcController controller, ModifyCacheDirectiveRequestProto request)
      throws ServiceException {
    try {
      server.modifyCacheDirective(
          PBHelperClient.convert(request.getInfo()),
          PBHelperClient.convertCacheFlags(request.getCacheFlags()));
      return ModifyCacheDirectiveResponseProto.newBuilder().build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public RemoveCacheDirectiveResponseProto
  removeCacheDirective(RpcController controller,
                       RemoveCacheDirectiveRequestProto request)
      throws ServiceException {
    try {
      server.removeCacheDirective(request.getId());
      return RemoveCacheDirectiveResponseProto.
          newBuilder().build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public ListCacheDirectivesResponseProto listCacheDirectives(
      RpcController controller, ListCacheDirectivesRequestProto request)
      throws ServiceException {
    try {
      CacheDirectiveInfo filter =
          PBHelperClient.convert(request.getFilter());
      BatchedEntries<CacheDirectiveEntry> entries =
          server.listCacheDirectives(request.getPrevId(), filter);
      ListCacheDirectivesResponseProto.Builder builder =
          ListCacheDirectivesResponseProto.newBuilder();
      builder.setHasMore(entries.hasMore());
      for (int i = 0, n = entries.size(); i < n; i++) {
        builder.addElements(PBHelperClient.convert(entries.get(i)));
      }
      return builder.build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public AddCachePoolResponseProto addCachePool(RpcController controller,
                                                AddCachePoolRequestProto request) throws ServiceException {
    try {
      server.addCachePool(PBHelperClient.convert(request.getInfo()));
      return AddCachePoolResponseProto.newBuilder().build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public ModifyCachePoolResponseProto modifyCachePool(RpcController controller,
                                                      ModifyCachePoolRequestProto request) throws ServiceException {
    try {
      server.modifyCachePool(PBHelperClient.convert(request.getInfo()));
      return ModifyCachePoolResponseProto.newBuilder().build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public RemoveCachePoolResponseProto removeCachePool(RpcController controller,
                                                      RemoveCachePoolRequestProto request) throws ServiceException {
    try {
      server.removeCachePool(request.getPoolName());
      return RemoveCachePoolResponseProto.newBuilder().build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public ListCachePoolsResponseProto listCachePools(RpcController controller,
                                                    ListCachePoolsRequestProto request) throws ServiceException {
    try {
      BatchedEntries<CachePoolEntry> entries =
          server.listCachePools(request.getPrevPoolName());
      ListCachePoolsResponseProto.Builder responseBuilder =
          ListCachePoolsResponseProto.newBuilder();
      responseBuilder.setHasMore(entries.hasMore());
      for (int i = 0, n = entries.size(); i < n; i++) {
        responseBuilder.addEntries(PBHelperClient.convert(entries.get(i)));
      }
      return responseBuilder.build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public ModifyAclEntriesResponseProto modifyAclEntries(
      RpcController controller, ModifyAclEntriesRequestProto req)
      throws ServiceException {
    try {
      server.modifyAclEntries(req.getSrc(), PBHelperClient.convertAclEntry(req.getAclSpecList()));
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_MODIFYACLENTRIES_RESPONSE;
  }

  @Override
  public RemoveAclEntriesResponseProto removeAclEntries(
      RpcController controller, RemoveAclEntriesRequestProto req)
      throws ServiceException {
    try {
      server.removeAclEntries(req.getSrc(),
          PBHelperClient.convertAclEntry(req.getAclSpecList()));
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_REMOVEACLENTRIES_RESPONSE;
  }

  @Override
  public RemoveDefaultAclResponseProto removeDefaultAcl(
      RpcController controller, RemoveDefaultAclRequestProto req)
      throws ServiceException {
    try {
      server.removeDefaultAcl(req.getSrc());
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_REMOVEDEFAULTACL_RESPONSE;
  }

  @Override
  public RemoveAclResponseProto removeAcl(RpcController controller,
                                          RemoveAclRequestProto req) throws ServiceException {
    try {
      server.removeAcl(req.getSrc());
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_REMOVEACL_RESPONSE;
  }

  @Override
  public SetAclResponseProto setAcl(RpcController controller,
                                    SetAclRequestProto req) throws ServiceException {
    try {
      server.setAcl(req.getSrc(), PBHelperClient.convertAclEntry(req.getAclSpecList()));
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_SETACL_RESPONSE;
  }

  @Override
  public GetAclStatusResponseProto getAclStatus(RpcController controller,
                                                GetAclStatusRequestProto req) throws ServiceException {
    try {
      return PBHelperClient.convert(server.getAclStatus(req.getSrc()));
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public CreateEncryptionZoneResponseProto createEncryptionZone(
      RpcController controller, CreateEncryptionZoneRequestProto req)
      throws ServiceException {
    try {
      server.createEncryptionZone(req.getSrc(), req.getKeyName());
      return CreateEncryptionZoneResponseProto.newBuilder().build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetEZForPathResponseProto getEZForPath(
      RpcController controller, GetEZForPathRequestProto req)
      throws ServiceException {
    try {
      GetEZForPathResponseProto.Builder builder =
          GetEZForPathResponseProto.newBuilder();
      final EncryptionZone ret = server.getEZForPath(req.getSrc());
      if (ret != null) {
        builder.setZone(PBHelperClient.convert(ret));
      }
      return builder.build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public ListEncryptionZonesResponseProto listEncryptionZones(
      RpcController controller, ListEncryptionZonesRequestProto req)
      throws ServiceException {
    try {
      BatchedEntries<EncryptionZone> entries = server
          .listEncryptionZones(req.getId());
      ListEncryptionZonesResponseProto.Builder builder =
          ListEncryptionZonesResponseProto.newBuilder();
      builder.setHasMore(entries.hasMore());
      for (int i = 0; i < entries.size(); i++) {
        builder.addZones(PBHelperClient.convert(entries.get(i)));
      }
      return builder.build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public ReencryptEncryptionZoneResponseProto reencryptEncryptionZone(
      RpcController controller, ReencryptEncryptionZoneRequestProto req)
      throws ServiceException {
    try {
      server.reencryptEncryptionZone(req.getZone(),
          PBHelperClient.convert(req.getAction()));
      return ReencryptEncryptionZoneResponseProto.newBuilder().build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  public ListReencryptionStatusResponseProto listReencryptionStatus(
      RpcController controller, ListReencryptionStatusRequestProto req)
      throws ServiceException {
    try {
      BatchedEntries<ZoneReencryptionStatus> entries = server
          .listReencryptionStatus(req.getId());
      ListReencryptionStatusResponseProto.Builder builder =
          ListReencryptionStatusResponseProto.newBuilder();
      builder.setHasMore(entries.hasMore());
      for (int i = 0; i < entries.size(); i++) {
        builder.addStatuses(PBHelperClient.convert(entries.get(i)));
      }
      return builder.build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public SetErasureCodingPolicyResponseProto setErasureCodingPolicy(
      RpcController controller, SetErasureCodingPolicyRequestProto req)
      throws ServiceException {
    return null;
  }

  @Override
  public UnsetErasureCodingPolicyResponseProto unsetErasureCodingPolicy(
      RpcController controller, UnsetErasureCodingPolicyRequestProto req)
      throws ServiceException {
    return null;
  }

  @Override
  public GetECTopologyResultForPoliciesResponseProto getECTopologyResultForPolicies(RpcController rpcController, GetECTopologyResultForPoliciesRequestProto getECTopologyResultForPoliciesRequestProto) throws ServiceException {
    return null;
  }

  @Override
  public SetXAttrResponseProto setXAttr(RpcController controller,
                                        SetXAttrRequestProto req) throws ServiceException {
    try {
      server.setXAttr(req.getSrc(), PBHelperClient.convertXAttr(req.getXAttr()),
          PBHelperClient.convert(req.getFlag()));
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_SETXATTR_RESPONSE;
  }

  @Override
  public GetXAttrsResponseProto getXAttrs(RpcController controller,
                                          GetXAttrsRequestProto req) throws ServiceException {
    try {
      return PBHelperClient.convertXAttrsResponse(server.getXAttrs(req.getSrc(),
          PBHelperClient.convertXAttrs(req.getXAttrsList())));
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public ListXAttrsResponseProto listXAttrs(RpcController controller,
                                            ListXAttrsRequestProto req) throws ServiceException {
    try {
      return PBHelperClient.convertListXAttrsResponse(server.listXAttrs(req.getSrc()));
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public RemoveXAttrResponseProto removeXAttr(RpcController controller,
                                              RemoveXAttrRequestProto req) throws ServiceException {
    try {
      server.removeXAttr(req.getSrc(), PBHelperClient.convertXAttr(req.getXAttr()));
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_REMOVEXATTR_RESPONSE;
  }

  @Override
  public CheckAccessResponseProto checkAccess(RpcController controller,
                                              CheckAccessRequestProto req) throws ServiceException {
    try {
      server.checkAccess(req.getPath(), PBHelperClient.convert(req.getMode()));
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_CHECKACCESS_RESPONSE;
  }

  @Override
  public SetStoragePolicyResponseProto setStoragePolicy(
      RpcController controller, SetStoragePolicyRequestProto request)
      throws ServiceException {
    try {
      server.setStoragePolicy(request.getSrc(), request.getPolicyName());
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_SET_STORAGE_POLICY_RESPONSE;
  }

  @Override
  public UnsetStoragePolicyResponseProto unsetStoragePolicy(
      RpcController controller, UnsetStoragePolicyRequestProto request)
      throws ServiceException {
    try {
      server.unsetStoragePolicy(request.getSrc());
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_UNSET_STORAGE_POLICY_RESPONSE;
  }

  @Override
  public GetStoragePolicyResponseProto getStoragePolicy(
      RpcController controller, GetStoragePolicyRequestProto request)
      throws ServiceException {
    try {
      BlockStoragePolicyProto policy = PBHelperClient.convert(server
          .getStoragePolicy(request.getPath()));
      return GetStoragePolicyResponseProto.newBuilder()
          .setStoragePolicy(policy).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetStoragePoliciesResponseProto getStoragePolicies(
      RpcController controller, GetStoragePoliciesRequestProto request)
      throws ServiceException {
    try {
      BlockStoragePolicy[] policies = server.getStoragePolicies();
      GetStoragePoliciesResponseProto.Builder builder =
          GetStoragePoliciesResponseProto.newBuilder();
      if (policies == null) {
        return builder.build();
      }
      for (BlockStoragePolicy policy : policies) {
        builder.addPolicies(PBHelperClient.convert(policy));
      }
      return builder.build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  public GetCurrentEditLogTxidResponseProto getCurrentEditLogTxid(RpcController controller,
                                                                  GetCurrentEditLogTxidRequestProto req) throws ServiceException {
    try {
      return GetCurrentEditLogTxidResponseProto.newBuilder().setTxid(
          server.getCurrentEditLogTxid()).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetEditsFromTxidResponseProto getEditsFromTxid(RpcController controller,
                                                        GetEditsFromTxidRequestProto req) throws ServiceException {
    try {
      return PBHelperClient.convertEditsResponse(server.getEditsFromTxid(
          req.getTxid()));
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetErasureCodingPoliciesResponseProto getErasureCodingPolicies(RpcController rpcController, GetErasureCodingPoliciesRequestProto getErasureCodingPoliciesRequestProto) throws ServiceException {
    return null;
  }

  @Override
  public AddErasureCodingPoliciesResponseProto addErasureCodingPolicies(RpcController rpcController, AddErasureCodingPoliciesRequestProto addErasureCodingPoliciesRequestProto) throws ServiceException {
    return null;
  }

  @Override
  public RemoveErasureCodingPolicyResponseProto removeErasureCodingPolicy(RpcController rpcController, RemoveErasureCodingPolicyRequestProto removeErasureCodingPolicyRequestProto) throws ServiceException {
    return null;
  }

  @Override
  public EnableErasureCodingPolicyResponseProto enableErasureCodingPolicy(RpcController rpcController, EnableErasureCodingPolicyRequestProto enableErasureCodingPolicyRequestProto) throws ServiceException {
    return null;
  }

  @Override
  public DisableErasureCodingPolicyResponseProto disableErasureCodingPolicy(RpcController rpcController, DisableErasureCodingPolicyRequestProto disableErasureCodingPolicyRequestProto) throws ServiceException {
    return null;
  }

  @Override
  public GetErasureCodingPolicyResponseProto getErasureCodingPolicy(RpcController rpcController, GetErasureCodingPolicyRequestProto getErasureCodingPolicyRequestProto) throws ServiceException {
    return null;
  }

  @Override
  public GetErasureCodingCodecsResponseProto getErasureCodingCodecs(RpcController rpcController, GetErasureCodingCodecsRequestProto getErasureCodingCodecsRequestProto) throws ServiceException {
    return null;
  }


  @Override
  public GetQuotaUsageResponseProto getQuotaUsage(
      RpcController controller, GetQuotaUsageRequestProto req)
      throws ServiceException {
    try {
      QuotaUsage result = server.getQuotaUsage(req.getPath());
      return GetQuotaUsageResponseProto.newBuilder()
          .setUsage(PBHelperClient.convert(result)).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public ListOpenFilesResponseProto listOpenFiles(RpcController controller,
                                                  ListOpenFilesRequestProto req) throws ServiceException {
    try {
      EnumSet<OpenFilesType> openFilesTypes =
          PBHelperClient.convertOpenFileTypes(req.getTypesList());
      BatchedEntries<OpenFileEntry> entries = server.listOpenFiles(req.getId(),
          openFilesTypes, req.getPath());
      ListOpenFilesResponseProto.Builder builder =
          ListOpenFilesResponseProto.newBuilder();
      builder.setHasMore(entries.hasMore());
      for (int i = 0; i < entries.size(); i++) {
        builder.addEntries(PBHelperClient.convert(entries.get(i)));
      }
      builder.addAllTypes(req.getTypesList());
      return builder.build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public MsyncResponseProto msync(RpcController controller,
                                  MsyncRequestProto req) throws ServiceException {
    try {
      server.msync();
      return MsyncResponseProto.newBuilder().build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public SatisfyStoragePolicyResponseProto satisfyStoragePolicy(
      RpcController controller,
      SatisfyStoragePolicyRequestProto request) throws ServiceException {
    try {
      server.satisfyStoragePolicy(request.getSrc());
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_SATISFYSTORAGEPOLICY_RESPONSE;
  }

  @Override
  public HAServiceStateResponseProto getHAServiceState(
      RpcController controller,
      HAServiceStateRequestProto request) throws ServiceException {
    try {
      HAServiceProtocol.HAServiceState state = server.getHAServiceState();
      HAServiceStateProto retState;
      switch (state) {
        case ACTIVE:
          retState = HAServiceProtocolProtos.HAServiceStateProto.ACTIVE;
          break;
        case STANDBY:
          retState = HAServiceProtocolProtos.HAServiceStateProto.STANDBY;
          break;
        case OBSERVER:
          retState = HAServiceProtocolProtos.HAServiceStateProto.OBSERVER;
          break;
        case INITIALIZING:
        default:
          retState = HAServiceProtocolProtos.HAServiceStateProto.INITIALIZING;
          break;
      }
      HAServiceStateResponseProto.Builder builder =
          HAServiceStateResponseProto.newBuilder();
      builder.setState(retState);
      return builder.build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }
}
