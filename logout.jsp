<%--
  Created by IntelliJ IDEA.
  User: baranrash
  Date: 2015-10-03
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%

  session.invalidate();
  response.sendRedirect("index.jsp");
%>