package org.apache.hadoop.hdfs.web.resources;

/** Integer parameter. */
abstract class IntegerParam extends Param<Integer, IntegerParam.Domain> {
  IntegerParam(final Domain domain, final Integer value,
      final Integer min, final Integer max) {
    super(domain, value);
    checkRange(min, max);
  }

  private void checkRange(final Integer min, final Integer max) {
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
  static final class Domain extends Param.Domain<Integer> {
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
      return "<" + NULL + " | int in radix " + radix + ">";
    }

    @Override
    Integer parse(final String str) {
      try{
        return NULL.equals(str) || str == null ? null : Integer.parseInt(str,
          radix);
      } catch(NumberFormatException e) {
        throw new IllegalArgumentException("Failed to parse \"" + str
            + "\" as a radix-" + radix + " integer.", e);
      }
    }

    /** Convert an Integer to a String. */
    String toString(final Integer n) {
      return n == null? NULL: Integer.toString(n, radix);
    }
  }
}
