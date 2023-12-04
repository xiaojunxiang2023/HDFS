package org.apache.hadoop.io;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

/** A file-based set of keys. */
public class SetFile extends MapFile {

  protected SetFile() {
  }                            // no public ctor

  /**
   * Write a new set file.
   */
  public static class Writer extends MapFile.Writer {

    /** Create the named set for keys of the named class. 
     *  @deprecated pass a Configuration too
     */
    public Writer(FileSystem fs, String dirName,
                  Class<? extends WritableComparable> keyClass) throws IOException {
      super(new Configuration(), fs, dirName, keyClass, NullWritable.class);
    }

    /** Create a set naming the element class and compression type. */
    public Writer(Configuration conf, FileSystem fs, String dirName,
                  Class<? extends WritableComparable> keyClass,
                  SequenceFile.CompressionType compress)
        throws IOException {
      this(conf, fs, dirName, WritableComparator.get(keyClass, conf), compress);
    }

    /** Create a set naming the element comparator and compression type. */
    public Writer(Configuration conf, FileSystem fs, String dirName,
                  WritableComparator comparator,
                  SequenceFile.CompressionType compress) throws IOException {
      super(conf, new Path(dirName),
          comparator(comparator),
          valueClass(NullWritable.class),
          compression(compress));
    }

    /** Append a key to a set.  The key must be strictly greater than the
     * previous key added to the set. */
    public void append(WritableComparable key) throws IOException {
      append(key, NullWritable.get());
    }
  }

  /** Provide access to an existing set file. */
  public static class Reader extends MapFile.Reader {

    /** Construct a set reader for the named set.*/
    public Reader(FileSystem fs, String dirName, Configuration conf) throws IOException {
      super(fs, dirName, conf);
    }

    /** Construct a set reader for the named set using the named comparator.*/
    public Reader(FileSystem fs, String dirName, WritableComparator comparator, Configuration conf)
        throws IOException {
      super(new Path(dirName), conf, comparator(comparator));
    }

    // javadoc inherited
    @Override
    public boolean seek(WritableComparable key)
        throws IOException {
      return super.seek(key);
    }

    /** Read the next key in a set into <code>key</code>.  Returns
     * true if such a key exists and false when at the end of the set. */
    public boolean next(WritableComparable key)
        throws IOException {
      return next(key, NullWritable.get());
    }

    /** Read the matching key from a set into <code>key</code>.
     * Returns <code>key</code>, or null if no match exists. */
    public WritableComparable get(WritableComparable key)
        throws IOException {
      if (seek(key)) {
        next(key);
        return key;
      } else
        return null;
    }
  }

}
