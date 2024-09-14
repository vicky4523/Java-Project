package entities;

public class Product {
	
	private int ProductId;
	private String Name;
	private double Price;
	private int StockQuantity;
	
	//Parametrized Constructor
	
	public Product(int productId, String name, double price, int stockQuantity) {
		ProductId = productId;
		Name = name;
		Price = price;
		StockQuantity = stockQuantity;
	}
	
	//Getters and Setters

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public int getStockQuantity() {
		return StockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		StockQuantity = stockQuantity;
	}
	
	//ToString

	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", Name=" + Name + ", Price=" + Price + ", StockQuantity="
				+ StockQuantity + "]";
	}

}