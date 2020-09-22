<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- jQuery 2.2.4 -->
<script type="text/javascript" src="http://code.jquery.com/jquery-2.2.4.min.js"></script>
<!-- dataTables -->
<link rel="stylesheet" href="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.css"/> 
<script src="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.js"></script>



<script type="text/javascript">

function getDW(DW) {

	var year = document.getElementById("year").value;
	
	$.ajax({
		type : "get",
		url : "/test/testProcess2",
		data : {
			DW : DW,
			year : year
		},
		dataType : "json",
		success : function(res) {
		alert("testProcess2 ajax 성공")
			let today = new Date();
			console.log(today)
			let date = today.getDate();
		
			console.log(date)
			console.log(res.list2)
			$("#comboBox").html("");
			$("#comboBox").show();

		
			for (var i = 0; i < res.list2.length; i++) {
			

				
					if(res.list2[i].CODE_NM == date + "일" ){
					
						$("#comboBox")
						.append("<option selected>" + res.list2[i].CODE_NM + "</option>");
					
					} else if(res.list2[i].CODE_NM != date + "일"){
						$("#comboBox")
						.append("<option>" + res.list2[i].CODE_NM + "</option>");
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

<c:set var="now" value="<%=new Date() %>" />
<fmt:formatDate value="${now }" pattern="yyyy" var="thisyear" /><br>

<form action="/test/test2" method="post">
연도	
<select id="year" name="year">
		
	<c:forEach var="selectedyear" begin="${thisyear - 2}" end="${thisyear + 2}" >
		<c:choose>
			<c:when test="${selectedyear == thisyear }">
				<option value="${selectedyear }" selected="selected">${thisyear }</option>
			</c:when>
			
			<c:otherwise>
				<option value="${selectedyear }" >${selectedyear }</option>
			</c:otherwise>
		</c:choose>

	</c:forEach>	
</select>
	
일/요일
<select id="DW" name="DW" onchange="getDW(this.value)">
	<option selected="selected"></option>
	<option value="D">D:일자</option>
	<option value="W">W:요일</option>
</select>

<select id="comboBox" name="comboBox" style="display:none" >
	<option value=""></option>
</select>

<input type="submit" value="입력" /><br><br>



<br><br>

</form>


<fmt:formatDate value="${now }" pattern="MM" var="thismonth" /><br>
<fieldset style="width: 600px">
<legend>입력한 날짜 </legend>
<table id="foo-table" class="table table-bordered">
	<thead>
	<tr>
		<th>년도</th>
		<th>일/요일 선택</th>
		<th>일/요일 선택 값</th>
		<th>출력</th>
	</tr>
	</thead>
	
	<tbody>
		<c:forEach items="${list2 }" var="list">
		<tr>
			<th>${list.year }</th>
			<th>${list.DW }</th>
			<th>${list.comboBox }</th>
			<th>${list.year }년 ${thismonth }월 ${list.comboBox }입니다</th>
		</tr>
		</c:forEach>
	</tbody>
</table>
</fieldset>







<!-- <table>에 DataTables 적용하기 -->
<script type="text/javascript">
$(document).ready(function(){
	
	$('#foo-table').dataTable();
	
}); 
</script>














</body>
</html>