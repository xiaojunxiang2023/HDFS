package org.apache.hadoop.http;

import org.eclipse.jetty.servlet.DefaultServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * General servlet which is admin-authorized.
 *
 */
public class AdminAuthorizedServlet extends DefaultServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // Do the authorization
    if (HttpServer2.hasAdministratorAccess(getServletContext(), request,
        response)) {
      // Authorization is done. Just call super.
      super.doGet(request, response);
    }
  }
}
