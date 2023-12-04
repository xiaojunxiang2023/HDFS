package org.apache.hadoop.io;

import org.apache.hadoop.util.ReflectionUtils;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * A Writable Map.
 */
public class MapWritable extends AbstractMapWritable
    implements Map<Writable, Writable> {

  private Map<Writable, Writable> instance;

  /** Default constructor. */
  public MapWritable() {
    super();
    this.instance = new HashMap<Writable, Writable>();
  }

  /**
   * Copy constructor.
   *
   * @param other the map to copy from
   */
  public MapWritable(MapWritable other) {
    this();
    copy(other);
  }

  @Override
  public void clear() {
    instance.clear();
  }

  @Override
  public boolean containsKey(Object key) {
    return instance.containsKey(key);
  }

  @Override
  public boolean containsValue(Object value) {
    return instance.containsValue(value);
  }

  @Override
  public Set<Map.Entry<Writable, Writable>> entrySet() {
    return instance.entrySet();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj instanceof MapWritable) {
      MapWritable map = (MapWritable) obj;
      if (size() != map.size()) {
        return false;
      }

      return entrySet().equals(map.entrySet());
    }

    return false;
  }

  @Override
  public Writable get(Object key) {
    return instance.get(key);
  }

  @Override
  public int hashCode() {
    return 1 + this.instance.hashCode();
  }

  @Override
  public boolean isEmpty() {
    return instance.isEmpty();
  }

  @Override
  public Set<Writable> keySet() {
    return instance.keySet();
  }

  @Override
  public Writable put(Writable key, Writable value) {
    addToMap(key.getClass());
    addToMap(value.getClass());
    return instance.put(key, value);
  }

  @Override
  public void putAll(Map<? extends Writable, ? extends Writable> t) {
    for (Map.Entry<? extends Writable, ? extends Writable> e : t.entrySet()) {
      put(e.getKey(), e.getValue());
    }
  }

  @Override
  public Writable remove(Object key) {
    return instance.remove(key);
  }

  @Override
  public int size() {
    return instance.size();
  }

  @Override
  public Collection<Writable> values() {
    return instance.values();
  }

  // Writable

  @Override
  public void write(DataOutput out) throws IOException {
    super.write(out);

    // Write out the number of entries in the map

    out.writeInt(instance.size());

    // Then write out each key/value pair

    for (Map.Entry<Writable, Writable> e : instance.entrySet()) {
      out.writeByte(getId(e.getKey().getClass()));
      e.getKey().write(out);
      out.writeByte(getId(e.getValue().getClass()));
      e.getValue().write(out);
    }
  }

  @Override
  public void readFields(DataInput in) throws IOException {
    super.readFields(in);

    // First clear the map.  Otherwise we will just accumulate
    // entries every time this method is called.
    this.instance.clear();

    // Read the number of entries in the map

    int entries = in.readInt();

    // Then read each key/value pair

    for (int i = 0; i < entries; i++) {
      Writable key = (Writable) ReflectionUtils.newInstance(getClass(
          in.readByte()), getConf());

      key.readFields(in);

      Writable value = (Writable) ReflectionUtils.newInstance(getClass(
          in.readByte()), getConf());

      value.readFields(in);
      instance.put(key, value);
    }
  }

  @Override
  public String toString() {
    return instance.toString();
  }
}
