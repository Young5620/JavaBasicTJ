<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String uid = request.getParameter("id");
	String ups = request.getParameter("ps");
	String una = request.getParameter("name");
	
	String sql = "INSERT INTO user(id,password,NAME) VALUES";
	sql += "('" + uid + "','" + ups + "','" + una + "')";
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/test","root","0000");
	Statement stmt = conn.createStatement();
	
	int count = stmt.executeUpdate(sql);
	if(count == 1){
		out.print("회원가입완료");
	}
	else {
		out.print("오류발생");
	}
%>