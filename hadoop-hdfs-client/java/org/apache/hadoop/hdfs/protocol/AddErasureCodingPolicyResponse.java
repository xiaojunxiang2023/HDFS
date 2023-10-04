package org.apache.hadoop.hdfs.protocol;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.hadoop.HadoopIllegalArgumentException;

/**
 * A response of add an ErasureCoding policy.
 */
public class AddErasureCodingPolicyResponse {
  private boolean succeed;
  private ErasureCodingPolicy policy;
  private String errorMsg;

  public AddErasureCodingPolicyResponse(ErasureCodingPolicy policy) {
    this.policy = policy;
    this.succeed = true;
  }

  public AddErasureCodingPolicyResponse(ErasureCodingPolicy policy,
                                        String errorMsg) {
    this.policy = policy;
    this.errorMsg = errorMsg;
    this.succeed = false;
  }

  public AddErasureCodingPolicyResponse(ErasureCodingPolicy policy,
                                        HadoopIllegalArgumentException e) {
    this(policy, e.getMessage());
  }

  public boolean isSucceed() {
    return succeed;
  }

  public ErasureCodingPolicy getPolicy() {
    return policy;
  }

  public String getErrorMsg() {
    return errorMsg;
  }

  @Override
  public String toString() {
    if (isSucceed()) {
      return "Add ErasureCodingPolicy " + getPolicy().getName() + " succeed.";
    } else {
      return "Add ErasureCodingPolicy " + getPolicy().getName() + " failed and "
          + "error message is " + getErrorMsg();
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof AddErasureCodingPolicyResponse) {
      AddErasureCodingPolicyResponse other = (AddErasureCodingPolicyResponse) o;
      return new EqualsBuilder()
          .append(policy, other.policy)
          .append(succeed, other.succeed)
          .append(errorMsg, other.errorMsg)
          .isEquals();
    }
    return false;
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(303855623, 582626729)
        .append(policy)
        .append(succeed)
        .append(errorMsg)
        .toHashCode();
  }
}
