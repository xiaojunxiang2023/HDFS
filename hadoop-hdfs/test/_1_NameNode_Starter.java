
import org.apache.hadoop.hdfs.server.namenode.NameNode;
import org.junit.Test;

/**
 * @Author: Learner src
 * @Date: 2023/09/25日  11:17分
 * @Description:
 */
public class _1_NameNode_Starter {
    @Test
    public void startNameNode() throws Exception {
//        String[] args = new String[]{"-format"};   
        String[] args = new String[]{ };  
        NameNode.main(args);
        Thread.sleep(System.currentTimeMillis());
    }
}
