package org.apache.hadoop.security.authorize;

import java.net.InetAddress;

import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.CommonConfigurationKeysPublic;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.util.ReflectionUtils;

import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;
// MapReduce 也可见
public class ProxyUsers {

  public static final String CONF_HADOOP_PROXYUSER = "hadoop.proxyuser";

  private static volatile ImpersonationProvider sip ;

  /**
   * Returns an instance of ImpersonationProvider.
   * Looks up the configuration to see if there is custom class specified.
   * @param conf
   * @return ImpersonationProvider
   */
  private static ImpersonationProvider getInstance(Configuration conf) {
    Class<? extends ImpersonationProvider> clazz =
        conf.getClass(
            CommonConfigurationKeysPublic.HADOOP_SECURITY_IMPERSONATION_PROVIDER_CLASS,
            DefaultImpersonationProvider.class, ImpersonationProvider.class);
    return ReflectionUtils.newInstance(clazz, conf);
  }

  /**
   * refresh Impersonation rules
   */
  public static void refreshSuperUserGroupsConfiguration() {
    //load server side configuration;
    refreshSuperUserGroupsConfiguration(new Configuration());
  }

  /**
   * Refreshes configuration using the specified Proxy user prefix for
   * properties.
   *
   * @param conf configuration
   * @param proxyUserPrefix proxy user configuration prefix
   */
  public static void refreshSuperUserGroupsConfiguration(Configuration conf,
      String proxyUserPrefix) {
    Preconditions.checkArgument(proxyUserPrefix != null && 
        !proxyUserPrefix.isEmpty(), "prefix cannot be NULL or empty");
    // sip is volatile. Any assignment to it as well as the object's state
    // will be visible to all the other threads. 
    ImpersonationProvider ip = getInstance(conf);
    ip.init(proxyUserPrefix);
    sip = ip;
    ProxyServers.refresh(conf);
  }

  /**
   * Refreshes configuration using the default Proxy user prefix for properties.
   * @param conf configuration
   */
  public static void refreshSuperUserGroupsConfiguration(Configuration conf) {
    refreshSuperUserGroupsConfiguration(conf, CONF_HADOOP_PROXYUSER);
  }
  
  /**
   * Authorize the superuser which is doing doAs.
   * {@link #authorize(UserGroupInformation, InetAddress)} should be preferred
   * to avoid possibly re-resolving the ip address.
   *
   * @param user ugi of the effective or proxy user which contains a real user
   * @param remoteAddress the ip address of client
   * @throws AuthorizationException
   */
  public static void authorize(UserGroupInformation user, 
      String remoteAddress) throws AuthorizationException {
    getSip().authorize(user, remoteAddress);
  }

  /**
   * Authorize the superuser which is doing doAs.
   *
   * @param user ugi of the effective or proxy user which contains a real user
   * @param remoteAddress the inet address of client
   * @throws AuthorizationException
   */
  public static void authorize(UserGroupInformation user,
      InetAddress remoteAddress) throws AuthorizationException {
    getSip().authorize(user, remoteAddress);
  }

  private static ImpersonationProvider getSip() {
    if (sip == null) {
      // In a race situation, It is possible for multiple threads to satisfy
      // this condition.
      // The last assignment will prevail.
      refreshSuperUserGroupsConfiguration();
    }
    return sip;
  }

  /**
   * This function is kept to provide backward compatibility.
   * @param user
   * @param remoteAddress
   * @param conf
   * @throws AuthorizationException
   * @deprecated use {@link #authorize(UserGroupInformation, String)} instead.
   */
  @Deprecated
  public static void authorize(UserGroupInformation user, 
      String remoteAddress, Configuration conf) throws AuthorizationException {
    authorize(user, remoteAddress);
  }
  
  @VisibleForTesting 
  public static DefaultImpersonationProvider getDefaultImpersonationProvider() {
    return ((DefaultImpersonationProvider) getSip());
  }
      
}
