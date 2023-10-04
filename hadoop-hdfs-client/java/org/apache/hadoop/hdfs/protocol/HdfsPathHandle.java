package org.apache.hadoop.hdfs.protocol;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Optional;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.fs.InvalidPathHandleException;
import org.apache.hadoop.fs.PathHandle;
import org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.HdfsPathHandleProto;

import org.apache.hadoop.thirdparty.protobuf.ByteString;

/**
 * Opaque handle to an entity in HDFS.
 */
@InterfaceAudience.Private
@InterfaceStability.Unstable
public final class HdfsPathHandle implements PathHandle {

  private static final long serialVersionUID = 0xc53087a5428L;

  private final String path;
  private final Long mtime;
  private final Long inodeId;

  public HdfsPathHandle(String path,
      Optional<Long> inodeId, Optional<Long> mtime) {
    this.path = path;
    this.mtime = mtime.orElse(null);
    this.inodeId = inodeId.orElse(null);
  }

  public HdfsPathHandle(ByteBuffer bytes) throws IOException {
    if (null == bytes) {
      throw new IOException("Missing PathHandle");
    }
    HdfsPathHandleProto p =
        HdfsPathHandleProto.parseFrom(ByteString.copyFrom(bytes));
    path = p.getPath();
    mtime   = p.hasMtime()   ? p.getMtime()   : null;
    inodeId = p.hasInodeId() ? p.getInodeId() : null;
  }

  public String getPath() {
    return path;
  }

  public void verify(HdfsLocatedFileStatus stat)
      throws InvalidPathHandleException {
    if (null == stat) {
      throw new InvalidPathHandleException("Could not resolve handle");
    }
    if (mtime != null && mtime != stat.getModificationTime()) {
      throw new InvalidPathHandleException("Content changed");
    }
    if (inodeId != null && inodeId != stat.getFileId()) {
      throw new InvalidPathHandleException("Wrong file");
    }
  }

  @Override
  public ByteBuffer bytes() {
    HdfsPathHandleProto.Builder b = HdfsPathHandleProto.newBuilder();
    b.setPath(path);
    if (inodeId != null) {
      b.setInodeId(inodeId);
    }
    if (mtime != null) {
      b.setMtime(mtime);
    }
    return b.build().toByteString().asReadOnlyByteBuffer();
  }

  @Override
  public boolean equals(Object other) {
    if (null == other) {
      return false;
    }
    if (!HdfsPathHandle.class.equals(other.getClass())) {
      // require exact match
      return false;
    }
    HdfsPathHandle o = (HdfsPathHandle)other;
    return getPath().equals(o.getPath());
  }

  @Override
  public int hashCode() {
    return path.hashCode();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{ ")
        .append("\"path\" : \"").append(path).append("\"");
    if (inodeId != null) {
      sb.append(",\"inodeId\" : ").append(inodeId);
    }
    if (mtime != null) {
      sb.append(",\"mtime\" : ").append(mtime);
    }
    sb.append(" }");
    return sb.toString();
  }

}
