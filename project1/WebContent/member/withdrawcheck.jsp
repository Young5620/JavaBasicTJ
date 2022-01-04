<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String uid = request.getParameter("id");
	String ups = request.getParameter("ps");
	String sid = (String) session.getAttribute("id");

	
	
	MemberDAO dao = new MemberDAO();
	
	if(dao.exist(uid) == false){
		response.sendRedirect("withdraw.jsp");
	}
	
	if(uid.equals(sid)){
		if(dao.delete(sid)){
			response.sendRedirect("join.jsp");	
		}
		else{
			response.sendRedirect("withdraw.jsp");
		}
	}
	else{
		response.sendRedirect("withdraw.jsp");
	}
	
%>