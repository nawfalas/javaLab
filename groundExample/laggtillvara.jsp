<%@ page import="barre.logic.Varor" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: baranrash
  Date: 2015-10-03
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%

  String vara = request.getParameter("varaid");


  ArrayList<Varor> varor = (ArrayList<Varor>) session.getAttribute("varor");
  ArrayList<Varor> kundvagn = (ArrayList<Varor>) session.getAttribute("kundvagn");
  if (varor == null ){

    varor = new ArrayList<Varor>();

  }

  if (kundvagn == null){

    kundvagn = new ArrayList<Varor>();

  }

  for (Varor v : varor){
    if(v.getId() == Integer.parseInt(vara) && v.getQuantity()>0){
      kundvagn.add(new Varor(v.getId(), v.getProductName(), 1, v.getPrice()));

      break;

    }

  }


  session.setAttribute("kundvagn", kundvagn);
  response.sendRedirect("index.jsp");


%>

