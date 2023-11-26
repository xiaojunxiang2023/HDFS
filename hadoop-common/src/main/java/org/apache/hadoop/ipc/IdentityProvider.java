package org.apache.hadoop.ipc;

/**
 * The IdentityProvider creates identities for each schedulable
 * by extracting fields and returning an identity string.
 *
 * Implementers will be able to change how schedulers treat
 * Schedulables.
 */
public interface IdentityProvider {
  /**
   * Return the string used for scheduling.
   * @param obj the schedulable to use.
   * @return string identity, or null if no identity could be made.
   */
  public String makeIdentity(Schedulable obj);
}