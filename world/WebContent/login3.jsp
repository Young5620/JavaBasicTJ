<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 	//post 방식에서 한글처리 
	request.setCharacterEncoding("utf-8");
	String uid = request.getParameter("id");
	String ups = request.getParameter("ps");
%>

<h3>User ID : <%=uid %></h3>
<h4>User PS : <%=ups %></h4>
<h6>현재 시간은 <%=(new Date()).toString()%>입니다.</h6>
</body>
</html>