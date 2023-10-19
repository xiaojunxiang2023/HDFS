package org.apache.hadoop.security.token;

import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.io.DataOutputBuffer;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.security.UserGroupInformation;

/**
 * An identifier that identifies a token, may contain public information 
 * about a token, including its kind (or type).
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public abstract class TokenIdentifier implements Writable {

  private String trackingId = null;

  /**
   * Get the token kind
   * @return the kind of the token
   */
  public abstract Text getKind();

  /**
   * Get the Ugi with the username encoded in the token identifier
   * 
   * @return the username. null is returned if username in the identifier is
   *         empty or null.
   */
  public abstract UserGroupInformation getUser();

  /**
   * Get the bytes for the token identifier
   * @return the bytes of the identifier
   */
  public byte[] getBytes() {
    DataOutputBuffer buf = new DataOutputBuffer(4096);
    try {
      this.write(buf);
    } catch (IOException ie) {
      throw new RuntimeException("i/o error in getBytes", ie);
    }
    return Arrays.copyOf(buf.getData(), buf.getLength());
  }

  /**
   * Returns a tracking identifier that can be used to associate usages of a
   * token across multiple client sessions.
   *
   * Currently, this function just returns an MD5 of {{@link #getBytes()}.
   *
   * @return tracking identifier
   */
  public String getTrackingId() {
    if (trackingId == null) {
      trackingId = DigestUtils.md5Hex(getBytes());
    }
    return trackingId;
  }
}
