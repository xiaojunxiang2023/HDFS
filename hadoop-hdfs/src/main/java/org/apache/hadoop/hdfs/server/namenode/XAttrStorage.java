package org.apache.hadoop.hdfs.server.namenode;

import org.apache.hadoop.fs.XAttr;
import org.apache.hadoop.hdfs.protocol.QuotaExceededException;

import java.util.ArrayList;
import java.util.List;

/**
 * XAttrStorage is used to read and set xattrs for an inode.
 */
public class XAttrStorage {

  /**
   * Reads the extended attribute of an inode by name with prefix.
   * <p>
   *
   * @param inode INode to read
   * @param snapshotId the snapshotId of the requested path
   * @param prefixedName xAttr name with prefix
   * @return the xAttr
   */
  public static XAttr readINodeXAttrByPrefixedName(INode inode, int snapshotId,
                                                   String prefixedName) {
    XAttrFeature f = inode.getXAttrFeature(snapshotId);
    return f == null ? null : f.getXAttr(prefixedName);
  }

  /**
   * Reads the existing extended attributes of an inode.
   * <p>
   * Must be called while holding the FSDirectory read lock.
   *
   * @param inodeAttr INodeAttributes to read.
   * @return {@code XAttr} list.
   */
  public static List<XAttr> readINodeXAttrs(INodeAttributes inodeAttr) {
    XAttrFeature f = inodeAttr.getXAttrFeature();
    return f == null ? new ArrayList<XAttr>(0) : f.getXAttrs();
  }

  /**
   * Update xattrs of inode.
   * <p>
   * Must be called while holding the FSDirectory write lock.
   *
   * @param inode INode to update
   * @param xAttrs to update xAttrs.
   * @param snapshotId id of the latest snapshot of the inode
   */
  public static void updateINodeXAttrs(INode inode,
                                       List<XAttr> xAttrs, int snapshotId) throws QuotaExceededException {
    if (inode.getXAttrFeature() != null) {
      inode.removeXAttrFeature(snapshotId);
    }
    if (xAttrs == null || xAttrs.isEmpty()) {
      return;
    }
    inode.addXAttrFeature(new XAttrFeature(xAttrs), snapshotId);
  }
}
