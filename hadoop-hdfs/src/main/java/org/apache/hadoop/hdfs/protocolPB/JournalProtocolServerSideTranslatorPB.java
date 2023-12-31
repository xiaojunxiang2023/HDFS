package org.apache.hadoop.hdfs.protocolPB;

import org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.*;
import org.apache.hadoop.hdfs.server.protocol.FenceResponse;
import org.apache.hadoop.hdfs.server.protocol.JournalProtocol;
import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;

import java.io.IOException;

/**
 * Implementation for protobuf service that forwards requests
 * received on {@link JournalProtocolPB} to the 
 * {@link JournalProtocol} server implementation.
 */
public class JournalProtocolServerSideTranslatorPB implements JournalProtocolPB {
  /** Server side implementation to delegate the requests to */
  private final JournalProtocol impl;

  private final static JournalResponseProto VOID_JOURNAL_RESPONSE =
      JournalResponseProto.newBuilder().build();

  private final static StartLogSegmentResponseProto
      VOID_START_LOG_SEGMENT_RESPONSE =
      StartLogSegmentResponseProto.newBuilder().build();

  public JournalProtocolServerSideTranslatorPB(JournalProtocol impl) {
    this.impl = impl;
  }

  /** @see JournalProtocol#journal */
  @Override
  public JournalResponseProto journal(RpcController unused,
                                      JournalRequestProto req) throws ServiceException {
    try {
      impl.journal(PBHelper.convert(req.getJournalInfo()), req.getEpoch(),
          req.getFirstTxnId(), req.getNumTxns(), req.getRecords().toByteArray());
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_JOURNAL_RESPONSE;
  }

  /** @see JournalProtocol#startLogSegment */
  @Override
  public StartLogSegmentResponseProto startLogSegment(RpcController controller,
                                                      StartLogSegmentRequestProto req) throws ServiceException {
    try {
      impl.startLogSegment(PBHelper.convert(req.getJournalInfo()),
          req.getEpoch(), req.getTxid());
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_START_LOG_SEGMENT_RESPONSE;
  }

  @Override
  public FenceResponseProto fence(RpcController controller,
                                  FenceRequestProto req) throws ServiceException {
    try {
      FenceResponse resp = impl.fence(PBHelper.convert(req.getJournalInfo()), req.getEpoch(),
          req.getFencerInfo());
      return FenceResponseProto.newBuilder().setInSync(resp.isInSync())
          .setLastTransactionId(resp.getLastTransactionId())
          .setPreviousEpoch(resp.getPreviousEpoch()).build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }
}
