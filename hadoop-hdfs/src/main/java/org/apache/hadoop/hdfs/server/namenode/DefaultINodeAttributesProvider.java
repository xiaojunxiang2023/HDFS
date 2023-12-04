package org.apache.hadoop.hdfs.server.namenode;

/**
 * A default implementation of the INodeAttributesProvider
 *
 */
public class DefaultINodeAttributesProvider extends INodeAttributeProvider {

  public static INodeAttributeProvider DEFAULT_PROVIDER =
      new DefaultINodeAttributesProvider();

  @Override
  public void start() {
    // NO-OP
  }

  @Override
  public void stop() {
    // NO-OP
  }

  @Override
  public INodeAttributes getAttributes(String[] pathElements,
                                       INodeAttributes inode) {
    return inode;
  }

}
