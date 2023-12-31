package org.apache.hadoop.security.alias;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.permission.FsPermission;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;

/**
 * CredentialProvider based on Java Key Store API.
 * The file may be stored in any Hadoop FileSystem using the following
 * name mangling:
 * bcfks://hdfs@nn1.example.com/my/creds.bcfks {@literal ->}
 * hdfs://nn1.example.com/my/creds.bcfks bcfks://file/home/larry/creds.bcfks
 * {@literal ->} file:///home/user1/creds.bcfks
 */
public abstract class KeyStoreProvider extends AbstractJavaKeyStoreProvider {

  private FileSystem fs;
  private FsPermission permissions;

  protected KeyStoreProvider(URI uri, Configuration conf)
      throws IOException {
    super(uri, conf);
  }

  @Override
  protected OutputStream getOutputStreamForKeystore() throws IOException {
    FSDataOutputStream out = FileSystem.create(fs, getPath(), permissions);
    return out;
  }

  @Override
  protected boolean keystoreExists() throws IOException {
    return fs.exists(getPath());
  }

  @Override
  protected InputStream getInputStreamForFile() throws IOException {
    return fs.open(getPath());
  }

  @Override
  protected void createPermissions(String perms) {
    permissions = new FsPermission(perms);
  }

  @Override
  protected void stashOriginalFilePermissions() throws IOException {
    // save off permissions in case we need to
    // rewrite the keystore in flush()
    FileStatus s = fs.getFileStatus(getPath());
    permissions = s.getPermission();
  }

  protected void initFileSystem(URI uri)
      throws IOException {
    super.initFileSystem(uri);
    fs = getPath().getFileSystem(getConf());
  }
}
