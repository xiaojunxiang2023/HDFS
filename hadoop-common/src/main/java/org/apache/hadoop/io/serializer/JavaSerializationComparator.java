package org.apache.hadoop.io.serializer;

import org.apache.hadoop.io.RawComparator;

import java.io.IOException;
import java.io.Serializable;

/**
 * <p>
 * A {@link RawComparator} that uses a {@link JavaSerialization}
 * {@link Deserializer} to deserialize objects that are then compared via
 * their {@link Comparable} interfaces.
 * </p>
 * @param <T>
 * @see JavaSerialization
 */
public class JavaSerializationComparator<T extends Serializable & Comparable<T>>
    extends DeserializerComparator<T> {
  public JavaSerializationComparator() throws IOException {
    super(new JavaSerialization.JavaSerializationDeserializer<T>());
  }

  @Override
  public int compare(T o1, T o2) {
    return o1.compareTo(o2);
  }

}
