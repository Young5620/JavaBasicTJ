<%@page import="dao.MemoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

	String ume = request.getParameter("memo");
	String sna = (String) session.getAttribute("name");
	
	MemoDAO dao = new MemoDAO();
	
	if(dao.insert(sna,ume)) response.sendRedirect("/main.jsp");
%>