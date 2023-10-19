package org.apache.hadoop.security;

import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;
import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This class uses {@link LdapGroupsMapping} for group lookup and applies the
 * rule configured on the group names.
 */
@InterfaceAudience.LimitedPrivate({"HDFS"})
@InterfaceStability.Evolving
public class RuleBasedLdapGroupsMapping extends LdapGroupsMapping {

  public static final String CONVERSION_RULE_KEY = LDAP_CONFIG_PREFIX +
      ".conversion.rule";

  private static final String CONVERSION_RULE_DEFAULT = "none";
  private static final Logger LOG =
      LoggerFactory.getLogger(RuleBasedLdapGroupsMapping.class);

  private Rule rule;

  /**
   * Supported rules applicable for group name modification.
   */
  private enum Rule {
    TO_UPPER, TO_LOWER, NONE
  }

  @Override
  public synchronized void setConf(Configuration conf) {
    super.setConf(conf);
    String value = conf.get(CONVERSION_RULE_KEY, CONVERSION_RULE_DEFAULT);
    try {
      rule = Rule.valueOf(value.toUpperCase());
    } catch (IllegalArgumentException iae) {
      LOG.warn("Invalid {} configured: '{}'. Using default value: '{}'",
          CONVERSION_RULE_KEY, value, CONVERSION_RULE_DEFAULT);
    }
  }

    /**
     * Returns list of groups for a user.
     * This calls {@link LdapGroupsMapping}'s getGroups and applies the
     * configured rules on group names before returning.
     *
     * @param user get groups for this user
     * @return list of groups for a given user
     */
  @Override
  public synchronized List<String> getGroups(String user) {
    List<String> groups = super.getGroups(user);
    switch (rule) {
    case TO_UPPER:
      return groups.stream().map(StringUtils::toUpperCase).collect(
          Collectors.toList());
    case TO_LOWER:
      return groups.stream().map(StringUtils::toLowerCase).collect(
          Collectors.toList());
    case NONE:
    default:
      return groups;
    }
  }

}
