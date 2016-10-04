<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Webshop</title>
<link rel="stylesheet" href="resources/css/theme.css" />

<meta charset="utf-8">
<title>jQuery UI Draggable - Default functionality</title>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">

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
				if (request.getAttribute("firstname_error") != null) {
			%>
			<li class="error">First name error</li>
			<%
				}
			%>

			<%
				if (request.getAttribute("lastname_error") != null) {
			%>
			<li class="error">Last name error</li>
			<%
				}
			%>

			<%
				if (request.getAttribute("email_error") != null) {
			%>
			<li class="error">Email error</li>
			<%
				}
			%>
			<%
				if (request.getAttribute("streetName_error") != null) {
			%>
			<li class="error">Address error</li>
			<%
				}
			%>
			<%
				if (request.getAttribute("city_error") != null) {
			%>
			<li class="error">City error</li>
			<%
				}
			%>
			<%
				if (request.getAttribute("postCode_error") != null) {
			%>
			<li class="error">Post code error, only numbers allowed</li>
			<%
				}
			%>
			<%
				if (request.getAttribute("country_error") != null) {
			%>
			<li class="error">Country error</li>
			<%
				}
			%>
			<%
				if (request.getAttribute("date_format_error") != null) {
			%>
			<li class="error">Date of birth error</li>
			<%
				}
			%>

		
		</ul>
	</fieldset>
	<%
		}
	%>

	<!-- <h2>Welcome to my webbpage</h2>> -->
	<div align="center">
		<div class="container">
			<div class="title">Create a user login</div>
			<fieldset>
				<legend class="titleLogin">User details</legend>
				<form action="AddUser" method="post">

					<div class="inputfield">
						<label for="first-name" class="inputLabel">First name:</label> <input
							name="first-name" type="text" placeholder="First Name"></input>
					</div>

					<div class="inputfield">
						<label for="last-name" class="inputLabel">Last name:</label> <input
							name="last-name" type="text" placeholder="Last Name"></input>
					</div>

					<div class="inputfield">
						<label for="email" class="inputLabel">Email Address:</label> <input
							name="email" type="text" placeholder="name@email.com"></input>
					</div>

					<div class="inputfield">
						<label for="street-name" class="inputLabel"> Address:</label> <input
							name="street-name" type="text" placeholder="heystreet 22"></input>
					</div>
					<div class="inputfield">
						<label for="city" class="inputLabel">City:</label> <input
							name="city" type="text" placeholder="city"></input>
					</div>

					<div class="inputfield">
						<label for="post-code" class="inputLabel">Post code:</label> <input
							name="post-code" type="text" placeholder="eg: 555 33"></input>
					</div>

					<div class="inputfield">
						<label for="country" class="inputLabel">Country:</label> <input
							name="country" type="text" placeholder="eg: Sweden"></input>
					</div>

					<div class="inputfield">
						<label for="dob" class="inputLabel">Date of birth:</label> <input
							name="dob" type="text" placeholder="DD/MM/YYYY"></input>
					</div>

					<div class="inputfield">
						<label for="gender" class="inputLabel">Gender:</label> <select
							name="gender">
							<option value="Male">Male</option>
							<option value="Female">Female</option>
						</select>
					</div>
			</fieldset>
			<div class="inputField" id="submitField">
				<input id="submitBtn" type="submit" value="Create user"></input>
			</div>
			</form>

		</div>
	</div>



</body>
</html>