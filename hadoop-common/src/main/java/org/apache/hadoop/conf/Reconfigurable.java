package org.apache.hadoop.conf;

import java.util.Collection;

/**
 * Something whose {@link Configuration} can be changed at run time.
 */
public interface Reconfigurable extends Configurable {

  /**
   * Change a configuration property on this object to the value specified.
   *
   * Change a configuration property on this object to the value specified 
   * and return the previous value that the configuration property was set to
   * (or null if it was not previously set). If newVal is null, set the property
   * to its default value;
   *
   * If the property cannot be changed, throw a 
   * {@link ReconfigurationException}.
   */
  void reconfigureProperty(String property, String newVal)
    throws ReconfigurationException;

  /**
   * Return whether a given property is changeable at run time.
   *
   * If isPropertyReconfigurable returns true for a property,
   * then changeConf should not throw an exception when changing
   * this property.
   */
  boolean isPropertyReconfigurable(String property);

  /**
   * Return all the properties that can be changed at run time.
   */
  Collection<String> getReconfigurableProperties();
}
