<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8"); //한글입력가능

	String uid = request.getParameter("id"); //입력받은값 가져옴
	String ups = request.getParameter("ps");
	
	MemberDAO dao = new MemberDAO();
	int code = dao.login(uid,ups);
	
	if(code==1){ //회원 아이디가 존재하지 않는 경우
		response.sendRedirect("join.jsp");
	}
	else if (code==2){ //회원 아이디는 있지만 비밀번호가 일치하지 않는 경우
		response.sendRedirect("login.jsp");
	}
	else{ //성공
		session.setAttribute("id",uid);
		response.sendRedirect("/main.jsp");
	}
%>