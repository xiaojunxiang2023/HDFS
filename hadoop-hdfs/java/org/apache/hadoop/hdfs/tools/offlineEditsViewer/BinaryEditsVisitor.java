package org.apache.hadoop.hdfs.tools.offlineEditsViewer;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.server.namenode.EditLogFileOutputStream;
import org.apache.hadoop.hdfs.server.namenode.FSEditLogOp;
import org.apache.hadoop.hdfs.server.namenode.NameNodeLayoutVersion;

import java.io.File;
import java.io.IOException;

/**
 * BinaryEditsVisitor implements a binary EditsVisitor
 */
public class BinaryEditsVisitor implements OfflineEditsVisitor {
    final private EditLogFileOutputStream elfos;

    /**
     * Create a processor that writes to a given file
     * @param outputName Name of file to write output to
     */
    public BinaryEditsVisitor(String outputName) throws IOException {
        this.elfos = new EditLogFileOutputStream(new Configuration(),
                new File(outputName), 0);
        elfos.create(NameNodeLayoutVersion.CURRENT_LAYOUT_VERSION);
    }

    /**
     * Start the visitor (initialization)
     */
    @Override
    public void start(int version) throws IOException {
    }

    /**
     * Finish the visitor
     */
    @Override
    public void close(Throwable error) throws IOException {
        elfos.setReadyToFlush();
        elfos.flushAndSync(true);
        elfos.close();
    }

    @Override
    public void visitOp(FSEditLogOp op) throws IOException {
        elfos.write(op);
    }
}
