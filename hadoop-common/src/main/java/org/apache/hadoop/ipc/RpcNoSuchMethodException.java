package org.apache.hadoop.ipc;

import org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcErrorCodeProto;
import org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcStatusProto;


/**
 * No such Method for an Rpc Call
 *
 */
public class RpcNoSuchMethodException extends RpcServerException {
  private static final long serialVersionUID = 1L;
  public RpcNoSuchMethodException(final String message) {
    super(message);
  }
  
  /**
   * get the rpc status corresponding to this exception
   */
  public RpcStatusProto getRpcStatusProto() {
    return RpcStatusProto.ERROR;
  }

  /**
   * get the detailed rpc status corresponding to this exception
   */
  public RpcErrorCodeProto getRpcErrorCodeProto() {
    return RpcErrorCodeProto.ERROR_NO_SUCH_METHOD;
  }
}
