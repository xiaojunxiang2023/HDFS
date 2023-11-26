package org.apache.hadoop.auth.util.micro;

// 获取当前机器的架构信息
public class PlatformName {
  
  public static final String PLATFORM_NAME =
      (System.getProperty("os.name").startsWith("Windows")
      ? System.getenv("os") : System.getProperty("os.name"))
      + "-" + System.getProperty("os.arch")
      + "-" + System.getProperty("sun.arch.data.model");

  public static final String JAVA_VENDOR_NAME = System.getProperty("java.vendor");

  public static final boolean IBM_JAVA = JAVA_VENDOR_NAME.contains("IBM");

  public static void main(String[] args) {
    System.out.println(PLATFORM_NAME);
  }
}
