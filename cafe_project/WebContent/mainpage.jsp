<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MainPage</title>
<script src="jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#searchb").on('click', function(){
		searchAjax();
	}); // on end
	$("#detailb").on('click', function(){
		detailAjax();
	}); // on end
}); // ready end

function searchAjax(){
	$.ajax({
		url : 'mainpage.jsp', //어디로?
		type : 'POST', //전송방식은?
		data : {'search':$("#search").val()}, // 무엇을?
		success : function(server_output){ // 서버 결과 받아오는 매개변수 여기서부터 받아옴
			// result = "{\"auth\" : true, \"time\" : \"2019-01-23\" }";
			// result = "{\"auth\" : false }";
			var jsonobj = JSON.parse(server_output);
			if(jsonobj.auth == true){
				// alert("ok");
				$("#here").html("여기에 그림을 넣을 것");
			} else {
				$("#here").html("여기에 다른 그림을 넣을 것");
				$("#here").css('border', '2px solid red');
			}
		},
		error : function(){alert("오류발생")},
		complete : function(){alert("통신완료")}
	}); // ajax함수 end
} // requestAjax end

function detailAjax(){
	$.ajax({
		url : 'detail.jsp', //어디로?
		type : 'POST', //전송방식은?
		data : {'detail':$("#detailb").val()}, // 무엇을?
		success : function(server_output){ // 서버 결과 받아오는 매개변수 여기서부터 받아옴
			// result = "{\"auth\" : true, \"time\" : \"2019-01-23\" }";
			// result = "{\"auth\" : false }";
			var jsonobj = JSON.parse(server_output);
			if(jsonobj.auth == true){
				// alert("ok");
				$("#here").html(jsonobj.auth + "에 정상적으로 로그인하셨습니다.");
				$("#here").css('border', '2px solid green');
			} else {
				$("#here").html("로그인 정보를 확인하세요.");
				$("#here").css('border', '2px solid red');
			}
		},
		error : function(){alert("오류발생")},
		complete : function(){alert("통신완료")}
	}); // ajax함수 end
} // requestAjax end
</script>
</head>
<body>
<h3>서울 테마카페 맵</h3>
<hr/>
<table border = "2px">
<tr><td>번호</td><td>제목</td><td>작성자</td><td>시간</td></tr>
<%
for(int i=0; i<5; i++){
	out.println("<tr><td>"+ 1 +"</td><td>"
	+"<a href='boarddetail.jsp?boardseq="
	+2+"'>"+ 3
	+"</a></td><td>"+ 4
	+"</td><td>"+ 5 + "</td></tr>");
}
%>
<!-- 
html input 태그 : 입력 -> css, jquery (id속성값)
html input 태그 : 입력 ->  전송받은 servlet, jsp 파일 파라미터 (name 속성값)
 -->
</table>
<form>
<input type="text" id="search" name="search">  <input type="button" id="searchb" value="검색"><br>
<input type="button" id="detailb" value="상세내용"><br>
</form>
<h3 id="here">   원 래 내 용      </h3>

</body>
</html>