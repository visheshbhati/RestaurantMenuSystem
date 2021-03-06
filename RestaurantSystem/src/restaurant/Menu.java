package restaurant;

import java.util.ArrayList;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

public class Menu {
	public static ArrayList<MenuItem> Load(String menuXmlPath)
			throws ParserConfigurationException, SAXException, IOException {
		File inputFile = new File(menuXmlPath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(inputFile);
		doc.getDocumentElement().normalize();
		NodeList nList = doc.getElementsByTagName("item");
		ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				String menuItemType = eElement.getAttribute("type");
				String menuItemName = eElement.getElementsByTagName("name").item(0).getTextContent();
				Double menuItemPrice = Double.parseDouble(eElement.getElementsByTagName("price").item(0).getTextContent());
				String menuItemDescription = eElement.getElementsByTagName("description").item(0).getTextContent();
				
				MenuItem menuItem = new MenuItem(menuItemType, menuItemName, menuItemPrice, menuItemDescription);
				menuItems.add(menuItem);
			}
		}
		return menuItems;
	}
}
