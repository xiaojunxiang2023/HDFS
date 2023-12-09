package org.apache.hadoop.security.authorize;

import org.apache.hadoop.classification.InterfaceAudience.Private;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.apache.hadoop.security.SecurityUtil;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;
import org.apache.hadoop.util.MachineList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

/**
 * An authorization manager which handles service-level authorization
 * for incoming service requests.
 */
// MapReduce也可见
public class ServiceAuthorizationManager {
  static final String BLOCKED = ".blocked";
  static final String HOSTS = ".hosts";

  private static final String HADOOP_POLICY_FILE = "hadoop-policy.xml";

  // For each class, first ACL in the array specifies the allowed entries
  // and second ACL specifies blocked entries.
  private volatile Map<Class<?>, AccessControlList[]> protocolToAcls =
      new IdentityHashMap<Class<?>, AccessControlList[]>();
  // For each class, first MachineList in the array specifies the allowed entries
  // and second MachineList specifies blocked entries.
  private volatile Map<Class<?>, MachineList[]> protocolToMachineLists =
      new IdentityHashMap<Class<?>, MachineList[]>();

  /**
   * Configuration key for controlling service-level authorization for Hadoop.
   *
   * @deprecated Use
   *             {@link CommonConfigurationKeys#HADOOP_SECURITY_AUTHORIZATION}
   *             instead.
   */
  @Deprecated
  public static final String SERVICE_AUTHORIZATION_CONFIG =
      "hadoop.security.authorization";

  public static final Logger AUDITLOG =
      LoggerFactory.getLogger(
          "SecurityLogger." + ServiceAuthorizationManager.class.getName());

  private static final String AUTHZ_SUCCESSFUL_FOR = "Authorization successful for ";
  private static final String AUTHZ_FAILED_FOR = "Authorization failed for ";


  /**
   * Authorize the user to access the protocol being used.
   *
   * @param user user accessing the service 
   * @param protocol service being accessed
   * @param conf configuration to use
   * @param addr InetAddress of the client
   * @throws AuthorizationException on authorization failure
   */
  public void authorize(UserGroupInformation user,
                        Class<?> protocol,
                        Configuration conf,
                        InetAddress addr
  ) throws AuthorizationException {
    AccessControlList[] acls = protocolToAcls.get(protocol);
    MachineList[] hosts = protocolToMachineLists.get(protocol);
    if (acls == null || hosts == null) {
      throw new AuthorizationException("Protocol " + protocol +
          " is not known.");
    }

    String clientPrincipal = null;
    if (UserGroupInformation.isSecurityEnabled()) {
      // get client principal key to verify (if available)
      clientPrincipal = SecurityUtil.getClientPrincipal(protocol, conf);
      try {
        if (clientPrincipal != null) {
          clientPrincipal =
              SecurityUtil.getServerPrincipal(clientPrincipal, addr);
        }
      } catch (IOException e) {
        throw (AuthorizationException) new AuthorizationException(
            "Can't figure out Kerberos principal name for connection from "
                + addr + " for user=" + user + " protocol=" + protocol)
            .initCause(e);
      }

    }
    if ((clientPrincipal != null && !clientPrincipal.equals(user.getUserName())) ||
        acls.length != 2 || !acls[0].isUserAllowed(user) || acls[1].isUserAllowed(user)) {
      String cause = clientPrincipal != null ?
          ": this service is only accessible by " + clientPrincipal :
          ": denied by configured ACL";
      AUDITLOG.warn(AUTHZ_FAILED_FOR + user
          + " for protocol=" + protocol + cause);
      throw new AuthorizationException("User " + user +
          " is not authorized for protocol " + protocol + cause);
    }
    if (addr != null) {
      String hostAddress = addr.getHostAddress();
      if (hosts.length != 2 || !hosts[0].includes(hostAddress) ||
          hosts[1].includes(hostAddress)) {
        AUDITLOG.warn(AUTHZ_FAILED_FOR + " for protocol=" + protocol
            + " from host = " + hostAddress);
        throw new AuthorizationException("Host " + hostAddress +
            " is not authorized for protocol " + protocol);
      }
    }
    AUDITLOG.info(AUTHZ_SUCCESSFUL_FOR + user + " for protocol=" + protocol);
  }

