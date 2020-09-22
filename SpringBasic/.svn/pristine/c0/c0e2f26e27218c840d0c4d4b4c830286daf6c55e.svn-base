<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- jQuery 2.2.4 -->
<script type="text/javascript" src="http://code.jquery.com/jquery-2.2.4.min.js"></script>
<script type="text/javascript">

function getDw(dw) {
	
	var year = document.getElementById("year").value;
	
	$.ajax({
		type : "get",
		url : "/test/testProcess",
		data : {
			dw : dw,
			year : year
		},
		dataType : "json",
		success : function(res) {
		
			let today = new Date();
			console.log(today)
			let date = today.getDate();
		
			console.log(date)

			$("#comboBox").html("");
			$("#comboBox").show();

			for (var i = 0; i < res.list1.length; i++) {
			
					if(res.list1[i].CODE_NM == date + "일" ){
					
						$("#comboBox")
						.append("<option selected>" + res.list1[i].CODE_NM + "</option>");
					
					} else if(res.list1[i].CODE_NM != date + "일"){
						$("#comboBox")
						.append("<option>" + res.list1[i].CODE_NM + "</option>");
					}
					
			}			
			console.log("성공");
						
		},
		
		error : function() {
			console.log("실패");
		}
		
		
	});
}

</script>	
</head>
<body>

<c:set value="<%=new Date() %>" var="now"/>
<fmt:formatDate value="${now }" pattern="yyyy" var="thisyear"/><br>

<form action="/test/test" method="post">
연도
<select id="year" name="year">

	<c:forEach begin="${thisyear - 2 }" end="${thisyear + 2 }" var="selectedyear">
		<c:choose>
			<c:when test="${selectedyear == thisyear }">
				<option value="${selectedyear }" selected="selected">${thisyear }</option>
			</c:when>
			
			<c:otherwise>
				<option value="${selectedyear }">${selectedyear }</option>
			</c:otherwise>
		</c:choose>
	</c:forEach>
</select>

일/요일
<select id="dw" name="dw" onchange="getDw(this.value)">
	<option selected="selected"></option>
	<option value="d">D:일자</option>
	<option value="w">W:요일</option>
</select>

<select id="comboBox" name="comboBox" style="display:none">
	<option value=""></option>
</select>

<input type="submit" value="입력" /><br><br>



<br><br>

</form>

<fmt:formatDate value="${now }" pattern="MM" var="thismonth" /><br>
<fieldset style="width: 600px">
<legend>입력한 날짜 </legend>
<table border="1">
	<tr>
		<th>년도</th>
		<th>일/요일 선택</th>
		<th>일/요일 선택 값</th>
		<th>출력</th>
	</tr>
	
	
		<c:forEach items="${list1 }" var="list">
		<tr>
			<th>${list.year }</th>
			<th>${list.dw }</th>
			<th>${list.comboBox }</th>
			<th>${list.year }년 ${thismonth }월 ${list.comboBox }입니다</th>
		</tr>
		</c:forEach>
	
</table>
</fieldset>






















</body>
</html>