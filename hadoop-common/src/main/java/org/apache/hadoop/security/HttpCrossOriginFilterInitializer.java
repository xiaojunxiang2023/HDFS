package org.apache.hadoop.security;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.http.FilterContainer;
import org.apache.hadoop.http.FilterInitializer;
import org.apache.hadoop.security.http.CrossOriginFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class HttpCrossOriginFilterInitializer extends FilterInitializer {

  public static final String PREFIX = "hadoop.http.cross-origin.";
  public static final String ENABLED_SUFFIX = "enabled";

  private static final Logger LOG =
      LoggerFactory.getLogger(HttpCrossOriginFilterInitializer.class);

  @Override
  public void initFilter(FilterContainer container, Configuration conf) {

    String key = getEnabledConfigKey();
    boolean enabled = conf.getBoolean(key, false);
    if (enabled) {
      container.addGlobalFilter("Cross Origin Filter",
          CrossOriginFilter.class.getName(),
          getFilterParameters(conf, getPrefix()));
    } else {
      LOG.info("CORS filter not enabled. Please set " + key
          + " to 'true' to enable it");
    }
  }

  protected static Map<String, String> getFilterParameters(Configuration conf,
                                                           String prefix) {
    Map<String, String> filterParams = new HashMap<String, String>();
    for (Map.Entry<String, String> entry : conf.getValByRegex(prefix)
        .entrySet()) {
      String name = entry.getKey();
      String value = entry.getValue();
      name = name.substring(prefix.length());
      filterParams.put(name, value);
    }
    return filterParams;
  }

  protected String getPrefix() {
    return HttpCrossOriginFilterInitializer.PREFIX;
  }

  protected String getEnabledConfigKey() {
    return getPrefix() + HttpCrossOriginFilterInitializer.ENABLED_SUFFIX;
  }
}
