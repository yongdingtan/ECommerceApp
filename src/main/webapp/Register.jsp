<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<h1>Register Form</h1>
<form action="RegisterServlet" method="post">
			<table style="with: 50%">
				<tr>
					<td>Username</td>
					<td><input type="text" name="username" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Security Question</td>
					<td>
					<select name="security_question">
					<option> Name of Elementary School</option>
					<option> Mother's Maiden Name </option>
					<option> First Pet's Name</option>
					</select> </td>
				</tr>
				<tr>
					<td>Answer</td>
					<td><input type="text" name="security_question_answer" /></td>
				</tr></table>
			<input type="submit" value="Submit" /></form>
</body>
</html>