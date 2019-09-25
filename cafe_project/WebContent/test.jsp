<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>
<%@page import="dao.CafeDAO"%>
<%@page import="vo.CafeVO"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H1>cafelist.jsp 출력.</H1>

<% ArrayList<CafeVO> list = (ArrayList<CafeVO>)request.getAttribute("cafelist");
for(CafeVO vo  : list){
	out.println("<h1><a href ='http://localhost:8081/cafeproject/CafeServlet2?no=" + vo.getNo() +"'>" +
	vo.getName() + "</a><br>" + vo.getZone() + "</h1><br><br>");
	}
%>


</body>
</html>