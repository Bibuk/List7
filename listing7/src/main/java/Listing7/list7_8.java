package Listing7;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class list7_8 {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Usage: java Transform имя_файла_xsl имя_файла_xml");
            System.exit(0);
        }

        File xslFile = new File(args[0]);
        File xmlFile = new File(args[1]);

        StreamSource xslSource = new StreamSource(xslFile);
        StreamSource xmlSource = new StreamSource(xmlFile);
        StreamSource outResult = new StreamSource(System.out);

        try {
            TransformerFactory factory =
                          TransformerFactory.newInstance();
            TransformerFactory transformer = factory.newTransformer(xslSource);

            transformer.tranform(xmlSource, outResult);
        }catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
