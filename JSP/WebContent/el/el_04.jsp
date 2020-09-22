<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>el 테스트 04</h1>
<h3>el의 Parameter 정보</h3>
<hr>

<h3>표현언어</h3>
전달받은 id : ${param.id }<br>
전달받은 pw : ${param.pw }<br>

<hr>
<h3>표현식</h3>
전달받은 id : <%=request.getParameter("id") %><br>
전달받은 pw : <%=request.getParameter("pw") %><br>

<hr>
<h3>스크립트릿</h3>
전달받은 id : <% out.print(request.getParameter("id")); %><br>
전달받은 pw : <% out.print(request.getParameter("pw")); %><br>











<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>