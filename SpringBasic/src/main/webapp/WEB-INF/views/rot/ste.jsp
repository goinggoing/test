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

<!-- jQuery ui datepicker 사용 -->
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">


<style type="text/css">
table {
	border-collapse: collapse;
	border-spacing: 0;
	width: 100%;
}

.upload-btn-wrapper {
	position: relative;
	overflow: hidden;
	display: inline-block;
}

.uploadBtnPosition {
	position: static;
}

#fileDragDesc {
			width: 100%; 
			height: 100%; 
			margin-left: auto; 
			margin-right: auto; 
			padding: 5px; 
			text-align: center; 
			line-height: 130px; 
			vertical-align:middle;
}

#listTable {
	text-align: center;
}

#listBody {
	text-align: center;
}

#listBody td {
	border: 1px solid black;
}

</style>

<script type="text/javascript">

//파일 리스트 번호
var fileIndex = 0;
// 등록할 전체 파일 사이즈
var totalFileSize = 0;

var fileList = new Array(); // 파일 리스트
var fileSizeList = new Array(); // 파일 사이즈 리스트
var fileSizeStrList = new Array();

// 등록 가능한 파일 사이즈 MB
var uploadSize = 50;
// 등록 가능한 총 파일 사이즈 MB
var maxUploadSize = 500;

