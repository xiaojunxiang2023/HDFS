package org.apache.hadoop.hdfs.protocol.datatransfer;

import java.io.IOException;
import org.apache.hadoop.hdfs.protocol.ExtendedBlock;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferTraceInfoProto;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status;
import org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto;
import org.apache.hadoop.hdfs.protocolPB.PBHelperClient;
import org.apache.hadoop.hdfs.security.token.block.BlockTokenIdentifier;
import org.apache.hadoop.hdfs.security.token.block.InvalidBlockTokenException;
import org.apache.hadoop.security.token.Token;
import org.apache.hadoop.util.DataChecksum;
import org.apache.hadoop.tracing.Span;
import org.apache.hadoop.tracing.Tracer;
import org.apache.hadoop.tracing.TraceUtils;

/**
 * Static utilities for dealing with the protocol buffers used by the
 * Data Transfer Protocol.
 */
public abstract class DataTransferProtoUtil {
  static BlockConstructionStage fromProto(
      OpWriteBlockProto.BlockConstructionStage stage) {
    return BlockConstructionStage.valueOf(stage.name());
  }

  static OpWriteBlockProto.BlockConstructionStage toProto(
      BlockConstructionStage stage) {
    return OpWriteBlockProto.BlockConstructionStage.valueOf(stage.name());
  }

  public static ChecksumProto toProto(DataChecksum checksum) {
    ChecksumTypeProto type = PBHelperClient.convert(checksum.getChecksumType());
    // ChecksumType#valueOf never returns null
    return ChecksumProto.newBuilder()
      .setBytesPerChecksum(checksum.getBytesPerChecksum())
      .setType(type)
      .build();
  }

  public static DataChecksum fromProto(ChecksumProto proto) {
    if (proto == null) {
      return null;
    }

    int bytesPerChecksum = proto.getBytesPerChecksum();
    DataChecksum.Type type = PBHelperClient.convert(proto.getType());
    return DataChecksum.newDataChecksum(type, bytesPerChecksum);
  }

  static ClientOperationHeaderProto buildClientHeader(ExtendedBlock blk,
      String client, Token<BlockTokenIdentifier> blockToken) {
    return ClientOperationHeaderProto.newBuilder()
      .setBaseHeader(buildBaseHeader(blk, blockToken))
      .setClientName(client)
      .build();
  }

  static BaseHeaderProto buildBaseHeader(ExtendedBlock blk,
      Token<BlockTokenIdentifier> blockToken) {
    BaseHeaderProto.Builder builder =  BaseHeaderProto.newBuilder()
        .setBlock(PBHelperClient.convert(blk))
        .setToken(PBHelperClient.convert(blockToken));
    Span span = Tracer.getCurrentSpan();
    if (span != null) {
      DataTransferTraceInfoProto.Builder traceInfoProtoBuilder =
          DataTransferTraceInfoProto.newBuilder().setSpanContext(
              TraceUtils.spanContextToByteString(span.getContext()));
      builder.setTraceInfo(traceInfoProtoBuilder);
    }
    return builder.build();
  }

  public static void checkBlockOpStatus(
          BlockOpResponseProto response,
          String logInfo) throws IOException {
    checkBlockOpStatus(response, logInfo, false);
  }

  public static void checkBlockOpStatus(BlockOpResponseProto response,
      String logInfo, boolean checkBlockPinningErr) throws IOException {
    if (response.getStatus() != Status.SUCCESS) {
      if (response.getStatus() == Status.ERROR_ACCESS_TOKEN) {
        throw new InvalidBlockTokenException(
          "Got access token error"
          + ", status message " + response.getMessage()
          + ", " + logInfo
        );
      } else if (checkBlockPinningErr
          && response.getStatus() == Status.ERROR_BLOCK_PINNED) {
        throw new BlockPinningException(
            "Got error"
            + ", status=" + response.getStatus().name()
            + ", status message " + response.getMessage()
            + ", " + logInfo
          );
      } else {
        throw new IOException(
          "Got error"
          + ", status=" + response.getStatus().name()
          + ", status message " + response.getMessage()
          + ", " + logInfo
        );
      }
    }
  }
}
