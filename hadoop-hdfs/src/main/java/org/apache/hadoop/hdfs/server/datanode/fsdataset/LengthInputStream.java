package org.apache.hadoop.hdfs.server.datanode.fsdataset;

import java.io.FilterInputStream;
import java.io.InputStream;

/**
 * An input stream with length.
 */
public class LengthInputStream extends FilterInputStream {

    private final long length;

    /**
     * Create an stream.
     * @param in the underlying input stream.
     * @param length the length of the stream.
     */
    public LengthInputStream(InputStream in, long length) {
        super(in);
        this.length = length;
    }

    /** @return the length. */
    public long getLength() {
        return length;
    }

    public InputStream getWrappedStream() {
        return in;
    }
}