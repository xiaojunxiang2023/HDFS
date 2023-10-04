package org.apache.hadoop.hdfs.server.namenode;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.fs.permission.PermissionStatus;
import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.hdfs.util.EnumCounters;

import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;

/**
 * The attributes of an inode.
 */
@InterfaceAudience.Private
public interface INodeDirectoryAttributes extends INodeAttributes {
  public QuotaCounts getQuotaCounts();

  public boolean metadataEquals(INodeDirectoryAttributes other);
  
  /** A copy of the inode directory attributes */
  public static class SnapshotCopy extends INodeAttributes.SnapshotCopy
      implements INodeDirectoryAttributes {
    public SnapshotCopy(byte[] name, PermissionStatus permissions,
        AclFeature aclFeature, long modificationTime, 
        XAttrFeature xAttrsFeature) {
      super(name, permissions, aclFeature, modificationTime, 0L, xAttrsFeature);
    }

    public SnapshotCopy(INodeDirectory dir) {
      super(dir);
    }

    @Override
    public QuotaCounts getQuotaCounts() {
      return new QuotaCounts.Builder().nameSpace(-1).
          storageSpace(-1).typeSpaces(-1).build();
    }

    public boolean isDirectory() {
      return true;
    }

    @Override
    public boolean metadataEquals(INodeDirectoryAttributes other) {
      return other != null
          && getQuotaCounts().equals(other.getQuotaCounts())
          && getPermissionLong() == other.getPermissionLong()
          && getAclFeature() == other.getAclFeature()
          && getXAttrFeature() == other.getXAttrFeature();
    }
  }

  public static class CopyWithQuota extends INodeDirectoryAttributes.SnapshotCopy {
    private QuotaCounts quota;

    public CopyWithQuota(byte[] name, PermissionStatus permissions,
        AclFeature aclFeature, long modificationTime, long nsQuota,
        long dsQuota, EnumCounters<StorageType> typeQuotas, XAttrFeature xAttrsFeature) {
      super(name, permissions, aclFeature, modificationTime, xAttrsFeature);
      this.quota = new QuotaCounts.Builder().nameSpace(nsQuota).
          storageSpace(dsQuota).typeSpaces(typeQuotas).build();
    }

    public CopyWithQuota(INodeDirectory dir) {
      super(dir);
      Preconditions.checkArgument(dir.isQuotaSet());
      final QuotaCounts q = dir.getQuotaCounts();
      this.quota = new QuotaCounts.Builder().quotaCount(q).build();
    }

    @Override
    public QuotaCounts getQuotaCounts() {
      return new QuotaCounts.Builder().quotaCount(quota).build();
    }
  }
}
