package org.apache.hadoop.fs.store.audit;

import java.io.Closeable;

/**
 * This is a span created by an {@link AuditSpanSource}.
 * An implementation of a span may carry context which can be picked
 * up by the filesystem when activated.
 * Each FS can have one active span per thread.
 * Different filesystem instances SHALL have different active
 * spans (if they support them)
 * A span is activated in a thread when {@link #activate()}
 * is called.
 * The span stays active in that thread until {@link #deactivate()}
 * is called.
 * When deactivated in one thread, it MAY still be active in others.
 * There's no explicit "end of span"; this is too hard to manage in
 * terms of API lifecycle.
 * Similarly, there's no stack of spans. Once a span is activated,
 * the previous span is forgotten about.
 * Therefore each FS will need a fallback "inactive span" which
 * will be reverted to on deactivation of any other span.
 */
public interface AuditSpan extends Closeable {

  /**
   * Return a span ID which must be unique for all spans within
   * everywhere. That effectively means part of the
   * span SHOULD be derived from a UUID.
   * Callers MUST NOT make any assumptions about the actual
   * contents or structure of this string other than the
   * uniqueness.
   * @return a non-empty string
   */
  String getSpanId();

  /**
   * Get the name of the operation.
   * @return the operation name.
   */
  String getOperationName();

  /**
   * Timestamp in UTC of span creation.
   * @return timestamp.
   */
  long getTimestamp();

  /**
   * Make this span active in the current thread.
   * @return the activated span.
   * This is makes it easy to use in try with resources
   */
  AuditSpan activate();

  /**
   * Deactivate the span in the current thread.
   */
  void deactivate();

  /**
   * Close calls {@link #deactivate()}; subclasses may override
   * but the audit manager's wrapping span will always relay to
   * {@link #deactivate()} rather
   * than call this method on the wrapped span.
   */
  default void close() {
    deactivate();
  }

  /**
   * Is the span valid? False == this is a span to indicate unbonded.
   * @return true if this span represents a real operation.
   */
  default boolean isValidSpan() {
    return true;
  }

  /**
   * Set an attribute.
   * This may or may not be propagated to audit logs.
   * @param key attribute name
   * @param value value
   */
  default void set(String key, String value) { }
}
