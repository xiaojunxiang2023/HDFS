package org.apache.hadoop.hdfs.server.namenode;

import java.net.InetAddress;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.hdfs.security.token.delegation.DelegationTokenSecretManager;
import org.apache.hadoop.ipc.CallerContext;
import org.apache.hadoop.security.UserGroupInformation;

/**
 * Extension of {@link AuditLogger}.
 */
public abstract class HdfsAuditLogger implements AuditLogger {

  @Override
  public void logAuditEvent(boolean succeeded, String userName,
      InetAddress addr, String cmd, String src, String dst,
      FileStatus status) {
    logAuditEvent(succeeded, userName, addr, cmd, src, dst, status,
        null /*callerContext*/, null /*ugi*/, null /*dtSecretManager*/);
  }

  /**
   * Same as
   * {@link #logAuditEvent(boolean, String, InetAddress, String, String, String,
   * FileStatus)} with additional parameters related to logging delegation token
   * tracking IDs.
   * 
   * @param succeeded Whether authorization succeeded.
   * @param userName Name of the user executing the request.
   * @param addr Remote address of the request.
   * @param cmd The requested command.
   * @param src Path of affected source file.
   * @param dst Path of affected destination file (if any).
   * @param stat File information for operations that change the file's metadata
   *          (permissions, owner, times, etc).
   * @param callerContext Context information of the caller
   * @param ugi UserGroupInformation of the current user, or null if not logging
   *          token tracking information
   * @param dtSecretManager The token secret manager, or null if not logging
   *          token tracking information
   */
  public abstract void logAuditEvent(boolean succeeded, String userName,
      InetAddress addr, String cmd, String src, String dst,
      FileStatus stat, CallerContext callerContext, UserGroupInformation ugi,
      DelegationTokenSecretManager dtSecretManager);

  /**
   * Same as
   * {@link #logAuditEvent(boolean, String, InetAddress, String, String,
   * String, FileStatus, CallerContext, UserGroupInformation,
   * DelegationTokenSecretManager)} without {@link CallerContext} information.
   */
  public abstract void logAuditEvent(boolean succeeded, String userName,
      InetAddress addr, String cmd, String src, String dst,
      FileStatus stat, UserGroupInformation ugi,
      DelegationTokenSecretManager dtSecretManager);
}
