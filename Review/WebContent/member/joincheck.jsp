<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
	request.setCharacterEncoding("utf-8");
	
	String una = request.getParameter("name");
	String uem = request.getParameter("email");
	String uid = request.getParameter("id");
	String ups = request.getParameter("ps");
	String uge = request.getParameter("gender");
	
	
	MemberDAO dao = new MemberDAO();
	if(dao.exist(uid)){
		response.sendRedirect("/member/join.jsp");
	}
	if(dao.insert(una,uem,uid,ups,uge)){
		session.setAttribute("id", uid);
		response.sendRedirect("/main.jsp");
	}
%>