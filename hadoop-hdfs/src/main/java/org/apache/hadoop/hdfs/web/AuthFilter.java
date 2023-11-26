package org.apache.hadoop.hdfs.web;

import org.apache.hadoop.filter.AuthenticationFilter;
import org.apache.hadoop.filter.ProxyUserAuthenticationFilter;
import org.apache.hadoop.hdfs.web.resources.DelegationParam;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Subclass of {@link AuthenticationFilter} that
 * obtains Hadoop-Auth configuration for webhdfs.
 */
public class AuthFilter extends ProxyUserAuthenticationFilter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain filterChain) throws IOException, ServletException {
        final HttpServletRequest httpRequest = ProxyUserAuthenticationFilter.
                toLowerCase((HttpServletRequest) request);
        final String tokenString = httpRequest.getParameter(DelegationParam.NAME);
        if (tokenString != null && httpRequest.getServletPath().startsWith(
                WebHdfsFileSystem.PATH_PREFIX)) {
            //Token is present in the url, therefore token will be used for
            //authentication, bypass kerberos authentication.
            filterChain.doFilter(httpRequest, response);
            return;
        }
        super.doFilter(request, response, filterChain);
    }

}