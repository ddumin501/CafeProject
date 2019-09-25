<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
   	<title>Rserve</title>
<!--     <script src="/redu/resources/wordcloud2/htmlwidgets-0.8/htmlwidgets.js?ver=2"></script>
	<link href="/redu/resources/wordcloud2/wordcloud2-0.0.1/wordcloud.css" rel="stylesheet" />
	<script src="/redu/resources/wordcloud2/wordcloud2-0.0.1/wordcloud2-all.js"></script>
	<script src="/redu/resources/wordcloud2/wordcloud2-0.0.1/hover.js"></script>
	<script src="/redu/resources/wordcloud2/wordcloud2-binding-0.2.0/wordcloud2.js?ver=2"></script> -->
</head>
<body>
<h1>테마카페지도</h1> 
<hr>
<%if(request.getAttribute("content") != null) { %>
${content}		
<%}%>
<%if(request.getAttribute("mapChartName") != null) { %>
<iframe src="${mapChartName}" width="100%" height="430" seamless></iframe>
<%}%> 

<DIV class='aside_menu'>
  <FORM name='frm' method='GET' action='./list.jsp'>
      <SELECT name='col'> <!-- 검색 컬럼 -->
        <OPTION value='none'>전체 목록</OPTION>
        <OPTION value='rname'>카페명</OPTION>
        <OPTION value='title'>주소</OPTION>
        <OPTION value='content'>테마</OPTION>
      </SELECT>
      <input type='text' name='word' value='' placeholder="특수문자는 사용할수 없습니다.">
      <button type='submit'>검색</button>    
  </FORM>
  <DIV class='menu_line' style='clear: both;'></DIV>
</DIV>
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
