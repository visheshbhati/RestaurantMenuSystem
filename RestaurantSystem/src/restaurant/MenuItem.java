package restaurant;

import java.security.InvalidParameterException;

public class MenuItem {

	private String type;
	private String name;
	private double price;
	private String description;
	
	public MenuItem(String type, String name,double price, String description){
		setType(type);
		setName(name);
		setPrice(price);
		setDescription(description); 
	}
	public String getType() {
		return type;
	}

	private void setType(String type) {
		if(type == null || type == "")
			throw new InvalidParameterException("Menu item type can not be null.");
		this.type = type;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if(name == null || type == "")
			throw new InvalidParameterException("Name can not be null.");
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	private void setPrice(double price) {
		if(price == 0.0)
			throw new InvalidParameterException("price can not be zero.");
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}
	
}
