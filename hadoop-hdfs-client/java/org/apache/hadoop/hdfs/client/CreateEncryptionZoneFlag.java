package org.apache.hadoop.hdfs.client;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * CreateEncryptionZoneFlag is used in
 * {@link HdfsAdmin#createEncryptionZone(Path, String, EnumSet)} to indicate
 * what should be done when creating an encryption zone.
 *
 * Use CreateEncryptionZoneFlag as follows:
 * <ol>
 *   <li>PROVISION_TRASH - provision a trash directory for the encryption zone
 *   to support soft delete.</li>
 * </ol>
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public enum CreateEncryptionZoneFlag {

  /**
   * Do not provision a trash directory in the encryption zone.
   *
   * @see CreateEncryptionZoneFlag#NO_TRASH
   */
  NO_TRASH((short) 0x00),
  /**
   * Provision a trash directory .Trash/ in the
   * encryption zone.
   *
   * @see CreateEncryptionZoneFlag#PROVISION_TRASH
   */
  PROVISION_TRASH((short) 0x01);

  private final short mode;

  CreateEncryptionZoneFlag(short mode) {
    this.mode = mode;
  }

  public static CreateEncryptionZoneFlag valueOf(short mode) {
    for (CreateEncryptionZoneFlag flag : CreateEncryptionZoneFlag.values()) {
      if (flag.getMode() == mode) {
        return flag;
      }
    }
    return null;
  }

  public short getMode() {
    return mode;
  }
}
