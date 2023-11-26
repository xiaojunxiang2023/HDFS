package org.apache.hadoop.metrics2.lib;

import java.util.Map;

import org.apache.hadoop.thirdparty.com.google.common.base.Joiner;
import org.apache.hadoop.thirdparty.com.google.common.collect.Maps;

/**
 * Generates predictable and user-friendly unique names
 */
public class UniqueNames {

  static class Count {
    final String baseName;
    int value;

    Count(String name, int value) {
      baseName = name;
      this.value = value;
    }
  }

  static final Joiner joiner = Joiner.on('-');
  final Map<String, Count> map = Maps.newHashMap();

  public synchronized String uniqueName(String name) {
    Count c = map.get(name);
    if (c == null) {
      c = new Count(name, 0);
      map.put(name, c);
      return name;
    }
    if (!c.baseName.equals(name)) c = new Count(name, 0);
    do {
      String newName = joiner.join(name, ++c.value);
      Count c2 = map.get(newName);
      if (c2 == null) {
        map.put(newName, c);
        return newName;
      }
      // handle collisons, assume to be rare cases,
      // eg: people explicitly passed in name-\d+ names.
    } while (true);
  }
}
