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
<%
	String uid = (String) session.getAttribute("id");
	if(uid==null){
		response.sendRedirect("/member/login.jsp");
	}//로그인이 안되면 로그인페이지로 강제이동
	
	session.setAttribute("id", uid); //세션의 시간을 연장해준다.
%>

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
		ResultSet rs = stmt.executeQuery("SELECT * FROM tbvisit ORDER BY no DESC");
		
		while(rs.next()){
	%>
	<tr><td colspan=2></td></tr>
	<td><%= rs.getString("no") %><hr></td>
	<td><%= rs.getString("name") %><hr></td>
	<td colspan=2><%= rs.getString("memo") %><hr></td>
<%	
		}
%>
</table>

</div>

<%@ include file="/_footer.jsp" %>
</body>
</html>