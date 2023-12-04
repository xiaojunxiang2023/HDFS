package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.hdfs.protocol.DatanodeID;
import org.apache.hadoop.hdfs.security.token.block.ExportedBlockKeys;
import org.apache.hadoop.hdfs.server.common.Storage;
import org.apache.hadoop.hdfs.server.common.StorageInfo;
import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;

/**
 * DatanodeRegistration class contains all information the name-node needs
 * to identify and verify a data-node when it contacts the name-node.
 * This information is sent by data-node with each communication request.
 */
public class DatanodeRegistration extends DatanodeID
    implements NodeRegistration {

  private final StorageInfo storageInfo;
  private ExportedBlockKeys exportedKeys;
  private final String softwareVersion;
  private NamespaceInfo nsInfo;

  @VisibleForTesting
  public DatanodeRegistration(String uuid, DatanodeRegistration dnr) {
    this(new DatanodeID(uuid, dnr),
        dnr.getStorageInfo(),
        dnr.getExportedKeys(),
        dnr.getSoftwareVersion());
  }

  public DatanodeRegistration(DatanodeID dn, StorageInfo info,
                              ExportedBlockKeys keys, String softwareVersion) {
    super(dn);
    this.storageInfo = info;
    this.exportedKeys = keys;
    this.softwareVersion = softwareVersion;
  }

  public StorageInfo getStorageInfo() {
    return storageInfo;
  }

  public void setExportedKeys(ExportedBlockKeys keys) {
    this.exportedKeys = keys;
  }

  public ExportedBlockKeys getExportedKeys() {
    return exportedKeys;
  }

  public String getSoftwareVersion() {
    return softwareVersion;
  }

  @Override // NodeRegistration
  public int getVersion() {
    return storageInfo.getLayoutVersion();
  }

  public void setNamespaceInfo(NamespaceInfo nsInfo) {
    this.nsInfo = nsInfo;
  }

  public NamespaceInfo getNamespaceInfo() {
    return nsInfo;
  }

  @Override // NodeRegistration
  public String getRegistrationID() {
    return Storage.getRegistrationID(storageInfo);
  }

  @Override // NodeRegistration
  public String getAddress() {
    return getXferAddr();
  }

  @Override
  public String toString() {
    return getClass().getSimpleName()
        + "(" + super.toString()
        + ", datanodeUuid=" + getDatanodeUuid()
        + ", infoPort=" + getInfoPort()
        + ", infoSecurePort=" + getInfoSecurePort()
        + ", ipcPort=" + getIpcPort()
        + ", storageInfo=" + storageInfo
        + ")";
  }

  @Override
  public boolean equals(Object to) {
    return super.equals(to);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
