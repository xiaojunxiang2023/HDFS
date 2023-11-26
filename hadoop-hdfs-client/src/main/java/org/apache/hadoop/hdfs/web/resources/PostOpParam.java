package org.apache.hadoop.hdfs.web.resources;

import java.net.HttpURLConnection;

/** Http POST operation parameter. */
public class PostOpParam extends HttpOpParam<PostOpParam.Op> {
  /** Post operations. */
  public enum Op implements HttpOpParam.Op {
    APPEND(true, HttpURLConnection.HTTP_OK),

    CONCAT(false, HttpURLConnection.HTTP_OK),

    TRUNCATE(false, HttpURLConnection.HTTP_OK),

    UNSETECPOLICY(false, HttpURLConnection.HTTP_OK),

    UNSETSTORAGEPOLICY(false, HttpURLConnection.HTTP_OK),

    NULL(false, HttpURLConnection.HTTP_NOT_IMPLEMENTED);

    final boolean doOutputAndRedirect;
    final int expectedHttpResponseCode;

    Op(final boolean doOutputAndRedirect, final int expectedHttpResponseCode) {
      this.doOutputAndRedirect = doOutputAndRedirect;
      this.expectedHttpResponseCode = expectedHttpResponseCode;
    }

    @Override
    public Type getType() {
      return Type.POST;
    }

    @Override
    public boolean getRequireAuth() {
      return false;
    }

    @Override
    public boolean getDoOutput() {
      return doOutputAndRedirect;
    }

    @Override
    public boolean getRedirect() {
      return doOutputAndRedirect;
    }

    @Override
    public int getExpectedHttpResponseCode() {
      return expectedHttpResponseCode;
    }

    /** @return a URI query string. */
    @Override
    public String toQueryString() {
      return NAME + "=" + this;
    }
  }

  private static final Domain<Op> DOMAIN = new Domain<>(NAME, Op.class);

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public PostOpParam(final String str) {
    super(DOMAIN, getOp(str));
  }

  private static Op getOp(String str) {
    try {
      return DOMAIN.parse(str);
    } catch (IllegalArgumentException e) {
      throw new IllegalArgumentException(str + " is not a valid " + Type.POST
          + " operation.");
    }
  }

  @Override
  public String getName() {
    return NAME;
  }
}
