package org.apache.hadoop.ipc;

import com.google.protobuf.Message;

/**
 *  This engine uses Protobuf 2.5.0. Recommended to upgrade to Protobuf 3.x
 *  from hadoop-thirdparty and use ProtobufRpcEngineCallback2.
 */
@Deprecated
public interface ProtobufRpcEngineCallback {

  void setResponse(Message message);

  void error(Throwable t);

}