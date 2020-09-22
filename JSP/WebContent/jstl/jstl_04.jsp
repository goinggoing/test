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

<h1>c:if</h1>
<hr>

<c:if test="true">
	<h3>TRUE : 무조건 실행</h3>
</c:if>

<c:if test="false">
	<h3>FALSE : 무조건 실행하지 않음</h3>
</c:if>

<%	if(false) { %>
	<h3>FALSE : 무조건 실행하지 않음</h3>
<%	} %>

<hr>
<c:if test="단순 문자열">
	<h3>실행? 할까요</h3>
</c:if>
<%-- test의 속성은 문자열 타입을 사용하지만
	"true" 나 "false" 가 오도록 해야한다 --%>



<%-- 주의사항 --%>
"${10 eq 10 } "
<c:if test="${10 eq 10 }">
	<h3>출력출력</h3>
	<h3>EL 뒤에 빈 칸 넣지않도록 조심할 것, "true "가 되어버림</h3>
</c:if>

<hr>
<%	boolean bFlag = true; %>
<c:if test="<%=bFlag %>">
	<h3>표현식으로 로컬 변수값 활용하기</h3>
</c:if>

<hr>
<%-- 서블릿(Controller)가 보내준 모델을 활용 --%>
<%	request.setAttribute("userList", null); // 모델값이 null %>

<c:if test="${userList == null }">
	<h3>데이터가 없습니다</h3>
</c:if>

<c:if test="${userList != null }">
	<table>
		<tr>
			<th>사용자번호</th>
			<th>사용자이름</th>
		</tr>
	</table>
</c:if>


<hr>
<%	int	num = 30; %>
<c:if test="<%=num==30 %>">
	<h3>자바 연산결과를 이용한 조건식</h3>
</c:if>

<hr>
<c:set var="res" value="111" />
<c:if test="${res eq 111 }">
	<h3>EL 연산결과를 이용한 조건식</h3>
</c:if>


















<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>
