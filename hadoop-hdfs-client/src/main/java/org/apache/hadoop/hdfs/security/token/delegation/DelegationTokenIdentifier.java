package org.apache.hadoop.hdfs.security.token.delegation;

import org.apache.commons.collections.map.LRUMap;
import org.apache.hadoop.hdfs.web.WebHdfsConstants;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.security.token.Token;
import org.apache.hadoop.security.token.TokenIdentifier;
import org.apache.hadoop.security.token.delegation.AbstractDelegationTokenIdentifier;
import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/**
 * A delegation token identifier that is specific to HDFS.
 */
public class DelegationTokenIdentifier
    extends AbstractDelegationTokenIdentifier {
  public static final Text HDFS_DELEGATION_KIND =
      new Text("HDFS_DELEGATION_TOKEN");

  @SuppressWarnings("unchecked")
  private static Map<TokenIdentifier, UserGroupInformation> ugiCache =
      Collections.synchronizedMap(new LRUMap(64));

  @VisibleForTesting
  public void clearCache() {
    ugiCache.clear();
  }

  /**
   * Create an empty delegation token identifier for reading into.
   */
  public DelegationTokenIdentifier() {
  }

  /**
   * Create a new delegation token identifier
   * @param owner the effective username of the token owner
   * @param renewer the username of the renewer
   * @param realUser the real username of the token owner
   */
  public DelegationTokenIdentifier(Text owner, Text renewer, Text realUser) {
    super(owner, renewer, realUser);
  }

  @Override
  public Text getKind() {
    return HDFS_DELEGATION_KIND;
  }

  @Override
  public UserGroupInformation getUser() {
    UserGroupInformation ugi = ugiCache.get(this);
    if (ugi == null) {
      ugi = super.getUser();
      ugiCache.put(this, ugi);
    }
    return ugi;
  }

  @Override
  public String toString() {
    StringBuilder sbld = new StringBuilder();
    sbld
        .append("token for ").append(getUser().getShortUserName())
        .append(": ").append(super.toString());
    return sbld.toString();
  }

  /*
   * A frozen version of toString() to be used to be backward compatible.
   * When backward compatibility is not needed, use toString(), which provides
   * more info and is supposed to evolve, see HDFS-9732.
   * Don't change this method except for major revisions.
   *
   * NOTE:
   * Currently this method is used by CLI for backward compatibility.
   */
  @Override
  public String toStringStable() {
    StringBuilder sbld = new StringBuilder();
    sbld
        .append(getKind()).append(" token ").append(getSequenceNumber())
        .append(" for ").append(getUser().getShortUserName())
        .append(" with renewer ").append(getRenewer());
    return sbld.toString();
  }

  /** @return a string representation of the token */
  public static String stringifyToken(final Token<?> token) throws IOException {
    DelegationTokenIdentifier ident = new DelegationTokenIdentifier();
    ByteArrayInputStream buf = new ByteArrayInputStream(token.getIdentifier());
    DataInputStream in = new DataInputStream(buf);
    ident.readFields(in);

    if (token.getService().getLength() > 0) {
      return ident + " on " + token.getService();
    } else {
      return ident.toString();
    }
  }

  public static class WebHdfsDelegationTokenIdentifier
      extends DelegationTokenIdentifier {
    public WebHdfsDelegationTokenIdentifier() {
      super();
    }

    @Override
    public Text getKind() {
      return WebHdfsConstants.WEBHDFS_TOKEN_KIND;
    }
  }

  public static class SWebHdfsDelegationTokenIdentifier
      extends WebHdfsDelegationTokenIdentifier {
    public SWebHdfsDelegationTokenIdentifier() {
      super();
    }

    @Override
    public Text getKind() {
      return WebHdfsConstants.SWEBHDFS_TOKEN_KIND;
    }
  }
}
