package org.apache.hadoop.ipc;

/**
 * Indicates an exception in the RPC client 
 */
public class RpcClientException extends RpcException {
  private static final long serialVersionUID = 1L;

  /**
   * Constructs exception with the specified detail message.
   * 
   * @param messages detailed message.
   */
  RpcClientException(final String message) {
    super(message);
  }

  /**
   * Constructs exception with the specified detail message and cause.
   * 
   * @param message message.
   * @param cause that cause this exception
   * @param cause the cause (can be retried by the {@link #getCause()} method).
   *          (A <tt>null</tt> value is permitted, and indicates that the cause
   *          is nonexistent or unknown.)
   */
  RpcClientException(final String message, final Throwable cause) {
    super(message, cause);
  }
}
