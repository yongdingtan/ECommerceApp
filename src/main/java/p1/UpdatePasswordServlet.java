package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import p1.service.UserService;
import p1.service.UserServiceImpl;

/**
 * Servlet implementation class UpdatePasswordServlet
 */
public class UpdatePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter browser = response.getWriter();
		
		String username = request.getParameter("username").trim();
		String password = request.getParameter("password").trim();
		String confirm_password = request.getParameter("confirm_password").trim();
		
		try {
			if(password.equals(confirm_password))
			{
				boolean status = userService.setPassword(username, password);
				if(status)
				{
					browser.print("Password updated successfully");
				}
				else
				{
					browser.print("Password update failed.");
				}
				
			}
			else
			{
				browser.print("Passwords do not match");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
