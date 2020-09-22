<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- jQuery 2.2.4 -->
<script type="text/javascript" src="http://code.jquery.com/jquery-2.2.4.min.js"></script>

<script type="text/javascript">
$(document).ready(function(){

	$("#saveBtn").click(function(){
	
		var form = $("#createForm")[0];
		var formData = new FormData(form);
		
		console.log(form);
		console.log(formData);
		
		$.ajax({
			url: "/file/fileup2",
			type: "POST",
			data: formData,
		    enctype: 'multipart/form-data',
		    processData: false,
		    contentType: false,
		    cache: false,
			dataType : "json",
			success: function(data){
				
				console.log("ajax 성공")
				
				
			},
			error: function(){
				alert("서버에러");
			}
		});	
			
	})
	
	
})
</script>


</head>
<body>

<h1>파일업로드 테스트2</h1>
<hr>
<div>
<form id="createForm" action="/file/fileup2" method="post"
 enctype="multipart/form-data" >
	<label for="title">제목</label>
	<input type="text" name="title" id="title" /><br>

	<label for="file">첨부파일</label>
	<input type="file" name="file" id="file" multiple="multiple"/><br><br>

</form>

<form id="testForm" >
<button type="button" id="saveBtn">저장</button>
</form>

</div>

</body>
</html>












