package org.apache.hadoop.hdfs.server.federation.store;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.hdfs.server.federation.store.driver.StateStoreDriver;
import org.apache.hadoop.hdfs.server.federation.store.records.DisabledNameservice;

import java.io.IOException;
import java.util.Set;

// 对 DisabledNameserviceStore(DisabledNameservice) 的管理
@InterfaceAudience.Private
@InterfaceStability.Evolving
public abstract class DisabledNameserviceStore
    extends CachedRecordStore<DisabledNameservice> {

  public DisabledNameserviceStore(StateStoreDriver driver) {
    super(DisabledNameservice.class, driver);
  }

  // disable一个 nameservice
  public abstract boolean disableNameservice(String nsId) throws IOException;

  // enable一个 nameservice
  public abstract boolean enableNameservice(String nsId) throws IOException;

  // 获得所有被 disable的 nameservice
  public abstract Set<String> getDisabledNameservices() throws IOException;
}
