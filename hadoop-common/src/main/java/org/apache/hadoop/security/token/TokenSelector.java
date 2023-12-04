package org.apache.hadoop.security.token;

import org.apache.hadoop.io.Text;

import java.util.Collection;

/**
 * Select token of type T from tokens for use with named service
 *
 * @param <T>
 *          T extends TokenIdentifier
 */
public interface TokenSelector<T extends TokenIdentifier> {
  Token<T> selectToken(Text service,
                       Collection<Token<? extends TokenIdentifier>> tokens);
}
