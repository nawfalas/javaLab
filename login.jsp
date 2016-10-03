<%--
  Created by IntelliJ IDEA.
  User: baranrash
  Date: 2015-10-02
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="barre.logic.User" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Login Barres webshop</title>
  <link rel="stylesheet" type="text/css" href="styles/main.css">
</head>
<body>
<header>
  <nav>
    <h1>Barres Webbshop</h1>
    <ul>
      <li> <a href="index.jsp">Shoppa</a></li>

      <li><a href="kundvagn.jsp">Shopping Korg</a></li>

      <li>Logga in</li>
      <li><a href="kontakt.jsp">Kontakt</a></li>

    </ul>
  </nav>
</header>

<h1>Logga in</h1>
<form action="checkLogin.jsp" method="post">
  <br/>Username:<input type="text" name="username">
  <br/>Password:<input type="password" name="password">
  <input type="submit" value="Logga in">
</form>


</body>
</html>
