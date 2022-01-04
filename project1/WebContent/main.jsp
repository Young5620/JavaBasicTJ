<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="javax.naming.NamingException" %>
<%@ page import = "util.*" %>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="/_header.jsp" %>

<div class="alert alert-info" role="alert">
메인 페이지
</div>

<div class="container">
<form action="/memo/memocheck.jsp">
<div class="form-floating">
  <textarea class="form-control" name="memo" placeholder="Leave a comment here" id="floatingTextarea2" style="height: 100px"></textarea>
  <label for="floatingTextarea2">메모</label>
</div>
<button class="w-100 btn btn-lg btn-primary" type="submit">입력완료</button>
</form>
<table align=center>
<%		
		Connection conn = ConnectionPool.get();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM tbvisit");
		
		while(rs.next()){
	%>
	<tr><td colspan=2><hr></td></tr>
	<td><%= rs.getString("no") %></td>
	<td><%= rs.getString("name") %></td>
	<td colspan=2><%= rs.getString("memo") %></td>
<%	
		}
%>
</table>

</div>

<%@ include file="/_footer.jsp" %>
</body>
</html>