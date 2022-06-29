package p1.dao;

import java.sql.SQLException;
import java.util.List;

import p1.model.Product;

public interface ProductDAO {
	
	public List<Product> getAllProducts() throws SQLException;
	public Product getProduct(String productName) throws SQLException;
	public List<Product> getSearchProducts(String searchEntry) throws SQLException;
}
