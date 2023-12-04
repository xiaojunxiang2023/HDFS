package org.apache.hadoop.util;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.InputStream;
import java.io.Writer;

/**
 * General xml utilities.
 *
 */
public class XMLUtils {
  /**
   * Transform input xml given a stylesheet.
   *
   * @param styleSheet the style-sheet
   * @param xml input xml data
   * @param out output
   * @throws TransformerConfigurationException
   * @throws TransformerException
   */
  public static void transform(
      InputStream styleSheet, InputStream xml, Writer out
  )
      throws TransformerConfigurationException, TransformerException {
    // Instantiate a TransformerFactory
    TransformerFactory tFactory = TransformerFactory.newInstance();

    // Use the TransformerFactory to process the  
    // stylesheet and generate a Transformer
    Transformer transformer = tFactory.newTransformer(
        new StreamSource(styleSheet)
    );

    // Use the Transformer to transform an XML Source 
    // and send the output to a Result object.
    transformer.transform(new StreamSource(xml), new StreamResult(out));
  }
}
