import org.apache.hadoop.conf.Configuration;

/**
 * @Author: hellosrc
 * @Date: 2023/10/19日  14:05分
 * @Description:
 */
public class Test1 {

  public static void main(String[] args) {
    Configuration conf = new Configuration();
    System.out.println(conf.get("fs.defaultFS"));
  }

}
