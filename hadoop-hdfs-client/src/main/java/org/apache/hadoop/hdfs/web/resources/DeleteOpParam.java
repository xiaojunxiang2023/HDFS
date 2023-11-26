package org.apache.hadoop.hdfs.web.resources;

import java.net.HttpURLConnection;

/** Http DELETE operation parameter. */
public class DeleteOpParam extends HttpOpParam<DeleteOpParam.Op> {
  /** Delete operations. */
  public enum Op implements HttpOpParam.Op {
    DELETE(HttpURLConnection.HTTP_OK),
    DELETESNAPSHOT(HttpURLConnection.HTTP_OK),

    NULL(HttpURLConnection.HTTP_NOT_IMPLEMENTED);

    final int expectedHttpResponseCode;

    Op(final int expectedHttpResponseCode) {
      this.expectedHttpResponseCode = expectedHttpResponseCode;
    }

    @Override
    public HttpOpParam.Type getType() {
      return HttpOpParam.Type.DELETE;
    }

    @Override
    public boolean getRequireAuth() {
      return false;
    }

    @Override
    public boolean getDoOutput() {
      return false;
    }

    @Override
    public boolean getRedirect() {
      return false;
    }

    @Override
    public int getExpectedHttpResponseCode() {
      return expectedHttpResponseCode;
    }

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
  public DeleteOpParam(final String str) {
    super(DOMAIN, getOp(str));
  }

  private static Op getOp(String str) {
    try {
      return DOMAIN.parse(str);
    } catch (IllegalArgumentException e) {
      throw new IllegalArgumentException(str + " is not a valid " + Type.DELETE
          + " operation.");
    }
  }

  @Override
  public String getName() {
    return NAME;
  }
}
