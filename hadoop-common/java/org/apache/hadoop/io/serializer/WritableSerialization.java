package org.apache.hadoop.io.serializer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.util.ReflectionUtils;

/**
 * A {@link Serialization} for {@link Writable}s that delegates to
 * {@link Writable#write(java.io.DataOutput)} and
 * {@link Writable#readFields(java.io.DataInput)}.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public class WritableSerialization extends Configured
	implements Serialization<Writable> {
  static class WritableDeserializer extends Configured
  	implements Deserializer<Writable> {

    private Class<?> writableClass;
    private DataInputStream dataIn;
    
    public WritableDeserializer(Configuration conf, Class<?> c) {
      setConf(conf);
      this.writableClass = c;
    }
    
    @Override
    public void open(InputStream in) {
      if (in instanceof DataInputStream) {
        dataIn = (DataInputStream) in;
      } else {
        dataIn = new DataInputStream(in);
      }
    }
    
    @Override
    public Writable deserialize(Writable w) throws IOException {
      Writable writable;
      if (w == null) {
        writable 
          = (Writable) ReflectionUtils.newInstance(writableClass, getConf());
      } else {
        writable = w;
      }
      writable.readFields(dataIn);
      return writable;
    }

    @Override
    public void close() throws IOException {
      dataIn.close();
    }
    
  }
  
  static class WritableSerializer extends Configured implements
  	Serializer<Writable> {
    
    private DataOutputStream dataOut;
    
    @Override
    public void open(OutputStream out) {
      if (out instanceof DataOutputStream) {
        dataOut = (DataOutputStream) out;
      } else {
        dataOut = new DataOutputStream(out);
      }
    }

    @Override
    public void serialize(Writable w) throws IOException {
      w.write(dataOut);
    }

    @Override
    public void close() throws IOException {
      dataOut.close();
    }

  }

  @InterfaceAudience.Private
  @Override
  public boolean accept(Class<?> c) {
    return Writable.class.isAssignableFrom(c);
  }

  @InterfaceAudience.Private
  @Override
  public Serializer<Writable> getSerializer(Class<Writable> c) {
    return new WritableSerializer();
  }
  
  @InterfaceAudience.Private
  @Override
  public Deserializer<Writable> getDeserializer(Class<Writable> c) {
    return new WritableDeserializer(getConf(), c);
  }

}
