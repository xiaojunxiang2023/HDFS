package org.apache.hadoop.io.serializer;

/**
 * <p>
 * Encapsulates a {@link Serializer}/{@link Deserializer} pair.
 * </p>
 * @param <T>
 */
// MapReduce也可见
public interface Serialization<T> {
  
  /**
   * Allows clients to test whether this {@link Serialization}
   * supports the given class.
   */
  boolean accept(Class<?> c);
  
  /**
   * @return a {@link Serializer} for the given class.
   */
  Serializer<T> getSerializer(Class<T> c);

  /**
   * @return a {@link Deserializer} for the given class.
   */
  Deserializer<T> getDeserializer(Class<T> c);
}
