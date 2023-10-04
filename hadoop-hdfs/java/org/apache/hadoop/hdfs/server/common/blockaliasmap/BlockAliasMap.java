package org.apache.hadoop.hdfs.server.common.blockaliasmap;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.hdfs.protocol.Block;
import org.apache.hadoop.hdfs.server.common.BlockAlias;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;

/**
 * An abstract class used to read and write block maps for provided blocks.
 */
@InterfaceAudience.Public
@InterfaceStability.Unstable
public abstract class BlockAliasMap<T extends BlockAlias> {

    /**
     * Returns a reader to the alias map.
     * @param opts reader options
     * @param blockPoolID block pool id to use
     * @return {@link Reader} to the alias map. If a Reader for the blockPoolID
     * cannot be created, this will return null.
     * @throws IOException
     */
    public abstract Reader<T> getReader(Reader.Options opts, String blockPoolID)
            throws IOException;

    /**
     * Returns the writer for the alias map.
     * @param opts writer options.
     * @param blockPoolID block pool id to use
     * @return {@link Writer} to the alias map.
     * @throws IOException
     */
    public abstract Writer<T> getWriter(Writer.Options opts, String blockPoolID)
            throws IOException;

    /**
     * Refresh the alias map.
     * @throws IOException
     */
    public abstract void refresh() throws IOException;

    public abstract void close() throws IOException;

    /**
     * An abstract class that is used to read {@link BlockAlias}es
     * for provided blocks.
     */
    public static abstract class Reader<U extends BlockAlias>
            implements Iterable<U>, Closeable {

        /**
         * @param ident block to resolve
         * @return BlockAlias corresponding to the provided block.
         * @throws IOException
         */
        public abstract Optional<U> resolve(Block ident) throws IOException;

        /**
         * reader options.
         */
        public interface Options {
        }
    }

    /**
     * An abstract class used as a writer for the provided block map.
     */
    public static abstract class Writer<U extends BlockAlias>
            implements Closeable {
        public abstract void store(U token) throws IOException;

        /**
         * writer options.
         */
        public interface Options {
        }

    }

    /**
     * ImmutableIterator is an Iterator that does not support the remove
     * operation. This could inherit {@link java.util.Enumeration} but Iterator
     * is supported by more APIs and Enumeration's javadoc even suggests using
     * Iterator instead.
     */
    public abstract class ImmutableIterator implements Iterator<T> {
        public void remove() {
            throw new UnsupportedOperationException(
                    "Remove is not supported for provided storage");
        }
    }

}
