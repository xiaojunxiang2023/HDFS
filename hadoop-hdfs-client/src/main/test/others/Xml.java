package others;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;

/**
 * @Author: hellosrc
 * @Date: 2023/11/05日  21:03分
 * @Description:
 */
public class Xml {

  public static void main(String[] args) throws TransformerConfigurationException {
    TransformerFactory transFactory = TransformerFactory.newInstance();
    Transformer transformer = transFactory.newTransformer();
    System.out.println(transformer);
  }

}
