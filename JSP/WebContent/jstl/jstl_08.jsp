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

<c:import url="/basicTag/jsp_header.jsp" />

<h1>c:import</h1>
<hr>

<%-- <c:import url="https://www.youtube.com" /> --%>
<%-- <c:import url="https://www.naver.com" /> --%>


<c:import url="https://search.naver.com/search.naver">
	<c:param name="query" value="정국" />
</c:import>



<c:import url="/basicTag/jsp_footer.jsp" />

<iframe width="560" height="315" src="https://www.youtube.com/embed/0LeEYW4iY20" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>










<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>
