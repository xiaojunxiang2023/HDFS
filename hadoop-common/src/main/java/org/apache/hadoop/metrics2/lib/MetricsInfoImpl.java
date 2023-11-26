package org.apache.hadoop.metrics2.lib;

import org.apache.hadoop.thirdparty.com.google.common.base.Objects;
import org.apache.hadoop.metrics2.MetricsInfo;

import java.util.StringJoiner;

import static org.apache.hadoop.thirdparty.com.google.common.base.Preconditions.checkNotNull;

/**
 * Making implementing metric info a little easier
 */
class MetricsInfoImpl implements MetricsInfo {
  private final String name, description;

  MetricsInfoImpl(String name, String description) {
    this.name = checkNotNull(name, "name");
    this.description = checkNotNull(description, "description");
  }

  @Override public String name() {
    return name;
  }

  @Override public String description() {
    return description;
  }

  @Override public boolean equals(Object obj) {
    if (obj instanceof MetricsInfo) {
      MetricsInfo other = (MetricsInfo) obj;
      return Objects.equal(name, other.name()) &&
             Objects.equal(description, other.description());
    }
    return false;
  }

  @Override public int hashCode() {
    return Objects.hashCode(name, description);
  }

  @Override public String toString() {
    return new StringJoiner(", ", this.getClass().getSimpleName() + "{", "}")
        .add("name=" + name)
        .add("description=" + description)
        .toString();
  }
}
