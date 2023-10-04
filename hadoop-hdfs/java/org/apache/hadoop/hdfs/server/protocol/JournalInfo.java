package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.classification.InterfaceAudience;

/**
 * Information that describes a journal
 */
@InterfaceAudience.Private
public class JournalInfo {
  private final int layoutVersion;
  private final String clusterId;
  private final int namespaceId;

  public JournalInfo(int lv, String clusterId, int nsId) {
    this.layoutVersion = lv;
    this.clusterId = clusterId;
    this.namespaceId = nsId;
  }

  public int getLayoutVersion() {
    return layoutVersion;
  }

  public String getClusterId() {
    return clusterId;
  }

  public int getNamespaceId() {
    return namespaceId;
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("lv=").append(layoutVersion).append(";cid=").append(clusterId)
    .append(";nsid=").append(namespaceId);
    return sb.toString();
  }
  
  @Override
  public boolean equals(Object o) {
    JournalInfo jInfo;
    if (!(o instanceof JournalInfo)) {
      return false;
    }
    jInfo = (JournalInfo) o;
    return ((jInfo.clusterId.equals(this.clusterId))
        && (jInfo.namespaceId == this.namespaceId)
        && (jInfo.layoutVersion == this.layoutVersion));
  }
  
  @Override
  public int hashCode() {
    return (namespaceId ^ layoutVersion ^ clusterId.hashCode());
  }
}
