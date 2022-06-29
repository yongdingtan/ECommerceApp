package p1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import p1.model.User;

public class UserDAOImpl implements UserDAO{
	
	Connection con;
	
	public UserDAOImpl() {
		
		con = MySQLConnection.mySql;
	}

	@Override
	public boolean saveUser(User e) throws SQLException {
		String query = "insert into shopapp.user values(?,?,?,?);";
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, e.getUsername());
		ps.setString(2, e.getPassword());
		ps.setString(3, e.getSecurityQuestion());
		ps.setString(4, e.getSecurityQuestionAnswer());
		
		int rowsAffected = ps.executeUpdate();
		
		boolean status = (rowsAffected == 1)?true:false;
		
		return status;
	}

	@Override
	public String checkPassword(String username, String security_question, String answer) throws SQLException {
		// TODO Auto-generated method stub
		String password = "";
		String query = "select password from shopapp.user where username = ? AND securityQuestion = ? AND securityQuestionAnswer = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, username);
		ps.setString(2, security_question);
		ps.setString(3, answer);
		ResultSet rowsAffected = ps.executeQuery();
		if(rowsAffected.next()) {
			password = rowsAffected.getString("password");
		}
		
		return password;
	}
	
	@Override
	public boolean validateUser(String username,String password) throws SQLException
	{
		boolean status = false;
		String query = "select * from shopapp.user where username = ? AND password = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, username);
		ps.setString(2, password);
		
		ResultSet rowsAffected = ps.executeQuery();
		
		if (rowsAffected.next() == false) {
	        status = false;
	      } else {

	        do {
	          status = true;
	        } while (rowsAffected.next());
	      }	
		return status;
	}

	@Override
	public boolean setPassword(String username, String password) throws SQLException {
		boolean status = false;
		
		String query = "update shopapp.user set password = ? where username = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, password);
		ps.setString(2, username);
		
		int rowsAffected = ps.executeUpdate();
		
		status = (rowsAffected==1)?true:false;
		
		return status;
	}

}
