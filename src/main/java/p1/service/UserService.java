package p1.service;

import java.sql.SQLException;

import p1.model.User;

public interface UserService {
	
	public boolean saveUser(User e) throws SQLException;
	public boolean validateUser(String username,String password) throws SQLException;
	public String checkPassword(String username, String security_question, String answer) throws SQLException;
	public boolean setPassword(String username, String password) throws SQLException;

}
