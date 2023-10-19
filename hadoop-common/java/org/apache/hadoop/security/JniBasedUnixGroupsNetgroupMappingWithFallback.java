package org.apache.hadoop.security;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.util.NativeCodeLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JniBasedUnixGroupsNetgroupMappingWithFallback implements
    GroupMappingServiceProvider {

  private static final Logger LOG = LoggerFactory
      .getLogger(JniBasedUnixGroupsNetgroupMappingWithFallback.class);

  private GroupMappingServiceProvider impl;

  public JniBasedUnixGroupsNetgroupMappingWithFallback() {
    if (NativeCodeLoader.isNativeCodeLoaded()) {
      this.impl = new JniBasedUnixGroupsNetgroupMapping();
    } else {
      LOG.info("Falling back to shell based");
      this.impl = new ShellBasedUnixGroupsNetgroupMapping();
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
