<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
   <%@page import="p1.model.Product"%>
<%@page import="p1.service.ProductService"%>
<%@page import="p1.service.ProductServiceImpl"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="ISO-8859-1">
      <title>Search</title>
   </head>
   <body>
   <div class="middle" align="middle">
   <form action=CartServlet method=post>
      <%@include file="Header.jsp"%>
       <h1>Searched Products</h1>
         <%List<Product> searchedProducts = (List<Product>)session.getAttribute("searched_products");%>
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
                  for(Product t : searchedProducts)
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