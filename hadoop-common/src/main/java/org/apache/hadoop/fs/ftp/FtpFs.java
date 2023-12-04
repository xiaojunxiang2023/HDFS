package org.apache.hadoop.fs.ftp;

import org.apache.commons.net.ftp.FTP;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * The FtpFs implementation of AbstractFileSystem.
 * This impl delegates to the old FileSystem
 */ /*Evolving for a release,to be changed to Stable */
public class FtpFs extends DelegateToFileSystem {
  /**
   * This constructor has the signature needed by
   * {@link AbstractFileSystem#createFileSystem(URI, Configuration)}.
   *
   * @param theUri which must be that of localFs
   * @param conf
   * @throws IOException
   * @throws URISyntaxException
   */
  FtpFs(final URI theUri, final Configuration conf) throws IOException,
      URISyntaxException {
    super(theUri, new FTPFileSystem(), conf, FsConstants.FTP_SCHEME, true);
  }

  @Override
  public int getUriDefaultPort() {
    return FTP.DEFAULT_PORT;
  }

  @Override
  @Deprecated
  public FsServerDefaults getServerDefaults() throws IOException {
    return FtpConfigKeys.getServerDefaults();
  }

  @Override
  public FsServerDefaults getServerDefaults(final Path f) throws IOException {
    return FtpConfigKeys.getServerDefaults();
  }
}
