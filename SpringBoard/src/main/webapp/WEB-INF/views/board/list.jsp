<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:import url="/WEB-INF/views/layout/header.jsp" />

<script type="text/javascript">
$(document).ready(function(){
	
	//글쓰기 버튼 클릭
	$("#btnWrite").click(function(){
		$(location).attr("href", "/board/write")
	});
	
	//검색 버튼 클릭
	$("#btnSearch").click(function(){
		location.href="/board/list?search="+$("#search").val();
		console.log(3);
	});
	
})	
</script>


<script type="text/javascript">
$(document).ready(function(){
	//선택 체크 삭제
	$("#btnDelete").click(function(){
		//선택 체크 박스
		var $checkboxes = $("input:checkbox[name='checkRow']:checked");
		
		//방법1
		// 체크된 대상들을 하나씩 꺼내서 문자열로 합치기
	//		var names = "";
	//		var len = $checkboxes.length;
	//		$checkboxes.each( function(idx) {
	//			names += $(this).val();
			
	//			if( len-1 != idx ) {
	//				names += ",";
	//			}
	//		});
	//		console.log(names);
	
	
		
		//방법2
		// 체크된 대상들을 map으로 만들고 map을 문자열로 만들기
		var map = $checkboxes.map(function(){
			return $(this).val();
		})
		console.log("map" + map)
		
		
		var map2 = $checkboxes.map(function() {
			return $(this).attr("data-writer");
		});
		console.log("map2" + map2)
		
		var names = map.get().join(",");
		var writers = map2.get().join(",");
// 			console.log("names : " + names);
	
// 			console.log($checkboxes);
// 			console.log( "map:" + map );	// 맵
// 			console.log( "map->array : " + map.get() );	// 맵->배열
// 			console.log( "array tostring : " + map.get().join(",") ); // toString
		
		
		
		
		// 전송 폼
		var $form = $("<form>")
			.attr("action", "/board/listDelete")
			.attr("method", "post")
			.append(
				$("<input>")
					.attr("type", "hidden")
					.attr("name", "names")
					.attr("value", names)				
			).append(
				$("<input>")
				.attr("type", "hidden")
				.attr("name", "writers")
				.attr("value", writers)	
			);
		
		$(document.body).append($form);
		$form.submit();
		
	});
		
});

//전체 체크/해제
function checkAll() {
	// checkbox들
	var $checkboxes=$("input:checkbox[name='checkRow']");

	// checkAll 체크상태 (true:전체선택, false:전체해제)
	var check_status = $("#checkAll").is(":checked");
	
	if( check_status ) {
		// 전체 체크박스를 checked로 바꾸기
		$checkboxes.each(function() {
			this.checked = true;	
		});
	} else {
		// 전체 체크박스를 checked 해제하기
		$checkboxes.each(function() {
			this.checked = false;	
		});
	}
}
</script>


<style type="text/css">
table {
	table-layout: fixed;
}

table, th {
	text-align: center;
}

td:nth-child(2) {
	text-align: left;
	
	white-space:nowrap;	
	text-overflow: ellipsis;
	overflow: hidden;
}
</style>

<div class="container">

<h1 class="pull-left">게시판 리스트</h1>
<div class="clearfix"></div>
<hr>

<table class="table table-striped table-hover">
<thead>
	<tr>
		<th>
			<input type="checkbox" id="checkAll" onclick="checkAll();" />
		</th>
		<th style="width: 10%">글번호</th>
		<th style="width: 40%">제목</th>
		<th style="width: 15%">작성자</th>
		<th style="width: 10%">조회수</th>
		<th style="width: 15%">작성일</th>
	</tr>
</thead>	

<tbody>
<c:forEach items="${list }" var="b"> 
	<tr>
		<td><input type="checkbox" name="checkRow" value="${b.boardNo }" data-writer="${b.writerNick }" /></td>
		<td>${b.boardNo }</td>
		<td><a href="/board/view?boardNo=${b.boardNo }">${b.title }</a></td>
		<td>${b.writerNick }</td>
		<td>${b.hit }</td>
		<td><fmt:formatDate value="${b.writeDate }" pattern="yy-MM-dd HH:mm:ss" /></td>
	</tr>

</c:forEach>
</tbody>
</table>

<c:if test="${login }">
<button id="btnDelete" class="btn btn-warning pull-left">삭제</button>
</c:if>
<div class="clearfix"></div>

<span class="pull-left">total : ${paging.totalCount }</span>

<button id="btnWrite" class="btn btn-primary pull-right">글쓰기</button>
<div class="clearfix"></div>

<div class="form-inline text-center">
	<input class="form-control" type="text" id="search" />
	<button id="btnSearch" class="btn">검색</button>
</div>

<jsp:include page="/WEB-INF/views/util/paging.jsp" />

</div> <!-- .container -->

<c:import url="/WEB-INF/views/layout/footer.jsp" />













