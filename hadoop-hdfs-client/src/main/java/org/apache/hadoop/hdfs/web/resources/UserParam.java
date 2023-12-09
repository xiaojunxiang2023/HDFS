package org.apache.hadoop.hdfs.web.resources;

import org.apache.hadoop.security.UserGroupInformation;

import java.text.MessageFormat;
import java.util.regex.Pattern;

import static org.apache.hadoop.hdfs.client.HdfsClientConfigKeys.DFS_WEBHDFS_USER_PATTERN_DEFAULT;

/** User parameter. */
public class UserParam extends StringParam {
  /** Parameter name. */
  public static final String NAME = "user.name";
  /** Default parameter value. */
  public static final String DEFAULT = "";

  private static Domain domain = new Domain(NAME,
      Pattern.compile(DFS_WEBHDFS_USER_PATTERN_DEFAULT));


  public static Domain getUserPatternDomain() {
    return domain;
  }


  public static void setUserPatternDomain(Domain dm) {
    domain = dm;
  }

  public static void setUserPattern(String pattern) {
    domain = new Domain(NAME, Pattern.compile(pattern));
  }

  private static String validateLength(String str) {
    if (str == null) {
      throw new IllegalArgumentException(
          MessageFormat.format("Parameter [{0}], cannot be NULL", NAME));
    }
    int len = str.length();
    if (len < 1) {
      throw new IllegalArgumentException(MessageFormat.format(
          "Parameter [{0}], it's length must be at least 1", NAME));
    }
    return str;
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public UserParam(final String str) {
    super(domain, str == null ||
        str.equals(DEFAULT) ? null : validateLength(str));
  }

  /**
   * Construct an object from a UGI.
   */
  public UserParam(final UserGroupInformation ugi) {
    this(ugi.getShortUserName());
  }

  @Override
  public String getName() {
    return NAME;
  }
}
