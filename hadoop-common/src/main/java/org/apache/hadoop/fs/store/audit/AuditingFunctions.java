package org.apache.hadoop.fs.store.audit;

import javax.annotation.Nullable;
import java.util.concurrent.Callable;
import org.apache.hadoop.util.functional.CallableRaisingIOE;
import org.apache.hadoop.util.functional.FunctionRaisingIOE;
import org.apache.hadoop.util.functional.InvocationRaisingIOE;

/**
 * Static methods to assist in working with Audit Spans.
 * the {@code withinX} calls take a span and a closure/function etc.
 * and return a new function of the same types but which will
 * activate and the span.
 * They do not deactivate it afterwards to avoid accidentally deactivating
 * the already-active span during a chain of operations in the same thread.
 * All they do is ensure that the given span is guaranteed to be
 * active when the passed in callable/function/invokable is evaluated.
 */
public final class AuditingFunctions {

  private AuditingFunctions() {
  }

  /**
   * Given a callable, return a new callable which
   * activates and deactivates the span around the inner invocation.
   * @param auditSpan audit span
   * @param operation operation
   * @param <T> type of result
   * @return a new invocation.
   */
  public static <T> CallableRaisingIOE<T> withinAuditSpan(
      @Nullable AuditSpan auditSpan,
      CallableRaisingIOE<T> operation) {
    return auditSpan == null
        ? operation
        : () -> {
          auditSpan.activate();
          return operation.apply();
        };
  }

  /**
   * Given an invocation, return a new invocation which
   * activates and deactivates the span around the inner invocation.
   * @param auditSpan audit span
   * @param operation operation
   * @return a new invocation.
   */
  public static InvocationRaisingIOE withinAuditSpan(
      @Nullable AuditSpan auditSpan,
      InvocationRaisingIOE operation) {
    return auditSpan == null
        ? operation
        : () -> {
          auditSpan.activate();
          operation.apply();
        };
  }

  /**
   * Given a function, return a new function which
   * activates and deactivates the span around the inner one.
   * @param auditSpan audit span
   * @param operation operation
   * @return a new invocation.
   */
  public static <T, R> FunctionRaisingIOE<T, R> withinAuditSpan(
      @Nullable AuditSpan auditSpan,
      FunctionRaisingIOE<T, R> operation) {
    return auditSpan == null
        ? operation
        : (x) -> {
          auditSpan.activate();
          return operation.apply(x);
        };
  }

  /**
   * Given a callable, return a new callable which
   * activates and deactivates the span around the inner invocation.
   * @param auditSpan audit span
   * @param operation operation
   * @param <T> type of result
   * @return a new invocation.
   */
  public static <T> Callable<T> callableWithinAuditSpan(
      @Nullable AuditSpan auditSpan,
      Callable<T> operation) {
    return auditSpan == null
        ? operation
        : () -> {
          auditSpan.activate();
          return operation.call();
        };
  }

}
