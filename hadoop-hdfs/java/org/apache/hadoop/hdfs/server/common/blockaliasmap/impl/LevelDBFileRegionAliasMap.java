package org.apache.hadoop.hdfs.server.common.blockaliasmap.impl;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.conf.Configurable;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.protocol.Block;
import org.apache.hadoop.hdfs.protocol.ProvidedStorageLocation;
import org.apache.hadoop.hdfs.server.common.FileRegion;
import org.apache.hadoop.hdfs.server.common.blockaliasmap.BlockAliasMap;
import org.iq80.leveldb.DB;
import org.iq80.leveldb.DBIterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

import static org.apache.hadoop.hdfs.DFSConfigKeys.DFS_PROVIDED_ALIASMAP_LEVELDB_PATH;
import static org.apache.hadoop.hdfs.server.aliasmap.InMemoryAliasMap.*;
import static org.fusesource.leveldbjni.JniDBFactory.factory;

/**
 * A LevelDB based implementation of {@link BlockAliasMap}.
 */
@InterfaceAudience.Public
@InterfaceStability.Unstable
public class LevelDBFileRegionAliasMap
        extends BlockAliasMap<FileRegion> implements Configurable {

    public static final Logger LOG =
            LoggerFactory.getLogger(LevelDBFileRegionAliasMap.class);
    private Configuration conf;
    private LevelDBOptions opts = new LevelDBOptions();

    private static DB createDB(String levelDBPath, boolean createIfMissing,
                               String blockPoolID) throws IOException {
        if (levelDBPath == null || levelDBPath.length() == 0) {
            throw new IllegalArgumentException(
                    "A valid path needs to be specified for "
                            + LevelDBFileRegionAliasMap.class + " using the parameter "
                            + DFS_PROVIDED_ALIASMAP_LEVELDB_PATH);
        }
        org.iq80.leveldb.Options options = new org.iq80.leveldb.Options();
        options.createIfMissing(createIfMissing);
        File dbFile;
        if (blockPoolID != null) {
            dbFile = new File(levelDBPath, blockPoolID);
        } else {
            dbFile = new File(levelDBPath);
        }
        if (createIfMissing && !dbFile.exists()) {
            if (!dbFile.mkdirs()) {
                throw new IOException("Unable to create " + dbFile);
            }
        }
        return factory.open(dbFile, options);
    }

    @Override
    public Configuration getConf() {
        return conf;
    }

    @Override
    public void setConf(Configuration conf) {
        opts.setConf(conf);
        this.conf = conf;
    }

    @Override
    public Reader<FileRegion> getReader(Reader.Options opts, String blockPoolID)
            throws IOException {
        if (null == opts) {
            opts = this.opts;
        }
        if (!(opts instanceof LevelDBOptions)) {
            throw new IllegalArgumentException("Invalid options " + opts.getClass());
        }
        LevelDBOptions o = (LevelDBOptions) opts;
        return new LevelDBFileRegionAliasMap.LevelDBReader(
                createDB(o.levelDBPath, false, blockPoolID));
    }

    @Override
    public Writer<FileRegion> getWriter(Writer.Options opts, String blockPoolID)
            throws IOException {
        if (null == opts) {
            opts = this.opts;
        }
        if (!(opts instanceof LevelDBOptions)) {
            throw new IllegalArgumentException("Invalid options " + opts.getClass());
        }
        LevelDBOptions o = (LevelDBOptions) opts;
        return new LevelDBFileRegionAliasMap.LevelDBWriter(
                createDB(o.levelDBPath, true, blockPoolID));
    }

    @Override
    public void refresh() throws IOException {
    }

    @Override
    public void close() throws IOException {
        // Do nothing.
    }

    /**
     * Class specifying reader options for the {@link LevelDBFileRegionAliasMap}.
     */
    public static class LevelDBOptions implements LevelDBReader.Options,
            LevelDBWriter.Options, Configurable {
        private Configuration conf;
        private String levelDBPath;

        @Override
        public Configuration getConf() {
            return conf;
        }

        @Override
        public void setConf(Configuration conf) {
            this.conf = conf;
            this.levelDBPath = conf.get(DFS_PROVIDED_ALIASMAP_LEVELDB_PATH);
        }

        @Override
        public LevelDBOptions filename(String levelDBPath) {
            this.levelDBPath = levelDBPath;
            return this;
        }
    }

    /**
     * This class is used as a reader for block maps which
     * are stored as LevelDB files.
     */
    public static class LevelDBReader extends Reader<FileRegion> {

        private DB db;

        LevelDBReader(DB db) {
            this.db = db;
        }

        @Override
        public Optional<FileRegion> resolve(Block block) throws IOException {
            if (db == null) {
                return Optional.empty();
            }
            // consider layering index w/ composable format
            byte[] key = toProtoBufBytes(block);
            byte[] value = db.get(key);
            ProvidedStorageLocation psl = fromProvidedStorageLocationBytes(value);
            return Optional.of(new FileRegion(block, psl));
        }

        public Iterator<FileRegion> iterator() {
            if (db == null) {
                return null;
            }
            DBIterator iterator = db.iterator();
            iterator.seekToFirst();
            return new FRIterator(iterator);
        }

        @Override
        public void close() throws IOException {
            if (db != null) {
                db.close();
            }
        }

        /**
         * Options for {@link LevelDBReader}.
         */
        public interface Options extends Reader.Options {
            Options filename(String levelDBPath);
        }

        static class FRIterator implements Iterator<FileRegion> {
            private final DBIterator internal;

            FRIterator(DBIterator internal) {
                this.internal = internal;
            }

            @Override
            public boolean hasNext() {
                return internal.hasNext();
            }

            @Override
            public FileRegion next() {
                Map.Entry<byte[], byte[]> entry = internal.next();
                if (entry == null) {
                    return null;
                }
                try {
                    Block block = fromBlockBytes(entry.getKey());
                    ProvidedStorageLocation psl =
                            fromProvidedStorageLocationBytes(entry.getValue());
                    return new FileRegion(block, psl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }
    }

    /**
     * This class is used as a writer for block maps which
     * are stored as LevelDB files.
     */
    public static class LevelDBWriter extends Writer<FileRegion> {

        private final DB db;

        LevelDBWriter(DB db) {
            this.db = db;
        }

        @Override
        public void store(FileRegion token) throws IOException {
            byte[] key = toProtoBufBytes(token.getBlock());
            byte[] value = toProtoBufBytes(token.getProvidedStorageLocation());
            db.put(key, value);
        }

        @Override
        public void close() throws IOException {
            if (db != null) {
                db.close();
            }
        }

        /**
         * Interface for Writer options.
         */
        public interface Options extends Writer.Options {
            Options filename(String levelDBPath);
        }
    }
}
