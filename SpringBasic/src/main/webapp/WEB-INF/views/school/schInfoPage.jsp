<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- jQuery 2.2.4 -->
<script type="text/javascript" src="http://code.jquery.com/jquery-2.2.4.min.js"></script>

<!-- 부트스트랩 3.3.2 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<!-- rmate6.0 라이센스, 라이브러리, css -->
<script src="/resources/rmate/LicenseKey/rMateChartH5License.js"></script>
<script src="/resources/rmate/rMateChartH5/JS/rMateChartH5.js"></script>
<link rel="stylesheet" href="/resources/rmate/rMateChartH5/Assets/Css/rMateChartH5.css"/>

<!-- rmate 통계 차트  -->
<script src="/resources/rmate/statistics.js"></script>

<!-- icomoon 검색 아이콘 추가 -->
<!-- https://dkfkslsksh.tistory.com/25 참조 -->
<link rel="stylesheet" href="/resources/icomoon/style.css"/>

<!-- 우편번호 검색 -->
<!-- http://postcode.map.daum.net/guide 참조-->
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

<style type="text/css">
.row-bottom-margin { margin-bottom:20px; }

/* nav 태그  및 내부 요소 설정 */
nav {
	float: right;
	display: inline-block;
/*     border-bottom: 1px solid black; */
}

.crumbs ol {
    list-style-type: none;
/*     padding-left: 0; */
}

.crumb {
    display: inline-block;
}

.crumb a:not(.a3)::after {
    display: inline-block;
    color: #000;
    content: '>'; 
    font-size: 80%;
    font-weight: bold;
    padding: 0 8px;
}

/* nav 태그 설정 끝  */
</style>

<!-- 우편번호 검색 -->
<script>
    function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
				
                var test =data.postcode;
               
                
                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
//                     document.getElementById("sample6_extraAddress").value = extraAddr;
                
                } else {
                    document.getElementById("sample6_extraAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample6_postcode').value = data.zonecode;
                document.getElementById("sample6_address").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("sample6_detailAddress").focus();
            }
        }).open();
    }
</script>

<!--rmate 차트의 레이아웃과 데이터셋 설정하고 차트 생성 실행하는 코드 구현  -->
<!-- 레이아웃은 차트의 종류, 모양, 기능 등을 설정하고 데이터셋은 차트에 표현될 데이터를 설정 -->
<script type="text/javascript">

</script>


<script type="text/javascript">
$(document).ready(function(){
	
	//신규 버튼 클릭시
	$("#createBtn").click(function(){
		$("#infoCreate").show();
	})
	
	//조회버튼 클릭시
	$("#btnSearch").click(function(){
		fn_search();
	})
	
	//저장 버튼 클릭시 중복체크 후 submit
	$("#saveBtn").click(function(){
		
		var params = $("#createForm").serialize();
		params += "&" + $("#searchForm").serialize();
// 		params += "&keyword="+$("#keyword").val()+"&searchType=" + $("#searchType").val();
		
		$.ajax({
			url: "/school/infoSave",
			type: "POST",
			data:params,
			dataType : "json",
			success: function(data){
				
				if(data.check == 0){

					/* 등록폼 컬럼값 비우기 */
					$(":text:not([id=post])").val("");
					$("#schDiv").val("");
					
					list(data);
					
					statistics(data);
					
					statistics2(data)

				} else {
					alert("이미 존재하는 학교 코드 입니다.")
					$(":text:not([id=post])").val("");
				}
			},
			error: function(){
				alert("서버에러");
			}
		});

	})
	
	//선택 체크 삭제
	$("#deleteBtn").click(function(){
		//선택 체크 박스
		var $checkboxes = $("input:checkbox[name='checkRow']:checked");
		
		// 체크된 대상들을 map으로 만들고 map을 문자열로 만들기
		var map = $checkboxes.map(function(){
			return $(this).val();
		})
		
		var names = map.get().join(",");

// 			console.log("names : " + names);
	
// 			console.log($checkboxes);
// 			console.log( "map:" + map );	// 맵
// 			console.log( "map->array : " + map.get() );	// 맵->배열
// 			console.log( "array tostring : " + map.get().join(",") ); // toString
		
		var keyword = $("#keyword").val();
		var searchType = $("#searchType").val();
		
		
		var objParams = {
				"names": names,
				"keyword": keyword,
				"searchType": searchType
		}
		
		$.ajax({
			url: "/school/listDelete",
			type: "POST",
			data: objParams,
			dataType : "json",
			success: function(data){
				
				
				
				list(data);
				
				statistics(data);
				
				statistics2(data);
				
			},
			error: function(){
				alert("서버에러");
			}
		});
		
	});
	
	$("#excelBtn").click(function(){
		
		//선택 체크 박스
		var $checkboxes = $("input:checkbox[name='checkRow']:checked");
		
		// 체크된 대상들을 map으로 만들고 map을 문자열로 만들기
		var map = $checkboxes.map(function(){
			return $(this).val();
		})
		
		var names = map.get().join(",");
		
		// 전송 폼
		var $form = $("<form>")
			.attr("action", "/school/downloadExcelFile")
			.attr("method", "post")
			.attr("enctype", "multipart/form-data")			
			.append(
				$("<input>")
					.attr("type", "hidden")
					.attr("name", "names")
					.attr("value", names)				
			);
		
		$(document.body).append($form);
		$form.submit();
	})
	
		
})
</script>

