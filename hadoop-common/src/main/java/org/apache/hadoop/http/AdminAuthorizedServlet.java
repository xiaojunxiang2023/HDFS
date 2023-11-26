package org.apache.hadoop.http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.servlet.DefaultServlet;

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
