package org.apache.hadoop.hdfs;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.apache.hadoop.ha.HAServiceProtocol;
import org.apache.hadoop.ha.ZKFCProtocol;
import org.apache.hadoop.hdfs.protocol.ClientDatanodeProtocol;
import org.apache.hadoop.hdfs.protocol.ClientProtocol;
import org.apache.hadoop.hdfs.protocol.ReconfigurationProtocol;
import org.apache.hadoop.hdfs.qjournal.protocol.InterQJournalProtocol;
import org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocol;
import org.apache.hadoop.hdfs.server.protocol.DatanodeLifelineProtocol;
import org.apache.hadoop.hdfs.server.protocol.DatanodeProtocol;
import org.apache.hadoop.hdfs.server.protocol.InterDatanodeProtocol;
import org.apache.hadoop.hdfs.server.protocol.NamenodeProtocol;
import org.apache.hadoop.security.RefreshUserMappingsProtocol;
import org.apache.hadoop.security.authorize.PolicyProvider;
import org.apache.hadoop.security.authorize.RefreshAuthorizationPolicyProtocol;
import org.apache.hadoop.security.authorize.Service;
import org.apache.hadoop.tools.GetUserMappingsProtocol;
import org.apache.hadoop.ipc.RefreshCallQueueProtocol;
import org.apache.hadoop.ipc.GenericRefreshProtocol;

/**
 * {@link PolicyProvider} for HDFS protocols.
 */
@InterfaceAudience.Private
public class HDFSPolicyProvider extends PolicyProvider {
  private static final Service[] hdfsServices =
    new Service[] {
    new Service(CommonConfigurationKeys.SECURITY_CLIENT_PROTOCOL_ACL,
        ClientProtocol.class),
    new Service(CommonConfigurationKeys.SECURITY_CLIENT_DATANODE_PROTOCOL_ACL,
        ClientDatanodeProtocol.class),
    new Service(CommonConfigurationKeys.SECURITY_DATANODE_PROTOCOL_ACL,
        DatanodeProtocol.class),
    new Service(CommonConfigurationKeys.SECURITY_INTER_DATANODE_PROTOCOL_ACL, 
        InterDatanodeProtocol.class),
    new Service(CommonConfigurationKeys.SECURITY_NAMENODE_PROTOCOL_ACL,
        NamenodeProtocol.class),
    new Service(CommonConfigurationKeys.SECURITY_QJOURNAL_SERVICE_PROTOCOL_ACL,
        QJournalProtocol.class),
        new Service(
            CommonConfigurationKeys.SECURITY_INTERQJOURNAL_SERVICE_PROTOCOL_ACL,
            InterQJournalProtocol.class),
    new Service(CommonConfigurationKeys.SECURITY_HA_SERVICE_PROTOCOL_ACL,
        HAServiceProtocol.class),
    new Service(CommonConfigurationKeys.SECURITY_ZKFC_PROTOCOL_ACL,
        ZKFCProtocol.class),
    new Service(
        CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_AUTHORIZATION_REFRESH_POLICY, 
        RefreshAuthorizationPolicyProtocol.class),
    new Service(
        CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_AUTHORIZATION_REFRESH_USER_MAPPINGS, 
        RefreshUserMappingsProtocol.class),
    new Service(
        CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_AUTHORIZATION_GET_USER_MAPPINGS,
        GetUserMappingsProtocol.class),
    new Service(
        CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_AUTHORIZATION_REFRESH_CALLQUEUE,
        RefreshCallQueueProtocol.class),
    new Service(
        CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_AUTHORIZATION_GENERIC_REFRESH,
        GenericRefreshProtocol.class),
    new Service(
        CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_AUTHORIZATION_DATANODE_LIFELINE,
        DatanodeLifelineProtocol.class),
    new Service(
          CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_AUTHORIZATION_RECONFIGURATION,
          ReconfigurationProtocol.class)
  };
  
  @Override
  public Service[] getServices() {
    return hdfsServices;
  }
}
