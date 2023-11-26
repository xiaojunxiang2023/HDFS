package org.apache.hadoop.ipc;

import java.io.IOException;

/**
 * This interface is implemented by the client side translators and can be used
 * to obtain information about underlying protocol e.g. to check if a method is
 * supported on the server side.
 */
public interface ProtocolMetaInterface {
  
  /**
   * Checks whether the given method name is supported by the server.
   * It is assumed that all method names are unique for a protocol.
   * @param methodName The name of the method
   * @return true if method is supported, otherwise false.
   * @throws IOException
   */
  public boolean isMethodSupported(String methodName) throws IOException;
}
