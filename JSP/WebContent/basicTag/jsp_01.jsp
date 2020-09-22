<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Hello JSP!</h3>

<%
	//자바 주석
	//스크립트릿 변수 테스트
	String scriptlet = "HI";
	System.out.println(scriptlet);
%>
<hr>
<%	for(int i=0; i<3; i++) { %>
		<h3>스크립트릿 + HTML</h3>
<%	} %>

<hr>
<%-- <%	private int data = 10; %> --%>

<hr>
<%-- <%	public void method() { --%>
<%-- }	%> --%>

</body>
</html>