$(document).ready(function(){
	
	//처음 페이지 접속시 리스트 띄우기
	function list() {
		
		var params = jQuery("#mainForm").serialize();
		
		$.ajax({
			type: "GET"
			, url: "/rot/rotStelist"
	 		, data: params
			, dataType: "json"
			, success: function( data ) {
				
				$("#listBody").html("");
				
				for(var i=0; i<data.list.length; i++){
					
					$("#listBody").append(
						"<tr>"
						+ "<td>" + "<input type='checkbox' name='checkRow' value='" + data.list[i].fileSeq + "'/>" + "</td>"
						+ "<td>" + data.list[i].steSeq + "</td>" 
						+ "<td>" + data.list[i].steNm + "</td>"	
						+ "<td>" + data.list[i].nm + "</td>"
						+ "<td>" + data.list[i].cttpc + "</td>"
						+ "<td>" + data.list[i].email + "</td>"
						+ "<td>" + data.list[i].psitn + "</td>"
						+ "<td>" + data.list[i].regDtm + "</td>"
						+ "</tr>"
					)
				}

				}
			, error: function() {
				console.log("실패");
			}
		})
		
	}
	
	window.onload = list;
	
	
	//파일선택 눌렀을 때
	$("#file").bind('change', function() {
		selectFile(this.files);
		//this.files[0].size gets the size of your file.
		//alert(this.files[0].size);
	});

//datepicker	
//https://zetawiki.com/wiki/JQuery_UI_%EB%82%A0%EC%A7%9C%EC%84%A0%ED%83%9D%EA%B8%B0_datepicker
	  $.datepicker.setDefaults({
		    dateFormat: 'yy-mm',
		    prevText: '이전 달',
		    nextText: '다음 달',
		    monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
		    monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
		    dayNames: ['일', '월', '화', '수', '목', '금', '토'],
		    dayNamesShort: ['일', '월', '화', '수', '목', '금', '토'],
		    dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],
		    showMonthAfterYear: true,
		    yearSuffix: '년'
		  });
	
    $(function() {
        $("#startDate, #endDate").datepicker({
            dateFormat: 'yy-mm-dd'
        });
    });
	
	//날짜검색으로 조회하기 위한 신고일짜 default 
	//from(-2주) ~ to(오늘 일자)
	//자바스크립트 현재 날짜 구하기	https://hianna.tistory.com/325, https://nown2210.tistory.com/92
	//https://zero-gravity.tistory.com/308
	var startDate = getStartDate();

	var endDate = getEndDate();

	$("#startDate").val(startDate);
	$("#endDate").val(endDate);
	
	function getStartDate(){
		var today = new Date();
		today.setDate(today.getDate() - 14);
		
		var startYear = today.getFullYear();
		var startMonth = today.getMonth() + 1;
		var startDate = today.getDate();
			
		if(startMonth<10){
			startMonth = "0" + startMonth;
		}
		
		if(startDate<10){
			startDate = "0" + startDate;
		}
		
		return startYear + "-" + startMonth + "-" + startDate; 
		
	}
	
	function getEndDate(){
		var today = new Date();
		
		var endYear = today.getFullYear();
		var endMonth = today.getMonth() + 1;
		var endDate = today.getDate();
		
		if(endMonth<10){
			endMonth = "0" + endMonth;
		}
		
		if(endDate<10){
			endDate = "0" + endDate;
		}
		
		return endYear + "-" + endMonth + "-" + endDate; 
	}
	
	$("#oneWeek").click(function(){
		
		var end_ymd = $("#endDate").val();
		var yyyy = end_ymd.substr(0,4);
		var mm = end_ymd.substr(5,2);
		var dd = end_ymd.substr(8,2); 
		
		var com_ymd = new Date(yyyy, mm-1, dd);
		
		com_ymd.setDate(com_ymd.getDate() - 7);
		
		$("#startDate").datepicker();
		$("#startDate").datepicker('setDate', com_ymd);
		
	})
	
	$("#twoWeek").click(function(){

		var end_ymd = $("#endDate").val();
		var yyyy = end_ymd.substr(0,4);
		var mm = end_ymd.substr(5,2);
		var dd = end_ymd.substr(8,2); 
		
		var com_ymd = new Date(yyyy, mm-1, dd);
		
		com_ymd.setDate(com_ymd.getDate() - 14);
		
		$("#startDate").datepicker();
		$("#startDate").datepicker('setDate', com_ymd);
		
	})
	
	$("#oneMonth").click(function(){

		var end_ymd = $("#endDate").val();
		var yyyy = end_ymd.substr(0,4);
		var mm = end_ymd.substr(5,2);
		var dd = end_ymd.substr(8,2); 
		
		var com_ymd = new Date(yyyy, mm-1, dd);
		
		com_ymd.setMonth(com_ymd.getMonth() - 1);
		
		$("#startDate").datepicker();
		$("#startDate").datepicker('setDate', com_ymd);
	})
	
	$("#sixMonth").click(function(){

		var end_ymd = $("#endDate").val();
		var yyyy = end_ymd.substr(0,4);
		var mm = end_ymd.substr(5,2);
		var dd = end_ymd.substr(8,2); 
		
		var com_ymd = new Date(yyyy, mm-1, dd);
		
		com_ymd.setMonth(com_ymd.getMonth() - 6);
		
		$("#startDate").datepicker();
		$("#startDate").datepicker('setDate', com_ymd);
	})
	
	
	//조회버튼 클릭시
	$("#searchBtn").click(function(){
		
		var params = jQuery("#mainForm").serialize();

		$.ajax({
			type: "GET"
			, url: "/rot/rotStelist"
	 		, data: params
			, dataType: "json"
			, success: function( data ) {

				$("#listBody").html("");
				
				for(var i=0; i<data.list.length; i++){
					
					$("#listBody").append(
						"<tr>"
						+ "<td>" + "<input type='checkbox' name='checkRow' value='" + data.list[i].fileSeq + "'/>" + "</td>"
						+ "<td>" + data.list[i].steSeq + "</td>" 
						+ "<td>" + data.list[i].steNm + "</td>"	
						+ "<td>" + data.list[i].nm + "</td>"
						+ "<td>" + data.list[i].cttpc + "</td>"
						+ "<td>" + data.list[i].email + "</td>"
						+ "<td>" + data.list[i].psitn + "</td>"
						+ "<td>" + data.list[i].regDtm + "</td>"
						+ "</tr>"
					)
				}

				}
			, error: function() {
				console.log("실패");
			}
		})
	})
	
	
	//저장버튼 클릭시
	$("#saveBtn").click(function(){
		
		// 등록할 파일 리스트
		var uploadFileList = Object.keys(fileList);

		var form = $('#createForm')[0];

		var params = $("#mainForm").serialize();

		var param = params.split('&');

		var formData = new FormData(form);

		for (var i = 0; i < uploadFileList.length; i++) {

			formData.append('files', fileList[i]);
			formData.append('fileSize', fileSizeStrList[i]);
		}
		
		for(var i in param){
			var para = param[i].split('=');
			formData.append(para[0],para[1]);	
		}

		$.ajax({
			url: "/rot/rotSteSave",
			type: "POST",
			data: formData,
		    enctype: 'multipart/form-data',
		    processData: false,
		    contentType: false,
		    cache: false,
			dataType : "json",
			success: function(data){
				
				$("#listBody").html("");
				
				for(var i=0; i<data.list.length; i++){
					
					$("#listBody").append(
						"<tr>"
						+ "<td>" + "<input type='checkbox' name='checkRow' value='" + data.list[i].fileSeq + "'/>" + "</td>"
						+ "<td>" + data.list[i].steSeq + "</td>" 
						+ "<td>" + data.list[i].steNm + "</td>"	
						+ "<td>" + data.list[i].nm + "</td>"
						+ "<td>" + data.list[i].cttpc + "</td>"
						+ "<td>" + data.list[i].email + "</td>"
						+ "<td>" + data.list[i].psitn + "</td>"
						+ "<td>" + data.list[i].regDtm + "</td>"
						+ "</tr>"
					)
				}
			
				//Initialize
				$("#steNm").val("");
				$("#nm").val("");
				$("#cttpc").val("");
				$("#email").val("");
				$("#psitn").val("");
				$("#regDtm").val("");
				$("input[name=file]").val("");
					
				$("#startDate").val(startDate);
				$("#endDate").val(endDate);
				$("textarea").val("");
				
				$("#fileTableTbody").html("");
				$("#dropZone").hide();

			},
			error: function(){
				alert("서버에러");
			}
		});
			
	})
	

	//추가버튼 클릭시
// 	https://dreamjy.tistory.com/16
	$('#addBtn').off('click').on('click', function() {
		
		$("#regDtm").val(getEndDate());
    });

	
	//선택 체크 삭제
	$("#deleteBtn").click(function(){
		//선택 체크 박스
		var $checkboxes = $("input:checkbox[name='checkRow']:checked");
		
		// 체크된 대상들을 map으로 만들고 map을 문자열로 만들기
		var map = $checkboxes.map(function(){
			return $(this).val();
		})
		
		var fileSeq = map.get().join(",");

		var keyword = $("#keyword").val();
		var searchType = $("#searchType").val();
		
		
		var objParams = {
				"fileSeq": fileSeq,
				"keyword": keyword,
				"searchType": searchType,
				"startDate": startDate,
				"endDate": endDate
		}
		
		$.ajax({
			url: "/rot/listDelete",
			type: "POST",
			data: objParams,
			dataType : "json",
			success: function(data){
				
				$("#listBody").html("");
				
				for(var i=0; i<data.list.length; i++){
					
					$("#listBody").append(
						"<tr>"
						+ "<td>" + "<input type='checkbox' name='checkRow' value='" + data.list[i].fileSeq + "'/>" + "</td>"
						+ "<td>" + data.list[i].steSeq + "</td>" 
						+ "<td>" + data.list[i].steNm + "</td>"	
						+ "<td>" + data.list[i].nm + "</td>"
						+ "<td>" + data.list[i].cttpc + "</td>"
						+ "<td>" + data.list[i].email + "</td>"
						+ "<td>" + data.list[i].psitn + "</td>"
						+ "<td>" + data.list[i].regDtm + "</td>"
						+ "</tr>"
					)
				}
		
			},
			error: function(){
				alert("서버에러");
			}
		});
		
	});
	
	
	//파일추가 버튼 눌렀을 시
	$("#uploadBoxBtn").click(function(){
			$("#dropZone").toggle();
	})
	
	
	//파일보기 버튼을 클릭했을 시
	$("#fileViewBtn").click(function(){
		
		//선택 체크 박스
		var $checkboxes = $("input:checkbox[name='checkRow']:checked");
		
		// 체크된 대상들을 map으로 만들고 map을 문자열로 만들기
		var map = $checkboxes.map(function(){
			return $(this).val();
		})

		var fileSeq = map.get().join(",");

		if($("input:checkbox[name='checkRow']").is(":checked") == true && $checkboxes.length == 1) {
			var objParam = {
					"fileSeq": fileSeq,
			}
			
			$.ajax({
				url: "/rot/fileView",
				type: "GET",
				data: objParam,
				dataType : "json",
				success: function(data){
					
					$("#dropZone").show();
					$("#fileDragDesc").hide(); 
					$("#fileListTable").show();
					$("#fileTableTbody").html("");
					
					var list = data.fileList;

					for(var i in list){	
						
						var fIndex = list[i].seq;
						var fileSize = list[i].fileSize;
						var fileSize2 = list[i].fileSize.substr(0,2)
						var fileSize = Number(fileSize2);
						
						totalFileSize += fileSize;
						fileList[fIndex] = list[i];
						fileSizeList[fIndex] = fileSize;
						
						addFileList(fIndex, list[i].ognFileNm, list[i].fileSize);
					}
					
				},
				error: function(){
					alert("서버에러");
				}
			});
			
		}else {
			alert("다시 선택하세요")
			return;
		}
		
	}) /* fiewViewBtn click 끝  */
}) /* jquery document 끝  */


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
	
	
	$(function() {
		// 파일 드롭 다운
		fileDropDown();
	});
	
	// 파일 드롭 다운
	function fileDropDown() {
		var dropZone = $("#dropZone");
		//Drag기능 
		dropZone.on('dragenter', function(e) {
			e.stopPropagation();
			e.preventDefault();
			// 드롭다운 영역 css
			dropZone.css('background-color', '#E3F2FC');
		});
		dropZone.on('dragleave', function(e) {
			e.stopPropagation();
			e.preventDefault();
			// 드롭다운 영역 css
			dropZone.css('background-color', '#FFFFFF');
		});
		dropZone.on('dragover', function(e) {
			e.stopPropagation();
			e.preventDefault();
			// 드롭다운 영역 css
			dropZone.css('background-color', '#E3F2FC');
		});
		dropZone.on('drop', function(e) {
			e.preventDefault();
			// 드롭다운 영역 css
			dropZone.css('background-color', '#FFFFFF');
	
			var files = e.originalEvent.dataTransfer.files;
			if (files != null) {
				if (files.length < 1) {
					/* alert("폴더 업로드 불가"); */
					console.log("폴더 업로드 불가");
					return;
				} else {
					selectFile(files)
				}
			} else {
				alert("ERROR");
			}
		});
	}
	

	// 파일 선택시
	function selectFile(fileObject) {
		var files = null;

		if (fileObject != null) {
			// 파일 Drag 이용하여 등록시
			files = fileObject;

		}

		// 다중파일 등록
		if (files != null) {

			if (files != null && files.length > 0) {
				$("#fileDragDesc").hide();
				$("#fileListTable").show();
			} else {
				$("#fileDragDesc").show();
				$("#fileListTable").hide();
			}

			for (var i = 0; i < files.length; i++) {
				// 파일 이름
				var fileName = files[i].name;
				console.log(fileName)
				var fileNameArr = fileName.split("\.");
				console.log(fileNameArr)
				// 확장자
				var ext = fileNameArr[fileNameArr.length - 1];
				console.log(ext)
				var fileSize = files[i].size; // 파일 사이즈(단위 :byte)
				console.log(fileSize)
				if (fileSize <= 0) {
					console.log("0kb file return");
					return;
				}

				var fileSizeKb = fileSize / 1024;
				var fileSizeMb = fileSizeKb / 1024;

				var fileSizeStr = "";
				if ((1024 * 1024) <= fileSize) { // 파일 용량이 1메가 이상인 경우 
					console.log("fileSizeMb=" + fileSizeMb.toFixed(2));
					fileSizeStr = fileSizeMb.toFixed(2) + " Mb";
				} else if ((1024) <= fileSize) {
					console.log("fileSizeKb=" + parseInt(fileSizeKb));
					fileSizeStr = parseInt(fileSizeKb) + " kb";
				} else {
					console.log("fileSize=" + parseInt(fileSize));
					fileSizeStr = parseInt(fileSize) + " byte";
				}

				/* if ($.inArray(ext, [ 'exe', 'bat', 'sh', 'java', 'jsp', 'html', 'js', 'css', 'xml' ]) >= 0) {
					// 확장자 체크
					alert("등록 불가 확장자");
					break; */
				if ($.inArray(ext, [ 'hwp', 'doc', 'docx', 'xls', 'xlsx',
						'ppt', 'pptx', 'txt', 'png', 'pdf', 'jpg', 'jpeg',
						'gif', 'zip' ]) <= 0) {
					// 확장자 체크
					/* alert("등록이 불가능한 파일 입니다.");
					break; */
					alert("등록이 불가능한 파일 입니다.(" + fileName + ")");
				} else if (fileSizeMb > uploadSize) {
					// 파일 사이즈 체크
					alert("용량 초과\n업로드 가능 용량 : " + uploadSize + " MB");
					break;
				} else {
					// 전체 파일 사이즈
					totalFileSize += fileSizeMb;

					// 파일 배열에 넣기
					fileList[fileIndex] = files[i];

					// 파일 사이즈 배열에 넣기
					fileSizeList[fileIndex] = fileSizeMb;
					fileSizeStrList[fileIndex] = fileSizeStr;

					// 업로드 파일 목록 생성
					addFileList(fileIndex, fileName, fileSizeStr);

					// 파일 번호 증가
					fileIndex++;
				}
			}
		} 
		else {
			alert("ERROR");
		}
	}

		
	// 업로드 파일 목록 생성
	function addFileList(fIndex, fileName, fileSizeStr) {
		/* if (fileSize.match("^0")) {
			alert("start 0");
		} */

		var html = "";
		html += "<tr id='fileTr_" + fIndex + "'>";
		html += "    <td id='dropZone' class='left'>";
		html += "    <a href='/rot/fileDownLoad?seq=" + fIndex + "'>";
		html += fileName
				+ " ("
				+ fileSizeStr
				+ ") "
				+ "</a>"
				+ "<input value='삭제' type='button' href='#' onclick='deleteFile("
				+ fIndex + "); return false;'>"
		html += "    </td>"
		html += "</tr>"

		$('#fileTableTbody').append(html);
	} /* addFileList 함수 끝 */

	
	// 업로드 파일 삭제
	function deleteFile(fIndex) {
		console.log("deleteFile.fIndex=" + fIndex);
		// 전체 파일 사이즈 수정
		totalFileSize -= fileSizeList[fIndex];
		console.log(totalFileSize)

		// 파일 배열에서 삭제
		delete fileList[fIndex];

		// 파일 사이즈 배열 삭제
		delete fileSizeList[fIndex];

		// 업로드 파일 테이블 목록에서 삭제
		$("#fileTr_" + fIndex).remove();

		if (totalFileSize > 0) {
			$("#fileDragDesc").hide();
			$("fileListTable").show();
		} else {
			$("#fileDragDesc").show();
			$("fileListTable").hide();
		}

	} /* deleteFile 함수 끝 */
