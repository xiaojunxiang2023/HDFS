package org.apache.hadoop.hdfs.tools.offlineEditsViewer;

import org.apache.hadoop.hdfs.server.common.HdfsServerConstants;
import org.apache.hadoop.hdfs.server.namenode.EditLogFileInputStream;
import org.apache.hadoop.hdfs.server.namenode.EditLogInputStream;

import java.io.File;
import java.io.IOException;

/**
 * OfflineEditsLoader walks an EditsVisitor over an EditLogInputStream
 */
interface OfflineEditsLoader {

  abstract public void loadEdits() throws IOException;

  static class OfflineEditsLoaderFactory {
    static OfflineEditsLoader createLoader(OfflineEditsVisitor visitor,
                                           String inputFileName, boolean xmlInput,
                                           OfflineEditsViewer.Flags flags) throws IOException {
      if (xmlInput) {
        return new OfflineEditsXmlLoader(visitor, new File(inputFileName), flags);
      } else {
        File file = null;
        EditLogInputStream elis = null;
        OfflineEditsLoader loader = null;
        try {
          file = new File(inputFileName);
          elis = new EditLogFileInputStream(file, HdfsServerConstants.INVALID_TXID,
              HdfsServerConstants.INVALID_TXID, false);
          loader = new OfflineEditsBinaryLoader(visitor, elis, flags);
        } finally {
          if ((loader == null) && (elis != null)) {
            elis.close();
          }
        }
        return loader;
      }
    }
  }
}
