<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="_header.jsp" %>
<%
	String uid = (String) session.getAttribute("id");
	if(uid == null){
		response.sendRedirect("login.html");
	}
%>
<h1>Hello World 홍길동</h1>
</body>
</html>