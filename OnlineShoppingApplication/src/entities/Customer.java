package entities;

//check??

import java.util.ArrayList;
import java.util.List; // For the list of orders

public class Customer extends User {// inherits properties from user
	
	private String Address;
	private ShoppingCart shoppingcart;  // Shopping Cart is a Class
	private List<Order> Orders; //Here Order is a class and orders is attribute name
	
	//Usage of default constructor so that user can inherit the parameters here

	public Customer(int userId, String username, String email, String address) {
		super(userId, username, email); //usage of super??
		Address = address;
		
		//These two lines why?
		this.shoppingcart = new ShoppingCart();
		this.Orders = new ArrayList<>();
	}
	
	//Getters and Setters

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public ShoppingCart getShoppingcart() {
		return shoppingcart;
	}

	//Setter is not required for shopping cart and order why??

	public List<Order> getOrders() {
		return Orders;
	}

	public void addOrder(Order order) {
		order.add(order);
	}
	
}