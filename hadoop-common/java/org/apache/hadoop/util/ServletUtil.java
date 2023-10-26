package org.apache.hadoop.util;

import java.io.*;
import java.util.Calendar;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
public class ServletUtil {
  /**
   * Initial HTML header
   */
  public static PrintWriter initHTML(ServletResponse response, String title
      ) throws IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>\n"
        + "<link rel='stylesheet' type='text/css' href='/static/hadoop.css'>\n"
        + "<title>" + title + "</title>\n"
        + "<body>\n"
        + "<h1>" + title + "</h1>\n");
    return out;
  }

  /**
   * Get a parameter from a ServletRequest.
   * Return null if the parameter contains only white spaces.
   */
  public static String getParameter(ServletRequest request, String name) {
    String s = request.getParameter(name);
    if (s == null) {
      return null;
    }
    s = s.trim();
    return s.length() == 0? null: s;
  }
  
  /**
   * @return a long value as passed in the given parameter, throwing
   * an exception if it is not present or if it is not a valid number.
   */
  public static long parseLongParam(ServletRequest request, String param)
      throws IOException {
    String paramStr = request.getParameter(param);
    if (paramStr == null) {
      throw new IOException("Invalid request has no " + param + " parameter");
    }
    
    return Long.parseLong(paramStr);
  }

  public static final String HTML_TAIL = "<hr />\n"
    + "<a href='http://hadoop.apache.org'>Hadoop</a>, "
    + Calendar.getInstance().get(Calendar.YEAR) + ".\n"
    + "</body></html>";

  /**
   * HTML footer to be added in the jsps.
   * @return the HTML footer.
   */
  public static String htmlFooter() {
    return HTML_TAIL;
  }

  /**
   * Parse the path component from the given request and return w/o decoding.
   * @param request Http request to parse
   * @param servletName the name of servlet that precedes the path
   * @return path component, null if the default charset is not supported
   */
  public static String getRawPath(final HttpServletRequest request, String servletName) {
    Preconditions.checkArgument(request.getRequestURI().startsWith(servletName+"/"));
    return request.getRequestURI().substring(servletName.length());
  }
}