<script type="text/javascript">

//조회
function fn_search(){
	var params = jQuery("#searchForm").serialize();
	
	$.ajax({
		type: "get"
		, url: "/school/list"
 		, data: params
		, dataType: "json"
		, success: function( data ) {
			
			    // 테이블 그려줌
				list(data);
				
				statistics(data);
				
				statistics2(data);

			}
		, error: function() {
			console.log("실패");
		}
	})
}

//전체 체크/해제
function checkAll(){
	//checkbox들
	var $checkboxes = $("input:checkbox[name='checkRow']");
	
	//checkAll 체크 상태(true: 전체선택, false: 전체해제])
	var check_status = $("#checkAll").is(":checked");
	
	if( check_status ) {
		//전체 체크박스를 checked로 바꾸기
		$checkboxes.each(function(){
			this.checked = true;
		});
	} else {
		//전체 체크박스를 checked 해제하기
		$checkboxes.each(function(){
			this.checked = false;
		});
	}
}

//리스트 함수
function list(data){
	
	$("#listBody").html("");
	$("#listTable").show();
	
	for(var i=0; i<data.list.length; i++){
		$("#listBody").append(
			"<tr>"
			+ "<td>" + "<input type='checkbox' name='checkRow' value='" + data.list[i].schCd + "'/>" + "</td>"
			+ "<td>" + data.list[i].schCd + "</td>" 
			+ "<td>" + data.list[i].schDiv + "</td>"	
			+ "<td>" + data.list[i].schNm + "</td>"
			+ "<td>" + data.list[i].telNo + "</td>"
			+ "<td>" + data.list[i].zipno + "</td>"
			+ "<td>" + data.list[i].addr + "</td>"
			+ "<td>" + data.list[i].remk + "</td>"
			+ "</tr>"
		)
	}
	
}

</script>


</head>
<body>

<div class="container">

<h1 class="pull-left">학교관리</h1>
<div class="clearfix"></div>
<hr>

<!-- 학교정보 등록, 저장, 삭제 -->
<div class="form-inline row-bottom-margin">
<button type="button" id="createBtn" class="btn btn-success">신규</button>
<button type="button" id="saveBtn" class="btn btn-primary">저장</button>
<button type="button" id="deleteBtn" class="btn btn-light">삭제</button>
<button type="button" id="excelBtn"  class="btn btn-danger" >엑셀다운로드</button>

