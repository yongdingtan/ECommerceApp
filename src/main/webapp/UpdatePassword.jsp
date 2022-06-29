<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Password</title>
</head>
<body>
<h1><u>Update Password</u></h1>
      <form action="UpdatePasswordServlet" method="post">
         <table style="with: 50%">
         <tr>
               <td>Username:</td>
               <td><input type="text" name="username" /></td>
            </tr>
            <tr>
               <td>Password:</td>
               <td><input type="password" name="password" /></td>
            </tr>
            <tr>
               <td>Confirm Password:</td>
               <td><input type="password" name="confirm_password" /></td>
            </tr>
         </table>
         <input type="submit" style="height:25px; width:100px"> 
      </form>
</body>
</html>