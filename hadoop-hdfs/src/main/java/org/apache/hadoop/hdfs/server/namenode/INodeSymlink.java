package org.apache.hadoop.hdfs.server.namenode;

import org.apache.hadoop.fs.permission.PermissionStatus;
import org.apache.hadoop.hdfs.DFSUtil;
import org.apache.hadoop.hdfs.server.blockmanagement.BlockStoragePolicySuite;
import org.apache.hadoop.hdfs.server.namenode.snapshot.Snapshot;

import java.io.PrintWriter;

/**
 * An {@link INode} representing a symbolic link.
 */
public class INodeSymlink extends INodeWithAdditionalFields {
  private final byte[] symlink; // The target URI

  INodeSymlink(long id, byte[] name, PermissionStatus permissions,
               long mtime, long atime, String symlink) {
    super(id, name, permissions, mtime, atime);
    this.symlink = DFSUtil.string2Bytes(symlink);
  }

  INodeSymlink(INodeSymlink that) {
    super(that);
    this.symlink = that.symlink;
  }

  @Override
  void recordModification(int latestSnapshotId) {
    if (isInLatestSnapshot(latestSnapshotId)) {
      INodeDirectory parent = getParent();
      parent.saveChild2Snapshot(this, latestSnapshotId, new INodeSymlink(this));
    }
  }

  /** @return true unconditionally. */
  @Override
  public boolean isSymlink() {
    return true;
  }

  /** @return this object. */
  @Override
  public INodeSymlink asSymlink() {
    return this;
  }

  public String getSymlinkString() {
    return DFSUtil.bytes2String(symlink);
  }

  public byte[] getSymlink() {
    return symlink;
  }

  @Override
  public void cleanSubtree(ReclaimContext reclaimContext, final int snapshotId,
                           int priorSnapshotId) {
    if (snapshotId == Snapshot.CURRENT_STATE_ID
        && priorSnapshotId == Snapshot.NO_SNAPSHOT_ID) {
      destroyAndCollectBlocks(reclaimContext);
    }
  }

  @Override
  public void destroyAndCollectBlocks(ReclaimContext reclaimContext) {
    reclaimContext.removedINodes.add(this);
    reclaimContext.quotaDelta().add(
        new QuotaCounts.Builder().nameSpace(1).build());
  }

  @Override
  public QuotaCounts computeQuotaUsage(BlockStoragePolicySuite bsps,
                                       byte blockStoragePolicyId, boolean useCache, int lastSnapshotId) {
    return new QuotaCounts.Builder().nameSpace(1).build();
  }

  @Override
  public ContentSummaryComputationContext computeContentSummary(int snapshotId,
                                                                final ContentSummaryComputationContext summary) {
    summary.getCounts().addContent(Content.SYMLINK, 1);
    return summary;
  }

  @Override
  public void dumpTreeRecursively(PrintWriter out, StringBuilder prefix,
                                  final int snapshot) {
    super.dumpTreeRecursively(out, prefix, snapshot);
    out.println();
  }

  @Override
  public void removeAclFeature() {
    throw new UnsupportedOperationException("ACLs are not supported on symlinks");
  }

  @Override
  public void addAclFeature(AclFeature f) {
    throw new UnsupportedOperationException("ACLs are not supported on symlinks");
  }

  @Override
  final XAttrFeature getXAttrFeature(int snapshotId) {
    throw new UnsupportedOperationException("XAttrs are not supported on symlinks");
  }

  @Override
  public void removeXAttrFeature() {
    throw new UnsupportedOperationException("XAttrs are not supported on symlinks");
  }

  @Override
  public void addXAttrFeature(XAttrFeature f) {
    throw new UnsupportedOperationException("XAttrs are not supported on symlinks");
  }

  @Override
  public byte getStoragePolicyID() {
    throw new UnsupportedOperationException(
        "Storage policy are not supported on symlinks");
  }

  @Override
  public byte getLocalStoragePolicyID() {
    throw new UnsupportedOperationException(
        "Storage policy are not supported on symlinks");
  }
}
