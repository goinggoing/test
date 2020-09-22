<%@page import="dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>액션태그 테스트</h1>
<h3>useBean</h3>

<hr>
<%
	//스크립트릿을 이용한 객체 생성
	User user1 = new User();

	//page scope의 컨텍스트 정보로 삽입
	pageContext.setAttribute("user1", user1); //자바 빈으로 등록
%>


<%-- 액션태그를 이용한 자바 빈 객체 생성 --%>
<jsp:useBean id="user2" class="dto.User" scope="session" />


<%-- 생성된 자바빈 브라우저에 출력하기 --%>
<%-- user1 : <%=user1 %><br> --%>
<%-- user2 : <%=user2 %><br> --%>

user1 : <%=pageContext.getAttribute("user1") %><br>
user2 : <%=session.getAttribute("user2") %><br>


<%-- 자바빈 객체에 프로퍼티 값 설정하기 --%>
<jsp:setProperty property="id" name="user1" value="id1" />
<jsp:setProperty property="pw" name="user1" value="pw1" />

<jsp:setProperty property="id" name="user2" value="id2" />
<jsp:setProperty property="pw" name="user2" value="pw2" />

<hr>
user1 : <%=pageContext.getAttribute("user1") %><br>
user2 : <%=session.getAttribute("user2") %><br>



<hr>
user2.id : <%=((User)session.getAttribute("user2")).getId() %><br>
user2.pw : <jsp:getProperty property="pw" name="user2" /><br>














<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>

