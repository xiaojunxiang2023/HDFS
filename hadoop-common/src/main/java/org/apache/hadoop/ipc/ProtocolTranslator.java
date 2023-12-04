package org.apache.hadoop.ipc;

/**
 * An interface implemented by client-side protocol translators to get the
 * underlying proxy object the translator is operating on.
 */
public interface ProtocolTranslator {

  /**
   * Return the proxy object underlying this protocol translator.
   * @return the proxy object underlying this protocol translator.
   */
  public Object getUnderlyingProxyObject();

}
