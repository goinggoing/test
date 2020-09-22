<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>el 테스트 01</h1>
<hr>

<%="<h1>표현식, Expression</h1>" %>
<h1><%="표현식, Expression" %></h1>
<hr>


<%	out.print("<h1>스크립트릿, Scriptlet</h1>"); %>
<h1><%	out.print("스크립트릿, Scriptlet"); %></h1>
<hr>


${"<h1>표현언어, EL</h1>" }
<h1>${"표현언어, EL" }</h1>

















<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>