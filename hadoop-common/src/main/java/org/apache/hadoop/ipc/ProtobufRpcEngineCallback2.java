package org.apache.hadoop.ipc;

import org.apache.hadoop.thirdparty.protobuf.Message;

public interface ProtobufRpcEngineCallback2 {

  public void setResponse(Message message);

  public void error(Throwable t);

}