<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>el 테스트 02</h1>
<h3>el의 자료형</h3>
<hr>

정수형 : ${123 }<br>
실수형 : ${123.456 }<br>
단일문자 : ${'A' }<br>
문자열 : ${"Apple" }<br>
논리형 : ${true }&nbsp;&nbsp;&nbsp;&nbsp;${false }<br>
null : ${null }<br>
<hr>

${123 eq 123 }<br>

${10 > 20 }<br>
${10 gt 20 }<br>

<%-- ${10 div 4 }<br> --%>

${empty str }<br>
<hr>

<%	int num = 333; %>

num : ${num }<br>
empty num : ${empty num }<br>
<hr>

<%	pageContext.setAttribute("num", num); %>
num : ${num }<br>
empty num : ${empty num }<br>
<hr>

<%	pageContext.setAttribute("data", "Banana"); %>
data : ${data }<br>
empty data: ${empty data }<br>
<hr>













<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>