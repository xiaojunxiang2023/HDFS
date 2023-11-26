package org.apache.hadoop.metrics2.impl;

import org.apache.hadoop.thirdparty.com.google.common.base.Objects;
import org.apache.hadoop.thirdparty.com.google.common.collect.Iterables;
import org.apache.hadoop.metrics2.MetricsRecord;

import java.util.StringJoiner;

abstract class AbstractMetricsRecord implements MetricsRecord {

  @Override public boolean equals(Object obj) {
    if (obj instanceof MetricsRecord) {
      final MetricsRecord other = (MetricsRecord) obj;
      return Objects.equal(timestamp(), other.timestamp()) &&
             Objects.equal(name(), other.name()) &&
             Objects.equal(description(), other.description()) &&
             Objects.equal(tags(), other.tags()) &&
             Iterables.elementsEqual(metrics(), other.metrics());
    }
    return false;
  }

  // Should make sense most of the time when the record is used as a key
  @Override public int hashCode() {
    return Objects.hashCode(name(), description(), tags());
  }

  @Override public String toString() {
    return new StringJoiner(", ", this.getClass().getSimpleName() + "{", "}")
        .add("timestamp=" + timestamp())
        .add("name=" + name())
        .add("description=" + description())
        .add("tags=" + tags())
        .add("metrics=" + Iterables.toString(metrics()))
        .toString();
  }
}
