package org.apache.hadoop.security;

import org.apache.hadoop.util.NativeCodeLoader;
import org.apache.hadoop.util.PerformanceAdvisory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class JniBasedUnixGroupsMappingWithFallback implements
    GroupMappingServiceProvider {

  private static final Logger LOG = LoggerFactory
      .getLogger(JniBasedUnixGroupsMappingWithFallback.class);

  private GroupMappingServiceProvider impl;

  public JniBasedUnixGroupsMappingWithFallback() {
    if (NativeCodeLoader.isNativeCodeLoaded()) {
      this.impl = new JniBasedUnixGroupsMapping();
    } else {
      PerformanceAdvisory.LOG.debug("Falling back to shell based");
      this.impl = new ShellBasedUnixGroupsMapping();
    }
    if (LOG.isDebugEnabled()) {
      LOG.debug("Group mapping impl=" + impl.getClass().getName());
    }
  }

  @Override
  public List<String> getGroups(String user) throws IOException {
    return impl.getGroups(user);
  }

  @Override
  public void cacheGroupsRefresh() throws IOException {
    impl.cacheGroupsRefresh();
  }

  @Override
  public void cacheGroupsAdd(List<String> groups) throws IOException {
    impl.cacheGroupsAdd(groups);
  }

}
