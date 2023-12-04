import org.apache.hadoop.hdfs.server.datanode.DataNode;
import org.junit.Test;

/**
 * @Author: Learner src
 * @Date: 2023/09/25日  11:17分
 * @Description:
 */
public class _2_DataNode_Starter {
  @Test
  public void startDataNode() throws Exception {
    String[] args = new String[]{};
    DataNode.main(args);
    Thread.sleep(System.currentTimeMillis());
  }
}
