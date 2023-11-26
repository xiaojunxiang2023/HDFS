package org.apache.hadoop.hdfs.web.resources;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import org.apache.hadoop.util.StringUtils;

abstract class EnumSetParam<E extends Enum<E>>
    extends Param<EnumSet<E>, EnumSetParam.Domain<E>> {
  /** Convert an EnumSet to a string of comma separated values. */
  static <E extends Enum<E>> String toString(EnumSet<E> set) {
    if (set == null || set.isEmpty()) {
      return "";
    } else {
      final StringBuilder b = new StringBuilder();
      final Iterator<E> i = set.iterator();
      b.append(i.next());
      for(; i.hasNext(); ) {
        b.append(',').append(i.next());
      }
      return b.toString();
    }
  }

  static <E extends Enum<E>> EnumSet<E> toEnumSet(final Class<E> clazz,
      final E[] values) {
    final EnumSet<E> set = EnumSet.noneOf(clazz);
    set.addAll(Arrays.asList(values));
    return set;
  }

  EnumSetParam(final Domain<E> domain, final EnumSet<E> value) {
    super(domain, value);
  }

  @Override
  public String toString() {
    return getName() + "=" + toString(value);
  }

  /** @return the parameter value as a string */
  @Override
  public String getValueString() {
    return toString(value);
  }

  /** The domain of the parameter. */
  static final class Domain<E extends Enum<E>> extends Param.Domain<EnumSet<E>> {
    private final Class<E> enumClass;

    Domain(String name, final Class<E> enumClass) {
      super(name);
      this.enumClass = enumClass;
    }

    @Override
    public final String getDomain() {
      return Arrays.asList(enumClass.getEnumConstants()).toString();
    }

    /** The string contains a comma separated values. */
    @Override
    final EnumSet<E> parse(final String str) {
      final EnumSet<E> set = EnumSet.noneOf(enumClass);
      if (!str.isEmpty()) {
        for(int i, j = 0; j >= 0; ) {
          i = j > 0 ? j + 1 : 0;
          j = str.indexOf(',', i);
          final String sub = j >= 0? str.substring(i, j): str.substring(i);
          set.add(Enum.valueOf(enumClass, StringUtils.toUpperCase(sub.trim())));
        }
      }
      return set;
    }
  }
}
