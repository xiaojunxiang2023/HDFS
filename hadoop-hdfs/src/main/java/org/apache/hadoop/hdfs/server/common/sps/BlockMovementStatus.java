package org.apache.hadoop.hdfs.server.common.sps;

/**
 * Block movement status code.
 */
public enum BlockMovementStatus {
    /** Success. */
    DN_BLK_STORAGE_MOVEMENT_SUCCESS(0),
    /**
     * Failure due to generation time stamp mismatches or network errors
     * or no available space.
     */
    DN_BLK_STORAGE_MOVEMENT_FAILURE(-1);

    // TODO: need to support different type of failures. Failure due to network
    // errors, block pinned, no space available etc.

    private final int code;

    BlockMovementStatus(int code) {
        this.code = code;
    }

    /**
     * @return the status code.
     */
    int getStatusCode() {
        return code;
    }
}
