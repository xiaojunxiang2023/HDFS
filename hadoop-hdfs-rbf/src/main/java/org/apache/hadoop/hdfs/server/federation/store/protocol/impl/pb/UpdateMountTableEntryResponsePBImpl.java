package org.apache.hadoop.hdfs.server.federation.store.protocol.impl.pb;

import org.apache.hadoop.hdfs.federation.protocol.proto.HdfsServerFederationProtos.UpdateMountTableEntryResponseProto;
import org.apache.hadoop.hdfs.federation.protocol.proto.HdfsServerFederationProtos.UpdateMountTableEntryResponseProtoOrBuilder;
import org.apache.hadoop.hdfs.server.federation.store.protocol.UpdateMountTableEntryResponse;
import org.apache.hadoop.hdfs.server.federation.store.records.impl.pb.PBRecord;
import org.apache.hadoop.thirdparty.protobuf.Message;

import java.io.IOException;

/**
 * Protobuf implementation of the state store API object
 * UpdateMountTableEntryResponse.
 */
public class UpdateMountTableEntryResponsePBImpl
    extends UpdateMountTableEntryResponse implements PBRecord {

  private FederationProtocolPBTranslator<UpdateMountTableEntryResponseProto,
      UpdateMountTableEntryResponseProto.Builder,
      UpdateMountTableEntryResponseProtoOrBuilder> translator =
      new FederationProtocolPBTranslator<UpdateMountTableEntryResponseProto,
          UpdateMountTableEntryResponseProto.Builder,
          UpdateMountTableEntryResponseProtoOrBuilder>(
          UpdateMountTableEntryResponseProto.class);

  public UpdateMountTableEntryResponsePBImpl() {
  }

  public UpdateMountTableEntryResponsePBImpl(
      UpdateMountTableEntryResponseProto proto) {
    this.setProto(proto);
  }

  @Override
  public UpdateMountTableEntryResponseProto getProto() {
    return this.translator.build();
  }

  @Override
  public void setProto(Message proto) {
    this.translator.setProto(proto);
  }

  @Override
  public void readInstance(String base64String) throws IOException {
    this.translator.readInstance(base64String);
  }

  @Override
  public boolean getStatus() {
    return this.translator.getProtoOrBuilder().getStatus();
  }

  @Override
  public void setStatus(boolean result) {
    this.translator.getBuilder().setStatus(result);
  }
}
