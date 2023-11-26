package org.apache.hadoop.http;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NoCacheFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
  }

  @Override
  public void doFilter(ServletRequest req, ServletResponse res,
                       FilterChain chain)
    throws IOException, ServletException {
    HttpServletResponse httpRes = (HttpServletResponse) res;
    httpRes.setHeader("Cache-Control", "no-cache");
    long now = System.currentTimeMillis();
    httpRes.addDateHeader("Expires", now);
    httpRes.addDateHeader("Date", now);
    httpRes.addHeader("Pragma", "no-cache");
    chain.doFilter(req, res);
  }

  @Override
  public void destroy() {
  }

}
