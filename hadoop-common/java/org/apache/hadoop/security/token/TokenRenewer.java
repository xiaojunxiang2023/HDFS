package org.apache.hadoop.security.token;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.Text;

/**
 * This is the interface for plugins that handle tokens.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public abstract class TokenRenewer {

  /**
   * Does this renewer handle this kind of token?
   * @param kind the kind of the token
   * @return true if this renewer can renew it
   */
  public abstract boolean handleKind(Text kind);

  /**
   * Is the given token managed? Only managed tokens may be renewed or
   * cancelled.
   * @param token the token being checked
   * @return true if the token may be renewed or cancelled
   * @throws IOException
   */
  public abstract boolean isManaged(Token<?> token) throws IOException;
  
  /**
   * Renew the given token.
   * @return the new expiration time
   * @throws IOException
   * @throws InterruptedException 
   */
  public abstract long renew(Token<?> token,
                             Configuration conf
                             ) throws IOException, InterruptedException;
  
  /**
   * Cancel the given token
   * @throws IOException
   * @throws InterruptedException 
   */
  public abstract void cancel(Token<?> token,
                              Configuration conf
                              ) throws IOException, InterruptedException;
}
