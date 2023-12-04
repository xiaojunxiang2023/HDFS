package org.apache.hadoop.hdfs.server.namenode;

import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.XAttr;
import org.apache.hadoop.fs.XAttrSetFlag;
import org.apache.hadoop.fs.permission.FsAction;
import org.apache.hadoop.hdfs.XAttrHelper;
import org.apache.hadoop.hdfs.server.blockmanagement.BlockManager;
import org.apache.hadoop.hdfs.server.namenode.FSDirectory.DirOp;
import org.apache.hadoop.hdfs.server.namenode.sps.StoragePolicySatisfyManager;
import org.apache.hadoop.thirdparty.com.google.common.collect.Lists;

import java.io.IOException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

import static org.apache.hadoop.hdfs.server.common.HdfsServerConstants.XATTR_SATISFY_STORAGE_POLICY;

/**
 * Helper class to perform storage policy satisfier related operations.
 */
final class FSDirSatisfyStoragePolicyOp {

  /**
   * Private constructor for preventing FSDirSatisfyStoragePolicyOp object
   * creation. Static-only class.
   */
  private FSDirSatisfyStoragePolicyOp() {
  }

  /**
   * Satisfy storage policy function which will add the entry to SPS call queue
   * and will perform satisfaction async way.
   *
   * @param fsd
   *          fs directory
   * @param bm
   *          block manager
   * @param src
   *          source path
   * @param logRetryCache
   *          whether to record RPC ids in editlog for retry cache rebuilding
   * @return file status info
   * @throws IOException
   */
  static FileStatus satisfyStoragePolicy(FSDirectory fsd, BlockManager bm,
                                         String src, boolean logRetryCache) throws IOException {

    assert fsd.getFSNamesystem().hasWriteLock();
    FSPermissionChecker pc = fsd.getPermissionChecker();
    INodesInPath iip;
    fsd.writeLock();
    try {

      // check operation permission.
      iip = fsd.resolvePath(pc, src, DirOp.WRITE);
      if (fsd.isPermissionEnabled()) {
        fsd.checkPathAccess(pc, iip, FsAction.WRITE);
      }
      INode inode = FSDirectory.resolveLastINode(iip);
      if (inode.isFile() && inode.asFile().numBlocks() == 0) {
        if (NameNode.LOG.isInfoEnabled()) {
          NameNode.LOG.info(
              "Skipping satisfy storage policy on path:{} as "
                  + "this file doesn't have any blocks!",
              inode.getFullPathName());
        }
      } else if (inodeHasSatisfyXAttr(inode)) {
        NameNode.LOG
            .warn("Cannot request to call satisfy storage policy on path: "
                + inode.getFullPathName()
                + ", as this file/dir was already called for satisfying "
                + "storage policy.");
      } else {
        XAttr satisfyXAttr = XAttrHelper
            .buildXAttr(XATTR_SATISFY_STORAGE_POLICY);
        List<XAttr> xAttrs = Arrays.asList(satisfyXAttr);
        List<XAttr> existingXAttrs = XAttrStorage.readINodeXAttrs(inode);
        List<XAttr> newXAttrs = FSDirXAttrOp.setINodeXAttrs(fsd, existingXAttrs,
            xAttrs, EnumSet.of(XAttrSetFlag.CREATE));
        XAttrStorage.updateINodeXAttrs(inode, newXAttrs,
            iip.getLatestSnapshotId());
        fsd.getEditLog().logSetXAttrs(src, xAttrs, logRetryCache);

        // Adding directory in the pending queue, so FileInodeIdCollector
        // process directory child in batch and recursively
        StoragePolicySatisfyManager spsManager =
            fsd.getBlockManager().getSPSManager();
        if (spsManager != null) {
          spsManager.addPathId(inode.getId());
        }
      }
    } finally {
      fsd.writeUnlock();
    }
    return fsd.getAuditFileInfo(iip);
  }

  static boolean unprotectedSatisfyStoragePolicy(INode inode, FSDirectory fsd) {
    if (inode.isFile() && inode.asFile().numBlocks() == 0) {
      return false;
    } else {
      // Adding directory in the pending queue, so FileInodeIdCollector process
      // directory child in batch and recursively
      StoragePolicySatisfyManager spsManager =
          fsd.getBlockManager().getSPSManager();
      if (spsManager != null) {
        spsManager.addPathId(inode.getId());
      }
      return true;
    }
  }

  private static boolean inodeHasSatisfyXAttr(INode inode) {
    final XAttrFeature f = inode.getXAttrFeature();
    if (inode.isFile() && f != null
        && f.getXAttr(XATTR_SATISFY_STORAGE_POLICY) != null) {
      return true;
    }
    return false;
  }

  static void removeSPSXattr(FSDirectory fsd, INode inode, XAttr spsXAttr)
      throws IOException {
    try {
      fsd.writeLock();
      List<XAttr> existingXAttrs = XAttrStorage.readINodeXAttrs(inode);
      existingXAttrs.remove(spsXAttr);
      XAttrStorage.updateINodeXAttrs(inode, existingXAttrs, INodesInPath
          .fromINode(inode).getLatestSnapshotId());
      List<XAttr> xAttrs = Lists.newArrayListWithCapacity(1);
      xAttrs.add(spsXAttr);
      fsd.getEditLog().logRemoveXAttrs(inode.getFullPathName(), xAttrs, false);
    } finally {
      fsd.writeUnlock();
    }
  }
}
