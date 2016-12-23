<%@page import="java.util.List"%>
<%@page import="java.lang.Thread"%>
<%@page import="jungle.web.PeopleModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>some people</title>
</head>
<body>
<h1>${peoples}</h1>
<p>
    <%
        out.println("sd1ss");
        out.println(Thread.currentThread());
    %>
<c:forEach var="item" items="${ peoples }">
<c:out value="${item.name }"/>
</c:forEach>

</p>
<table>
 <tr>
    <th>id</th>
    <th>name</th>
  </tr>
  
  <c:forEach var="item" items="${ peoples }">
  <tr>
<td><c:out value="${item.id }"/></td>
<td><c:out value="${item.name }"/></td>
</tr>
</c:forEach>
  
</table>
</body>
</html>