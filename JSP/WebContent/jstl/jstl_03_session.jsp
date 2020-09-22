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

<h1>c:set</h1>
<h3>세션 데이터 확인</h3>
<hr>

세션 데이터 : ${sessionData }<br>

<a href="./jstl_03.jsp">이전페이지</a>

<hr>
<h3>맵 데이터 확인</h3>
A key : <c:out value='${sessionScope.m.get("A") }' /><br>
B key : <c:out value='${m.get("B") }' /><br>
A key : ${m.get("A") }<br>
B key : ${m.B }<br>

<%	out.print(
		((Map)request.getSession().getAttribute("m")).get("A") ); %>

<hr>
User 객체 : <c:out value="${userSession }" />

<hr>
id : <c:out value="${userSession.id }" /><br>
pw : <c:out value="${userSession.pw }" />






















<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>
