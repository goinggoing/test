<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
<h3>서브 페이지</h3>
<p>여긴  include된 페이지 영역</p>
<p>전달 데이터 : <%=request.getParameter("includeData") %>

<p>request 컨텍스트 : <%=request.getAttribute("data") %>
</div>













