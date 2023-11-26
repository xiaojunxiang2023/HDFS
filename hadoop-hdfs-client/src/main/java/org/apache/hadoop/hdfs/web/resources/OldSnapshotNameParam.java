package org.apache.hadoop.hdfs.web.resources;

/**
 * The old snapshot name parameter for renameSnapshot operation.
 */
public class OldSnapshotNameParam extends StringParam {
  /** Parameter name. */
  public static final String NAME = "oldsnapshotname";

  /** Default parameter value. */
  public static final String DEFAULT = "";

  private static final Domain DOMAIN = new Domain(NAME, null);

  public OldSnapshotNameParam(final String str) {
    super(DOMAIN, str != null && !str.equals(DEFAULT) ? str : null);
  }

  @Override
  public String getName() {
    return NAME;
  }
}
