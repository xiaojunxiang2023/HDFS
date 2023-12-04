package org.apache.hadoop.hdfs.web.resources;

import org.apache.hadoop.fs.Path;

/** The concat source paths parameter. */
public class ConcatSourcesParam extends StringParam {
  /** Parameter name. */
  public static final String NAME = "sources";

  public static final String DEFAULT = "";

  private static final Domain DOMAIN = new Domain(NAME, null);

  private static String paths2String(Path[] paths) {
    if (paths == null || paths.length == 0) {
      return "";
    }
    final StringBuilder b = new StringBuilder(paths[0].toUri().getPath());
    for (int i = 1; i < paths.length; i++) {
      b.append(',').append(paths[i].toUri().getPath());
    }
    return b.toString();
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public ConcatSourcesParam(String str) {
    super(DOMAIN, str);
  }

  public ConcatSourcesParam(Path[] paths) {
    this(paths2String(paths));
  }

  @Override
  public String getName() {
    return NAME;
  }

  /** @return the absolute path. */
  public final String[] getAbsolutePaths() {
    return getValue().split(",");
  }
}
