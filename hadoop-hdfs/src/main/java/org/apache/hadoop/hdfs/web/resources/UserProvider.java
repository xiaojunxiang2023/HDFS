package org.apache.hadoop.hdfs.web.resources;

import com.sun.jersey.api.core.HttpContext;
import com.sun.jersey.core.spi.component.ComponentContext;
import com.sun.jersey.core.spi.component.ComponentScope;
import com.sun.jersey.server.impl.inject.AbstractHttpContextInjectable;
import com.sun.jersey.spi.inject.Injectable;
import com.sun.jersey.spi.inject.InjectableProvider;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.server.common.JspHelper;
import org.apache.hadoop.security.SecurityUtil;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.lang.reflect.Type;

/** Inject user information to http operations. */
@Provider
public class UserProvider
    extends AbstractHttpContextInjectable<UserGroupInformation>
    implements InjectableProvider<Context, Type> {
  @Context
  HttpServletRequest request;
  @Context
  ServletContext servletcontext;

  @Override
  public UserGroupInformation getValue(final HttpContext context) {
    final Configuration conf = (Configuration) servletcontext
        .getAttribute(JspHelper.CURRENT_CONF);
    try {
      return JspHelper.getUGI(servletcontext, request, conf,
          AuthenticationMethod.KERBEROS, false);
    } catch (IOException e) {
      throw new SecurityException(
          SecurityUtil.FAILED_TO_GET_UGI_MSG_HEADER + " " + e, e);
    }
  }

  @Override
  public ComponentScope getScope() {
    return ComponentScope.PerRequest;
  }

  @Override
  public Injectable<UserGroupInformation> getInjectable(
      final ComponentContext componentContext, final Context context,
      final Type type) {
    return type.equals(UserGroupInformation.class) ? this : null;
  }
}