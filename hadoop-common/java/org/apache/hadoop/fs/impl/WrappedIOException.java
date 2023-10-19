package org.apache.hadoop.fs.impl;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.concurrent.ExecutionException;

import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * A wrapper for an IOException which
 * {@link FutureIOSupport#raiseInnerCause(ExecutionException)} knows to
 * always extract the exception.
 *
 * The constructor signature guarantees the cause will be an IOException,
 * and as it checks for a null-argument, non-null.
 * @deprecated use the {@code UncheckedIOException}.
 */
@Deprecated
@InterfaceAudience.Private
@InterfaceStability.Unstable
public class WrappedIOException extends UncheckedIOException {

  private static final long serialVersionUID = 2510210974235779294L;

  /**
   * Construct from a non-null IOException.
   * @param cause inner cause
   * @throws NullPointerException if the cause is null.
   */
  public WrappedIOException(final IOException cause) {
    super(Preconditions.checkNotNull(cause));
  }

  @Override
  public synchronized IOException getCause() {
    return (IOException) super.getCause();
  }
}
