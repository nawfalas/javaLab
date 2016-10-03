<%--
  Created by IntelliJ IDEA.
  User: baranrash
  Date: 2015-10-02
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="barre.logic.User" %>
<%@ page import="java.lang.*" %>
<%@ page import="barre.logic.Faced" %>
   
<%

    String username = request.getParameter("username");
    String password = request.getParameter("password");


  User user = Faced.checkLogin(username, password);

    if(user != null){
        session.setAttribute("user", user);
        response.sendRedirect("index.jsp");
    }else{

        response.sendRedirect("login.jsp");

    }

%> 
