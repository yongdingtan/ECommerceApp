package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import p1.model.Product;
import p1.service.ProductService;
import p1.service.ProductServiceImpl;
import p1.service.UserService;
import p1.service.UserServiceImpl;

/**
 * Servlet implementation class CartServlet
 */
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductService productService = new ProductServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
	List<Product> allProducts = new ArrayList<>();
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		
		
		String productName = request.getParameter("product_name");
		try {
			Product e = productService.getProduct(productName);
			allProducts.add(e);
			request.getSession().setAttribute("products", allProducts);
			response.sendRedirect("ShoppingPage.jsp");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.print("<thead>");
        pw.print("<tr>");
        pw.print("<th>Name</th>");
        pw.print("<th>Processor</th>");
        pw.print("<th>HDD Size</th>");
        pw.print("<th>Ram Size</th>");
        pw.print("<th>Price</th>");
        pw.print("</tr>");
        pw.print("</thead>");
		
		for(Product t : allProducts)
         {
         	
            pw.print("<%="+t.getProductName()+" %> </td>");
            pw.print("<%="+t.getProcessor()+" %></td>");
            pw.print("<%="+t.gethDDSize()+" %> </td>");
            pw.print("<%="+t.getRamSize()+" %> </td>");
            pw.print("$<%="+t.getPrice()+" %> </td>"); 
         
         }
	
	}

}
