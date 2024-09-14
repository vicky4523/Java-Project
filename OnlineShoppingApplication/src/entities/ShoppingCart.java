package entities;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	
	private Map<Product, Integer> items;
	
	//Constructor is different
	
	public ShoppingCart() {
		items = new HashMap<>();
	}
	
	//Getters and Setters but in pdf its different

	public Map<Product, Integer> getItems() {
		return items;
	}

	public void addItem(Product product, int quantity) {
		items.put(product, quantity);
	}
	
	public void removeItem(Product product) {
		items.remove(product);
	}
	
	//toString method

	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + "]";
	}
	
}