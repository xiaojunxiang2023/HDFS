package org.apache.hadoop.hdfs.web.resources;

/** The FileSystem path parameter. */
public class UriFsPathParam extends StringParam {
  /** Parameter name. */
  public static final String NAME = "path";

  private static final Domain DOMAIN = new Domain(NAME, null);

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public UriFsPathParam(String str) {
    super(DOMAIN, str);
  }

  @Override
  public String getName() {
    return NAME;
  }

  /** @return the absolute path. */
  public final String getAbsolutePath() {
    final String path = getValue(); //The first / has been stripped out.
    return path == null ? null : "/" + path;
  }
}
