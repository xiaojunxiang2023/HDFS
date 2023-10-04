package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.hdfs.server.common.Storage;
import org.apache.hadoop.hdfs.server.common.StorageInfo;
import org.apache.hadoop.hdfs.server.common.HdfsServerConstants.NamenodeRole;

/**
 * Information sent by a subordinate name-node to the active name-node
 * during the registration process. 
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class NamenodeRegistration extends StorageInfo
implements NodeRegistration {
  final String rpcAddress;          // RPC address of the node
  final String httpAddress;         // HTTP address of the node
  final NamenodeRole role;          // node role

  public NamenodeRegistration(String address,
                              String httpAddress,
                              StorageInfo storageInfo,
                              NamenodeRole role) {
    super(storageInfo);
    this.rpcAddress = address;
    this.httpAddress = httpAddress;
    this.role = role;
  }

  @Override // NodeRegistration
  public String getAddress() {
    return rpcAddress;
  }
  
  public String getHttpAddress() {
    return httpAddress;
  }
  
  @Override // NodeRegistration
  public String getRegistrationID() {
    return Storage.getRegistrationID(this);
  }

  @Override // NodeRegistration
  public int getVersion() {
    return super.getLayoutVersion();
  }

  @Override // NodeRegistration
  public String toString() {
    return getClass().getSimpleName()
    + "(" + rpcAddress
    + ", role=" + getRole()
    + ")";
  }

  /**
   * Get name-node role.
   */
  public NamenodeRole getRole() {
    return role;
  }

  public boolean isRole(NamenodeRole that) {
    return role.equals(that);
  }
}
