package org.apache.hadoop.crypto.key;

import org.apache.hadoop.security.Credentials;
import org.apache.hadoop.security.token.DelegationTokenIssuer;
import org.apache.hadoop.security.token.Token;

import java.io.IOException;

/**
 * A KeyProvider extension with the ability to add a renewer's Delegation 
 * Tokens to the provided Credentials.
 */
public class KeyProviderDelegationTokenExtension extends
    KeyProviderExtension
        <KeyProviderDelegationTokenExtension.DelegationTokenExtension>
    implements DelegationTokenIssuer {

  private static DelegationTokenExtension DEFAULT_EXTENSION =
      new DefaultDelegationTokenExtension();

  /**
   * DelegationTokenExtension is a type of Extension that exposes methods
   * needed to work with Delegation Tokens.
   */
  public interface DelegationTokenExtension
      extends KeyProviderExtension.Extension, DelegationTokenIssuer {
    /**
     * Renews the given token.
     * @param token The token to be renewed.
     * @return The token's lifetime after renewal, or 0 if it can't be renewed.
     * @throws IOException
     */
    long renewDelegationToken(final Token<?> token) throws IOException;

    /**
     * Cancels the given token.
     * @param token The token to be cancelled.
     * @throws IOException
     */
    Void cancelDelegationToken(final Token<?> token) throws IOException;

    // Do NOT call this. Only intended for internal use.

    Token<?> selectDelegationToken(Credentials creds);
  }

  /**
   * Default implementation of {@link DelegationTokenExtension} that
   * implements the method as a no-op.
   */
  private static class DefaultDelegationTokenExtension implements
      DelegationTokenExtension {

    @Override
    public Token<?>[] addDelegationTokens(String renewer,
                                          Credentials credentials) {
      return null;
    }

    @Override
    public String getCanonicalServiceName() {
      return null;
    }

    @Override
    public Token<?> getDelegationToken(String renewer) {
      return null;
    }

    @Override
    public long renewDelegationToken(final Token<?> token) throws IOException {
      return 0;
    }

    @Override
    public Void cancelDelegationToken(final Token<?> token) throws IOException {
      return null;
    }

    @Override
    public Token<?> selectDelegationToken(Credentials creds) {
      return null;
    }

  }

  private KeyProviderDelegationTokenExtension(KeyProvider keyProvider,
                                              DelegationTokenExtension extensions) {
    super(keyProvider, extensions);
  }

  @Override
  public String getCanonicalServiceName() {
    return getExtension().getCanonicalServiceName();
  }

  @Override
  public Token<?> getDelegationToken(final String renewer) throws IOException {
    return getExtension().getDelegationToken(renewer);
  }

  /**
   * Creates a <code>KeyProviderDelegationTokenExtension</code> using a given 
   * {@link KeyProvider}.
   * <p>
   * If the given <code>KeyProvider</code> implements the 
   * {@link DelegationTokenExtension} interface the <code>KeyProvider</code> 
   * itself will provide the extension functionality, otherwise a default 
   * extension implementation will be used.
   *
   * @param keyProvider <code>KeyProvider</code> to use to create the 
   * <code>KeyProviderDelegationTokenExtension</code> extension.
   * @return a <code>KeyProviderDelegationTokenExtension</code> instance 
   * using the given <code>KeyProvider</code>.
   */
  public static KeyProviderDelegationTokenExtension
  createKeyProviderDelegationTokenExtension(KeyProvider keyProvider) {

    DelegationTokenExtension delTokExtension =
        (keyProvider instanceof DelegationTokenExtension) ?
            (DelegationTokenExtension) keyProvider :
            DEFAULT_EXTENSION;
    return new KeyProviderDelegationTokenExtension(
        keyProvider, delTokExtension);

  }

}
