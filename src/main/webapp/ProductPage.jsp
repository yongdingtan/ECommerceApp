<%@page import="p1.model.Product"%>
<%@page import="p1.service.ProductService"%>
<%@page import="p1.service.ProductServiceImpl"%>
<%@page import="java.util.List"%>
<%@ page language="java"%>
<html>
   <head>
      <meta charset="ISO-8859-1">
   </head>
   <body>
   <form action=CartServlet method=post >
      <div id = "menu" align = "middle" >
       <h1><u>All Products</u></h1>
         <%
            ProductService productService = new ProductServiceImpl();
            List<Product> allProducts = productService.getAllProducts();
            %>
         <hr/>
         <table class="table table-hover">
            <thead>
               <tr>
                  <th>Name</th>
                  <th>Processor</th>
                  <th>HDD Size</th>
                  <th>Ram Size</th>
                  <th>Price</th>
               </tr>
            </thead>
            <tbody>
               <%
                  for(Product t : allProducts)
                  {
                  	%>
               <tr>
                  <td>     <%=t.getProductName() %> </td>
                  <td>     <%=t.getProcessor() %></td>
                  <td>     <%=t.gethDDSize() %> </td>
                  <td>     <%=t.getRamSize() %> </td>
                  <td>    $<%=t.getPrice() %> </td> 
                  <td> <button class="uk-button" name="product_name" value=<%=t.getProductName() %>>Add to Cart</button> </td>
               </tr>
               <%}%>
            </tbody>
         </table>
      </div>
      </form>
   </body>
</html>