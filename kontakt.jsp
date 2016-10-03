<%--
  Created by IntelliJ IDEA.
  User: baranrash
  Date: 2015-10-02
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title> kontakter - Barres Webbshopp</title>
  <link rel="stylesheet" type="text/css" href="styles/main.css">

</head>

<body>
<header>
  <nav>
    <h1>Barres Webbshop</h1>
    <ul>
      <li> <a href="index.jsp">Shoppa</a></li>

      <li><a href="kundvagn.jsp">Shopping Korg</a></li>
      <%
        if (session.getAttribute("user") == null) {
      %>
      <li><a href="login.jsp">Logga in</a></li>
      <% } else { %>
      <li><a href="logout.jsp">Logout</a></li>
      <%}%>
      <li>Kontakt</li>

    </ul>
  </nav>
</header>
<h3>Telefonnummer :0000000</h3>
<h4>100% pålitlig sida</h4>

</body>
</html>
