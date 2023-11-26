package org.apache.hadoop.hdfs.util;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.thirdparty.com.google.common.base.Charsets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * Class that represents a file on disk which persistently stores
 * a single <code>long</code> value. The file is updated atomically
 * and durably (i.e fsynced). 
 */
public class PersistentLongFile {
    private static final Logger LOG = LoggerFactory.getLogger(
            PersistentLongFile.class);

    private final File file;
    private final long defaultVal;

    private long value;
    private boolean loaded = false;

    public PersistentLongFile(File file, long defaultVal) {
        this.file = file;
        this.defaultVal = defaultVal;
    }

    /**
     * Atomically write the given value to the given file, including fsyncing.
     *
     * @param file destination file
     * @param val value to write
     * @throws IOException if the file cannot be written
     */
    public static void writeFile(File file, long val) throws IOException {
        AtomicFileOutputStream fos = new AtomicFileOutputStream(file);
        try {
            fos.write(String.valueOf(val).getBytes(Charsets.UTF_8));
            fos.write('\n');
            fos.close();
            fos = null;
        } finally {
            if (fos != null) {
                fos.abort();
            }
        }
    }

    public static long readFile(File file, long defaultVal) throws IOException {
        long val = defaultVal;
        if (file.exists()) {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(new FileInputStream(
                            file), Charsets.UTF_8));
            try {
                val = Long.parseLong(br.readLine());
                br.close();
                br = null;
            } catch (NumberFormatException e) {
                throw new IOException(e);
            } finally {
                IOUtils.cleanupWithLogger(LOG, br);
            }
        }
        return val;
    }

    public long get() throws IOException {
        if (!loaded) {
            value = readFile(file, defaultVal);
            loaded = true;
        }
        return value;
    }

    public void set(long newVal) throws IOException {
        if (value != newVal || !loaded) {
            writeFile(file, newVal);
        }
        value = newVal;
        loaded = true;
    }
}
