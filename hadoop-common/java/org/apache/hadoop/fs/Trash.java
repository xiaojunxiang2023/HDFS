package org.apache.hadoop.fs;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * Provides a trash facility which supports pluggable Trash policies. 
 *
 * See the implementation of the configured TrashPolicy for more
 * details.
 */
public class Trash extends Configured {
  private static final Logger LOG =
      LoggerFactory.getLogger(Trash.class);

  private TrashPolicy trashPolicy; // configured trash policy instance

  /** 
   * Construct a trash can accessor.
   * @param conf a Configuration
   */
  public Trash(Configuration conf) throws IOException {
    this(FileSystem.get(conf), conf);
  }

  /**
   * Construct a trash can accessor for the FileSystem provided.
   * @param fs the FileSystem
   * @param conf a Configuration
   */
  public Trash(FileSystem fs, Configuration conf) throws IOException {
    super(conf);
    trashPolicy = TrashPolicy.getInstance(conf, fs);
  }

  /**
   * In case of the symlinks or mount points, one has to move the appropriate
   * trashbin in the actual volume of the path p being deleted.
   *
   * Hence we get the file system of the fully-qualified resolved-path and
   * then move the path p to the trashbin in that volume,
   * @param fs - the filesystem of path p
   * @param p - the  path being deleted - to be moved to trasg
   * @param conf - configuration
   * @return false if the item is already in the trash or trash is disabled
   * @throws IOException on error
   */
  public static boolean moveToAppropriateTrash(FileSystem fs, Path p,
      Configuration conf) throws IOException {
    Path fullyResolvedPath = fs.resolvePath(p);
    FileSystem fullyResolvedFs =
        FileSystem.get(fullyResolvedPath.toUri(), conf);
    // If the trash interval is configured server side then clobber this
    // configuration so that we always respect the server configuration.
    try {
      long trashInterval = fullyResolvedFs.getServerDefaults(
          fullyResolvedPath).getTrashInterval();
      if (0 != trashInterval) {
        Configuration confCopy = new Configuration(conf);
        confCopy.setLong(CommonConfigurationKeysPublic.FS_TRASH_INTERVAL_KEY,
            trashInterval);
        conf = confCopy;
      }
    } catch (Exception e) {
      // If we can not determine that trash is enabled server side then
      // bail rather than potentially deleting a file when trash is enabled.
      LOG.warn("Failed to get server trash configuration", e);
      throw new IOException("Failed to get server trash configuration", e);
    }
    Trash trash = new Trash(fullyResolvedFs, conf);
    return trash.moveToTrash(fullyResolvedPath);
  }
  
  /**
   * Returns whether the trash is enabled for this filesystem
   */
  public boolean isEnabled() {
    return trashPolicy.isEnabled();
  }

  /** Move a file or directory to the current trash directory.
   * @return false if the item is already in the trash or trash is disabled
   */ 
  public boolean moveToTrash(Path path) throws IOException {
    return trashPolicy.moveToTrash(path);
  }

  /** Create a trash checkpoint. */
  public void checkpoint() throws IOException {
    trashPolicy.createCheckpoint();
  }

  /** Delete old checkpoint(s). */
  public void expunge() throws IOException {
    trashPolicy.deleteCheckpoint();
  }

  /** Delete all trash immediately. */
  public void expungeImmediately() throws IOException {
    trashPolicy.createCheckpoint();
    trashPolicy.deleteCheckpointsImmediately();
  }

  /** get the current working directory */
  Path getCurrentTrashDir() throws IOException {
    return trashPolicy.getCurrentTrashDir();
  }

  /** get the configured trash policy */
  TrashPolicy getTrashPolicy() {
    return trashPolicy;
  }

  /** Return a {@link Runnable} that periodically empties the trash of all
   * users, intended to be run by the superuser.
   */
  public Runnable getEmptier() throws IOException {
    return trashPolicy.getEmptier();
  }

  public Path getCurrentTrashDir(Path path) throws IOException {
    return trashPolicy.getCurrentTrashDir(path);
  }
}
