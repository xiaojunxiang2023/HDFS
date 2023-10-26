package org.apache.hadoop.fs.store.audit;

import javax.annotation.Nullable;
import java.io.IOException;

/**
 * A source of audit spans.
 */
public interface AuditSpanSource<T extends AuditSpan> {

  /**
   * Create a span for an operation.
   *
   * All operation names <i>SHOULD</i> come from
   * {@code StoreStatisticNames} or
   * {@code StreamStatisticNames}.
   * @param operation operation name.
   * @param path1 first path of operation
   * @param path2 second path of operation
   * @return a span for the audit
   * @throws IOException failure
   */
  T createSpan(String operation,
      @Nullable String path1,
      @Nullable String path2)
      throws IOException;
}
