package org.apache.hadoop.crypto.key.kms;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.security.token.delegation.web.DelegationTokenIdentifier;

/**
 * Holder class for KMS delegation tokens.
 */
public final class KMSDelegationToken {

  public static final String TOKEN_KIND_STR = "kms-dt";
  public static final Text TOKEN_KIND = new Text(TOKEN_KIND_STR);

  // Utility class is not supposed to be instantiated.
  private KMSDelegationToken() {
  }

  /**
   * DelegationTokenIdentifier used for the KMS.
   */
  public static class KMSDelegationTokenIdentifier
      extends DelegationTokenIdentifier {

    public KMSDelegationTokenIdentifier() {
      super(TOKEN_KIND);
    }

    @Override
    public Text getKind() {
      return TOKEN_KIND;
    }
  }
}