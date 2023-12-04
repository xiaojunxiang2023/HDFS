package others;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: hellosrc
 * @Date: 2023/11/25日  21:15分
 * @Description:
 */
public class Test5 {
  private static Logger logger = LoggerFactory.getLogger(Object.class);


  public static void main(String[] args) {
    main3(args);
  }

  public static void main3(String[] args) {
    logger.info("hhhhhh");
    System.out.println(logger.getName());
    System.out.println(logger.isInfoEnabled());
    System.out.println(logger.isDebugEnabled());
    try {
      System.out.println(1 / 0);
    } catch (Exception e) {
      logger.error("hello, ", e);
      System.out.println("=========================");
      logger.error(e.getMessage());
      System.out.println("=========================");
      for (StackTraceElement element : e.getStackTrace()) {
        System.out.println(element);
      }
    }
  }

}
