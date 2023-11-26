package org.apache.hadoop.hdfs.tools.offlineEditsViewer;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.util.StringUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * EditsVisitorFactory for different implementations of EditsVisitor
 *
 */
public class OfflineEditsVisitorFactory {
    /**
     * Factory function that creates an EditsVisitor object
     *
     * @param filename              output filename
     * @param processor             type of visitor to create 
     * @param printToScreen         parameter passed to visitor constructor
     *
     * @return EditsVisitor for appropriate output format (binary, xml, etc.)
     */
    static public OfflineEditsVisitor getEditsVisitor(String filename,
                                                      String processor, boolean printToScreen) throws IOException {
        if (StringUtils.equalsIgnoreCase("binary", processor)) {
            return new BinaryEditsVisitor(filename);
        }
        OfflineEditsVisitor vis;
        OutputStream fout = Files.newOutputStream(Paths.get(filename));
        OutputStream out = null;
        try {
            if (!printToScreen) {
                out = fout;
            } else {
                OutputStream outs[] = new OutputStream[2];
                outs[0] = fout;
                outs[1] = System.out;
                out = new TeeOutputStream(outs);
            }
            if (StringUtils.equalsIgnoreCase("xml", processor)) {
                vis = new XmlEditsVisitor(out);
            } else if (StringUtils.equalsIgnoreCase("stats", processor)) {
                vis = new StatisticsEditsVisitor(out);
            } else {
                throw new IOException("Unknown processor " + processor +
                        " (valid processors: xml, binary, stats)");
            }
            out = fout = null;
            return vis;
        } finally {
            IOUtils.closeStream(fout);
            IOUtils.closeStream(out);
        }
    }
}
