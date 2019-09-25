<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="vo.CafeVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table{
border:1px solid black;
margin : auto;
text-align: center;
}
</style>


</head>
<body>
<h2>detail</h2>


<% 
CafeVO cafeinfo = (CafeVO)request.getAttribute("cafeinfo");
%>
	
<table>
<tr><td>카페이름</td><td> <%=cafeinfo.getName()%></td></tr>
<tr><td>주소</td><td> <%=cafeinfo.getAddr()%> </td></tr>
<tr><td>소분류</td><td> <%=cafeinfo.getTheme()%> </td></tr>
<tr><td>전화번호</td><td> <%=cafeinfo.getTel()%> </td></tr>
<tr><td>오픈시간</td><td> <%=cafeinfo.getOpentime()%> </td></tr>
<tr><td>판매메뉴</td><td> <%=cafeinfo.getMenu()%> </td></tr>
<tr><td>블로그, 홈페이지 링크</td><td> <%=cafeinfo.getLink_page()%> </td></tr>
<tr><td>인스타 링크</td><td> <%=cafeinfo.getLink_insta()%> </td></tr>
<tr><td>분위기</td><td> <%=cafeinfo.getStyle()%> </td></tr>
<tr><td>인기토픽</td><td> <%=cafeinfo.getTopic()%> </td></tr>
<tr><td>방문목적</td><td> <%=cafeinfo.getPurpose()%> </td></tr>
<tr><td>단체석,예약,주차 등</td><td> <%=cafeinfo.getOptions()%> </td></tr>
<tr><td>소개</td><td> <%=cafeinfo.getIntro()%> </td></tr>
<tr><td>예약자리뷰 수</td><td> <%=cafeinfo.getRview()%> </td></tr>
<tr><td>블로그리뷰 수</td><td> <%=cafeinfo.getBview()%> </td></tr>
<tr><td>tv출연정보</td><td> <%=cafeinfo.getTv()%> </td></tr>


</table>
