package org.apache.hadoop.fs;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Interface to query streams for supported capabilities.
 *
 * Capability strings must be in lower case.
 *
 * Constant strings are chosen over enums in order to allow other file systems
 * to define their own capabilities.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public interface StreamCapabilities {
  /**
   * Stream hflush capability implemented by {@link Syncable#hflush()}.
   *
   * Use the {@link #HSYNC} probe to check for the support of Syncable;
   * it's that presence of {@code hsync()} which matters.
   */
  @Deprecated
  String HFLUSH = "hflush";

  /**
   * Stream hsync capability implemented by {@link Syncable#hsync()}.
   */
  String HSYNC = "hsync";

  /**
   * Stream setReadahead capability implemented by
   * {@link CanSetReadahead#setReadahead(Long)}.
   */
  String READAHEAD = "in:readahead";

  /**
   * Stream setDropBehind capability implemented by
   * {@link CanSetDropBehind#setDropBehind(Boolean)}.
   */
  String DROPBEHIND = "dropbehind";

  /**
   * Stream unbuffer capability implemented by {@link CanUnbuffer#unbuffer()}.
   */
  String UNBUFFER = "in:unbuffer";

  /**
   * Stream read(ByteBuffer) capability implemented by
   * {@link ByteBufferReadable#read(java.nio.ByteBuffer)}.
   */
  String READBYTEBUFFER = "in:readbytebuffer";

  /**
   * Stream read(long, ByteBuffer) capability implemented by
   * {@link ByteBufferPositionedReadable#read(long, java.nio.ByteBuffer)}.
   */
  String PREADBYTEBUFFER = "in:preadbytebuffer";

  /**
   * IOStatisticsSource API.
   */
  String IOSTATISTICS = "iostatistics";

  /**
   * Stream abort() capability implemented by {@link Abortable#abort()}.
   * This matches the Path Capability
   * {@link CommonPathCapabilities#ABORTABLE_STREAM}.
   */
  String ABORTABLE_STREAM =  CommonPathCapabilities.ABORTABLE_STREAM;

  /**
   * Capabilities that a stream can support and be queried for.
   */
  @Deprecated
  enum StreamCapability {
    HFLUSH(StreamCapabilities.HFLUSH),
    HSYNC(StreamCapabilities.HSYNC);

    private final String capability;

    StreamCapability(String value) {
      this.capability = value;
    }

    public final String getValue() {
      return capability;
    }
  }

  /**
   * Query the stream for a specific capability.
   *
   * @param capability string to query the stream support for.
   * @return True if the stream supports capability.
   */
  boolean hasCapability(String capability);
}

