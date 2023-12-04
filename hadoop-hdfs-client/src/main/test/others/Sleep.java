package others;

/**
 * 功能:      不做任何事情，只是 sleep
 * 使用示例:   hadoop jar hadoop-case*.jar others.Sleep
 */
public class Sleep {

  /**
   * main方法
   */
  public static void main(String[] args) throws InterruptedException {
    System.out.println("进程启动.");
    Thread.sleep(2 * 3600);
    System.out.println("进程终止.");
  }

}
