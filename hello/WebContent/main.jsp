<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할 일 목록보기</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<%@ include file = "_header.jsp"%>
<%
	String uid = (String) session.getAttribute("id");
	if(uid == null){
		response.sendRedirect("login.html");
	}
%>
<main>
<div class="alert alert-primary" role="alert">
 
</div>
</main>
<%@ include file = "_footer.jsp"%>
</body>
</html>