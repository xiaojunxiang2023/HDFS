package org.apache.hadoop.io;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Stringifier interface offers two methods to convert an object 
 * to a string representation and restore the object given its 
 * string representation.
 * @param <T> the class of the objects to stringify
 */
@InterfaceAudience.Public
@InterfaceStability.Stable
public interface Stringifier<T> extends java.io.Closeable {

  /**
   * Converts the object to a string representation
   * @param obj the object to convert
   * @return the string representation of the object
   * @throws IOException if the object cannot be converted
   */
  public String toString(T obj)  throws IOException;
  
  /**
   * Restores the object from its string representation.
   * @param str the string representation of the object
   * @return restored object
   * @throws IOException if the object cannot be restored
   */
  public T fromString(String str) throws IOException;
  
  
  /** 
   * Closes this object. 
   * @throws IOException if an I/O error occurs 
   * */
  @Override
  public void close() throws IOException;
  
}
