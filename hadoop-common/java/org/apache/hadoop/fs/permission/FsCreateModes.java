package org.apache.hadoop.fs.permission;

import java.text.MessageFormat;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * A class that stores both masked and unmasked create modes
 * and is a drop-in replacement for masked permission.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public final class FsCreateModes extends FsPermission {
  private static final long serialVersionUID = 0x22986f6d;
  private final FsPermission unmasked;

  /**
   * Create from unmasked mode and umask.
   *
   * If the mode is already an FsCreateModes object, return it.
   */
  public static FsPermission applyUMask(FsPermission mode,
                                        FsPermission umask) {
    if (mode.getUnmasked() != null) {
      return mode;
    }
    return create(mode.applyUMask(umask), mode);
  }

  /**
   * Create from masked and unmasked modes.
   */
  public static FsCreateModes create(FsPermission masked,
                                     FsPermission unmasked) {
    assert masked.getUnmasked() == null;
    assert unmasked.getUnmasked() == null;
    return new FsCreateModes(masked, unmasked);
  }

  private FsCreateModes(FsPermission masked, FsPermission unmasked) {
    super(masked);
    this.unmasked = unmasked;
    assert masked.getUnmasked() == null;
    assert unmasked.getUnmasked() == null;
  }

  @Override
  public FsPermission getMasked() {
    return this;
  }

  @Override
  public FsPermission getUnmasked() {
    return unmasked;
  }

  @Override
  public String toString() {
    return MessageFormat.format("'{' masked: {0}, unmasked: {1} '}'",
        super.toString(), getUnmasked());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    FsCreateModes that = (FsCreateModes) o;
    return getUnmasked().equals(that.getUnmasked());
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + getUnmasked().hashCode();
    return result;
  }
}
