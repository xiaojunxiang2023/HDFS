package org.apache.hadoop.security;

import static org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_AUTH_TO_LOCAL;
import static org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_AUTH_TO_LOCAL_MECHANISM;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.auth.util.KerberosName;
import org.apache.hadoop.auth.util.KerberosUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class implements parsing and handling of Kerberos principal names. In 
 * particular, it splits them apart and translates them down into local
 * operating system names.
 */
@SuppressWarnings("all")
@InterfaceAudience.LimitedPrivate({"HDFS", "MapReduce"})
@InterfaceStability.Evolving
public class HadoopKerberosName extends KerberosName {
  private static final Logger LOG =
          LoggerFactory.getLogger(HadoopKerberosName.class);

  /**
   * Create a name from the full Kerberos principal name.
   * @param name
   */
  public HadoopKerberosName(String name) {
    super(name);
  }
  /**
   * Set the static configuration to get and evaluate the rules.
   * <p>
   * IMPORTANT: This method does a NOP if the rules have been set already.
   * If there is a need to reset the rules, the {@link KerberosName#setRules(String)}
   * method should be invoked directly.
   * 
   * @param conf the new configuration
   * @throws IOException
   */
  public static void setConfiguration(Configuration conf) throws IOException {
    final String defaultRule;
    switch (SecurityUtil.getAuthenticationMethod(conf)) {
      case KERBEROS:
      case KERBEROS_SSL:
        try {
          KerberosUtil.getDefaultRealm();
        } catch (Exception ke) {
          throw new IllegalArgumentException("Can't get Kerberos realm", ke);
        }
        defaultRule = "DEFAULT";
        break;
      default:
        // just extract the simple user name
        defaultRule = "RULE:[1:$1] RULE:[2:$1]";
        break; 
    }
    String ruleString = conf.get(HADOOP_SECURITY_AUTH_TO_LOCAL, defaultRule);
    setRules(ruleString);

    String ruleMechanism = conf.get(HADOOP_SECURITY_AUTH_TO_LOCAL_MECHANISM,  DEFAULT_MECHANISM);
    setRuleMechanism(ruleMechanism);
  }

  public static void main(String[] args) throws Exception {
    setConfiguration(new Configuration());
    for(String arg: args) {
      HadoopKerberosName name = new HadoopKerberosName(arg);
      System.out.println("Name: " + name + " to " + name.getShortName());
    }
  }
}
