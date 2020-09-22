<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<c:import url="/WEB-INF/views/layout/header.jsp" />

<!-- Naver SmartEditor -->
<script type="text/javascript"
 src="/resources/se/js/service/HuskyEZCreator.js" charset="utf-8"></script>


<script type="text/javascript">
//스마트 에디터 스크립트
function submitContents(elClickedObj) {
  // 에디터의 내용이 textarea에 적용된다.
  oEditors.getById["content"].exec("UPDATE_CONTENTS_FIELD", []);

  try {
      elClickedObj.form.submit();
  } catch(e) {}
}


$(document).ready(function() {
	
	//글쓰기 버튼 클릭
	$("#btnWrite").click(function(){
		submitContents($(this));
	});
	
	$("#title").focus();
	
	//취소 버튼 클릭
	$("#cancel").click(function() {
		history.back(-1);
	});
	
	
});
</script>

<div class="container">

<h1>글쓰기 페이지</h1>
<hr>

<form action="/board/write" method="post" enctype="multipart/form-data">
	<div class="form-group">
		<label for="writer">작성자</label>
		<input type="text" id="writer" value="${nick }" readonly="readonly" class="form-control"/>
	</div>
	<div class="form-group">
		<label for="title">제목</label>
		<input type="text" id="title" name="title" class="form-control" />
	</div>
	<div class="form-group">
		<label for="content">본문</label>
		<textarea rows="10" style="width:100%" id="content" name="content"></textarea>
	</div>
	
첨부파일 <input type="file" name="file" />

	<div class="text-center">
		<button class="btn btn-primary" id="btnWrite">작성</button>
		<input type="reset" id="cancel"	class="btn btn-danger" value="취소"/>
	</div>	
</form>


</div><!-- .container -->

<c:import url="/WEB-INF/views/layout/footer.jsp" />

<!-- 스마트에디터 초기화코드 -->
<script type="text/javascript">
var oEditors = [];
nhn.husky.EZCreator.createInIFrame({
    oAppRef: oEditors,
    elPlaceHolder: "content",
    sSkinURI: "/resources/se/SmartEditor2Skin.html",
    fCreator: "createSEditor2",
    htParams : {
    	bUseToolbar: true, // 툴바 사용여부
    	bUseVerticalResizer: false, //입력창 크기 조절바
    	bUseModeChanger: true //모드 탭
    }
});
</script>

