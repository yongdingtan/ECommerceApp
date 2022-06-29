<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="ISO-8859-1">
      <title>Shopping App</title>
   </head>
   <body><div id = "menu" align = "middle" >
      <h1><u>Login</u></h1>
      <form action="LoginServlet" method="post">
         <table style="with: 50%">
            <tr>
               <td>Username:</td>
               <td><input type="text" name="username" /></td>
            </tr>
            <tr>
               <td>Password:</td>
               <td><input type="password" name="password" /></td>
            </tr>
         </table>
         <input type="submit" style="height:25px; width:100px"> 
      </form>
      <form action ="RegisterServlet" method="get">
         <a href="Register.jsp">Register User</a>   <a href="ForgotPassword.jsp">Forgot Password</a>
      </form>
      </div>
   </body>
</html>