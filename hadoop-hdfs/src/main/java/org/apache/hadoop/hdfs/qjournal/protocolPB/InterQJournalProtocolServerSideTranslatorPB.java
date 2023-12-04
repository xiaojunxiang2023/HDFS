package org.apache.hadoop.hdfs.qjournal.protocolPB;

import org.apache.hadoop.hdfs.qjournal.protocol.InterQJournalProtocol;
import org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestRequestProto;
import org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestResponseProto;
import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;

import java.io.IOException;

/**
 * Implementation for protobuf service that forwards requests
 * received on {@link InterQJournalProtocolPB} to the
 * {@link InterQJournalProtocol} server implementation.
 */
public class InterQJournalProtocolServerSideTranslatorPB implements
    InterQJournalProtocolPB {

  /* Server side implementation to delegate the requests to. */
  private final InterQJournalProtocol impl;

  public InterQJournalProtocolServerSideTranslatorPB(InterQJournalProtocol
                                                         impl) {
    this.impl = impl;
  }

  @Override
  public GetEditLogManifestResponseProto getEditLogManifestFromJournal(
      RpcController controller, GetEditLogManifestRequestProto request)
      throws ServiceException {
    try {
      return impl.getEditLogManifestFromJournal(
          request.getJid().getIdentifier(),
          request.hasNameServiceId() ? request.getNameServiceId() : null,
          request.getSinceTxId(),
          request.getInProgressOk());
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }
}
