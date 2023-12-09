package org.apache.hadoop.io.serializer;

import java.io.IOException;
import java.io.OutputStream;

/**
 * <p>
 * Provides a facility for serializing objects of type &lt;T&gt; to an
 * {@link OutputStream}.
 * </p>
 *
 * <p>
 * Serializers are stateful, but must not buffer the output since
 * other producers may write to the output between calls to
 * {@link #serialize(Object)}.
 * </p>
 * @param <T>
 */
public interface Serializer<T> {
  /**
   * <p>Prepare the serializer for writing.</p>
   */
  void open(OutputStream out) throws IOException;

  /**
   * <p>Serialize <code>t</code> to the underlying output stream.</p>
   */
  void serialize(T t) throws IOException;

  /**
   * <p>Close the underlying output stream and clear up any resources.</p>
   */
  void close() throws IOException;
}
