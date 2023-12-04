package others;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @Author: hellosrc
 * @Date: 2023/10/10日  14:43分
 * @Description:
 */
public class Test1 {

  @Test
  public void test01() throws IOException {
  }

  public static void main(String[] args) throws IOException {
    String input = "hello!";
    System.out.println(input);
    ByteBuffer buffer = ByteBuffer.wrap(input.getBytes(StandardCharsets.UTF_8));
    String pathName = "/xxx/01.txt";
    Path path = Paths.get(pathName);
    FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
    fileChannel.position(fileChannel.size() - 1);
    FileLock lock = fileChannel.lock();
    // FileLock lock = fileChannel.lock(0, Long.MAX_VALUE, true);
    System.out.println("isShared: " + lock.isShared());
    fileChannel.write(buffer);
    fileChannel.close();
    readFile(pathName);
  }

  private static void readFile(String pathName) throws IOException {
    FileReader fileReader = new FileReader(pathName);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String str = bufferedReader.readLine();
    System.out.println("读取内容：");
    while (str != null) {
      System.out.println("  " + str);
      str = bufferedReader.readLine();
    }
    fileReader.close();
    bufferedReader.close();
  }
}
