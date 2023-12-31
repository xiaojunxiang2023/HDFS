package org.apache.hadoop.http;

import org.eclipse.jetty.servlet.DefaultServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Hadoop DefaultServlet for serving static web content.
 */
public class WebServlet extends DefaultServlet {
  private static final long serialVersionUID = 3910031415927L;
  public static final Logger LOG = LoggerFactory.getLogger(WebServlet.class);

  /**
   * Get method is modified to support impersonation and Kerberos
   * SPNEGO token by forcing client side redirect when accessing
   * "/" (root) of the web application context.
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    if (request.getRequestURI().equals("/")) {
      StringBuilder location = new StringBuilder();
      location.append("index.html");
      if (request.getQueryString() != null) {
        // echo query string but prevent HTTP response splitting
        location.append("?");
        location.append(request.getQueryString()
            .replaceAll("\n", "").replaceAll("\r", ""));
      }
      response.sendRedirect(location.toString());
    } else {
      super.doGet(request, response);
    }
  }
}
