package org.apache.hadoop.fs.permission;

import java.util.regex.Pattern;
import org.apache.hadoop.fs.FileStatus;

/**
 * Parse a permission mode passed in from a chmod command and apply that
 * mode against an existing file.
 */
public class ChmodParser extends PermissionParser {
  private static Pattern chmodOctalPattern =
    Pattern.compile("^\\s*[+]?([01]?)([0-7]{3})\\s*$");
  private static Pattern chmodNormalPattern =
    Pattern.compile("\\G\\s*([ugoa]*)([+=-]+)([rwxXt]+)([,\\s]*)\\s*");
  
  public ChmodParser(String modeStr) throws IllegalArgumentException {
    super(modeStr, chmodNormalPattern, chmodOctalPattern);
  }

  /**
   * Apply permission against specified file and determine what the
   * new mode would be
   * @param file File against which to apply mode
   * @return File's new mode if applied.
   */
  public short applyNewPermission(FileStatus file) {
    FsPermission perms = file.getPermission();
    int existing = perms.toShort();
    boolean exeOk = file.isDirectory() || (existing & 0111) != 0;
    
    return (short)combineModes(existing, exeOk);
  }
}
