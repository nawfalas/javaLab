<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel="stylesheet" href="resources/css/theme.css"/>

 <nav>
    <h1>Webshop</h1>
    <ul>
      <li> <a href="AddUser">Sign up</a></li>

      <li><a href="UserLogin">User login</a></li>
    </ul>
  </nav>

</head>
<body>
<%
		if (request.getAttribute("errors") != null) {
	%>
	<fieldset>
		<legend>Errors</legend>
		<ul>
			<%
				if (request.getAttribute("email_error") != null) {
			%>
			<li class="error">Email error</li>
			<%
				}
			%>
		</ul>
	</fieldset>
	<%
		}
	%>




<div align="center">
<div class="container">
	<div class="inputfield">
		<label for ="username" class="inputLabel">Username(email):</label>
		<input name="username" type="text"></input>
	</div>
	<div class="inputfield">
		<label for ="password" class="inputLabel">Password:</label>
		<input name="password" type="text"></input>
	</div>
	<div class="inputField" id="submitField">
		<input id="submitBtn" type="submit" value ="Submit"></input>
	</div>
	
</div>
</div>
</body>
</html>