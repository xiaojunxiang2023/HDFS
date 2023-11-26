package org.apache.hadoop.ipc;

/**
 * Return a response in the handler method for the user to see.
 * Useful since you may want to display status to a user even though an
 * error has not occurred.
 */
public class RefreshResponse {
  private int returnCode = -1;
  private String message;
  private String senderName;

  /**
   * Convenience method to create a response for successful refreshes.
   * @return void response
   */
  public static RefreshResponse successResponse() {
    return new RefreshResponse(0, "Success");
  }

  // Most RefreshHandlers will use this
  public RefreshResponse(int returnCode, String message) {
    this.returnCode = returnCode;
    this.message = message;
  }

  /**
   * Optionally set the sender of this RefreshResponse.
   * This helps clarify things when multiple handlers respond.
   * @param name The name of the sender
   */
  public void setSenderName(String name) {
    senderName = name;
  }
  public String getSenderName() { return senderName; }

  public int getReturnCode() { return returnCode; }
  public void setReturnCode(int rc) { returnCode = rc; }

  public void setMessage(String m) { message = m; }
  public String getMessage() { return message; }

  @Override
  public String toString() {
    String ret = "";

    if (senderName != null) {
      ret += senderName + ": ";
    }

    if (message != null) {
      ret += message;
    }

    ret += " (exit " + returnCode + ")";
    return ret;
  }
}
