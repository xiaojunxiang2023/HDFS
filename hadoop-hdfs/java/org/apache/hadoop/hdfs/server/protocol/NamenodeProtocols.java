package org.apache.hadoop.hdfs.server.protocol;
import org.apache.hadoop.ha.status.HAServiceProtocol;
import org.apache.hadoop.hdfs.protocol.ClientProtocol;
import org.apache.hadoop.hdfs.protocol.ReconfigurationProtocol;
import org.apache.hadoop.security.authorize.RefreshAuthorizationPolicyProtocol;
import org.apache.hadoop.security.RefreshUserMappingsProtocol;
import org.apache.hadoop.ipc.RefreshCallQueueProtocol;
import org.apache.hadoop.ipc.GenericRefreshProtocol;
import org.apache.hadoop.tools.GetUserMappingsProtocol;

/** The full set of RPC methods implemented by the Namenode.  */
public interface NamenodeProtocols
  extends ClientProtocol,
          DatanodeProtocol,
          DatanodeLifelineProtocol,
          NamenodeProtocol,
          RefreshAuthorizationPolicyProtocol,
          ReconfigurationProtocol,
          RefreshUserMappingsProtocol,
          RefreshCallQueueProtocol,
          GenericRefreshProtocol,
          GetUserMappingsProtocol,
          HAServiceProtocol {
}
