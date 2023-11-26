package org.apache.hadoop.http;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.apache.hadoop.metrics2.lib.DefaultMetricsSystem;
import org.apache.hadoop.metrics2.sink.PrometheusMetricsSink;

/**
 * Servlet to publish hadoop metrics in prometheus format.
 */
public class PrometheusServlet extends HttpServlet {

  public PrometheusMetricsSink getPrometheusSink() {
    return
        (PrometheusMetricsSink) getServletContext().getAttribute(
            HttpServer2.PROMETHEUS_SINK);
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    DefaultMetricsSystem.instance().publishMetricsNow();
    getPrometheusSink().writeMetrics(resp.getWriter());
    resp.getWriter().flush();
  }
}
