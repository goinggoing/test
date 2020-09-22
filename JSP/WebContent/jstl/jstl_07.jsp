<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>c:forTokens</h1>
<hr>

<%	String fruits = "Apple:Banana:Cherry:Durian"; %>
<c:forTokens items="<%=fruits %>" delims=":" var="f">
	${f }<br>
</c:forTokens>

<hr>
<%	String fruits2 = "Apple Banana Cherry Durian"; %>
<c:forTokens items="<%=fruits2 %>" delims=" " var="fruit">
	${fruit }<br>
</c:forTokens>

















<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>
