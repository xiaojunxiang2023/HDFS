package org.apache.hadoop.hdfs.server.datanode.checker;


/**
 * A Checkable is an object whose health can be probed by invoking its
 * {@link #check} method.
 *
 * e.g. a {@link Checkable} instance may represent a single hardware
 * resource.
 */
public interface Checkable<K, V> {

    /**
     * Query the health of this object. This method may hang
     * indefinitely depending on the status of the target resource.
     *
     * @param context for the probe operation. May be null depending
     *                on the implementation.
     *
     * @return result of the check operation.
     *
     * @throws Exception encountered during the check operation. An
     *                   exception indicates that the check failed.
     */
    V check(K context) throws Exception;
}
