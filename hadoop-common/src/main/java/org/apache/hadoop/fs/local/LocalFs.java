package org.apache.hadoop.fs.local;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.AbstractFileSystem;
import org.apache.hadoop.fs.ChecksumFs;

/**
 * The LocalFs implementation of ChecksumFs.
 */ /*Evolving for a release,to be changed to Stable */
public class LocalFs extends ChecksumFs {
  LocalFs(final Configuration conf) throws IOException, URISyntaxException {
    super(new RawLocalFs(conf));
  }
  
  /**
   * This constructor has the signature needed by
   * {@link AbstractFileSystem#createFileSystem(URI, Configuration)}.
   * 
   * @param theUri which must be that of localFs
   * @param conf
   * @throws IOException
   * @throws URISyntaxException 
   */
  LocalFs(final URI theUri, final Configuration conf) throws IOException,
      URISyntaxException {
    this(conf);
  }
}
