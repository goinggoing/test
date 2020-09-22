<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>page 객체</h1>
<hr>
<h3>사용하지 않는다</h3>

<hr>
<h1>config 객체</h1>
<h3>설정 정보 객체</h3>

서블릿 이름 : <%=config.getServletName() %><br>

서블릿 컨텍스트 : <%=config.getServletContext() %><br>

서블릿 버전 : <%=config.getServletContext().getMajorVersion() %>




















<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>
