package org.apache.hadoop.hdfs.server.federation.store.protocol.impl.pb;

import org.apache.hadoop.hdfs.federation.protocol.proto.HdfsServerFederationProtos.GetRouterRegistrationsResponseProto;
import org.apache.hadoop.hdfs.federation.protocol.proto.HdfsServerFederationProtos.GetRouterRegistrationsResponseProto.Builder;
import org.apache.hadoop.hdfs.federation.protocol.proto.HdfsServerFederationProtos.GetRouterRegistrationsResponseProtoOrBuilder;
import org.apache.hadoop.hdfs.federation.protocol.proto.HdfsServerFederationProtos.RouterRecordProto;
import org.apache.hadoop.hdfs.server.federation.store.protocol.GetRouterRegistrationsResponse;
import org.apache.hadoop.hdfs.server.federation.store.records.RouterState;
import org.apache.hadoop.hdfs.server.federation.store.records.impl.pb.PBRecord;
import org.apache.hadoop.hdfs.server.federation.store.records.impl.pb.RouterStatePBImpl;
import org.apache.hadoop.thirdparty.protobuf.Message;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Protobuf implementation of the state store API object
 * GetRouterRegistrationsResponse.
 */
public class GetRouterRegistrationsResponsePBImpl
    extends GetRouterRegistrationsResponse implements PBRecord {

  private FederationProtocolPBTranslator<GetRouterRegistrationsResponseProto,
      Builder, GetRouterRegistrationsResponseProtoOrBuilder> translator =
      new FederationProtocolPBTranslator<
          GetRouterRegistrationsResponseProto, Builder,
          GetRouterRegistrationsResponseProtoOrBuilder>(
          GetRouterRegistrationsResponseProto.class);

  public GetRouterRegistrationsResponsePBImpl() {

  }

  @Override
  public GetRouterRegistrationsResponseProto getProto() {
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
  public List<RouterState> getRouters() throws IOException {

    List<RouterState> ret = new ArrayList<RouterState>();
    List<RouterRecordProto> memberships =
        this.translator.getProtoOrBuilder().getRoutersList();
    for (RouterRecordProto memberProto : memberships) {
      RouterState membership = new RouterStatePBImpl(memberProto);
      ret.add(membership);
    }
    return ret;
  }

  @Override
  public void setRouters(List<RouterState> records) throws IOException {

    this.translator.getBuilder().clearRouters();
    for (RouterState router : records) {
      if (router instanceof RouterStatePBImpl) {
        RouterStatePBImpl routerPB = (RouterStatePBImpl) router;
        this.translator.getBuilder().addRouters(routerPB.getProto());
      }
    }
  }

  @Override
  public long getTimestamp() {
    return this.translator.getProtoOrBuilder().getTimestamp();
  }

  @Override
  public void setTimestamp(long time) {
    this.translator.getBuilder().setTimestamp(time);
  }
}