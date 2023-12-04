package org.apache.hadoop.metrics2.util;

import org.apache.hadoop.thirdparty.com.google.common.collect.ComparisonChain;

/**
 * Specifies a quantile (with error bounds) to be watched by a
 * {@link SampleQuantiles} object.
 */
public class Quantile implements Comparable<Quantile> {
  public final double quantile;
  public final double error;

  public Quantile(double quantile, double error) {
    this.quantile = quantile;
    this.error = error;
  }

  @Override
  public boolean equals(Object aThat) {
    if (this == aThat) {
      return true;
    }
    if (!(aThat instanceof Quantile)) {
      return false;
    }

    Quantile that = (Quantile) aThat;

    long qbits = Double.doubleToLongBits(quantile);
    long ebits = Double.doubleToLongBits(error);

    return qbits == Double.doubleToLongBits(that.quantile)
        && ebits == Double.doubleToLongBits(that.error);
  }

  @Override
  public int hashCode() {
    return (int) (Double.doubleToLongBits(quantile) ^ Double
        .doubleToLongBits(error));
  }

  @Override
  public int compareTo(Quantile other) {
    return ComparisonChain.start()
        .compare(quantile, other.quantile)
        .compare(error, other.error)
        .result();
  }

  @Override
  public String toString() {
    return String.format("%.2f %%ile +/- %.2f%%",
        quantile * 100, error * 100);
  }

}