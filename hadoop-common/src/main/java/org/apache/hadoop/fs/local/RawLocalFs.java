package org.apache.hadoop.fs.local;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * The RawLocalFs implementation of AbstractFileSystem.
 *  This impl delegates to the old FileSystem
 */ /*Evolving for a release,to be changed to Stable */
public class RawLocalFs extends DelegateToFileSystem {

  RawLocalFs(final Configuration conf) throws IOException, URISyntaxException {
    this(FsConstants.LOCAL_FS_URI, conf);
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
  RawLocalFs(final URI theUri, final Configuration conf) throws IOException,
      URISyntaxException {
    super(theUri, new RawLocalFileSystem(), conf,
        FsConstants.LOCAL_FS_URI.getScheme(), false);
  }

  @Override
  public int getUriDefaultPort() {
    return -1; // No default port for file:///
  }

  @Override
  public FsServerDefaults getServerDefaults(final Path f)
      throws IOException {
    return LocalConfigKeys.getServerDefaults();
  }

  @Override
  @Deprecated
  public FsServerDefaults getServerDefaults() throws IOException {
    return LocalConfigKeys.getServerDefaults();
  }

  @Override
  public boolean isValidName(String src) {
    // Different local file systems have different validation rules. Skip
    // validation here and just let the OS handle it. This is consistent with
    // RawLocalFileSystem.
    return true;
  }
}
