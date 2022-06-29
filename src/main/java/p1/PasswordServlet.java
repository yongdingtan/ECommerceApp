package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import p1.service.UserService;
import p1.service.UserServiceImpl;

/**
 * Servlet implementation class PasswordServlet
 */
public class PasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter browser = response.getWriter();
		
		String username = request.getParameter("username").trim();
		String securityQuestion = request.getParameter("security_question").trim();
		String securityQuestionAnswer = request.getParameter("security_question_answer").trim();
		
		try {
			String password = userService.checkPassword(username, securityQuestion, securityQuestionAnswer);
			if(password.length()>0)
			{
				browser.print("Your password is "+password);
			}
			else
			{
				browser.print("Invalid Credentials");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
