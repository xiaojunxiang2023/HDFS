package org.apache.hadoop.hdfs.server.namenode;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.server.common.JspHelper;
import org.apache.hadoop.security.UserGroupInformation;

/**
 * A base class for the servlets in DFS.
 */
public abstract class DfsServlet extends HttpServlet {
  /** For java.io.Serializable */
  private static final long serialVersionUID = 1L;

  static final Logger LOG =
      LoggerFactory.getLogger(DfsServlet.class.getCanonicalName());

  protected UserGroupInformation getUGI(HttpServletRequest request,
                                        Configuration conf) throws IOException {
    return JspHelper.getUGI(getServletContext(), request, conf);
  }
}
