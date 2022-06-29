package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import p1.model.User;
import p1.service.UserService;
import p1.service.UserServiceImpl;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	UserService userService = new UserServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter browser = response.getWriter();

		String username = request.getParameter("username").trim();
		String password = request.getParameter("password").trim();
		String securityQuestion = request.getParameter("security_question").trim();
		String securityQuestionAnswer = request.getParameter("security_question_answer").trim();
		
		User e = new User(username, password, securityQuestion, securityQuestionAnswer, null);
		browser.print(e.toString());
		try {
			boolean status = userService.saveUser(e);
			if(status == true)
			{
				browser.print("Employee "+e.getUsername()+" Saved in the Database ");
			}
			else
			{
				throw new Exception("Unknown SQL Exception ");
			}
		}
		catch (Exception e2) {
			browser.print(e2.getMessage()+"\n contact to customer care");
			browser.print("\n\n care@ncshr.com");
		}
	}

}
