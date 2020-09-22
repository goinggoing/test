<%@page import="dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/basicTag/jsp_header.jsp" />

<h1>액션태그 테스트 04</h1>
<h3>include</h3>


<%-- request 컨텍스트 정보 저장 --%>
<%	request.setAttribute("data", "contextData"); %>


<%	request.setCharacterEncoding("utf-8"); %>
<jsp:include page="/views/includePage.jsp">
	<jsp:param value="안녕! Hello!" name="includeData"/>
</jsp:include>

<%-- <%@ include file="/views/includePage.jsp" %> --%>

<jsp:include page="/basicTag/jsp_footer.jsp" />
