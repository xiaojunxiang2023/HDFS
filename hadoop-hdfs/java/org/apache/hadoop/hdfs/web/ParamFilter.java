package org.apache.hadoop.hdfs.web;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;
import com.sun.jersey.spi.container.ContainerResponseFilter;
import com.sun.jersey.spi.container.ResourceFilter;
import org.apache.hadoop.util.StringUtils;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.List;
import java.util.Map;

/**
 * A filter to change parameter names to lower cases
 * so that parameter names are considered as case insensitive.
 */
public class ParamFilter implements ResourceFilter {
    private static final ContainerRequestFilter LOWER_CASE
            = new ContainerRequestFilter() {
        @Override
        public ContainerRequest filter(final ContainerRequest request) {
            final MultivaluedMap<String, String> parameters = request.getQueryParameters();
            if (containsUpperCase(parameters.keySet())) {
                //rebuild URI
                final URI lower = rebuildQuery(request.getRequestUri(), parameters);
                request.setUris(request.getBaseUri(), lower);
            }
            return request;
        }
    };

    /** Do the strings contain upper case letters? */
    static boolean containsUpperCase(final Iterable<String> strings) {
        for (String s : strings) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /** Rebuild the URI query with lower case parameter names. */
    private static URI rebuildQuery(final URI uri,
                                    final MultivaluedMap<String, String> parameters) {
        UriBuilder b = UriBuilder.fromUri(uri).replaceQuery("");
        for (Map.Entry<String, List<String>> e : parameters.entrySet()) {
            final String key = StringUtils.toLowerCase(e.getKey());
            for (String v : e.getValue()) {
                b = b.queryParam(key, v);
            }
        }
        return b.build();
    }

    @Override
    public ContainerRequestFilter getRequestFilter() {
        return LOWER_CASE;
    }

    @Override
    public ContainerResponseFilter getResponseFilter() {
        return null;
    }
}