package org.apache.hadoop.security.token;

import java.util.Collection;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.io.Text;

/**
 * Select token of type T from tokens for use with named service
 * 
 * @param <T>
 *          T extends TokenIdentifier
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public interface TokenSelector<T extends TokenIdentifier> {
  Token<T> selectToken(Text service,
      Collection<Token<? extends TokenIdentifier>> tokens);
}
