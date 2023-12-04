package org.apache.hadoop.hdfs;

import org.apache.hadoop.ipc.AlignmentContext;
import org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto;
import org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto;

import java.io.IOException;
import java.util.concurrent.atomic.LongAccumulator;

/**
 * Global State Id context for the client.
 * <p>
 * This is the client side implementation responsible for receiving
 * state alignment info from server(s).
 */
public class ClientGSIContext implements AlignmentContext {

  private final LongAccumulator lastSeenStateId =
      new LongAccumulator(Math::max, Long.MIN_VALUE);

  @Override
  public long getLastSeenStateId() {
    return lastSeenStateId.get();
  }

  @Override
  public boolean isCoordinatedCall(String protocolName, String method) {
    throw new UnsupportedOperationException(
        "Client should not be checking uncoordinated call");
  }

  /**
   * Client side implementation only receives state alignment info.
   * It does not provide state alignment info therefore this does nothing.
   */
  @Override
  public void updateResponseState(RpcResponseHeaderProto.Builder header) {
    // Do nothing.
  }

  /**
   * Client side implementation for receiving state alignment info
   * in responses.
   */
  @Override
  public void receiveResponseState(RpcResponseHeaderProto header) {
    lastSeenStateId.accumulate(header.getStateId());
  }

  /**
   * Client side implementation for providing state alignment info in requests.
   */
  @Override
  public void updateRequestState(RpcRequestHeaderProto.Builder header) {
    header.setStateId(lastSeenStateId.longValue());
  }

  /**
   * Client side implementation only provides state alignment info in requests.
   * Client does not receive RPC requests therefore this does nothing.
   */
  @Override
  public long receiveRequestState(RpcRequestHeaderProto header, long threshold)
      throws IOException {
    // Do nothing.
    return 0;
  }
}
