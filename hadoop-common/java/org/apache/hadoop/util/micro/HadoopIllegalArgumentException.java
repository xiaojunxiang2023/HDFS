package org.apache.hadoop.util.micro;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Indicates that a method has been passed illegal or invalid argument. This
 * exception is thrown instead of IllegalArgumentException to differentiate the
 * exception thrown in Hadoop implementation from the one thrown in JDK.
 */
@InterfaceAudience.Public
@InterfaceStability.Stable
public class HadoopIllegalArgumentException extends IllegalArgumentException {
  private static final long serialVersionUID = 1L;
  
  /**
   * Constructs exception with the specified detail message. 
   * @param message detailed message.
   */
  public HadoopIllegalArgumentException(final String message) {
    super(message);
  }
}