  public void refresh(Configuration conf,
                      PolicyProvider provider) {
    // Get the system property 'hadoop.policy.file'
    String policyFile =
        System.getProperty("hadoop.policy.file", HADOOP_POLICY_FILE);

    // Make a copy of the original config, and load the policy file
    Configuration policyConf = new Configuration(conf);
    policyConf.addResource(policyFile);
    refreshWithLoadedConfiguration(policyConf, provider);
  }

  @Private
  public void refreshWithLoadedConfiguration(Configuration conf,
                                             PolicyProvider provider) {
    final Map<Class<?>, AccessControlList[]> newAcls =
        new IdentityHashMap<Class<?>, AccessControlList[]>();
    final Map<Class<?>, MachineList[]> newMachineLists =
        new IdentityHashMap<Class<?>, MachineList[]>();

    String defaultAcl = conf.get(
        CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_AUTHORIZATION_DEFAULT_ACL,
        AccessControlList.WILDCARD_ACL_VALUE);

    String defaultBlockedAcl = conf.get(
        CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_AUTHORIZATION_DEFAULT_BLOCKED_ACL, "");

    String defaultServiceHostsKey = getHostKey(
        CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_AUTHORIZATION_DEFAULT_ACL);
    String defaultMachineList = conf.get(defaultServiceHostsKey,
        MachineList.WILDCARD_VALUE);
    String defaultBlockedMachineList = conf.get(
        defaultServiceHostsKey + BLOCKED, "");

    // Parse the config file
    Service[] services = provider.getServices();
    if (services != null) {
      for (Service service : services) {
        AccessControlList acl =
            new AccessControlList(
                conf.get(service.getServiceKey(),
                    defaultAcl)
            );
        AccessControlList blockedAcl =
            new AccessControlList(
                conf.get(service.getServiceKey() + BLOCKED,
                    defaultBlockedAcl));
        newAcls.put(service.getProtocol(), new AccessControlList[]{acl, blockedAcl});
        String serviceHostsKey = getHostKey(service.getServiceKey());
        MachineList machineList = new MachineList(conf.get(serviceHostsKey, defaultMachineList));
        MachineList blockedMachineList = new MachineList(
            conf.get(serviceHostsKey + BLOCKED, defaultBlockedMachineList));
        newMachineLists.put(service.getProtocol(),
            new MachineList[]{machineList, blockedMachineList});
      }
    }

    // Flip to the newly parsed permissions
    protocolToAcls = newAcls;
    protocolToMachineLists = newMachineLists;
  }

  private String getHostKey(String serviceKey) {
    int endIndex = serviceKey.lastIndexOf(".");
    if (endIndex != -1) {
      return serviceKey.substring(0, endIndex) + HOSTS;
    }
    return serviceKey;
  }

  
  public Set<Class<?>> getProtocolsWithAcls() {
    return protocolToAcls.keySet();
  }

  
  public AccessControlList getProtocolsAcls(Class<?> className) {
    return protocolToAcls.get(className)[0];
  }

  
  public AccessControlList getProtocolsBlockedAcls(Class<?> className) {
    return protocolToAcls.get(className)[1];
  }

  
  public Set<Class<?>> getProtocolsWithMachineLists() {
    return protocolToMachineLists.keySet();
  }

  
  public MachineList getProtocolsMachineList(Class<?> className) {
    return protocolToMachineLists.get(className)[0];
  }

  
  public MachineList getProtocolsBlockedMachineList(Class<?> className) {
    return protocolToMachineLists.get(className)[1];
  }
}
