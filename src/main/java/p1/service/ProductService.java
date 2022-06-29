package p1.service;

import java.sql.SQLException;
import java.util.List;

import p1.model.Product;

public interface ProductService {
	
	public List<Product> getAllProducts() throws SQLException;
	public Product getProduct(String productName) throws SQLException;
	public List<Product> getSearchProducts(String searchEntry) throws SQLException;  

}
