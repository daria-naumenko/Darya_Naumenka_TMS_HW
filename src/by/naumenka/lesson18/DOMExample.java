package by.naumenka.lesson18;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMExample {

    public static void main(String[] args) {
        try {
            // Создается построитель документа
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            // Создается дерево DOM документа из файла
            Document document = builder.parse("src/author.xml");

            // Получаем корневой элемент
           Node root = document.getDocumentElement();
            //NodeList authorElements = document.getDocumentElement().getElementsByTagName("author");
            // Просматриваем все подэлементы корневого - т.е. книги
            NodeList authorElements = root.getChildNodes();
            for (int i = 0; i < authorElements.getLength(); i++) {
                Node author = authorElements.item(i);
                // Если нода не текст, то это книга - заходим внутрь
                if (author.getNodeType() != Node.TEXT_NODE) {
                    NodeList attributes = author.getChildNodes();
                    for(int j = 0; j < attributes.getLength(); j++) {
                        Node attribute = attributes.item(j);
                        // Если нода не текст, то это один из параметров книги - печатаем
                        if (attribute.getNodeType() != Node.TEXT_NODE) {
                            System.out.println(attribute.getNodeName() + ":" + attribute.getChildNodes().item(0).getTextContent());
                        }
                    }
                    System.out.println("===========>>>>");
                }
            }

        } catch (ParserConfigurationException ex) {
            ex.printStackTrace(System.out);
        } catch (SAXException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}