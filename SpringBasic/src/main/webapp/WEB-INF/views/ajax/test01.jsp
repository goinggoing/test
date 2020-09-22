<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript"
 src="http://code.jquery.com/jquery-2.2.4.min.js"></script>

<script type="text/javascript">
$(document).ready(function() {
	$("#ajax").click(function() {
		
		$.ajax({
			type: "get"
			, url: "/ajax/test01_ok"
// 			, data: { num: 123, text: "testStr" }
			, data: { }
			, dataType: "json"
			, success: function( res ) {
				console.log("성공")
				console.log( res )
			}
			, error: function() {
				console.log("실패")
			}
		});
		
	});
});
</script>

</head>
<body>

<h1>Ajax 테스트 01</h1>
<hr>

<button id="ajax">AJAX 요청 보내기</button>

</body>
</html>





