package entities;

public class ProductQuantityPair {
	
	private Product product;//Product is a class and product is a attribute
	private int Quantity;
	
	//Parametrised Constructor
	public ProductQuantityPair(Product product, int quantity) {
		super();
		this.product = product;
		Quantity = quantity;
	}
	
	//Getters and Setters

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
}