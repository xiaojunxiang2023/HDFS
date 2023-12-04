package org.apache.hadoop.hdfs.web.resources;

import org.apache.hadoop.hdfs.server.namenode.NameNode;

/** Namenode RPC address parameter. */
public class NamenodeAddressParam extends StringParam {
  /** Parameter name. */
  public static final String NAME = "namenoderpcaddress";
  /** Default parameter value. */
  public static final String DEFAULT = "";

  private static final Domain DOMAIN = new Domain(NAME, null);

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public NamenodeAddressParam(final String str) {
    super(DOMAIN, str == null || str.equals(DEFAULT) ? null : DOMAIN.parse(str));
  }

  /**
   * Construct an object using the RPC address of the given namenode.
   */
  public NamenodeAddressParam(final NameNode namenode) {
    super(DOMAIN, namenode.getTokenServiceName());
  }

  @Override
  public String getName() {
    return NAME;
  }
}