<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 선언, Declaration 태그 --%>
<%!	String name = "Alice"; //멤버필드 %>

<%! private int age = 11; %>

<%! public void method() {
		System.out.println("Hello " + name);
	} %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% method(); //메소드 호출 %>

</body>
</html>









