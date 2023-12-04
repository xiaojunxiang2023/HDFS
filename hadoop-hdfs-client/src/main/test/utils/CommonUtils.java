package utils;


import java.io.IOException;
import java.io.InputStream;


public class CommonUtils {

  // shell, os.system调用
  public static void system(String cmd) {
    System.out.println("=========================【" + cmd + "】============================");
    exec(cmd);
  }

  // shell, os.open调用并获得返回值
  public static String open(String cmd) {
    System.out.println("=========================【" + cmd + "】============================");
    Process process = exec(cmd);
    try {
      // 防止立刻获取不到数据
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    InputStream in = process.getInputStream();
    byte[] bytes = null;
    try {
      bytes = new byte[in.available()];
      in.read(bytes);
    } catch (IOException e) {
      e.printStackTrace();
    }
    if (bytes == null) {
      System.err.println("bytes 不能为null");
    }
    String result = new String(bytes).trim();
    System.out.println("result:  " + result);
    return result;
  }

  private static Process exec(String cmd) {
    try {
      return (new ProcessBuilder(cmd.split("\\s+"))).redirectErrorStream(true).start();
    } catch (IOException var3) {
      throw new RuntimeException(var3);
    }
  }

}
