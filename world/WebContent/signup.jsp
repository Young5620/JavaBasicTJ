<%@page import="dao.MemberDAO"%>
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
	
	/*String sql = "INSERT INTO user(id,password,NAME) VALUES";
	sql += "('" + uid + "','" + ups + "','" + una + "')";*/
	
	//1.드라이버로드
	/* Class.forName("com.mysql.jdbc.Driver");
	//2.DB연결
	Connection conn = DriverManager.getConnection(
	"jdbc:mysql://localhost:3306/test","root","0000"); */
	//3.SQL구문
	/* Statement stmt = conn.createStatement(); */
	//4.결과받기
	
	MemberDAO dao = new MemberDAO();
	int count = dao.insert(uid,ups,una);
	/* int count = stmt.executeUpdate(sql); */
	if(count == 1){
		out.print("회원가입완료");
	}
	else {
		out.print("오류발생");
	}
%>