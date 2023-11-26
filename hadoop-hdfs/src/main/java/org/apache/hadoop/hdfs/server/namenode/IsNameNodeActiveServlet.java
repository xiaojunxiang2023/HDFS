package org.apache.hadoop.hdfs.server.namenode;

import org.apache.hadoop.http.IsActiveServlet;

/**
 * Used by Load Balancers to find the active NameNode.
 */
public class IsNameNodeActiveServlet extends IsActiveServlet {

  @Override
  protected boolean isActive() {
    NameNode namenode = NameNodeHttpServer.getNameNodeFromContext(
        getServletContext());
    return namenode.isActiveState();
  }
}
