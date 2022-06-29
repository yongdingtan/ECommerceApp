package p1.service;

import java.sql.SQLException;

import p1.dao.UserDAO;
import p1.dao.UserDAOImpl;
import p1.model.User;

public class UserServiceImpl implements UserService {
	
	UserDAO userDAO;
	
	public UserServiceImpl()
	{
		userDAO = new UserDAOImpl();
	}

	public boolean saveUser(User e) throws SQLException {
		// TODO Auto-generated method stub
		return userDAO.saveUser(e);
	}

	@Override
	public boolean validateUser(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return userDAO.validateUser(username, password);
	}

	@Override
	public String checkPassword(String username, String security_question, String answer) throws SQLException {
		// TODO Auto-generated method stub
		return userDAO.checkPassword(username, security_question, answer);
	}

	@Override
	public boolean setPassword(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return userDAO.setPassword(username, password);
	}

}
