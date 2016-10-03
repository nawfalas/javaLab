<%@ page import="barre.logic.User" %>
<%@ page import="barre.logic.Varor" %>

<%@ page import="java.util.ArrayList" %>
<%@ page import="barre.logic.Faced" %>
<html>
<head>
    <title>Barres Webbshop</title>
    <link rel="stylesheet" type="text/css" href="styles/main.css">

</head>

<body>

<header>
    <nav>
        <h1>Barres Webbshop</h1>
        <ul>
            <li> Shoppa</li>

            <li><a href="kundvagn.jsp">Shopping Korg</a></li>
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

<%
    User u = (User) session.getAttribute("user");

    if (u != null) {
%>
<h1><%="Welcome " + u.getUsername()%> </h1>

<%}%>

<%


    ArrayList<Varor> varor = Faced.getVaror();

    session.setAttribute("varor", varor);

%>

<%

    for (Varor vara : varor) {
%>

<%=vara.getPrice()%><br>
<%=vara.getProductName()%><br>
<%=vara.getQuantity()%><br>
<% if (session.getAttribute("user") != null) {%>
<form action="laggtillvara.jsp" method="post">
    <input type="hidden" name="varaid" value="<%=vara.getId()%>">
    <input type="submit" value=" <%if (vara.getQuantity() > 0){ %><%="Buy"%> <%}else{%> <%="Out of stock"%><%}%>">

</form>
<%
        }
    }
%>
</body>
</html>
