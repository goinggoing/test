<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:import url="/WEB-INF/views/layout/header.jsp" />

<style type="text/css">
td.info {
	width: 10%;
}
td:not(.info) {
	width: 40%;
}
</style>

<script type="text/javascript">
$(document).ready(function() {
	if(${isRecommend}){
		$("#btnRecommend")
			.addClass("btn-waring")
			.html('추천 취소');
	} else {
		$("#btnRecommend")
			.addClass("btn-primary")
			.html('추천');
	}
	
	
	$("#btnRecommend").click(function() {
		
		$.ajax({
			type: "get"
			, url: "/board/recommend"
			, data: { "boardNo": '${view.boardNo }' }
			, dataType: "json"
			, success: function( data ) {
 				console.log("성공");
				console.log(data);

				if( data.result ) { //추천 성공
					$("#btnRecommend")
					.removeClass("btn-primary")
					.addClass("btn-warning")
					.html('추천 취소');
				
				} else { //추천 취소 성공
					$("#btnRecommend")
					.removeClass("btn-warning")
					.addClass("btn-primary")
					.html('추천');
				
				}
				
				//추천수 적용
				$("#recommend").html(data.cnt);
				
			}
			, error: function() {
				console.log("실패");
				
			}
		});
		
	});
	
	
	
});
</script>

<script type="text/javascript">
$(document).ready(function() {
	// 댓글 입력
	$("#btnCommInsert").click(function() {
		// 게시글 번호.... ${viewBoard.boardno }
	//		console.log($("#commentWriter").val());
	//		console.log($("#commentContent").val());
		
		$form = $("<form>").attr({
			action: "/comment/insert",
			method: "post"
		}).append(
			$("<input>").attr({
				type:"hidden",
				name:"boardNo",
				value:"${view.boardNo }"
			})
		).append(
			$("<input>").attr({
				type:"hidden",
				name:"id",
				value:"${sessionScope.id }"
			})
		).append(
			$("<textarea>")
				.attr("name", "content")
				.css("display", "none")
				.text($("#commentContent").val())
		);
		$(document.body).append($form);
		$form.submit();
		
	});
	
});

//댓글 삭제
function deleteComment(commentNo) {
	$.ajax({
		type: "post"
		, url: "/comment/delete"
		, dataType: "json"
		, data: {
			commentNo: commentNo
		}
		, success: function(data){
			console.log(data)
			if(data.success) {
				
				$("[data-commentno='"+commentNo+"']").remove();
				
			} else {
				alert("댓글 삭제 실패");
			}
		}
		, error: function() {
			console.log("error");
		}
	});
}
</script>




<div class="container">

<h1 class="pull-left">게시글 상세보기</h1>

<c:if test="${login }">
<button id="btnRecommend" class="btn pull-right">추천</button>
</c:if>

<div class="clearfix"></div>
<hr>

<table class="table table-bordered">
<tr>
<td class="info">글번호</td><td>${view.boardNo }</td>
<td class="info">추천수</td><td id="recommend" colspan="3">${view.recommend }</td>
</tr>

<tr>
<td class="info">아이디</td><td>${view.writerId }</td>
<td class="info">닉네임</td><td>${view.writerNick }</td>
</tr>

<tr>
<td class="info">조회수</td><td>${view.hit }</td>
<td class="info">작성일</td><td><fmt:formatDate value="${view.writeDate }" pattern="yy-MM-dd hh:mm:ss" /></td></tr>

<tr>
<td class="info">제목</td><td colspan="3">${view.title }</td>
</tr>

<tr><td class="info"  colspan="4">본문</td></tr>

<tr><td colspan="4">${view.content }</td></tr>
</table>

<a href="/board/download?fileno=${filetest.fileNo }">${filetest.originName }</a>


<!-- 버튼 영역 -->
<div class="text-center">
	<a href="/board/list"><button class="btn btn-default">목록</button></a>
	<c:if test="${id eq view.writerId }">
		<a href="/board/update?boardNo=${view.boardNo }"><button class="btn btn-primary">수정</button></a>
		<a href="/board/delete?boardNo=${view.boardNo }"><button class="btn btn-danger">삭제</button></a>
	</c:if>
</div><!-- 버튼 영역 end -->


<!-- 로그인 상태  -->
<c:if test="${login }">
<!-- 댓글 입력 -->
<div class="form-inline text-center">
	<input type="text" size="10" class="form-control" id="commentWriter" value="${nick }" readonly="readonly"/>
	<textarea rows="2" cols="60" class="form-control" id="commentContent"></textarea>
	<button id="btnCommInsert" class="btn">입력</button>
</div>	<!-- 댓글 입력 end -->
</c:if>

<!-- 댓글 리스트 -->
<table class="table table-striped table-hover table-condensed">

<thead>
<tr>
	<th style="width: 5%;">번호</th>
	<th style="width: 10%;">작성자</th>
	<th style="width: 50%;">댓글</th>
	<th style="width: 20%;">작성일</th>
	<th style="width: 5%;"></th>
</tr>
</thead>

<tbody id="commentBody">
<c:forEach items="${commentList }" var="comment">
<tr data-commentno="${comment.commentNo }">
	<td>${comment.rnum }</td>
	<td>${comment.id }</td><!-- 닉네임으로 해도 좋음 -->
	<td>${comment.content }</td>
	<td><fmt:formatDate value="${comment.writeDate }" pattern="yy-MM-dd hh:mm:ss" /></td>
	<td>
		<c:if test="${sessionScope.id eq comment.id }">
		<button class="btn btn-default btn-xs"
			onclick="deleteComment(${comment.commentNo });">삭제</button>
		</c:if>
	</td>
	
</tr>
</c:forEach>
</tbody>

</table><!-- 댓글 리스트 end -->





</div> <!-- .container -->
