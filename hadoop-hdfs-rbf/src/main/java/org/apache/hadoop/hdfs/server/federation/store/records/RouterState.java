package org.apache.hadoop.hdfs.server.federation.store.records;

import org.apache.hadoop.hdfs.server.federation.router.FederationUtil;
import org.apache.hadoop.hdfs.server.federation.router.RouterServiceState;
import org.apache.hadoop.hdfs.server.federation.store.driver.StateStoreSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.SortedMap;
import java.util.TreeMap;

public abstract class RouterState extends BaseRecord {

  private static final Logger LOG = LoggerFactory.getLogger(RouterState.class);

  private static long expirationMs;
  private static long deletionMs;

  public RouterState() {
    super();
  }

  // 创建一个实例
  public static RouterState newInstance() {
    RouterState record = StateStoreSerializer.newRecord(RouterState.class);
    record.init();
    return record;
  }

  // 创建一个实例，并赋值
  public static RouterState newInstance(String addr, long startTime,
                                        RouterServiceState status) {
    RouterState record = newInstance();
    record.setDateStarted(startTime);
    record.setAddress(addr);
    record.setStatus(status);
    record.setCompileInfo(FederationUtil.getCompileInfo());
    record.setVersion(FederationUtil.getVersion());
    return record;
  }

  public abstract void setAddress(String address);

  public abstract void setDateStarted(long dateStarted);

  public abstract String getAddress();

  public abstract StateStoreVersion getStateStoreVersion() throws IOException;

  public abstract void setStateStoreVersion(StateStoreVersion version);

  public abstract RouterServiceState getStatus();

  public abstract void setStatus(RouterServiceState newStatus);

  public abstract String getVersion();

  public abstract void setVersion(String version);

  public abstract String getCompileInfo();

  public abstract void setCompileInfo(String info);

  public abstract long getDateStarted();

  public abstract void setAdminAddress(String adminAddress);

  public abstract String getAdminAddress();

  public String getRouterId() {
    return getAddress();
  }

  // 是否相似（equals）
  @Override
  public boolean like(BaseRecord o) {
    if (o instanceof RouterState) {
      RouterState other = (RouterState) o;
      if (getAddress() != null &&
          !getAddress().equals(other.getAddress())) {
        return false;
      }
      return getStatus() == null ||
          getStatus().equals(other.getStatus());
    }
    return false;
  }

  @Override
  public String toString() {
    return getAddress() + " -> " + getStatus() + "," + getVersion();
  }

  // 获得 Map
  @Override
  public SortedMap<String, String> getPrimaryKeys() {
    SortedMap<String, String> map = new TreeMap<>();
    map.put("address", getAddress());
    return map;
  }

  @Override
  public void validate() {
    super.validate();
    if ((getAddress() == null || getAddress().length() == 0) &&
        getStatus() != RouterServiceState.INITIALIZING) {
      throw new IllegalArgumentException(
          "Invalid router entry, no address specified " + this);
    }
  }

  @Override
  public int compareTo(BaseRecord other) {
    if (other == null) {
      return -1;
    } else if (other instanceof RouterState) {
      RouterState router = (RouterState) other;
      return this.getAddress().compareTo(router.getAddress());
    } else {
      return super.compareTo(other);
    }
  }

  @Override
  public boolean checkExpired(long currentTime) {
    if (super.checkExpired(currentTime)) {
      setStatus(RouterServiceState.EXPIRED);
      return true;
    }
    return false;
  }

  @Override
  public long getExpirationMs() {
    return RouterState.expirationMs;
  }

  public static void setExpirationMs(long time) {
    RouterState.expirationMs = time;
  }

  @Override
  public boolean isExpired() {
    return getStatus() == RouterServiceState.EXPIRED;
  }

  @Override
  public long getDeletionMs() {
    return RouterState.deletionMs;
  }

  public static void setDeletionMs(long time) {
    RouterState.deletionMs = time;
  }
}
