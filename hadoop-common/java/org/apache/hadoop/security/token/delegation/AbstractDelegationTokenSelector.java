package org.apache.hadoop.security.token.delegation;

import java.util.Collection;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.security.token.Token;
import org.apache.hadoop.security.token.TokenIdentifier;
import org.apache.hadoop.security.token.TokenSelector;

/**
 * Look through tokens to find the first delegation token that matches the
 * service and return it.
 */
@InterfaceAudience.LimitedPrivate({"HDFS", "MapReduce"})
@InterfaceStability.Evolving
public 
class AbstractDelegationTokenSelector<TokenIdent 
extends AbstractDelegationTokenIdentifier> 
    implements TokenSelector<TokenIdent> {
  private Text kindName;
  
  protected AbstractDelegationTokenSelector(Text kindName) {
    this.kindName = kindName;
  }

  @SuppressWarnings("unchecked")
  @Override
  public Token<TokenIdent> selectToken(Text service,
      Collection<Token<? extends TokenIdentifier>> tokens) {
    if (service == null) {
      return null;
    }
    for (Token<? extends TokenIdentifier> token : tokens) {
      if (kindName.equals(token.getKind())
          && service.equals(token.getService())) {
        return (Token<TokenIdent>) token;
      }
    }
    return null;
  }
}
