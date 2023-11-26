package org.apache.hadoop.hdfs.web.resources;

/** Long parameter. */
abstract class LongParam extends Param<Long, LongParam.Domain> {
  LongParam(final Domain domain, final Long value, final Long min,
            final Long max) {
    super(domain, value);
    checkRange(min, max);
  }

  private void checkRange(final Long min, final Long max) {
    if (value == null) {
      return;
    }
    if (min != null && value < min) {
      throw new IllegalArgumentException("Invalid parameter range: " + getName()
          + " = " + domain.toString(value) + " < " + domain.toString(min));
    }
    if (max != null && value > max) {
      throw new IllegalArgumentException("Invalid parameter range: " + getName()
          + " = " + domain.toString(value) + " > " + domain.toString(max));
    }
  }

  @Override
  public String toString() {
    return getName() + "=" + domain.toString(getValue());
  }

  /** @return the parameter value as a string */
  @Override
  public String getValueString() {
    return domain.toString(getValue());
  }

  /** The domain of the parameter. */
  static final class Domain extends Param.Domain<Long> {
    /** The radix of the number. */
    final int radix;

    Domain(final String paramName) {
      this(paramName, 10);
    }

    Domain(final String paramName, final int radix) {
      super(paramName);
      this.radix = radix;
    }

    @Override
    public String getDomain() {
      return "<" + NULL + " | long in radix " + radix + ">";
    }

    @Override
    Long parse(final String str) {
      try {
        return NULL.equals(str) || str == null ? null: Long.parseLong(str,
          radix);
      } catch(NumberFormatException e) {
        throw new IllegalArgumentException("Failed to parse \"" + str
            + "\" as a radix-" + radix + " long integer.", e);
      }
    }

    /** Convert a Long to a String. */
    String toString(final Long n) {
      return n == null? NULL: Long.toString(n, radix);
    }
  }
}
