<%@ page import="java.util.ArrayList" %>
<%@ page import="barre.logic.Varor" %>
<%--
  Created by IntelliJ IDEA.
  User: baranrash
  Date: 2015-10-03
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<title> kontakter - Barres Webbshopp</title>
<link rel="stylesheet" type="text/css" href="styles/main.css">
<header>
  <nav>
    <h1>Barres Webbshop</h1>
    <ul>
      <li><a href="index.jsp">Shoppa</a></li>

      <li><a href="#">Kundvagn</a></li>
      <%
        if (session.getAttribute("user") == null) {
      %>
      <li><a href="login.jsp">Logga in</a></li>
      <% } else { %>
      <li><a href="logout.jsp">Logout</a></li>
      <%}%>
      <li><a href="kontakt.jsp">Kontakt</a></li>

    </ul>
  </nav>
</header>
<body>
<%

  ArrayList<Varor> varor = (ArrayList<Varor>) session.getAttribute("kundvagn");

  if (varor == null){
    %>
    Du har inte lagt något i din kundvagn.
<%

  }

  else{

    for (Varor vara : varor) {
%>

      <%=vara.getPrice()%><br>
      <%=vara.getProductName()%><br>
      <%=vara.getQuantity()%><br><br>
<%

  }}

%>

</body>
</html>
