package org.apache.hadoop.hdfs.server.federation.store.protocol.impl.pb;

import org.apache.hadoop.hdfs.federation.protocol.proto.HdfsServerFederationProtos.RefreshSuperUserGroupsConfigurationRequestProto;
import org.apache.hadoop.hdfs.federation.protocol.proto.HdfsServerFederationProtos.RefreshSuperUserGroupsConfigurationRequestProto.Builder;
import org.apache.hadoop.hdfs.federation.protocol.proto.HdfsServerFederationProtos.RefreshSuperUserGroupsConfigurationRequestProtoOrBuilder;
import org.apache.hadoop.hdfs.server.federation.store.protocol.RefreshSuperUserGroupsConfigurationRequest;
import org.apache.hadoop.hdfs.server.federation.store.records.impl.pb.PBRecord;
import org.apache.hadoop.thirdparty.protobuf.Message;

import java.io.IOException;

/**
 * Protobuf implementation of the state store API object
 * RefreshSuperUserGroupsConfigurationRequest.
 */
public class RefreshSuperUserGroupsConfigurationRequestPBImpl
    extends RefreshSuperUserGroupsConfigurationRequest
    implements PBRecord {

  private FederationProtocolPBTranslator<
      RefreshSuperUserGroupsConfigurationRequestProto, Builder,
      RefreshSuperUserGroupsConfigurationRequestProtoOrBuilder> translator =
      new FederationProtocolPBTranslator<>(
          RefreshSuperUserGroupsConfigurationRequestProto.class);

  public RefreshSuperUserGroupsConfigurationRequestPBImpl() {
  }

  public RefreshSuperUserGroupsConfigurationRequestPBImpl(
      RefreshSuperUserGroupsConfigurationRequestProto proto) {
    this.translator.setProto(proto);
  }

  @Override
  public RefreshSuperUserGroupsConfigurationRequestProto getProto() {
    this.translator.getBuilder();
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
}