</script>

</head>
<body>

<div class="container">

<h1>부패신고</h1>
<hr>

<!-- 부패 정보 신규, 추가, 저장, 삭제  -->
<div style="border: 1px solid; padding: 10px;">
<form id="mainForm" action="/rot/ste" method="get">
	<table>
		<tr align="left">
			<th>
				<button type="button" id="fileViewBtn">파일보기</button>
				<button type="button" id="addBtn">추가</button>
				<button type="button" id="saveBtn">저장</button>
				<button type="button" id="deleteBtn">삭제</button>
			</th>
		</tr>
		<tr align="left">
			<th>
				<label>신고일자</label>
				<input type="text" id="startDate" name="startDate"/>
				<i></i>
				<span>~</span>
				<input type="text" id="endDate" name="endDate"/>
				<i></i>
				<button type="button" id="oneWeek">1주</button>
				<button type="button" id="twoWeek">2주</button>
				<button type="button" id="oneMonth">1개월</button>
				<button type="button" id="sixMonth">6개월</button>
				<button type="button" id="searchBtn">조회</button>
			</th>
		</tr>
		<tr align="left">
			<th>
				<span>신고구분</span>
				<select id="searchType" name="searchType">
					<option value="">전체</option>
					<option value="admin">행정</option>
					<option value="corp">공사</option>
					<option value="human">인사</option>
					<option value="other">기타</option>
				</select>
				<span>신고내용</span>
				<input type="text" id="keyword" name="keyword"/>
			</th>
		</tr>
	</table>
