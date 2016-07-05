package restaurant;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class MainClass {

	public static void main(String[] args){
		ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
		try {
			menuItems = Menu.Load("C:/Users/vishesh/Desktop/menu.xml");
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
