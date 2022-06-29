package p1.service;

import java.sql.SQLException;
import java.util.List;

import p1.dao.ProductDAO;
import p1.dao.ProductDAOImpl;
import p1.dao.UserDAOImpl;
import p1.model.Product;

public class ProductServiceImpl implements ProductService{
	
	ProductDAO productDAO;
	
	public ProductServiceImpl()
	{
		productDAO = new ProductDAOImpl();
	}

	@Override
	public List<Product> getAllProducts() throws SQLException {
		// TODO Auto-generated method stub
		return productDAO.getAllProducts();
	}

	@Override
	public Product getProduct(String productName) throws SQLException {
		// TODO Auto-generated method stub
		return productDAO.getProduct(productName);
	}

	@Override
	public List<Product> getSearchProducts(String searchEntry) throws SQLException {
		// TODO Auto-generated method stub
		return productDAO.getSearchProducts(searchEntry);
	}

}
