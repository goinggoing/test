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

<h1>c:out</h1>
<hr>

<c:out value="Hello! JSTL!" />
<hr>

eldata : <c:out value="${eldata }" /><br>
empty eldata : <c:out value="${empty eldata }" />
<hr>

<c:out value="null" default="null값 출력" /><br>
<c:out value="${eldata }" default="eldata가 없음, null" /><br>
<c:out value="${null }" default="EL을 이용한 null 출력"/><br>

<c:out value="<%=null %>" default="Expression을 이용한 null 출력"/><br>
<hr>

<c:out value="<h3>태그 출력</h3>" /> <!-- escapeXml="true" -->
<c:out value="<h3>태그 출력</h3>" escapeXml="false" />

<%="<h3>태그 출력</h3>" %>
<%="&lt;h3&gt;태그 출력&lt;/h3&gt;" %><br>

&lt;하이&gt;<br>
&laquo;<br>
&raquo;<br>
<hr>

<%	String str = "테스트 문자열"; %>
str 출력 : <c:out value="${str }" /><br>
str 출력 : <c:out value="${pageScope.str }" /><br>

<hr>
<%	pageContext.setAttribute("str", str); %>
str 출력 : <c:out value="${str }" /><br>
str 출력 : <c:out value="${pageScope.str }" /><br>
${str }

<hr>
<%	pageContext.setAttribute("tagStr", "<h3>태그포함문자열</h3>"); %>
${tagStr }

<c:out value="${tagStr }" />

<hr>

<c:out value="<% out.println(123); %>" /><br>
<c:out value="<% out.println(123); %>" escapeXml="false"/><br>

<%-- JSTL 속성값은 EL, Expression만 사용한다 --%>
<%-- JSTL 속성값으로 스크립트릿을 사용할 수 없다 --%>

















<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>