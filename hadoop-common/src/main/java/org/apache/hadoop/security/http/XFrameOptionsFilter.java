package org.apache.hadoop.security.http;

import org.apache.hadoop.conf.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.util.Map;

/**
 * This filter protects webapps from clickjacking attacks that
 * are possible through use of Frames to embed the resources in another
 * application and intercept clicks to accomplish nefarious things.
 */
public class XFrameOptionsFilter implements Filter {
  public static final String X_FRAME_OPTIONS = "X-Frame-Options";
  public static final String CUSTOM_HEADER_PARAM = "xframe-options";

  private String option = "DENY";

  @Override
  public void destroy() {
  }

  @Override
  public void doFilter(ServletRequest req, ServletResponse res,
                       FilterChain chain) throws IOException, ServletException {
    ((HttpServletResponse) res).setHeader(X_FRAME_OPTIONS, option);
    chain.doFilter(req,
        new XFrameOptionsResponseWrapper((HttpServletResponse) res));
  }

  @Override
  public void init(FilterConfig config) throws ServletException {
    String customOption = config.getInitParameter(CUSTOM_HEADER_PARAM);
    if (customOption != null) {
      option = customOption;
    }
  }

  /**
   * Constructs a mapping of configuration properties to be used for filter
   * initialization.  The mapping includes all properties that start with the
   * specified configuration prefix.  Property names in the mapping are trimmed
   * to remove the configuration prefix.
   *
   * @param conf configuration to read
   * @param confPrefix configuration prefix
   * @return mapping of configuration properties to be used for filter
   *     initialization
   */
  public static Map<String, String> getFilterParams(Configuration conf,
                                                    String confPrefix) {
    return conf.getPropsWithPrefix(confPrefix);
  }

  /**
   * This wrapper allows the rest of the filter pipeline to
   * see the configured value when interrogating the response.
   * It also blocks other filters from setting the value to
   * anything other than what is configured.
   *
   */
  public class XFrameOptionsResponseWrapper
      extends HttpServletResponseWrapper {
    /**
     * Ctor to take wrap the provided response.
     * @param response the response to wrap
     */
    public XFrameOptionsResponseWrapper(HttpServletResponse response) {
      super(response);
    }

    @Override
    public void addHeader(String name, String value) {
      // don't allow additional values to be added along
      // with the configured options value
      if (!name.equals(X_FRAME_OPTIONS)) {
        super.addHeader(name, value);
      }
    }

    @Override
    public void setHeader(String name, String value) {
      // don't allow overwriting of configured value
      if (!name.equals(X_FRAME_OPTIONS)) {
        super.setHeader(name, value);
      }
    }

    @Override
    public void setDateHeader(String name, long date) {
      // don't allow overwriting of configured value
      if (!name.equals(X_FRAME_OPTIONS)) {
        super.setDateHeader(name, date);
      }
    }

    @Override
    public void addDateHeader(String name, long date) {
      // don't allow additional values to be added along
      // with the configured options value
      if (!name.equals(X_FRAME_OPTIONS)) {
        super.addDateHeader(name, date);
      }
    }

    @Override
    public void setIntHeader(String name, int value) {
      // don't allow overwriting of configured value
      if (!name.equals(X_FRAME_OPTIONS)) {
        super.setIntHeader(name, value);
      }
    }

    @Override
    // don't allow additional values to be added along
    // with the configured options value
    public void addIntHeader(String name, int value) {
      if (!name.equals(X_FRAME_OPTIONS)) {
        super.addIntHeader(name, value);
      }
    }

    @Override
    public boolean containsHeader(String name) {
      boolean contains = false;
      // allow the filterchain and subsequent
      // filters to see that the header is set
      if (name.equals(X_FRAME_OPTIONS)) {
        return (option != null);
      } else {
        super.containsHeader(name);
      }
      return contains;
    }
  }
}

