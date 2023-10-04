package org.apache.hadoop.hdfs.util;

import org.apache.hadoop.classification.InterfaceAudience;

import java.util.Arrays;

/**
 * Wrapper for byte[] to use byte[] as key in HashMap
 */
@InterfaceAudience.Private
public class ByteArray {
    private final byte[] bytes;
    private int hash = 0; // cache the hash code

    public ByteArray(byte[] bytes) {
        this.bytes = bytes;
    }

    public byte[] getBytes() {
        return bytes;
    }

    @Override
    public int hashCode() {
        if (hash == 0) {
            hash = Arrays.hashCode(bytes);
        }
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ByteArray)) {
            return false;
        }
        return Arrays.equals(bytes, ((ByteArray) o).bytes);
    }
}
