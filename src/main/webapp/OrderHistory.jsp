<%@page import="p1.model.Product"%>
<%@page import="p1.service.ProductService"%>
<%@page import="p1.service.ProductServiceImpl"%>
<%@page import="java.util.List"%>
<%@ page language="java"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
</head>
<body>
<div id = "menu" align = "middle" >
   <h1><u>Cart</u></h1>
<%List<Product> allProducts = (List<Product>)session.getAttribute("products"); %>
<% if(allProducts==null || allProducts.equals(null)) %>Test
<% else %>

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
                 </tr>
               <%}%>
            </tbody>
         </table>
</div>
</body>
</html>