package org.apache.hadoop.hdfs.protocol;

import java.io.IOException;
import java.util.EnumSet;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.fs.BatchedRemoteIterator;
import org.apache.hadoop.tracing.TraceScope;
import org.apache.hadoop.tracing.Tracer;

/**
 * OpenFilesIterator is a remote iterator that iterates over the open files list
 * managed by the NameNode. Since the list is retrieved in batches, it does not
 * represent a consistent view of all open files.
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class OpenFilesIterator extends
    BatchedRemoteIterator<Long, OpenFileEntry> {

  /** No path to be filtered by default. */
  public static final String FILTER_PATH_DEFAULT = "/";

  /**
   * Open file types to filter the results.
   */
  public enum OpenFilesType {

    ALL_OPEN_FILES((short) 0x01),
    BLOCKING_DECOMMISSION((short) 0x02);

    private final short mode;
    OpenFilesType(short mode) {
      this.mode = mode;
    }

    public short getMode() {
      return mode;
    }

    public static OpenFilesType valueOf(short num) {
      for (OpenFilesType type : OpenFilesType.values()) {
        if (type.getMode() == num) {
          return type;
        }
      }
      return null;
    }
  }

  private final ClientProtocol namenode;
  private final Tracer tracer;
  private final EnumSet<OpenFilesType> types;
  /** List files filtered by given path. */
  private String path;

  public OpenFilesIterator(ClientProtocol namenode, Tracer tracer,
      EnumSet<OpenFilesType> types, String path) {
    super(HdfsConstants.GRANDFATHER_INODE_ID);
    this.namenode = namenode;
    this.tracer = tracer;
    this.types = types;
    this.path = path;
  }

  @Override
  public BatchedEntries<OpenFileEntry> makeRequest(Long prevId)
      throws IOException {
    try (TraceScope ignored = tracer.newScope("listOpenFiles")) {
      return namenode.listOpenFiles(prevId, types, path);
    }
  }

  @Override
  public Long elementToPrevKey(OpenFileEntry entry) {
    return entry.getId();
  }
}
