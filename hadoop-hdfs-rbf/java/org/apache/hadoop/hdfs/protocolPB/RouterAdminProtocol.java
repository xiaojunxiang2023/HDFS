package org.apache.hadoop.hdfs.protocolPB;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.hdfs.server.federation.resolver.MountTableManager;
import org.apache.hadoop.hdfs.server.federation.resolver.RouterGenericManager;
import org.apache.hadoop.hdfs.server.federation.router.NameserviceManager;
import org.apache.hadoop.hdfs.server.federation.router.RouterStateManager;
import org.apache.hadoop.ipc.GenericRefreshProtocol;

// RouterAdmin 和 RouterServer 的通信
@InterfaceAudience.Private
@InterfaceStability.Stable
public interface RouterAdminProtocol extends MountTableManager,
    RouterStateManager, NameserviceManager, GenericRefreshProtocol,
    RouterGenericManager {
}
