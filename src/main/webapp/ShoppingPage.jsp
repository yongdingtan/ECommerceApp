<%@page import="p1.model.Product"%>
<%@page import="p1.service.ProductService"%>
<%@page import="p1.service.ProductServiceImpl"%>
<%@page import="java.util.List"%>
<%@ page language="java"%>
<html>
   <head>
      <meta charset="ISO-8859-1">
      <title>Shopping Page</title>
   </head>
   <body>
      <%@include file="Header.jsp"%>
      <div class="topnav">
         <form action=ProductServlet method=post>
            <input type="text" name="search_entry" placeholder="Search..">
         </form>
      </div>
      <%@include file="ProductPage.jsp"%>
   </body>
</html>