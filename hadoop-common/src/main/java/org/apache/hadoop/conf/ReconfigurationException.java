package org.apache.hadoop.conf;


/**
 * Exception indicating that configuration property cannot be changed
 * at run time.
 */
public class ReconfigurationException extends Exception {

  private static final long serialVersionUID = 1L;

  private String property;
  private String newVal;
  private String oldVal;

  /**
   * Construct the exception message.
   */
  private static String constructMessage(String property,
                                         String newVal, String oldVal) {
    String message = "Could not change property " + property;
    if (oldVal != null) {
      message += " from \'" + oldVal;
    }
    if (newVal != null) {
      message += "\' to \'" + newVal + "\'";
    }
    return message;
  }


  /**
   * Create a new instance of {@link ReconfigurationException}.
   */
  public ReconfigurationException() {
    super("Could not change configuration.");
    this.property = null;
    this.newVal = null;
    this.oldVal = null;
  }

  /**
   * Create a new instance of {@link ReconfigurationException}.
   */
  public ReconfigurationException(String property,
                                  String newVal, String oldVal,
                                  Throwable cause) {
    super(constructMessage(property, newVal, oldVal), cause);
    this.property = property;
    this.newVal = newVal;
    this.oldVal = oldVal;
  }

  /**
   * Create a new instance of {@link ReconfigurationException}.
   */
  public ReconfigurationException(String property,
                                  String newVal, String oldVal) {
    super(constructMessage(property, newVal, oldVal));
    this.property = property;
    this.newVal = newVal;
    this.oldVal = oldVal;
  }

  /**
   * Get property that cannot be changed.
   */
  public String getProperty() {
    return property;
  }

  /**
   * Get value to which property was supposed to be changed.
   */
  public String getNewValue() {
    return newVal;
  }

  /**
   * Get old value of property that cannot be changed.
   */
  public String getOldValue() {
    return oldVal;
  }

}
