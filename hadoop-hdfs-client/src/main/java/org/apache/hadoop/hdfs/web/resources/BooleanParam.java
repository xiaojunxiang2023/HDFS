package org.apache.hadoop.hdfs.web.resources;

/** Boolean parameter. */
abstract class BooleanParam extends Param<Boolean, BooleanParam.Domain> {
  static final String TRUE = "true";
  static final String FALSE = "false";

  /** @return the parameter value as a string */
  @Override
  public String getValueString() {
    return value.toString();
  }

  BooleanParam(final Domain domain, final Boolean value) {
    super(domain, value);
  }

  /** The domain of the parameter. */
  static final class Domain extends Param.Domain<Boolean> {
    Domain(final String paramName) {
      super(paramName);
    }

    @Override
    public String getDomain() {
      return "<" + NULL + " | boolean>";
    }

    @Override
    Boolean parse(final String str) {
      if (TRUE.equalsIgnoreCase(str)) {
        return true;
      } else if (FALSE.equalsIgnoreCase(str)) {
        return false;
      }
      throw new IllegalArgumentException("Failed to parse \"" + str
          + "\" to Boolean.");
    }
  }
}