</form>
</div>


<!-- 부패신고 리스트 -->
<div style="margin-top: 10px;">
	<table id="listTable" style="border: 1px solid black;">
		<thead>
		<tr>
			<td width="5%" style="border: 1px solid;"><input type="checkbox"  id="checkAll" onclick="checkAll();"/></td>
			<td width="10%" style="border: 1px solid;">신고번호</td>
			<td width="20%" style="border: 1px solid;">부패신고 명</td>
			<td width="10%" style="border: 1px solid;">성명</td>
			<td width="15%" style="border: 1px solid;">연락처</td>
			<td width="15%" style="border: 1px solid;">이메일</td>
			<td width="10%" style="border: 1px solid;">소속</td>
			<td width="15%" style="border: 1px solid;">신고일자</td>
		</tr>
		</thead>
		<tbody id="listBody"></tbody>
		
	</table>
</div>


<!-- 부패신고 폼 -->
<div style="margin-top: 10px;">
<form id="createForm" method="post" enctype="multipart/form-data">
	<table style="border: 1px solid black;">
		<tr>
			<th style="border: 1px solid;">부패신고명*</th>
			<td colspan="3" style="border: 1px solid;"><input type="text" id="steNm" name="steNm"></td>
		</tr>
		<tr>
			
		</tr>
		<tr>
			<th style="border: 1px solid;">성명*</th>
			<td style="border: 1px solid;"><input type="text" id="nm" name="nm"></td>
			<th style="border: 1px solid;">연락처*</th>
			<td style="border: 1px solid;"><input type="tel" id="cttpc" name="cttpc"></td>
		</tr>
		<tr>
			<th style="border: 1px solid;">이메일*</th>
			<td style="border: 1px solid;"><input type="email" id="email" name="email"></td>
			<th style="border: 1px solid;">소속</th>
			<td style="border: 1px solid;">
				<select id="psitn" name="psitn">
					<option selected="selected"></option>
					<option value="admin">행정</option>
					<option value="corp">공사</option>
					<option value="human">인사</option>
					<option value="other">기타</option>
				</select>
		    </td>
