package others;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: hellosrc
 * @Date: 2023/11/17日  12:17分
 * @Description:
 */
public class Test4 {
    public static void main(String[] args) throws ClassNotFoundException {
        Logger LOG = LoggerFactory.getLogger(Test4.class);
//        Class.forName("org.apache.hadoop.hdfs.protocolPB.ClientNamenodeProtocolPB");
//        Class.forName("com.google.protobuf.Service");
//        Class.forName("org.apache.hadoop.hdfs.protocol.proto.ClientNamenodeProtocolProtos");
//        Class.forName("org.apache.hadoop.hdfs.protocol.proto.ClientNamenodeProtocolProtos$ClientNamenodeProtocol");
        try {
            System.out.println(1/0);
        } catch (Exception e) {
            LOG.error("meet with Exception when getProtocolEngine()", e);
        } 
    }

}
