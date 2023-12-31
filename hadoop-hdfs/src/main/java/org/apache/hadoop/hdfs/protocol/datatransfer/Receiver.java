package org.apache.hadoop.hdfs.protocol.datatransfer;

import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
import org.apache.hadoop.hdfs.protocol.ExtendedBlock;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.*;
import org.apache.hadoop.hdfs.protocolPB.PBHelperClient;
import org.apache.hadoop.hdfs.server.datanode.CachingStrategy;
import org.apache.hadoop.hdfs.shortcircuit.ShortCircuitShm.SlotId;
import org.apache.hadoop.thirdparty.protobuf.ByteString;
import org.apache.hadoop.tracing.SpanContext;
import org.apache.hadoop.tracing.TraceScope;
import org.apache.hadoop.tracing.TraceUtils;
import org.apache.hadoop.tracing.Tracer;

import java.io.DataInputStream;
import java.io.IOException;

import static org.apache.hadoop.hdfs.protocol.datatransfer.DataTransferProtoUtil.fromProto;
import static org.apache.hadoop.hdfs.protocolPB.PBHelperClient.vintPrefixed;

/** Receiver */
public abstract class Receiver implements DataTransferProtocol {
  private final Tracer tracer;
  protected DataInputStream in;

  protected Receiver(Tracer tracer) {
    this.tracer = tracer;
  }

  /** Initialize a receiver for DataTransferProtocol with a socket. */
  protected void initialize(final DataInputStream in) {
    this.in = in;
  }

  /** Read an Op.  It also checks protocol version. */
  protected final Op readOp() throws IOException {
    final short version = in.readShort();
    if (version != DataTransferProtocol.DATA_TRANSFER_VERSION) {
      throw new IOException("Version Mismatch (Expected: " +
          DataTransferProtocol.DATA_TRANSFER_VERSION +
          ", Received: " + version + " )");
    }
    return Op.read(in);
  }

  private TraceScope continueTraceSpan(ByteString spanContextBytes,
                                       String description) {
    TraceScope scope = null;
    SpanContext spanContext =
        TraceUtils.byteStringToSpanContext(spanContextBytes);
    if (spanContext != null) {
      scope = tracer.newScope(description, spanContext);
    }
    return scope;
  }

  private TraceScope continueTraceSpan(ClientOperationHeaderProto header,
                                       String description) {
    return continueTraceSpan(header.getBaseHeader(), description);
  }

  private TraceScope continueTraceSpan(BaseHeaderProto header,
                                       String description) {
    return continueTraceSpan(header.getTraceInfo().getSpanContext(),
        description);
  }

  /** Process op by the corresponding method. */
  protected final void processOp(Op op) throws IOException {
    switch (op) {
      case READ_BLOCK:
        opReadBlock();
        break;
      case WRITE_BLOCK:
        opWriteBlock(in);
        break;
      case REPLACE_BLOCK:
        opReplaceBlock(in);
        break;
      case COPY_BLOCK:
        opCopyBlock(in);
        break;
      case BLOCK_CHECKSUM:
        opBlockChecksum(in);
        break;
      case TRANSFER_BLOCK:
        opTransferBlock(in);
        break;
      case REQUEST_SHORT_CIRCUIT_FDS:
        opRequestShortCircuitFds(in);
        break;
      case RELEASE_SHORT_CIRCUIT_FDS:
        opReleaseShortCircuitFds(in);
        break;
      case REQUEST_SHORT_CIRCUIT_SHM:
        opRequestShortCircuitShm(in);
        break;
      default:
        throw new IOException("Unknown op " + op + " in data stream");
    }
  }

  static private CachingStrategy getCachingStrategy(CachingStrategyProto strategy) {
    Boolean dropBehind = strategy.hasDropBehind() ?
        strategy.getDropBehind() : null;
    Long readahead = strategy.hasReadahead() ?
        strategy.getReadahead() : null;
    return new CachingStrategy(dropBehind, readahead);
  }

