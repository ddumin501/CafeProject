<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String detail = request.getParameter("detail");
// ajax jquery 함수 요청 - 응답
//--> json: {"auth" : true, "time" : "2019-01-23" } 논리값은 "" ㄴㄴ
String result = "";
// 여기에서 search로 맞는 내용들 DB에서 긁어와서 쓰면 되겠네
	result = "{\"auth\" : " + detail + "}"; // json 쉽게 쓰기 위한 API 사용해봐라
 // html태그 다 빼야함 ㅎㅎ
%>
<%=result%>