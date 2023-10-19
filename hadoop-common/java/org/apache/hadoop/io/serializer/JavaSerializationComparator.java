package org.apache.hadoop.io.serializer;

import java.io.IOException;
import java.io.Serializable;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.io.RawComparator;

/**
 * <p>
 * A {@link RawComparator} that uses a {@link JavaSerialization}
 * {@link Deserializer} to deserialize objects that are then compared via
 * their {@link Comparable} interfaces.
 * </p>
 * @param <T>
 * @see JavaSerialization
 */
@InterfaceAudience.Public
@InterfaceStability.Unstable
public class JavaSerializationComparator<T extends Serializable&Comparable<T>>
  extends DeserializerComparator<T> {

  @InterfaceAudience.Private
  public JavaSerializationComparator() throws IOException {
    super(new JavaSerialization.JavaSerializationDeserializer<T>());
  }

  @Override
  @InterfaceAudience.Private
  public int compare(T o1, T o2) {
    return o1.compareTo(o2);
  }

}
