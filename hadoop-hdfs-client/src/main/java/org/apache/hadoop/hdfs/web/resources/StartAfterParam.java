package org.apache.hadoop.hdfs.web.resources;

/**
 * Used during batched ListStatus operations.
 */
public class StartAfterParam extends StringParam {

  public static final String NAME = "startafter";
  public static final String DEFAULT = "";

  private static final Domain DOMAIN = new Domain(NAME, null);

  public StartAfterParam(final String str) {
    super(DOMAIN, str != null && !str.equals(DEFAULT) ? str : null);
  }

  @Override
  public String getName() {
    return NAME;
  }
}
