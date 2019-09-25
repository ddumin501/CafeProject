<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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

</body>
</html>