package org.apache.hadoop.io;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.SequenceFile.CompressionType;
import org.apache.hadoop.util.Progressable;

import java.io.IOException;


/** A dense file-based mapping from integers to values. */
public class ArrayFile extends MapFile {

  protected ArrayFile() {
  }                            // no public ctor

  /** Write a new array file. */
  public static class Writer extends MapFile.Writer {
    private LongWritable count = new LongWritable(0);

    /** Create the named file for values of the named class. */
    public Writer(Configuration conf, FileSystem fs,
                  String file, Class<? extends Writable> valClass)
        throws IOException {
      super(conf, new Path(file), keyClass(LongWritable.class),
          valueClass(valClass));
    }

    /** Create the named file for values of the named class. */
    public Writer(Configuration conf, FileSystem fs,
                  String file, Class<? extends Writable> valClass,
                  CompressionType compress, Progressable progress)
        throws IOException {
      super(conf, new Path(file),
          keyClass(LongWritable.class),
          valueClass(valClass),
          compression(compress),
          progressable(progress));
    }

    /** Append a value to the file. */
    public synchronized void append(Writable value) throws IOException {
      super.append(count, value);                 // add to map
      count.set(count.get() + 1);                   // increment count
    }
  }

  /** Provide access to an existing array file. */
  public static class Reader extends MapFile.Reader {
    private LongWritable key = new LongWritable();

    /** Construct an array reader for the named file.*/
    public Reader(FileSystem fs, String file,
                  Configuration conf) throws IOException {
      super(new Path(file), conf);
    }

    /** Positions the reader before its <code>n</code>th value. */
    public synchronized void seek(long n) throws IOException {
      key.set(n);
      seek(key);
    }

    /** Read and return the next value in the file. */
    public synchronized Writable next(Writable value) throws IOException {
      return next(key, value) ? value : null;
    }

    /** Returns the key associated with the most recent call to {@link
     * #seek(long)}, {@link #next(Writable)}, or {@link
     * #get(long, Writable)}. */
    public synchronized long key() throws IOException {
      return key.get();
    }

    /** Return the <code>n</code>th value in the file. */
    public synchronized Writable get(long n, Writable value)
        throws IOException {
      key.set(n);
      return get(key, value);
    }
  }

}
