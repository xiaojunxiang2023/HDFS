package org.apache.hadoop.fs.store.audit;

/**
 * Interface to get the active thread span.
 * This can be used to collect the active span to
 * propagate it into other threads.
 *
 * FileSystems which track their active span may implement
 * this and offer their active span.
 */
public interface ActiveThreadSpanSource<T extends AuditSpan> {

  /**
   * The active span. This may not be a valid span, i.e. there is no guarantee
   * that {@code getActiveAuditSpan().isValidSpan()} is true, but
   * implementations MUST always return a non-null span.
   * @return the currently active span.
   */
  T getActiveAuditSpan();
}
