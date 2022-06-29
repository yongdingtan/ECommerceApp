package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import p1.service.UserService;
import p1.service.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter browser = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isValidUser;
		try {
			isValidUser = userService.validateUser(username, password);
			if(isValidUser)
			{
				HttpSession session = request.getSession(true);
				
				
				session.setAttribute("username", username);
				
				response.sendRedirect("ShoppingPage.jsp");;
				
			}
			else
			{
				browser.print("Invalid credentials");
				response.sendRedirect("LoginPage.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
