package org.apache.hadoop.metrics2.impl;

import org.apache.hadoop.metrics2.AbstractMetric;
import org.apache.hadoop.metrics2.MetricsFilter;
import org.apache.hadoop.metrics2.MetricsRecord;
import org.apache.hadoop.metrics2.MetricsTag;
import org.apache.hadoop.thirdparty.com.google.common.collect.AbstractIterator;

import java.util.Collection;
import java.util.Iterator;

class MetricsRecordFiltered extends AbstractMetricsRecord {
  private final MetricsRecord delegate;
  private final MetricsFilter filter;

  MetricsRecordFiltered(MetricsRecord delegate, MetricsFilter filter) {
    this.delegate = delegate;
    this.filter = filter;
  }

  @Override
  public long timestamp() {
    return delegate.timestamp();
  }

  @Override
  public String name() {
    return delegate.name();
  }

  @Override
  public String description() {
    return delegate.description();
  }

  @Override
  public String context() {
    return delegate.context();
  }

  @Override
  public Collection<MetricsTag> tags() {
    return delegate.tags();
  }

  @Override
  public Iterable<AbstractMetric> metrics() {
    return new Iterable<AbstractMetric>() {
      final Iterator<AbstractMetric> it = delegate.metrics().iterator();

      @Override
      public Iterator<AbstractMetric> iterator() {
        return new AbstractIterator<AbstractMetric>() {
          @Override
          public AbstractMetric computeNext() {
            while (it.hasNext()) {
              AbstractMetric next = it.next();
              if (filter.accepts(next.name())) {
                return next;
              }
            }
            return endOfData();
          }
        };
      }
    };
  }
}
