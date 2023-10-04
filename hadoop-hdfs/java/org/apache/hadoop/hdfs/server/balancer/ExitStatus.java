package org.apache.hadoop.hdfs.server.balancer;

/**
 * Exit status - The values associated with each exit status is directly mapped
 * to the process's exit code in command line.
 */
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

    private ExitStatus(int code) {
        this.code = code;
    }

    /** @return the command line exit code. */
    public int getExitCode() {
        return code;
    }
}