package org.apache.hadoop.fs.permission;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableFactories;
import org.apache.hadoop.io.WritableFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * A class for file/directory permissions.
 */
public class FsPermission implements Writable, Serializable,
    ObjectInputValidation {
  private static final Logger LOG = LoggerFactory.getLogger(FsPermission.class);
  private static final long serialVersionUID = 0x2fe08564;

  static final WritableFactory FACTORY = new WritableFactory() {
    @Override
    public Writable newInstance() {
      return new FsPermission();
    }
  };

  static {                                      // register a ctor
    WritableFactories.setFactory(FsPermission.class, FACTORY);
    WritableFactories.setFactory(ImmutableFsPermission.class, FACTORY);
  }

  /** Maximum acceptable length of a permission string to parse */
  public static final int MAX_PERMISSION_LENGTH = 10;

  /** Create an immutable {@link FsPermission} object. */
  public static FsPermission createImmutable(short permission) {
    return new ImmutableFsPermission(permission);
  }

  //POSIX permission style
  private FsAction useraction = null;
  private FsAction groupaction = null;
  private FsAction otheraction = null;
  private Boolean stickyBit = false;

  private FsPermission() {
  }

  /**
   * Construct by the given {@link FsAction}.
   * @param u user action
   * @param g group action
   * @param o other action
   */
  public FsPermission(FsAction u, FsAction g, FsAction o) {
    this(u, g, o, false);
  }

  public FsPermission(FsAction u, FsAction g, FsAction o, boolean sb) {
    set(u, g, o, sb);
  }

  /**
   * Construct by the given mode.
   * @param mode
   * @see #toShort()
   */
  public FsPermission(short mode) {
    fromShort(mode);
  }

  /**
   * Construct by the given mode.
   *
   * octal mask is applied.
   *
   *<pre>
   *              before mask     after mask    file type   sticky bit
   *
   *    octal     100644            644         file          no
   *    decimal    33188            420
   *
   *    octal     101644           1644         file          yes
   *    decimal    33700           1420
   *
   *    octal      40644            644         directory     no
   *    decimal    16804            420
   *
   *    octal      41644           1644         directory     yes
   *    decimal    17316           1420
   *</pre>
   *
   * 100644 becomes 644 while 644 remains as 644
   *
   * @param mode Mode is supposed to come from the result of native stat() call.
   *             It contains complete permission information: rwxrwxrwx, sticky
   *             bit, whether it is a directory or a file, etc. Upon applying
   *             mask, only permission and sticky bit info will be kept because
   *             they are the only parts to be used for now.
   * @see #FsPermission(short mode)
   */
  public FsPermission(int mode) {
    this((short) (mode & 01777));
  }

  /**
   * Copy constructor
   *
   * @param other other permission
   */
  public FsPermission(FsPermission other) {
    this.useraction = other.useraction;
    this.groupaction = other.groupaction;
    this.otheraction = other.otheraction;
    this.stickyBit = other.stickyBit;
  }

  /**
   * Construct by given mode, either in octal or symbolic format.
   * @param mode mode as a string, either in octal or symbolic format
   * @throws IllegalArgumentException if <code>mode</code> is invalid
   */
  public FsPermission(String mode) {
    this(new RawParser(mode).getPermission());
  }

  /** Return user {@link FsAction}. */
  public FsAction getUserAction() {
    return useraction;
  }

  /** Return group {@link FsAction}. */
  public FsAction getGroupAction() {
    return groupaction;
  }

  /** Return other {@link FsAction}. */
  public FsAction getOtherAction() {
    return otheraction;
  }

  private void set(FsAction u, FsAction g, FsAction o, boolean sb) {
    useraction = u;
    groupaction = g;
    otheraction = o;
    stickyBit = sb;
  }

  public void fromShort(short n) {
    FsAction[] v = FSACTION_VALUES;
    set(v[(n >>> 6) & 7], v[(n >>> 3) & 7], v[n & 7], (((n >>> 9) & 1) == 1));
  }

  @Override
  @Deprecated
  public void write(DataOutput out) throws IOException {
    out.writeShort(toShort());
  }

  @Override
  @Deprecated
  public void readFields(DataInput in) throws IOException {
    fromShort(in.readShort());
  }

  /**
   * Get masked permission if exists.
   */
  public FsPermission getMasked() {
    return null;
  }

  /**
   * Get unmasked permission if exists.
   */
  public FsPermission getUnmasked() {
    return null;
  }

  /**
   * Create and initialize a {@link FsPermission} from {@link DataInput}.
   */
  public static FsPermission read(DataInput in) throws IOException {
    FsPermission p = new FsPermission();
    p.fromShort(in.readShort());
    return p;
  }

  /**
   * Encode the object to a short.
   */
  public short toShort() {
    int s = (stickyBit ? 1 << 9 : 0) |
        (useraction.ordinal() << 6) |
        (groupaction.ordinal() << 3) |
        otheraction.ordinal();

    return (short) s;
  }

  /**
   * Encodes the object to a short.  Unlike {@link #toShort()}, this method may
   * return values outside the fixed range 00000 - 01777 if extended features
   * are encoded into this permission, such as the ACL bit.
   *
   * @return short extended short representation of this permission
   */
  @Deprecated
  public short toExtendedShort() {
    return toShort();
  }

  /**
   * Returns the FsPermission in an octal format.
   *
   * @return short Unlike {@link #toShort()} which provides a binary
   * representation, this method returns the standard octal style permission.
   */
  public short toOctal() {
    int n = this.toShort();
    int octal = (n >>> 9 & 1) * 1000 + (n >>> 6 & 7) * 100 + (n >>> 3 & 7) * 10 + (n & 7);
    return (short) octal;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof FsPermission) {
      FsPermission that = (FsPermission) obj;
      return this.useraction == that.useraction
          && this.groupaction == that.groupaction
          && this.otheraction == that.otheraction
          && this.stickyBit.booleanValue() == that.stickyBit.booleanValue();
    }
    return false;
  }

  @Override
  public int hashCode() {
    return toShort();
  }

  @Override
  public String toString() {
    String str = useraction.SYMBOL + groupaction.SYMBOL + otheraction.SYMBOL;
    if (stickyBit) {
      StringBuilder str2 = new StringBuilder(str);
      str2.replace(str2.length() - 1, str2.length(),
          otheraction.implies(FsAction.EXECUTE) ? "t" : "T");
      str = str2.toString();
    }

    return str;
  }

  /**
   * Apply a umask to this permission and return a new one.
   *
   * The umask is used by create, mkdir, and other Hadoop filesystem operations.
   * The mode argument for these operations is modified by removing the bits
   * which are set in the umask.  Thus, the umask limits the permissions which
   * newly created files and directories get.
   *
   * @param umask              The umask to use
   *
   * @return The effective permission
   */
  public FsPermission applyUMask(FsPermission umask) {
    return new FsPermission(useraction.and(umask.useraction.not()),
        groupaction.and(umask.groupaction.not()),
        otheraction.and(umask.otheraction.not()));
  }

  public static final String UMASK_LABEL =
      CommonConfigurationKeys.FS_PERMISSIONS_UMASK_KEY;
  public static final int DEFAULT_UMASK =
      CommonConfigurationKeys.FS_PERMISSIONS_UMASK_DEFAULT;

  private static final FsAction[] FSACTION_VALUES = FsAction.values();

  /**
   * Get the user file creation mask (umask)
   *
   * {@code UMASK_LABEL} config param has umask value that is either symbolic 
   * or octal.
   *
   * Symbolic umask is applied relative to file mode creation mask; 
   * the permission op characters '+' clears the corresponding bit in the mask, 
   * '-' sets bits in the mask.
   *
   * Octal umask, the specified bits are set in the file mode creation mask.
   */
  public static FsPermission getUMask(Configuration conf) {
    int umask = DEFAULT_UMASK;

    // To ensure backward compatibility first use the deprecated key.
    // If the deprecated key is not present then check for the new key
    if (conf != null) {
      String confUmask = conf.get(UMASK_LABEL);
      try {
        if (confUmask != null) {
          umask = new UmaskParser(confUmask).getUMask();
        }
      } catch (IllegalArgumentException iae) {
        // Provide more explanation for user-facing message
        String type = iae instanceof NumberFormatException ? "decimal"
            : "octal or symbolic";
        String error = "Unable to parse configuration " + UMASK_LABEL
            + " with value " + confUmask + " as " + type + " umask.";
        LOG.warn(error);

        throw new IllegalArgumentException(error);
      }
    }

    return new FsPermission((short) umask);
  }

  public boolean getStickyBit() {
    return stickyBit;
  }

  /**
   * Returns true if there is also an ACL (access control list).
   *
   * @return boolean true if there is also an ACL (access control list).
   * @deprecated Get acl bit from the {@link org.apache.hadoop.fs.FileStatus}
   * object.
   */
  @Deprecated
  public boolean getAclBit() {
    // File system subclasses that support the ACL bit would override this.
    return false;
  }

  /**
   * Returns true if the file is encrypted or directory is in an encryption zone
   * @deprecated Get encryption bit from the
   * {@link org.apache.hadoop.fs.FileStatus} object.
   */
  @Deprecated
  public boolean getEncryptedBit() {
    return false;
  }

  /**
   * Returns true if the file or directory is erasure coded.
   * @deprecated Get ec bit from the {@link org.apache.hadoop.fs.FileStatus}
   * object.
   */
  @Deprecated
  public boolean getErasureCodedBit() {
    return false;
  }

  /** Set the user file creation mask (umask) */
  public static void setUMask(Configuration conf, FsPermission umask) {
    conf.set(UMASK_LABEL, String.format("%1$03o", umask.toShort()));
  }

  /**
   * Get the default permission for directory and symlink.
   * In previous versions, this default permission was also used to
   * create files, so files created end up with ugo+x permission.
   * See HADOOP-9155 for detail. 
   * Two new methods are added to solve this, please use 
   * {@link FsPermission#getDirDefault()} for directory, and use
   * {@link FsPermission#getFileDefault()} for file.
   * This method is kept for compatibility.
   */
  public static FsPermission getDefault() {
    return new FsPermission((short) 00777);
  }

  /**
   * Get the default permission for directory.
   */
  public static FsPermission getDirDefault() {
    return new FsPermission((short) 00777);
  }

  /**
   * Get the default permission for file.
   */
  public static FsPermission getFileDefault() {
    return new FsPermission((short) 00666);
  }

  /**
   * Get the default permission for cache pools.
   */
  public static FsPermission getCachePoolDefault() {
    return new FsPermission((short) 00755);
  }

  /**
   * Create a FsPermission from a Unix symbolic permission string
   * @param unixSymbolicPermission e.g. "-rw-rw-rw-"
   */
  public static FsPermission valueOf(String unixSymbolicPermission) {
    if (unixSymbolicPermission == null) {
      return null;
    } else if (unixSymbolicPermission.length() != MAX_PERMISSION_LENGTH) {
      throw new IllegalArgumentException(String.format(
          "length != %d(unixSymbolicPermission=%s)", MAX_PERMISSION_LENGTH,
          unixSymbolicPermission));
    }

    int n = 0;
    for (int i = 1; i < unixSymbolicPermission.length(); i++) {
      n = n << 1;
      char c = unixSymbolicPermission.charAt(i);
      n += (c == '-' || c == 'T' || c == 'S') ? 0 : 1;
    }

    // Add sticky bit value if set
    if (unixSymbolicPermission.charAt(9) == 't' ||
        unixSymbolicPermission.charAt(9) == 'T')
      n += 01000;

    return new FsPermission((short) n);
  }

  private static class ImmutableFsPermission extends FsPermission {
    private static final long serialVersionUID = 0x1bab54bd;

    public ImmutableFsPermission(short permission) {
      super(permission);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
      throw new UnsupportedOperationException();
    }
  }

  @Override
  public void validateObject() throws InvalidObjectException {
    if (null == useraction || null == groupaction || null == otheraction) {
      throw new InvalidObjectException("Invalid mode in FsPermission");
    }
    if (null == stickyBit) {
      throw new InvalidObjectException("No sticky bit in FsPermission");
    }
  }
}
