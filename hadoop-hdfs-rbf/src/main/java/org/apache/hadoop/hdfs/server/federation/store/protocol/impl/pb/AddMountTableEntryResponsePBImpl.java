package org.apache.hadoop.hdfs.server.federation.store.protocol.impl.pb;

import org.apache.hadoop.hdfs.federation.protocol.proto.HdfsServerFederationProtos.AddMountTableEntryResponseProto;
import org.apache.hadoop.hdfs.federation.protocol.proto.HdfsServerFederationProtos.AddMountTableEntryResponseProtoOrBuilder;
import org.apache.hadoop.hdfs.server.federation.store.protocol.AddMountTableEntryResponse;
import org.apache.hadoop.hdfs.server.federation.store.records.impl.pb.PBRecord;
import org.apache.hadoop.thirdparty.protobuf.Message;

import java.io.IOException;

/**
 * Protobuf implementation of the state store API object
 * AddMountTableEntryResponse.
 */
public class AddMountTableEntryResponsePBImpl
    extends AddMountTableEntryResponse implements PBRecord {

  private FederationProtocolPBTranslator<AddMountTableEntryResponseProto,
      AddMountTableEntryResponseProto.Builder,
      AddMountTableEntryResponseProtoOrBuilder> translator =
      new FederationProtocolPBTranslator<AddMountTableEntryResponseProto,
          AddMountTableEntryResponseProto.Builder,
          AddMountTableEntryResponseProtoOrBuilder>(
          AddMountTableEntryResponseProto.class);

  public AddMountTableEntryResponsePBImpl() {
  }

  public AddMountTableEntryResponsePBImpl(
      AddMountTableEntryResponseProto proto) {
    this.translator.setProto(proto);
  }

  @Override
  public AddMountTableEntryResponseProto getProto() {
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