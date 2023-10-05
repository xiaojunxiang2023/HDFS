package org.apache.hadoop.hdfs.server.federation.resolver;

import org.apache.hadoop.hdfs.server.federation.store.protocol.*;

import java.io.IOException;

/**
 * Manage a mount table.
 */
public interface MountTableManager {

    /**
     * Add an entry to the mount table.
     *
     * @param request Fully populated request object.
     * @return True if the mount table entry was successfully committed to the
     *         data store.
     * @throws IOException Throws exception if the data store is not initialized.
     */
    AddMountTableEntryResponse addMountTableEntry(
            AddMountTableEntryRequest request) throws IOException;

    /**
     * Updates an existing entry in the mount table.
     *
     * @param request Fully populated request object.
     * @return True if the mount table entry was successfully committed to the
     *         data store.
     * @throws IOException Throws exception if the data store is not initialized.
     */
    UpdateMountTableEntryResponse updateMountTableEntry(
            UpdateMountTableEntryRequest request) throws IOException;

    /**
     * Remove an entry from the mount table.
     *
     * @param request Fully populated request object.
     * @return True the mount table entry was removed from the data store.
     * @throws IOException Throws exception if the data store is not initialized.
     */
    RemoveMountTableEntryResponse removeMountTableEntry(
            RemoveMountTableEntryRequest request) throws IOException;

    /**
     * List all mount table entries present at or below the path. Fetches from the
     * state store.
     *
     * @param request Fully populated request object.
     *
     * @return List of all mount table entries under the path. Zero-length list if
     *         none are found.
     * @throws IOException Throws exception if the data store cannot be queried.
     */
    GetMountTableEntriesResponse getMountTableEntries(
            GetMountTableEntriesRequest request) throws IOException;

    /**
     * Refresh mount table entries cache from the state store. Cache is updated
     * periodically but with this API cache can be refreshed immediately. This API
     * is primarily meant to be called from the Admin Server. Admin Server will
     * call this API and refresh mount table cache of all the routers while
     * changing mount table entries.
     *
     * @param request Fully populated request object.
     * @return True the mount table entry was updated without any error.
     * @throws IOException Throws exception if the data store is not initialized.
     */
    RefreshMountTableEntriesResponse refreshMountTableEntries(
            RefreshMountTableEntriesRequest request) throws IOException;

    /**
     * Get the destination subcluster (namespace) of a file/directory.
     *
     * @param request Fully populated request object including the file to check.
     * @return The response including the subcluster where the input file is.
     * @throws IOException Throws exception if the data store is not initialized.
     */
    GetDestinationResponse getDestination(
            GetDestinationRequest request) throws IOException;
}