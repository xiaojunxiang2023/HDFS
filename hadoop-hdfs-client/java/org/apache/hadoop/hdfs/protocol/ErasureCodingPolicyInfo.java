package org.apache.hadoop.hdfs.protocol;

import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;

/**
 * HDFS internal presentation of a {@link ErasureCodingPolicy}. Also contains
 * additional information such as {@link ErasureCodingPolicyState}.
 */
public class ErasureCodingPolicyInfo implements Serializable {

  private static final long serialVersionUID = 0x31;

  private final ErasureCodingPolicy policy;
  private ErasureCodingPolicyState state;

  public ErasureCodingPolicyInfo(final ErasureCodingPolicy thePolicy,
      final ErasureCodingPolicyState theState) {
    Preconditions.checkNotNull(thePolicy);
    Preconditions.checkNotNull(theState);
    policy = thePolicy;
    state = theState;
  }

  public ErasureCodingPolicyInfo(final ErasureCodingPolicy thePolicy) {
    this(thePolicy, ErasureCodingPolicyState.DISABLED);
  }

  public ErasureCodingPolicy getPolicy() {
    return policy;
  }

  public ErasureCodingPolicyState getState() {
    return state;
  }

  public void setState(final ErasureCodingPolicyState newState) {
    Preconditions.checkNotNull(newState, "New state should not be null.");
    state = newState;
  }

  public boolean isEnabled() {
    return (this.state == ErasureCodingPolicyState.ENABLED);
  }

  public boolean isDisabled() {
    return (this.state == ErasureCodingPolicyState.DISABLED);
  }

  public boolean isRemoved() {
    return (this.state == ErasureCodingPolicyState.REMOVED);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) {
      return false;
    }
    if (o == this) {
      return true;
    }
    if (o.getClass() != getClass()) {
      return false;
    }
    ErasureCodingPolicyInfo rhs = (ErasureCodingPolicyInfo) o;
    return new EqualsBuilder()
        .append(policy, rhs.policy)
        .append(state, rhs.state)
        .isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(303855623, 582626729)
        .append(policy)
        .append(state)
        .toHashCode();
  }

  @Override
  public String toString() {
    return policy.toString() + ", State=" + state.toString();
  }
}