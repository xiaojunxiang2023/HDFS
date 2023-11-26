package org.apache.hadoop.hdfs.tools.offlineImageViewer;

import org.apache.hadoop.hdfs.util.XMLUtils;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * An XmlImageVisitor walks over an fsimage structure and writes out
 * an equivalent XML document that contains the fsimage's components.
 */
public class XmlImageVisitor extends TextWriterImageVisitor {
    final private Deque<ImageElement> tagQ = new ArrayDeque<>();

    public XmlImageVisitor(String filename) throws IOException {
        super(filename, false);
    }

    public XmlImageVisitor(String filename, boolean printToScreen)
            throws IOException {
        super(filename, printToScreen);
    }

    @Override
    void finish() throws IOException {
        super.finish();
    }

    @Override
    void finishAbnormally() throws IOException {
        write("\n<!-- Error processing image file.  Exiting -->\n");
        super.finishAbnormally();
    }

    @Override
    void leaveEnclosingElement() throws IOException {
        if (tagQ.isEmpty()) {
            throw new IOException("Tried to exit non-existent enclosing element " +
                    "in FSImage file");
        }

        ImageElement element = tagQ.pop();
        write("</" + element.toString() + ">\n");
    }

    @Override
    void start() throws IOException {
        write("<?xml version=\"1.0\" ?>\n");
    }

    @Override
    void visit(ImageElement element, String value) throws IOException {
        writeTag(element.toString(), value);
    }

    @Override
    void visitEnclosingElement(ImageElement element) throws IOException {
        write('<' + element.toString() + ">\n");
        tagQ.push(element);
    }

    @Override
    void visitEnclosingElement(ImageElement element,
                               ImageElement key, String value)
            throws IOException {
        write('<' + element.toString() + ' ' + key + "=\"" + value + "\">\n");
        tagQ.push(element);
    }

    private void writeTag(String tag, String value) throws IOException {
        write('<' + tag + '>' +
                XMLUtils.mangleXmlString(value, true) + "</" + tag + ">\n");
    }
}
