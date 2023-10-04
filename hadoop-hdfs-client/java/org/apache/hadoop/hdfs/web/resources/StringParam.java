package org.apache.hadoop.hdfs.web.resources;

import java.util.regex.Pattern;

/** String parameter. */
abstract class StringParam extends Param<String, StringParam.Domain> {
  StringParam(final Domain domain, String str) {
    super(domain, domain.parse(str));
  }

  /** @return the parameter value as a string */
  @Override
  public String getValueString() {
    return value;
  }

  /** The domain of the parameter. */
  static final class Domain extends Param.Domain<String> {
    /** The pattern defining the domain; null . */
    private final Pattern pattern;

    Domain(final String paramName, final Pattern pattern) {
      super(paramName);
      this.pattern = pattern;
    }

    @Override
    public final String getDomain() {
      return pattern == null ? "<String>" : pattern.pattern();
    }

    @Override
    final String parse(final String str) {
      if (str != null && pattern != null) {
        if (!pattern.matcher(str).matches()) {
          throw new IllegalArgumentException("Invalid value: \"" + str
              + "\" does not belong to the domain " + getDomain());
        }
      }
      return str;
    }
  }
}
