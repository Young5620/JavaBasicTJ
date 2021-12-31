<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String uid = request.getParameter("id");
	String ups = request.getParameter("ps");
	
	String dbps = "0000";
	MemberDAO dao = new MemberDAO();
	
	if(ups.equals(dbps)){
		session.setAttribute("id", uid); //세션에 저장 유저아이디
		out.print("로그인성공");
		response.sendRedirect("main.jsp");
	}
	else {
		out.print("비밀번호가 틀렸습니다");
		response.sendRedirect("login.html");
	}
%>
</body>
</html>