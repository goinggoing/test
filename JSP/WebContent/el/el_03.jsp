<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>el 테스트 03</h1>
<h3>el의 컨텍스트 정보</h3>
<hr>

<%
	int localData = 100;

	pageContext.setAttribute("pageData", 200);
	request.setAttribute("requestData", 300);
	session.setAttribute("sessionData", 400);
	application.setAttribute("applicationData", 500);
%>

<%-- 스크립트릿에서 선언된 local 변수는 EL로 사용 불가 --%>
localData : ${localData }<br>

<%-- EL의 컨텍스트 정보를 다루는 내장객체들은 생략 가능 --%>
page : ${pageData }<br>
request : ${requestData }<br>
session : ${sessionData  }<br>
application : ${applicationData }<br>

<hr>
page : ${pageScope.pageData }<br>
request : ${requestScope.requestData }<br>
session : ${sessionScope.sessionData  }<br>
application : ${applicationScope.applicationData }<br>














<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>