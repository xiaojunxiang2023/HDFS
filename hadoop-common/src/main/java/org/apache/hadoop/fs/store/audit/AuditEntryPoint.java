package org.apache.hadoop.fs.store.audit;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * A marker attribute simply to highlight which of the methods
 * in a FileSystem why are audit entry points.
 * <ol>
 *   <li>
 *     A FS method is an AuditEntryPoint if, on invocation it
 *     creates and activates an Audit Span for that FS.
 *   </li>
 *   <li>
 *     The audit span SHOULD be deactivated before returning,
 *   </li>
 *   <li>
 *     Objects returned by the API call which go on
 *     to make calls of the filesystem MUST perform
 *     all IO within the same audit span.
 *   </li>
 *   <li>
 *     Audit Entry points SHOULD NOT invoke other Audit Entry Points.
 *     This is to ensure the original audit span information
 *     is not replaced.
 *   </li>
 * </ol>
 * FileSystem methods the entry point then invokes
 * SHOULD NOT invoke audit entry points internally.
 *
 * All external methods MUST be audit entry points.
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface AuditEntryPoint {
}
