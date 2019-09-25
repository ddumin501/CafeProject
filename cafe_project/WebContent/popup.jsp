<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vo.CafeVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Poor+Story&amp;subset=korean" rel="stylesheet">
<style type="text/css">

@font-face {
  font-family:"Poor Story" ;
  font-style:normal;
  font-weight:narmal;
}

body {
  font-family: Poor Story !important;
  }

</style>
</head>



<body >

<h3>이 카테고리를 선택하신 분들의 워드 클라우드</h3>


<% 
CafeVO cafeinfo = (CafeVO)session.getAttribute("cafeinfo"); 


String[] category = new String[17] ;
category[0] = "갤러리";
category[1] = "공방";
category[2] = "동물";
category[3] = "만화방";
category[4] = "사주";
category[5] = "사진";
category[6] = "스터디";
category[7] = "슬라임카페";
category[8] = "아케이드";
category[9] = "음악";
category[10] = "이벤트카페";
category[11] = "이색카페";
category[12] = "책";
category[13] = "키즈";
category[14] = "테마카페";
category[15] = "플라워,가드닝카페";
category[16] = "힐링";

for(int i = 0; i <=16 ; i++ ){
if(cafeinfo.getCate().equals(category[i])) { %>
	<img src="img/wordcloud/<%=category[i]%>.jpeg" width = 80% height=400px>
<%
}
} //for문 마무리

%>


</body>
</html>