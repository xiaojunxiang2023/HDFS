package org.apache.hadoop.hdfs.server.balancer;

// 命令行状态退出码
public enum ExitStatus {
  SUCCESS(0),
  IN_PROGRESS(1),
  ALREADY_RUNNING(-1),
  NO_MOVE_BLOCK(-2),
  NO_MOVE_PROGRESS(-3),
  IO_EXCEPTION(-4),
  ILLEGAL_ARGUMENTS(-5),
  INTERRUPTED(-6),
  UNFINALIZED_UPGRADE(-7);

  private final int code;

  ExitStatus(int code) {
    this.code = code;
  }

  public int getExitCode() {
    return code;
  }
}