<nav class="crumbs">
    <ol>
        <li class="crumb"><a href="#">업무지원</a></li>
        <li class="crumb"><a href="#">기준정보</a></li>
        <li class="crumb"><a class="a3" href="#">학교관리</a></li>       
    </ol>
</nav>
</div>



<!-- rmate 차트 -->
<!-- 통계 차트가 삽입될 DIV -->
<div id="chartHolder" style="width:49%; height:300px; display:none; float:left; border: 1px solid;"></div>
<div id="chartHolder2" style="width:49%; height:300px; display:none; float:right; border: 1px solid;"></div>
<div class="row-bottom-margin" style="clear: both"></div>

<!-- 조회 -->
<div class="row-bottom-margin">
<form id="searchForm" class="form-inline" action="/school/list" method="get">
<div class="form-row">

	<div class="form-group" style="margin: 0 10px 0 0">
		<label for="keyword">학교명</label>
		<input hidden="hidden" /> <!-- 엔터 입력  submit 방지  -->
		<input type="text" id="keyword" name="keyword" class="form-control">
	</div>

	<div class="form-group">
	<label for="searchType">구분</label>
    <select id="searchType" name="searchType" class="form-control" >
    	<option selected="selected"></option>
		<option value="E">초등학교</option>
		<option value="M">중학교</option>
		<option value="H">고등학교</option>
    </select>
    </div>
    
    <div class="form-group col-md-offset-7">
		<label for="btnSearch"></label>
	    <button type="button" id="btnSearch" class="form-control btn btn-warning i-zoom-in">조회</button>
    </div>
    
</div> <!-- .form-row 끝 -->
</form>



</div> <!-- 조회끝 -->


<!-- list table -->
<div class="row-bottom-margin">
<table id="listTable" class="table table-hover" style="display:none" >

<thead>
<tr>
	<td><input type="checkbox" id="checkAll" onclick="checkAll();" /></td>
	<th>학교 코드</th>
	<th>구분 </th>
	<th>학교 명</th>
	<th>연락처</th>
	<th>우편번호</th>
	<th>주소</th>
	<th>비고</th>
</tr>
</thead>

<tbody id="listBody">

</tbody>


</table>

</div>


<!-- 등록 폼-->
<div id="infoCreate" style="display:none">
<form id="createForm" action="/school/list" method="post">
<table id="createTable" class="table table-bordered"> 
<tr>
	<th style="color: red;">학교 코드</th>
	<td><input type="text" id="schCd" name="schCd"/></td>
	<th style="color: red;">구분</th>
	<td>
		<select id="schDiv" name="schDiv">
			<option selected="selected"></option>
			<option value="E">초등학교</option>
			<option value="M">중학교</option>
			<option value="H">고등학교</option>
		</select>
	</td>
</tr>

<tr>
	<th style="color: red;">학교 명</th>
	<td>
		<input type="text" name="schNm"/>
	</td>
	<th>연락처</th>
	<td>
		<input type="text" name="telNo">
	</td>
</tr>

<tr>
	<th style="color: red;">유저 아이디</th>
	<td colspan="3"><input type="text" name="userId"/></td>
</tr>

<tr>
	<th>우편번호</th>
	<td colspan="3">
		<input type="text" id="sample6_postcode" name="zipno" placeholder="우편번호">
		<input type="button" id="post" onclick="sample6_execDaumPostcode()" value="우편번호 찾기">
	</td>

</tr>

<tr>
	<th>주소</th>
	<td colspan="3">
		<input type="text" id="sample6_address" name="addr" placeholder="주소">
		<input type="text" id="sample6_detailAddress" name="addrDts" placeholder="상세주소">
		<input type="hidden" id="sample6_extraAddress" placeholder="참고항목">
	</td>
	
</tr>

<tr>
	<th>비고</th>
	<td colspan="3"><input type="text" name="remk" /></td>
</tr>

</table>
</form>

</div>

</div> <!-- container end -->

</body>
</html>