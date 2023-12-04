package org.apache.hadoop.io.serializer;

import java.io.*;

/**
 * <p>
 * An experimental {@link Serialization} for Java {@link Serializable} classes.
 * </p>
 * @see JavaSerializationComparator
 */
public class JavaSerialization implements Serialization<Serializable> {

  static class JavaSerializationDeserializer<T extends Serializable>
      implements Deserializer<T> {

    private ObjectInputStream ois;

    @Override
    public void open(InputStream in) throws IOException {
      ois = new ObjectInputStream(in) {
        @Override
        protected void readStreamHeader() {
          // no header
        }
      };
    }

    @Override
    @SuppressWarnings("unchecked")
    public T deserialize(T object) throws IOException {
      try {
        // ignore passed-in object
        return (T) ois.readObject();
      } catch (ClassNotFoundException e) {
        throw new IOException(e.toString());
      }
    }

    @Override
    public void close() throws IOException {
      ois.close();
    }

  }

  static class JavaSerializationSerializer
      implements Serializer<Serializable> {

    private ObjectOutputStream oos;

    @Override
    public void open(OutputStream out) throws IOException {
      oos = new ObjectOutputStream(out) {
        @Override
        protected void writeStreamHeader() {
          // no header
        }
      };
    }

    @Override
    public void serialize(Serializable object) throws IOException {
      oos.reset(); // clear (class) back-references
      oos.writeObject(object);
    }

    @Override
    public void close() throws IOException {
      oos.close();
    }

  }

  @Override
  public boolean accept(Class<?> c) {
    return Serializable.class.isAssignableFrom(c);
  }

  @Override
  public Deserializer<Serializable> getDeserializer(Class<Serializable> c) {
    return new JavaSerializationDeserializer<Serializable>();
  }

  @Override
  public Serializer<Serializable> getSerializer(Class<Serializable> c) {
    return new JavaSerializationSerializer();
  }

}
