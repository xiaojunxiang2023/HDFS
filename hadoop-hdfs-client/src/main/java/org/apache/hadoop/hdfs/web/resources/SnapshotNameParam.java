package org.apache.hadoop.hdfs.web.resources;

/**
 * The snapshot name parameter for createSnapshot and deleteSnapshot operation.
 * Also used to indicate the new snapshot name for renameSnapshot operation.
 */
public class SnapshotNameParam extends StringParam {
  /** Parameter name. */
  public static final String NAME = "snapshotname";

  /** Default parameter value. */
  public static final String DEFAULT = "";

  private static final Domain DOMAIN = new Domain(NAME, null);

  public SnapshotNameParam(final String str) {
    super(DOMAIN, str != null && !str.equals(DEFAULT) ? str : null);
  }

  @Override
  public String getName() {
    return NAME;
  }
}
