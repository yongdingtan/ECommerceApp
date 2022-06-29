package p1.model;

public class Product {
	
	String productName;
	String processor;
	String hDDSize;
	String ramSize;
	int price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, String processor, String hDDSize, String ramSize, int price) {
		super();
		this.productName = productName;
		this.processor = processor;
		this.hDDSize = hDDSize;
		this.ramSize = ramSize;
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String gethDDSize() {
		return hDDSize;
	}
	public void sethDDSize(String hDDSize) {
		this.hDDSize = hDDSize;
	}
	public String getRamSize() {
		return ramSize;
	}
	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", processor=" + processor + ", hDDSize=" + hDDSize
				+ ", ramSize=" + ramSize + ", price=" + price + "]";
	}
	
	
}
