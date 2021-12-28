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
	String strcnt = (String) application.getAttribute("counter");
	int count = (strcnt == null) ? 0:Integer.valueOf(strcnt);
	out.print("방문자수: " + count);
	application.setAttribute("counter", String.valueOf(++count));
	//껐다가 다시 키면 방문자수가 reset이 되기때문에 DB에 저장해서 쓴다.
%>
</body>
</html>