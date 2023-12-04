package org.apache.hadoop.security.token.delegation.web;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * Servlet utility methods.
 */
class ServletUtils {
  private static final Charset UTF8_CHARSET = Charset.forName("UTF-8");

  /**
   * Extract a query string parameter without triggering http parameters
   * processing by the servlet container.
   *
   * @param request the request
   * @param name the parameter to get the value.
   * @return the parameter value, or <code>NULL</code> if the parameter is not
   * defined.
   * @throws IOException thrown if there was an error parsing the query string.
   */
  public static String getParameter(HttpServletRequest request, String name)
      throws IOException {
    String queryString = request.getQueryString();
    if (queryString == null) {
      return null;
    }
    List<NameValuePair> list = URLEncodedUtils.parse(queryString, UTF8_CHARSET);
    if (list != null) {
      for (NameValuePair nv : list) {
        if (name.equals(nv.getName())) {
          return nv.getValue();
        }
      }
    }
    return null;
  }
}
