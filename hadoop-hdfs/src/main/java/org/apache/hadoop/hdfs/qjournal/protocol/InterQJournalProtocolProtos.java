// source: InterQJournalProtocol.proto

package org.apache.hadoop.hdfs.qjournal.protocol;

public final class InterQJournalProtocolProtos {
  private InterQJournalProtocolProtos() {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }

  /**
   * Protobuf service {@code hadoop.hdfs.qjournal.InterQJournalProtocolService}
   */
  public static abstract class InterQJournalProtocolService
      implements org.apache.hadoop.thirdparty.protobuf.Service {
    protected InterQJournalProtocolService() {
    }

    public interface Interface {
      /**
       * <code>rpc getEditLogManifestFromJournal(.hadoop.hdfs.qjournal.GetEditLogManifestRequestProto) returns (.hadoop.hdfs.qjournal.GetEditLogManifestResponseProto);</code>
       */
      public abstract void getEditLogManifestFromJournal(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestResponseProto> done);

    }

    public static org.apache.hadoop.thirdparty.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new InterQJournalProtocolService() {
        @java.lang.Override
        public void getEditLogManifestFromJournal(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestResponseProto> done) {
          impl.getEditLogManifestFromJournal(controller, request, done);
        }

      };
    }

    public static org.apache.hadoop.thirdparty.protobuf.BlockingService
    newReflectiveBlockingService(final BlockingInterface impl) {
      return new org.apache.hadoop.thirdparty.protobuf.BlockingService() {
        public final org.apache.hadoop.thirdparty.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
          return getDescriptor();
        }

        public final org.apache.hadoop.thirdparty.protobuf.Message callBlockingMethod(
            org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method,
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.thirdparty.protobuf.Message request)
            throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
                "Service.callBlockingMethod() given method descriptor for " +
                    "wrong service type.");
          }
          switch (method.getIndex()) {
            case 0:
              return impl.getEditLogManifestFromJournal(controller, (org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestRequestProto) request);
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final org.apache.hadoop.thirdparty.protobuf.Message
        getRequestPrototype(
            org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
                "Service.getRequestPrototype() given method " +
                    "descriptor for wrong service type.");
          }
          switch (method.getIndex()) {
            case 0:
              return org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestRequestProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final org.apache.hadoop.thirdparty.protobuf.Message
        getResponsePrototype(
            org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
                "Service.getResponsePrototype() given method " +
                    "descriptor for wrong service type.");
          }
          switch (method.getIndex()) {
            case 0:
              return org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc getEditLogManifestFromJournal(.hadoop.hdfs.qjournal.GetEditLogManifestRequestProto) returns (.hadoop.hdfs.qjournal.GetEditLogManifestResponseProto);</code>
     */
    public abstract void getEditLogManifestFromJournal(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestResponseProto> done);

    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.ServiceDescriptor
    getDescriptor() {
      return org.apache.hadoop.hdfs.qjournal.protocol.InterQJournalProtocolProtos.getDescriptor().getServices().get(0);
    }

    public final org.apache.hadoop.thirdparty.protobuf.Descriptors.ServiceDescriptor
    getDescriptorForType() {
      return getDescriptor();
    }

    public final void callMethod(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method,
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.thirdparty.protobuf.Message request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<
            org.apache.hadoop.thirdparty.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
            "Service.callMethod() given method descriptor for wrong " +
                "service type.");
      }
      switch (method.getIndex()) {
        case 0:
          this.getEditLogManifestFromJournal(controller, (org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestRequestProto) request,
              org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestResponseProto>specializeCallback(
                  done));
          return;
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final org.apache.hadoop.thirdparty.protobuf.Message
    getRequestPrototype(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
                "descriptor for wrong service type.");
      }
      switch (method.getIndex()) {
        case 0:
          return org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestRequestProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final org.apache.hadoop.thirdparty.protobuf.Message
    getResponsePrototype(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
                "descriptor for wrong service type.");
      }
      switch (method.getIndex()) {
        case 0:
          return org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.hdfs.qjournal.protocol.InterQJournalProtocolProtos.InterQJournalProtocolService implements Interface {
      private Stub(org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.RpcChannel channel;

      public org.apache.hadoop.thirdparty.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public void getEditLogManifestFromJournal(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestResponseProto> done) {
        channel.callMethod(
            getDescriptor().getMethods().get(0),
            controller,
            request,
            org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestResponseProto.getDefaultInstance(),
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
                done,
                org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestResponseProto.class,
                org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestResponseProto getEditLogManifestFromJournal(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestResponseProto getEditLogManifestFromJournal(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestResponseProto) channel.callBlockingMethod(
            getDescriptor().getMethods().get(0),
            controller,
            request,
            org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.qjournal.InterQJournalProtocolService)
  }


  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }

  private static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;

  static {
    java.lang.String[] descriptorData = {
        "\n\033InterQJournalProtocol.proto\022\024hadoop.hd" +
            "fs.qjournal\032\020HdfsServer.proto\032\026QJournalP" +
            "rotocol.proto2\255\001\n\034InterQJournalProtocolS" +
            "ervice\022\214\001\n\035getEditLogManifestFromJournal" +
            "\0224.hadoop.hdfs.qjournal.GetEditLogManife" +
            "stRequestProto\0325.hadoop.hdfs.qjournal.Ge" +
            "tEditLogManifestResponseProtoBM\n(org.apa" +
            "che.hadoop.hdfs.qjournal.protocolB\033Inter" +
            "QJournalProtocolProtos\210\001\001\240\001\001"
    };
    org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry assignDescriptors(
              org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
        .internalBuildGeneratedFileFrom(descriptorData,
            new org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor[]{
                org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.getDescriptor(),
                org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.getDescriptor(),
            }, assigner);
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.getDescriptor();
    org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
