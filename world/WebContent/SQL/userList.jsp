<%@page import="java.sql.*"%>

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
Class.forName("com.mysql.jdbc.Driver"); //드라이버 로딩
Connection conn = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/test", "root","0000");
//객체 생성
Statement  stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM user");

String str = "";

while(rs.next()) {//다음꺼 리스트가 없을때까지 반복
	str += rs.getString("no")+ "," + rs.getString("id") + "," + rs.getString("password") + "," + rs.getString("name") + "," + rs.getString("timestamp") + "<br><hr>" ;
}

out.print(str);





%>
</body>
</html>
