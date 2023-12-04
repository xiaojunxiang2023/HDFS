package others;

import org.apache.hadoop.hdfs.protocolPB.ClientNamenodeProtocolPB;

/**
 * @Author: hellosrc
 * @Date: 2023/11/17日  12:17分
 * @Description:
 */
public class Test3 {


  public static void main(String[] args) throws ClassNotFoundException {
    System.out.println(isThirdParty(ClientNamenodeProtocolPB.class));
  }

  private static boolean isThirdParty(Class<?> protocol) throws ClassNotFoundException {
    Class<?> anInterface = protocol.getInterfaces()[0];
    org.apache.hadoop.hdfs.protocol.proto.ClientNamenodeProtocolProtos.ClientNamenodeProtocol clientNamenodeProtocol = null;
    String clzName = anInterface.getName().replace("$BlockingInterface", "");
    Class<?> aClass = Class.forName(clzName);
    String serviceName = aClass.getInterfaces()[0].getName();
    System.out.println(aClass.getInterfaces()[0].getName());
    return serviceName.startsWith("org.apache.hadoop.thirdparty.protobuf");
  }
}
