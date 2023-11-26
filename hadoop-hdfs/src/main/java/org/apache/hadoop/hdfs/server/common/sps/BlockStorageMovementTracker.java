package org.apache.hadoop.hdfs.server.common.sps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * This class is used to track the completion of block movement future tasks.
 */
public class BlockStorageMovementTracker implements Runnable {
    private static final Logger LOG = LoggerFactory
            .getLogger(BlockStorageMovementTracker.class);
    private final CompletionService<BlockMovementAttemptFinished>
            moverCompletionService;
    private final BlocksMovementsStatusHandler blksMovementsStatusHandler;

    private volatile boolean running = true;

    /**
     * BlockStorageMovementTracker constructor.
     *
     * @param moverCompletionService
     *          completion service.
     * @param handler
     *          blocks movements status handler
     */
    public BlockStorageMovementTracker(
            CompletionService<BlockMovementAttemptFinished> moverCompletionService,
            BlocksMovementsStatusHandler handler) {
        this.moverCompletionService = moverCompletionService;
        this.blksMovementsStatusHandler = handler;
    }

    @Override
    public void run() {
        while (running) {
            try {
                Future<BlockMovementAttemptFinished> future = moverCompletionService
                        .take();
                if (future != null) {
                    BlockMovementAttemptFinished result = future.get();
                    LOG.debug("Completed block movement. {}", result);
                    if (running && blksMovementsStatusHandler != null) {
                        // handle completed block movement.
                        blksMovementsStatusHandler.handle(result);
                    }
                }
            } catch (InterruptedException e) {
                if (running) {
                    LOG.error("Exception while moving block replica to target storage"
                            + " type", e);
                }
            } catch (ExecutionException e) {
                // TODO: Do we need failure retries and implement the same if required.
                LOG.error("Exception while moving block replica to target storage type",
                        e);
            }
        }
    }

    /**
     * Sets running flag to false.
     */
    public void stopTracking() {
        running = false;
    }
}
