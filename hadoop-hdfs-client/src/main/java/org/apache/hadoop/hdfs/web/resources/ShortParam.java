package org.apache.hadoop.hdfs.web.resources;

/** Short parameter. */
abstract class ShortParam extends Param<Short, ShortParam.Domain> {
  ShortParam(final Domain domain, final Short value,
             final Short min, final Short max) {
    super(domain, value);
    checkRange(min, max);
  }

  private void checkRange(final Short min, final Short max) {
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
  public final String getValueString() {
    return domain.toString(getValue());
  }

  /** The domain of the parameter. */
  static final class Domain extends Param.Domain<Short> {
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
      return "<" + NULL + " | short in radix " + radix + ">";
    }

    @Override
    Short parse(final String str) {
      try {
        return NULL.equals(str) || str == null ? null : Short.parseShort(str,
            radix);
      } catch (NumberFormatException e) {
        throw new IllegalArgumentException("Failed to parse \"" + str
            + "\" as a radix-" + radix + " short integer.", e);
      }
    }

    /** Convert a Short to a String. */
    String toString(final Short n) {
      return n == null ? NULL : Integer.toString(n, radix);
    }
  }
}
