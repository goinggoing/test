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

<h1>파일 목록2</h1>
<hr>

<table border="1">
<tr>
	<th>파일번호</th>
	<th>제목</th>
	<th>파일명</th>
</tr>
<c:forEach items="${list }" var="filetest">
<tr>
	<td>${filetest.fileno }</td>
	<td>${filetest.title }</td>
	<td>
		<a href="/file/download?fileno=${filetest.fileno }">
		${filetest.originName }
		</a>
	</td>
</tr>
</c:forEach>
</table>

</body>
</html>












