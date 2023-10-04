package org.apache.hadoop.hdfs.protocolPB;

import java.util.Map;
import java.util.Optional;

import org.apache.hadoop.conf.ReconfigurationTaskStatus;
import org.apache.hadoop.conf.ReconfigurationUtil.PropertyChange;
import org.apache.hadoop.hdfs.protocol.proto.ReconfigurationProtocolProtos.GetReconfigurationStatusConfigChangeProto;
import org.apache.hadoop.hdfs.protocol.proto.ReconfigurationProtocolProtos.GetReconfigurationStatusResponseProto;

import org.apache.hadoop.thirdparty.com.google.common.collect.Maps;

/**
 * This is a client side utility class that handles
 * common logic to to parameter reconfiguration.
 */
public final class ReconfigurationProtocolUtils {
  private ReconfigurationProtocolUtils() {
  }

  public static ReconfigurationTaskStatus getReconfigurationStatus(
      GetReconfigurationStatusResponseProto response) {
    Map<PropertyChange, Optional<String>> statusMap = null;
    long startTime;
    long endTime = 0;

    startTime = response.getStartTime();
    if (response.hasEndTime()) {
      endTime = response.getEndTime();
    }
    if (response.getChangesCount() > 0) {
      statusMap = Maps.newHashMap();
      for (GetReconfigurationStatusConfigChangeProto change : response
          .getChangesList()) {
        PropertyChange pc = new PropertyChange(change.getName(),
            change.getNewValue(), change.getOldValue());
        String errorMessage = null;
        if (change.hasErrorMessage()) {
          errorMessage = change.getErrorMessage();
        }
        statusMap.put(pc, Optional.ofNullable(errorMessage));
      }
    }
    return new ReconfigurationTaskStatus(startTime, endTime, statusMap);
  }
}
