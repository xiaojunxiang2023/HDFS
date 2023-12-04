package org.apache.hadoop.util;

import java.util.jar.JarFile;
import java.util.jar.Manifest;

/**
 * A micro-application that prints the main class name out of a jar file.
 */
public class PrintJarMainClass {

  /**
   * @param args
   */
  public static void main(String[] args) {
    try (JarFile jar_file = new JarFile(args[0])) {
      Manifest manifest = jar_file.getManifest();
      if (manifest != null) {
        String value = manifest.getMainAttributes().getValue("Main-Class");
        if (value != null) {
          System.out.println(value.replaceAll("/", "."));
          return;
        }
      }
    } catch (Throwable e) {
      // ignore it
    }
    System.out.println("UNKNOWN");
    System.exit(1);
  }

}
