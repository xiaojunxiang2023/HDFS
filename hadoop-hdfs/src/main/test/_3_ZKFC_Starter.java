import org.apache.hadoop.hdfs.tools.DFSZKFailoverController;
import org.junit.Test;

/**
 * @Author: Learner src
 * @Date: 2023/09/25日  11:17分
 * @Description:
 */
public class _3_ZKFC_Starter {
    @Test
    public void startZKFC() throws Exception {
//        String[] args = new String[]{"-formatZK"};
        String[] args = new String[]{};
        DFSZKFailoverController.main(args);
        Thread.sleep(System.currentTimeMillis());
    }
}