  /** Receive OP_READ_BLOCK */
  private void opReadBlock() throws IOException {
    OpReadBlockProto proto = OpReadBlockProto.parseFrom(vintPrefixed(in));
    TraceScope traceScope = continueTraceSpan(proto.getHeader(),
        proto.getClass().getSimpleName());
    try {
      readBlock(PBHelperClient.convert(proto.getHeader().getBaseHeader().getBlock()),
          PBHelperClient.convert(proto.getHeader().getBaseHeader().getToken()),
          proto.getHeader().getClientName(),
          proto.getOffset(),
          proto.getLen(),
          proto.getSendChecksums(),
          (proto.hasCachingStrategy() ?
              getCachingStrategy(proto.getCachingStrategy()) :
              CachingStrategy.newDefaultStrategy()));
    } finally {
      if (traceScope != null) traceScope.close();
    }
  }

  /** Receive OP_WRITE_BLOCK */
  private void opWriteBlock(DataInputStream in) throws IOException {
    final OpWriteBlockProto proto = OpWriteBlockProto.parseFrom(vintPrefixed(in));
    final DatanodeInfo[] targets = PBHelperClient.convert(proto.getTargetsList());
    TraceScope traceScope = continueTraceSpan(proto.getHeader(),
        proto.getClass().getSimpleName());
    try {
      writeBlock(PBHelperClient.convert(proto.getHeader().getBaseHeader().getBlock()),
          PBHelperClient.convertStorageType(proto.getStorageType()),
          PBHelperClient.convert(proto.getHeader().getBaseHeader().getToken()),
          proto.getHeader().getClientName(),
          targets,
          PBHelperClient.convertStorageTypes(proto.getTargetStorageTypesList(), targets.length),
          PBHelperClient.convert(proto.getSource()),
          fromProto(proto.getStage()),
          proto.getPipelineSize(),
          proto.getMinBytesRcvd(), proto.getMaxBytesRcvd(),
          proto.getLatestGenerationStamp(),
          fromProto(proto.getRequestedChecksum()),
          (proto.hasCachingStrategy() ?
              getCachingStrategy(proto.getCachingStrategy()) :
              CachingStrategy.newDefaultStrategy()),
          (proto.hasAllowLazyPersist() ? proto.getAllowLazyPersist() : false),
          (proto.hasPinning() ? proto.getPinning() : false),
          (PBHelperClient.convertBooleanList(proto.getTargetPinningsList())),
          proto.getStorageId(),
          proto.getTargetStorageIdsList().toArray(new String[0]));
    } finally {
      if (traceScope != null) traceScope.close();
    }
  }

  /** Receive {@link Op#TRANSFER_BLOCK} */
  private void opTransferBlock(DataInputStream in) throws IOException {
    final OpTransferBlockProto proto =
        OpTransferBlockProto.parseFrom(vintPrefixed(in));
    final DatanodeInfo[] targets = PBHelperClient.convert(proto.getTargetsList());
    TraceScope traceScope = continueTraceSpan(proto.getHeader(),
        proto.getClass().getSimpleName());
    try {
      final ExtendedBlock block =
          PBHelperClient.convert(proto.getHeader().getBaseHeader().getBlock());
      final StorageType[] targetStorageTypes =
          PBHelperClient.convertStorageTypes(proto.getTargetStorageTypesList(),
              targets.length);
      transferBlock(block,
          PBHelperClient.convert(proto.getHeader().getBaseHeader().getToken()),
          proto.getHeader().getClientName(),
          targets,
          targetStorageTypes,
          proto.getTargetStorageIdsList().toArray(new String[0])
      );
    } finally {
      if (traceScope != null) traceScope.close();
    }
  }

