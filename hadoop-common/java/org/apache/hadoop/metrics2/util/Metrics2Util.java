package org.apache.hadoop.metrics2.util;

import java.util.PriorityQueue;

/**
 * Utility class to simplify creation of hadoop metrics2 source/sink.
 */
public class Metrics2Util {
  /**
   * A pair of a name and its corresponding value. Defines a custom
   * comparator so the TopN PriorityQueue sorts based on the count.
   */
  public static class NameValuePair implements Comparable<NameValuePair> {
    private String name;
    private long value;

    public NameValuePair(String metricName, long value) {
      this.name = metricName;
      this.value = value;
    }

    public String getName() {
      return name;
    }

    public long getValue() {
      return value;
    }

    @Override
    public int compareTo(NameValuePair other) {
      return (int) (value - other.value);
    }

    @Override
    public boolean equals(Object other) {
      if (other instanceof NameValuePair) {
        return compareTo((NameValuePair)other) == 0;
      }
      return false;
    }

    @Override
    public int hashCode() {
      return Long.valueOf(value).hashCode();
    }
  }

  /**
   * A fixed-size priority queue, used to retrieve top-n of offered entries.
   */
  public static class TopN extends PriorityQueue<NameValuePair> {
    private static final long serialVersionUID = 5134028249611535803L;
    private int n; // > 0
    private long total = 0;

    public TopN(int n) {
      super(n);
      this.n = n;
    }

    @Override
    public boolean offer(NameValuePair entry) {
      updateTotal(entry.value);
      if (size() == n) {
        NameValuePair smallest = peek();
        if (smallest.value >= entry.value) {
          return false;
        }
        poll(); // remove smallest
      }
      return super.offer(entry);
    }

    private void updateTotal(long value) {
      total += value;
    }

    public long getTotal() {
      return total;
    }
  }
}