<!-- 			<td style="border: 1px solid;"><input type="text" id="psitn" name="psitn"></td> -->
		</tr>
		<tr>
			<th style="border: 1px solid;">신고일자*</th>
			<td colspan="3" style="border: 1px solid;">
				<input type="text" id="regDtm" name="regDtm">
			</td>
		</tr>
		<tr>
			<th colspan="4" style="border: 1px solid;">신고내용</th>
		</tr>
		<tr>
			<td colspan="4" style="border: 1px solid;">
				<textarea id="steDes" name="steDes" rows="6" style="width: 99.6%; text-align: left"></textarea>
			</td>
		</tr>
		<tr style="height: 180px;">
			<th colspan="1">첨부파일</th>
			<td colspan="3" style="width: 500px; border: 1px solid; vertical-align:baseline;">
			
<!-- 파일 업로드 참조 -->				
<!-- https://mrsohn.tistory.com/entry/html-jquery-%ED%8C%8C%EC%9D%BC-%EC%97%85%EB%A1%9C%EB%93%9C-Drag-and-drop -->		
			<div class="upload-btn-wrapper" id="upload-btn-wrapper">
				<button type="button" id="uploadBoxBtn">파일추가 </button>	
				<input type="file" id="file" name="file"  multiple="multiple" value="파일선택">
			</div>
			<div id="dropZone" style="width: 410px; height: 140px; border-style: solid; border-color: black; display: none">
				<div id="fileDragDesc"> 파일을 드래그 해주세요. </div>
			
				<table id="fileListTable" width="100%" border="0px">
					<tbody id="fileTableTbody">
	
					</tbody>
				</table>
			</div>
	
			</td>
		</tr>
	</table>
</form>
</div>


</div><!-- .container 끝  -->

</body>
</html>