package org.apache.hadoop.hdfs.util;

/**
 * A Holder is simply a wrapper around some other object. This is useful
 * in particular for storing immutable values like boxed Integers in a
 * collection without having to do the &quot;lookup&quot; of the value twice.
 */
public class Holder<T> {
    public T held;

    public Holder(T held) {
        this.held = held;
    }

    @Override
    public String toString() {
        return String.valueOf(held);
    }
}
