<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>Login</h3>
		<form action="">
            <div>
            <label for="userType">User Type:</label>
            <input id="userType" type="radio" name="userType" value="user" checked required/>User
            <input id="userType" type="radio" name="userType" value="admin" required/>Admin
            </div>
			<label>User name:</label>
			<input type="text" id="userName" placeholder="Enter user name" autofocus required/><br/>
			<label>Password:</label>
			<input type="password" id="password" placeholder="Enter password" required/><br/>
			<button type="submit" class="btn btn-primary">Login</button>
		</form>
	</main>
</body>
</html>