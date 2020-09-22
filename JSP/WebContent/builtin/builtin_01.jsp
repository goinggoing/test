<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>입출력 내장 객체</h1>
<hr>
<h3>request 객체</h3>

<%	String uri = request.getRequestURI(); %>
URI : <%=uri %><br>

METHOD : <%=request.getMethod() %><br>

ServerName : <%=request.getServerName() %><br>

Protocol : <%=request.getProtocol() %><br>

Context Path : <%=request.getContextPath() %><br>

Parameter : <%=request.getParameter("data") %><br>

<hr>
<h3>response 객체</h3>

<%
	//content-type 설정
	response.setContentType("text/html; charset=euc-kr");

	//redirection 수행
// 	response.sendRedirect("/basicTag/jsp_05.jsp");
%>

<hr>
<h3>out 객체</h3>

<%	out.println("브라우저에 출력되는 내용"); %><br>

<%="이렇게 사용해도 출력됨" %><br>

HTML 코드를 작성할 땐 그냥 적어도 됨














<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>















