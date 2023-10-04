package org.apache.hadoop.hdfs.web.resources;

import java.util.Arrays;
import org.apache.hadoop.util.StringUtils;

abstract class EnumParam<E extends Enum<E>>
    extends Param<E, EnumParam.Domain<E>> {
  EnumParam(final Domain<E> domain, final E value) {
    super(domain, value);
  }

  /** The domain of the parameter. */
  static final class Domain<E extends Enum<E>> extends Param.Domain<E> {
    private final Class<E> enumClass;

    Domain(String name, final Class<E> enumClass) {
      super(name);
      this.enumClass = enumClass;
    }

    @Override
    public final String getDomain() {
      return Arrays.asList(enumClass.getEnumConstants()).toString();
    }

    @Override
    final E parse(final String str) {
      return Enum.valueOf(enumClass, StringUtils.toUpperCase(str));
    }
  }
}
