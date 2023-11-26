package org.apache.hadoop.hdfs.qjournal.protocolPB;

import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;
import org.apache.hadoop.hdfs.qjournal.protocol.InterQJournalProtocol;
import org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestRequestProto;
import org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestResponseProto;
import org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos;
import org.apache.hadoop.ipc.ProtobufHelper;
import org.apache.hadoop.ipc.ProtocolMetaInterface;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RpcClientUtil;

import java.io.Closeable;
import java.io.IOException;

/**
 * This class is the client side translator to translate the requests made on
 * {@link InterQJournalProtocol} interfaces to the RPC server implementing
 * {@link InterQJournalProtocolPB}.
 */
public class InterQJournalProtocolTranslatorPB implements ProtocolMetaInterface,
    InterQJournalProtocol, Closeable {

  /* RpcController is not used and hence is set to null. */
  private final static RpcController NULL_CONTROLLER = null;
  private final InterQJournalProtocolPB rpcProxy;

  public InterQJournalProtocolTranslatorPB(InterQJournalProtocolPB rpcProxy) {
    this.rpcProxy = rpcProxy;
  }

  @Override
  public void close() {
    RPC.stopProxy(rpcProxy);
  }


  @Override
  public GetEditLogManifestResponseProto getEditLogManifestFromJournal(
      String jid, String nameServiceId, long sinceTxId, boolean inProgressOk)
      throws IOException {
    try {
      GetEditLogManifestRequestProto.Builder req;
      req = GetEditLogManifestRequestProto.newBuilder()
          .setJid(convertJournalId(jid))
          .setSinceTxId(sinceTxId)
          .setInProgressOk(inProgressOk);
      if (nameServiceId !=null) {
        req.setNameServiceId(nameServiceId);
      }
      return rpcProxy.getEditLogManifestFromJournal(NULL_CONTROLLER,
          req.build()
      );
    } catch (ServiceException e) {
      throw ProtobufHelper.getRemoteException(e);
    }
  }

  private QJournalProtocolProtos.JournalIdProto convertJournalId(String jid) {
    return QJournalProtocolProtos.JournalIdProto.newBuilder()
        .setIdentifier(jid)
        .build();
  }

  @Override
  public boolean isMethodSupported(String methodName) throws IOException {
    return RpcClientUtil.isMethodSupported(rpcProxy,
        InterQJournalProtocolPB.class, RPC.RpcKind.RPC_PROTOCOL_BUFFER,
        RPC.getProtocolVersion(InterQJournalProtocolPB.class), methodName);
  }
}
