package org.apache.hadoop.hdfs.tools.offlineEditsViewer;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.hdfs.server.namenode.EditLogInputStream;
import org.apache.hadoop.hdfs.server.namenode.FSEditLogOp;
import org.apache.hadoop.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * OfflineEditsBinaryLoader loads edits from a binary edits file
 */
@InterfaceAudience.Private
@InterfaceStability.Unstable
class OfflineEditsBinaryLoader implements OfflineEditsLoader {
    public static final Logger LOG =
            LoggerFactory.getLogger(OfflineEditsBinaryLoader.class.getName());
    private final OfflineEditsVisitor visitor;
    private final EditLogInputStream inputStream;
    private final boolean fixTxIds;
    private final boolean recoveryMode;
    private long nextTxId;

    /**
     * Constructor
     */
    public OfflineEditsBinaryLoader(OfflineEditsVisitor visitor,
                                    EditLogInputStream inputStream, OfflineEditsViewer.Flags flags) {
        this.visitor = visitor;
        this.inputStream = inputStream;
        this.fixTxIds = flags.getFixTxIds();
        this.recoveryMode = flags.getRecoveryMode();
        this.nextTxId = -1;
    }

    /**
     * Loads edits file, uses visitor to process all elements
     */
    @Override
    public void loadEdits() throws IOException {
        try {
            visitor.start(inputStream.getVersion(true));
            while (true) {
                try {
                    FSEditLogOp op = inputStream.readOp();
                    if (op == null)
                        break;
                    if (fixTxIds) {
                        if (nextTxId <= 0) {
                            nextTxId = op.getTransactionId();
                            if (nextTxId <= 0) {
                                nextTxId = 1;
                            }
                        }
                        op.setTransactionId(nextTxId);
                        nextTxId++;
                    }
                    visitor.visitOp(op);
                } catch (IOException e) {
                    if (!recoveryMode) {
                        // Tell the visitor to clean up, then re-throw the exception
                        LOG.error("Got IOException at position " +
                                inputStream.getPosition());
                        visitor.close(e);
                        throw e;
                    }
                    LOG.error("Got IOException while reading stream!  Resyncing.", e);
                    inputStream.resync();
                } catch (RuntimeException e) {
                    if (!recoveryMode) {
                        // Tell the visitor to clean up, then re-throw the exception
                        LOG.error("Got RuntimeException at position " +
                                inputStream.getPosition());
                        visitor.close(e);
                        throw e;
                    }
                    LOG.error("Got RuntimeException while reading stream!  Resyncing.", e);
                    inputStream.resync();
                }
            }
            visitor.close(null);
        } finally {
            IOUtils.cleanupWithLogger(LOG, inputStream);
        }
    }
}
