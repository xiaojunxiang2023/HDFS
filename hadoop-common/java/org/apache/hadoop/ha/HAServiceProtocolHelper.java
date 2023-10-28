package org.apache.hadoop.ha;

import java.io.IOException;
import org.apache.hadoop.ha.HAServiceProtocol.StateChangeRequestInfo;
import org.apache.hadoop.ha.micro.HealthCheckFailedException;
import org.apache.hadoop.ha.micro.ServiceFailedException;
import org.apache.hadoop.ipc.RemoteException;

public class HAServiceProtocolHelper {
  public static void monitorHealth(HAServiceProtocol svc,
      StateChangeRequestInfo reqInfo)
      throws IOException {
    try {
      svc.monitorHealth();
    } catch (RemoteException e) {
      throw e.unwrapRemoteException(HealthCheckFailedException.class);
    }
  }

  public static void transitionToActive(HAServiceProtocol svc,
      StateChangeRequestInfo reqInfo)
      throws IOException {
    try {
      svc.transitionToActive(reqInfo);
    } catch (RemoteException e) {
      throw e.unwrapRemoteException(ServiceFailedException.class);
    }
  }

  public static void transitionToStandby(HAServiceProtocol svc,
      StateChangeRequestInfo reqInfo)
      throws IOException {
    try {
      svc.transitionToStandby(reqInfo);
    } catch (RemoteException e) {
      throw e.unwrapRemoteException(ServiceFailedException.class);
    }
  }

  public static void transitionToObserver(HAServiceProtocol svc,
      StateChangeRequestInfo reqInfo) throws IOException {
    try {
      svc.transitionToObserver(reqInfo);
    } catch (RemoteException e) {
      throw e.unwrapRemoteException(ServiceFailedException.class);
    }
  }
}
