package org.apache.hadoop.metrics2.impl;

import java.util.ArrayList;

/**
 * Builder for the immutable metrics buffers
 */
class MetricsBufferBuilder extends ArrayList<MetricsBuffer.Entry> {
  private static final long serialVersionUID = 1L;

  boolean add(String name, Iterable<MetricsRecordImpl> records) {
    return add(new MetricsBuffer.Entry(name, records));
  }

  MetricsBuffer get() {
    return new MetricsBuffer(this);
  }
}
