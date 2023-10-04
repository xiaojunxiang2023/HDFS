package org.apache.hadoop.hdfs.util;

import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.nativeio.NativeIO;
import org.apache.hadoop.io.nativeio.NativeIOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * A FileOutputStream that has the property that it will only show
 * up at its destination once it has been entirely written and flushed
 * to disk. While being written, it will use a .tmp suffix.
 *
 * When the output stream is closed, it is flushed, fsynced, and
 * will be moved into place, overwriting any file that already
 * exists at that location.
 *
 * <b>NOTE</b>: on Windows platforms, it will not atomically
 * replace the target file - instead the target file is deleted
 * before this one is moved into place.
 */
public class AtomicFileOutputStream extends FilterOutputStream {

    private static final String TMP_EXTENSION = ".tmp";

    private final static Logger LOG = LoggerFactory.getLogger(
            AtomicFileOutputStream.class);

    private final File origFile;
    private final File tmpFile;

    public AtomicFileOutputStream(File f) throws FileNotFoundException {
        // Code unfortunately must be duplicated below since we can't assign anything
        // before calling super
        super(new FileOutputStream(new File(f.getParentFile(), f.getName() + TMP_EXTENSION)));
        origFile = f.getAbsoluteFile();
        tmpFile = new File(f.getParentFile(), f.getName() + TMP_EXTENSION).getAbsoluteFile();
    }

    @Override
    public void close() throws IOException {
        boolean triedToClose = false, success = false;
        try {
            flush();
            ((FileOutputStream) out).getChannel().force(true);

            triedToClose = true;
            super.close();
            success = true;
        } finally {
            if (success) {
                boolean renamed = tmpFile.renameTo(origFile);
                if (!renamed) {
                    // On windows, renameTo does not replace.
                    if (origFile.exists() && !origFile.delete()) {
                        throw new IOException("Could not delete original file " + origFile);
                    }
                    try {
                        NativeIO.renameTo(tmpFile, origFile);
                    } catch (NativeIOException e) {
                        throw new IOException("Could not rename temporary file " + tmpFile
                                + " to " + origFile + " due to failure in native rename. "
                                + e.toString());
                    }
                }
            } else {
                if (!triedToClose) {
                    // If we failed when flushing, try to close it to not leak an FD
                    IOUtils.closeStream(out);
                }
                // close wasn't successful, try to delete the tmp file
                if (!tmpFile.delete()) {
                    LOG.warn("Unable to delete tmp file " + tmpFile);
                }
            }
        }
    }

    /**
     * Close the atomic file, but do not "commit" the temporary file
     * on top of the destination. This should be used if there is a failure
     * in writing.
     */
    public void abort() {
        try {
            super.close();
        } catch (IOException ioe) {
            LOG.warn("Unable to abort file " + tmpFile, ioe);
        }
        if (!tmpFile.delete()) {
            LOG.warn("Unable to delete tmp file during abort " + tmpFile);
        }
    }

}
