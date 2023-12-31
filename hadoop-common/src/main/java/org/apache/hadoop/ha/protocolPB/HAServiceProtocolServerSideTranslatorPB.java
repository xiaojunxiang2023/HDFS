package org.apache.hadoop.ha.protocolPB;

import org.apache.hadoop.ha.proto.HAServiceProtocolProtos.*;
import org.apache.hadoop.ha.status.HAServiceProtocol;
import org.apache.hadoop.ha.status.HAServiceProtocol.RequestSource;
import org.apache.hadoop.ha.status.HAServiceProtocol.StateChangeRequestInfo;
import org.apache.hadoop.ha.status.HAServiceStatus;
import org.apache.hadoop.ipc.ProtocolSignature;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * This class is used on the server side. Calls come across the wire for the
 * for protocol {@link HAServiceProtocolPB}.
 * This class translates the PB data types
 * to the native data types used inside the NN as specified in the generic
 * ClientProtocol.
 */
public class HAServiceProtocolServerSideTranslatorPB implements
    HAServiceProtocolPB {
  private final HAServiceProtocol server;
  private static final MonitorHealthResponseProto MONITOR_HEALTH_RESP =
      MonitorHealthResponseProto.newBuilder().build();
  private static final TransitionToActiveResponseProto TRANSITION_TO_ACTIVE_RESP =
      TransitionToActiveResponseProto.newBuilder().build();
  private static final TransitionToStandbyResponseProto TRANSITION_TO_STANDBY_RESP =
      TransitionToStandbyResponseProto.newBuilder().build();
  private static final TransitionToObserverResponseProto
      TRANSITION_TO_OBSERVER_RESP =
      TransitionToObserverResponseProto.newBuilder().build();
  private static final Logger LOG = LoggerFactory.getLogger(
      HAServiceProtocolServerSideTranslatorPB.class);

  public HAServiceProtocolServerSideTranslatorPB(HAServiceProtocol server) {
    this.server = server;
  }

  @Override
  public MonitorHealthResponseProto monitorHealth(RpcController controller,
                                                  MonitorHealthRequestProto request) throws ServiceException {
    try {
      server.monitorHealth();
      return MONITOR_HEALTH_RESP;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  private StateChangeRequestInfo convert(HAStateChangeRequestInfoProto proto) {
    RequestSource src;
    switch (proto.getReqSource()) {
      case REQUEST_BY_USER:
        src = RequestSource.REQUEST_BY_USER;
        break;
      case REQUEST_BY_USER_FORCED:
        src = RequestSource.REQUEST_BY_USER_FORCED;
        break;
      case REQUEST_BY_ZKFC:
        src = RequestSource.REQUEST_BY_ZKFC;
        break;
      default:
        LOG.warn("Unknown request source: " + proto.getReqSource());
        src = null;
    }

    return new StateChangeRequestInfo(src);
  }

  @Override
  public TransitionToActiveResponseProto transitionToActive(
      RpcController controller, TransitionToActiveRequestProto request)
      throws ServiceException {
    try {
      server.transitionToActive(convert(request.getReqInfo()));
      return TRANSITION_TO_ACTIVE_RESP;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public TransitionToStandbyResponseProto transitionToStandby(
      RpcController controller, TransitionToStandbyRequestProto request)
      throws ServiceException {
    try {
      server.transitionToStandby(convert(request.getReqInfo()));
      return TRANSITION_TO_STANDBY_RESP;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public TransitionToObserverResponseProto transitionToObserver(
      RpcController controller, TransitionToObserverRequestProto request)
      throws ServiceException {
    try {
      server.transitionToObserver(convert(request.getReqInfo()));
      return TRANSITION_TO_OBSERVER_RESP;
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GetServiceStatusResponseProto getServiceStatus(RpcController controller,
                                                        GetServiceStatusRequestProto request) throws ServiceException {
    HAServiceStatus s;
    try {
      s = server.getServiceStatus();
    } catch (IOException e) {
      throw new ServiceException(e);
    }

    HAServiceStateProto retState;
    switch (s.getState()) {
      case ACTIVE:
        retState = HAServiceStateProto.ACTIVE;
        break;
      case STANDBY:
        retState = HAServiceStateProto.STANDBY;
        break;
      case OBSERVER:
        retState = HAServiceStateProto.OBSERVER;
        break;
      case INITIALIZING:
      default:
        retState = HAServiceStateProto.INITIALIZING;
        break;
    }

    GetServiceStatusResponseProto.Builder ret =
        GetServiceStatusResponseProto.newBuilder()
            .setState(retState)
            .setReadyToBecomeActive(s.isReadyToBecomeActive());
    if (!s.isReadyToBecomeActive()) {
      ret.setNotReadyReason(s.getNotReadyReason());
    }
    return ret.build();
  }

  @Override
  public long getProtocolVersion(String protocol, long clientVersion)
      throws IOException {
    return RPC.getProtocolVersion(HAServiceProtocolPB.class);
  }

  @Override
  public ProtocolSignature getProtocolSignature(String protocol,
                                                long clientVersion, int clientMethodsHash) throws IOException {
    if (!protocol.equals(RPC.getProtocolName(HAServiceProtocolPB.class))) {
      throw new IOException("Serverside implements " +
          RPC.getProtocolName(HAServiceProtocolPB.class) +
          ". The following requested protocol is unknown: " + protocol);
    }

    return ProtocolSignature.getProtocolSignature(clientMethodsHash,
        RPC.getProtocolVersion(HAServiceProtocolPB.class),
        HAServiceProtocolPB.class);
  }
}
