<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>fmt:formatDate</h1>
<hr>

<c:set var="now" value="<%=new Date() %>" />

now : ${now }

<hr>
default : <fmt:formatDate value="${now }" type="date" dateStyle="default"/><br> 
short : <fmt:formatDate value="${now }" type="date" dateStyle="short"/><br>
medium : <fmt:formatDate value="${now }" type="date" dateStyle="medium"/><br>
long : <fmt:formatDate value="${now }" type="date" dateStyle="long"/><br>
full : <fmt:formatDate value="${now }" type="date" dateStyle="full"/><br>

<hr>
default : <fmt:formatDate value="${now }" type="time" timeStyle="default"/><br> 
short : <fmt:formatDate value="${now }" type="time" timeStyle="short"/><br>
medium : <fmt:formatDate value="${now }" type="time" timeStyle="medium"/><br>
long : <fmt:formatDate value="${now }" type="time" timeStyle="long"/><br>
full : <fmt:formatDate value="${now }" type="time" timeStyle="full"/><br>

<hr>
<fmt:formatDate value="${now }" type="both"/><br>

<fmt:formatDate value="${now }" type="both"
 dateStyle="full" timeStyle="long"/><br>


<hr>
yyyy-MM-dd : <fmt:formatDate value="${now }" pattern="yyyy-MM-dd" /><br>

HH:mm:ss.S : <fmt:formatDate value="${now }" pattern="HH:mm:ss.S" /><br>

KK:mm:ss : <fmt:formatDate value="${now }" pattern="KK:mm:ss" /><br>

<hr>
<%-- 날짜/시간 입력한 변수 만들기 --%>
<c:set var="testTime"
 value="<%=new GregorianCalendar(2020, 0, 1, 0, 0, 0).getTime() %>" />

testTime : ${testTime }<br>

<fmt:formatDate value="${testTime }" type="both" />


<hr>

오전/오후 : <fmt:formatDate value="${now }" pattern="a" /><br>

z : <fmt:formatDate value="${now }" pattern="z" /><br>
Z : <fmt:formatDate value="${now }" pattern="Z" /><br>
X : <fmt:formatDate value="${now }" pattern="X" /><br>
















<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>
