package org.apache.hadoop.fs.audit;

/**
 * Statistic Names for Auditing.
 */
public final class AuditStatisticNames {

  private AuditStatisticNames() {
  }

  /**
   * Audit failure: {@value}.
   */
  public static final String AUDIT_FAILURE = "audit_failure";

  /**
   * A request was executed and the auditor invoked: {@value}.
   */
  public static final String AUDIT_REQUEST_EXECUTION
      = "audit_request_execution";

  /**
   * Audit span created: {@value}.
   */
  public static final String AUDIT_SPAN_CREATION = "audit_span_creation";

  /**
   * Access check during audit rejected: {@value}.
   */
  public static final String AUDIT_ACCESS_CHECK_FAILURE
      = "audit_access_check_failure";
}
