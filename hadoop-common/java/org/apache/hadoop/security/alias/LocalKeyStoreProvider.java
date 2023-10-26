package org.apache.hadoop.security.alias;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileUtil;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.util.Shell;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.EnumSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * CredentialProvider based on Java's KeyStore file format. The file may be
 * stored only on the local filesystem using the following name mangling:
 * localjceks://file/home/larry/creds.jceks {@literal ->}
 * file:///home/larry/creds.jceks
 */
public abstract class LocalKeyStoreProvider extends
    AbstractJavaKeyStoreProvider {
  private File file;
  private Set<PosixFilePermission> permissions;

  protected LocalKeyStoreProvider(URI uri, Configuration conf)
      throws IOException {
    super(uri, conf);
  }

  @Override
  protected OutputStream getOutputStreamForKeystore() throws IOException {
    if (LOG.isDebugEnabled()) {
      LOG.debug("using '" + file + "' for output stream.");
    }
    OutputStream out = Files.newOutputStream(file.toPath());
    return out;
  }

  @Override
  protected boolean keystoreExists() throws IOException {
    /* The keystore loader doesn't handle zero length files. */
    return file.exists() && (file.length() > 0);
  }

  @Override
  protected InputStream getInputStreamForFile() throws IOException {
    InputStream is = Files.newInputStream(file.toPath());
    return is;
  }

  @Override
  protected void createPermissions(String perms) throws IOException {
    int mode = 700;
    try {
      mode = Integer.parseInt(perms, 8);
    } catch (NumberFormatException nfe) {
      throw new IOException("Invalid permissions mode provided while "
          + "trying to createPermissions", nfe);
    }
    permissions = modeToPosixFilePermission(mode);
  }

  @Override
  protected void stashOriginalFilePermissions() throws IOException {
    // save off permissions in case we need to
    // rewrite the keystore in flush()
    Path path = Paths.get(file.getCanonicalPath());
    permissions = Files.getPosixFilePermissions(path);
  }

  @Override
  protected void initFileSystem(URI uri)
      throws IOException {
    super.initFileSystem(uri);
    try {
      file = new File(new URI(getPath().toString()));
      if (LOG.isDebugEnabled()) {
        LOG.debug("initialized local file as '" + file + "'.");
        if (file.exists()) {
          LOG.debug("the local file exists and is size " + file.length());
          if (LOG.isTraceEnabled()) {
            if (file.canRead()) {
              LOG.trace("we can read the local file.");
            }
            if (file.canWrite()) {
              LOG.trace("we can write the local file.");
            }
          }
        } else {
          LOG.debug("the local file does not exist.");
        }
      }
    } catch (URISyntaxException e) {
      throw new IOException(e);
    }
  }

  @Override
  public void flush() throws IOException {
    super.flush();
    if (LOG.isDebugEnabled()) {
      LOG.debug("Resetting permissions to '" + permissions + "'");
    }
    Files.setPosixFilePermissions(Paths.get(file.getCanonicalPath()),
          permissions);
  }

  private static Set<PosixFilePermission> modeToPosixFilePermission(
      int mode) {
    Set<PosixFilePermission> perms = EnumSet.noneOf(PosixFilePermission.class);
    if ((mode & 0001) != 0) {
      perms.add(PosixFilePermission.OTHERS_EXECUTE);
    }
    if ((mode & 0002) != 0) {
      perms.add(PosixFilePermission.OTHERS_WRITE);
    }
    if ((mode & 0004) != 0) {
      perms.add(PosixFilePermission.OTHERS_READ);
    }
    if ((mode & 0010) != 0) {
      perms.add(PosixFilePermission.GROUP_EXECUTE);
    }
    if ((mode & 0020) != 0) {
      perms.add(PosixFilePermission.GROUP_WRITE);
    }
    if ((mode & 0040) != 0) {
      perms.add(PosixFilePermission.GROUP_READ);
    }
    if ((mode & 0100) != 0) {
      perms.add(PosixFilePermission.OWNER_EXECUTE);
    }
    if ((mode & 0200) != 0) {
      perms.add(PosixFilePermission.OWNER_WRITE);
    }
    if ((mode & 0400) != 0) {
      perms.add(PosixFilePermission.OWNER_READ);
    }
    return perms;
  }
}
