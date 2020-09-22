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

<h1>c:set</h1>
<hr>

<!-- 세션 컨텍스트 정보 삽입 -->
<c:set var="sessionData" value="SESSION_DATA_123123123" scope="session" />

<a href="./jstl_03_session.jsp">세션 확인</a>

<hr>
<%-- Map 생성 --%>
<%	Map map = new HashMap(); %>

<%-- JSTL을 이용한 Map의 프로퍼티 삽입(put) --%>
<c:set target="<%=map %>" property="A" value="Alice" />
<c:set target="<%=map %>" property="B" value="Bob" />

<%-- 맵의 프로퍼티 출력 --%>
A Key : <%=map.get("A") %><br>
B Key : ${map.B }<br>

<%-- JSTL을 이용한 page 컨텍스트 정보 등록 --%>
<c:set var="m" value="<%=map %>" />

<%-- 맵의 프로퍼티 출력 --%>
A Key : <%=map.get("A") %><br>
B Key : ${m.B }<br>
<hr>


<%-- 맵을 session 컨텍스트 정보로 등록 --%>
<c:set var="m" value="<%=map %>" scope="session" />

<hr>

<%-- User DTO를 이용한 자바 빈 생성 --%>
<jsp:useBean id="userBean" class="dto.User" />
${userBean }<br>

<%-- 자바 빈의 프로퍼티에 값 넣기 --%>
<c:set target="<%=userBean %>" property="id" value="AAA" />
<jsp:setProperty property="pw" name="userBean" value="BBB" />

<%	userBean.setPw("BBBBB"); %>


<%-- 자바 빈의 프로퍼티값 출력 --%>
<c:out value="<%=userBean.getId() %>" /><br>
<c:out value="${userBean.pw }" /><br>
<c:out value="${userBean.getId() }" /><br>


<%-- 자바빈을 세션 컨텍스트로 등록 --%>
<c:set var="userSession" value="<%=userBean %>" scope="session"/>





<%-- 모든 컨텍스트 영역에서 "sessionData"로 등록된 변수 제거 --%>
<c:remove var="sessionData" />

<%	session.removeAttribute("sessionData"); %>

<%	pageContext.removeAttribute("A"); %>
<%	request.removeAttribute("B"); %>
<%	application.removeAttribute("C"); %>

<c:remove var="A" scope="page" />
<c:remove var="B" scope="request" />
<c:remove var="C" scope="application" />













<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>
