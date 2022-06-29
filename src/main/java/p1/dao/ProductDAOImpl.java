package p1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import p1.model.Product;

public class ProductDAOImpl implements ProductDAO{
	
Connection con;
	
	public ProductDAOImpl() {
		
		con = MySQLConnection.mySql;
	}

	@Override
	public List<Product> getAllProducts() throws SQLException {
		List<Product> allProducts = new ArrayList<>();
		
		String query = "select * from shopapp.product";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rowsAffected = ps.executeQuery();
		
		while(rowsAffected.next()) {
			Product e = new Product();
			e.setProductName(rowsAffected.getString("productName"));
			e.setProcessor(rowsAffected.getString("processor"));
			e.sethDDSize(rowsAffected.getString("hDDSize"));
			e.setRamSize(rowsAffected.getString("ramSize"));
			e.setPrice(rowsAffected.getInt("price"));
			
			allProducts.add(e);
		}
		return allProducts;
	}

	@Override
	public Product getProduct(String productName) throws SQLException {
		Product p = new Product();
		
		String query = "select * from shopapp.product where productName = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, productName);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			p.setProductName(rs.getString("productName"));
			p.setProcessor(rs.getString("processor"));
			p.sethDDSize(rs.getString("hDDSize"));
			p.setRamSize(rs.getString("ramSize"));
			p.setPrice(rs.getInt("price"));
			
		}
		return p;
	}

	@Override
	public List<Product> getSearchProducts(String searchEntry) throws SQLException {
		List<Product> searchProducts = new ArrayList<>();
		
		String query="select * from shopapp.product where productName LIKE '%"+searchEntry+"%'";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			Product e = new Product();
			e.setProductName(rs.getString("productName"));
			e.setProcessor(rs.getString("processor"));
			e.sethDDSize(rs.getString("hDDSize"));
			e.setRamSize(rs.getString("ramSize"));
			e.setPrice(rs.getInt("price"));
			
			searchProducts.add(e);
		}
		
		return searchProducts;
	}

}
