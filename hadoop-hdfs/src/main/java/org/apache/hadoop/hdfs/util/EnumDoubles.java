package org.apache.hadoop.hdfs.util;

import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;

import java.util.Arrays;

/**
 * Similar to {@link EnumCounters} except that the value type is double.
 *
 * @param <E> the enum type
 */
public class EnumDoubles<E extends Enum<E>> {
  /** The class of the enum. */
  private final Class<E> enumClass;
  /** An array of doubles corresponding to the enum type. */
  private final double[] doubles;

  /**
   * Construct doubles for the given enum constants.
   * @param enumClass the enum class.
   */
  public EnumDoubles(final Class<E> enumClass) {
    final E[] enumConstants = enumClass.getEnumConstants();
    Preconditions.checkNotNull(enumConstants);
    this.enumClass = enumClass;
    this.doubles = new double[enumConstants.length];
  }

  /** @return the value corresponding to e. */
  public final double get(final E e) {
    return doubles[e.ordinal()];
  }

  /** Negate all values. */
  public final void negation() {
    for (int i = 0; i < doubles.length; i++) {
      doubles[i] = -doubles[i];
    }
  }

  /** Set e to the given value. */
  public final void set(final E e, final double value) {
    doubles[e.ordinal()] = value;
  }

  /** Set the values of this object to that object. */
  public final void set(final EnumDoubles<E> that) {
    for (int i = 0; i < doubles.length; i++) {
      this.doubles[i] = that.doubles[i];
    }
  }

  /** Reset all values to zero. */
  public final void reset() {
    for (int i = 0; i < doubles.length; i++) {
      this.doubles[i] = 0.0;
    }
  }

  /** Add the given value to e. */
  public final void add(final E e, final double value) {
    doubles[e.ordinal()] += value;
  }

  /** Add the values of that object to this. */
  public final void add(final EnumDoubles<E> that) {
    for (int i = 0; i < doubles.length; i++) {
      this.doubles[i] += that.doubles[i];
    }
  }

  /** Subtract the given value from e. */
  public final void subtract(final E e, final double value) {
    doubles[e.ordinal()] -= value;
  }

  /** Subtract the values of this object from that object. */
  public final void subtract(final EnumDoubles<E> that) {
    for (int i = 0; i < doubles.length; i++) {
      this.doubles[i] -= that.doubles[i];
    }
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    } else if (obj == null || !(obj instanceof EnumDoubles)) {
      return false;
    }
    final EnumDoubles<?> that = (EnumDoubles<?>) obj;
    return this.enumClass == that.enumClass
        && Arrays.equals(this.doubles, that.doubles);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(doubles);
  }

  @Override
  public String toString() {
    final E[] enumConstants = enumClass.getEnumConstants();
    final StringBuilder b = new StringBuilder();
    for (int i = 0; i < doubles.length; i++) {
      final String name = enumConstants[i].name();
      b.append(name).append("=").append(doubles[i]).append(", ");
    }
    return b.substring(0, b.length() - 2);
  }
}
