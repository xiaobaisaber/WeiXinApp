<%@ page language="java" import="java.sql.*,java.io.*,java.util.*"%>
<%@ page contentType="text/html;charset=utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<title>测试</title>
    <%@ page isELIgnored="false" %>
  </head>
  
  <body>
  <c:forEach items="${user}" var="item" >
    userId:<c:out value="${item.id}"/>
    <br>
    username:<c:out value="${item.username}"/>
    <br>
  </c:forEach>
  </body>
</html>