  /** Receive {@link Op#REQUEST_SHORT_CIRCUIT_FDS} */
  private void opRequestShortCircuitFds(DataInputStream in) throws IOException {
    final OpRequestShortCircuitAccessProto proto =
        OpRequestShortCircuitAccessProto.parseFrom(vintPrefixed(in));
    SlotId slotId = (proto.hasSlotId()) ?
        PBHelperClient.convert(proto.getSlotId()) : null;
    TraceScope traceScope = continueTraceSpan(proto.getHeader(),
        proto.getClass().getSimpleName());
    try {
      requestShortCircuitFds(PBHelperClient.convert(proto.getHeader().getBlock()),
          PBHelperClient.convert(proto.getHeader().getToken()),
          slotId, proto.getMaxVersion(),
          proto.getSupportsReceiptVerification());
    } finally {
      if (traceScope != null) traceScope.close();
    }
  }

  /** Receive {@link Op#RELEASE_SHORT_CIRCUIT_FDS} */
  private void opReleaseShortCircuitFds(DataInputStream in)
      throws IOException {
    final ReleaseShortCircuitAccessRequestProto proto =
        ReleaseShortCircuitAccessRequestProto.parseFrom(vintPrefixed(in));
    TraceScope traceScope = continueTraceSpan(
        proto.getTraceInfo().getSpanContext(),
        proto.getClass().getSimpleName());
    try {
      releaseShortCircuitFds(PBHelperClient.convert(proto.getSlotId()));
    } finally {
      if (traceScope != null) traceScope.close();
    }
  }

  /** Receive {@link Op#REQUEST_SHORT_CIRCUIT_SHM} */
  private void opRequestShortCircuitShm(DataInputStream in) throws IOException {
    final ShortCircuitShmRequestProto proto =
        ShortCircuitShmRequestProto.parseFrom(vintPrefixed(in));
    TraceScope traceScope = continueTraceSpan(
        proto.getTraceInfo().getSpanContext(),
        proto.getClass().getSimpleName());
    try {
      requestShortCircuitShm(proto.getClientName());
    } finally {
      if (traceScope != null) traceScope.close();
    }
  }

  /** Receive OP_REPLACE_BLOCK */
  private void opReplaceBlock(DataInputStream in) throws IOException {
    OpReplaceBlockProto proto = OpReplaceBlockProto.parseFrom(vintPrefixed(in));
    TraceScope traceScope = continueTraceSpan(proto.getHeader(),
        proto.getClass().getSimpleName());
    try {
      replaceBlock(PBHelperClient.convert(proto.getHeader().getBlock()),
          PBHelperClient.convertStorageType(proto.getStorageType()),
          PBHelperClient.convert(proto.getHeader().getToken()),
          proto.getDelHint(),
          PBHelperClient.convert(proto.getSource()),
          proto.getStorageId());
    } finally {
      if (traceScope != null) traceScope.close();
    }
  }

  /** Receive OP_COPY_BLOCK */
  private void opCopyBlock(DataInputStream in) throws IOException {
    OpCopyBlockProto proto = OpCopyBlockProto.parseFrom(vintPrefixed(in));
    TraceScope traceScope = continueTraceSpan(proto.getHeader(),
        proto.getClass().getSimpleName());
    try {
      copyBlock(PBHelperClient.convert(proto.getHeader().getBlock()),
          PBHelperClient.convert(proto.getHeader().getToken()));
    } finally {
      if (traceScope != null) traceScope.close();
    }
  }

  /** Receive OP_BLOCK_CHECKSUM */
  private void opBlockChecksum(DataInputStream in) throws IOException {
    OpBlockChecksumProto proto = OpBlockChecksumProto.parseFrom(vintPrefixed(in));
    try (TraceScope ignored = continueTraceSpan(proto.getHeader(),
        proto.getClass().getSimpleName())) {
      blockChecksum(PBHelperClient.convert(proto.getHeader().getBlock()),
          PBHelperClient.convert(proto.getHeader().getToken()),
          PBHelperClient.convert(proto.getBlockChecksumOptions()));
    }
  }

}
