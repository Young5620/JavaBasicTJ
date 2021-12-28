<%--
지시어 direvtive
: 페이지 처리를 위해 부가적인 정보를 정의하는 데 이용
@annotation

page - JSP처리 방법을 정의 import 한글설정
include - 다른 문서를 포함 header,footer
taglib - 태그 라이브러리 JSTL JSP Standard Tag Library
 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- Get방식에서 한글처리: charset=UTF-8" pageEncoding="UTF-8" --%>
<%@ page import="java.util.Date" %>
<% //post 방식에서 한글처리 
request.setCharacterEncoding("utf-8"); 
%>
<html>
<head>
<!-- HTML 주석 -->
<%-- JSP 주석 --%>
</head>
<body>
<%! //선언문
String res="";

%>
<%@ include file="_header.jsp" %>
<!-- include 지시어를 사용할 때 주의할 점은 두 파일간에 이름이 같은 변수가 있으면 안된다.
	일반자바에서와 똑같이 충돌이 일어나게 된다. 
-->
    <% //여기 사이에는 자바나라
    	/*
    	스크립트릿 내에 정의된 코드는 서블릿 변환시 그대로 삽입된다. 따라서 java코드 형태로 실행된다.
    	*/
    	String uid = request.getParameter("id");
    	String ups = request.getParameter("ps");
    	
    	res = "<h3>User ID : " + uid + "</h3>";
    	res += "<h4>User PS : " + ups + "</h4>";
    	
    	//System.out.println(res);
    	out.print(res); //웹상에 출력할때 문법
    	out.print("<br>");//줄바꿈 할때 
    	out.print((new Date()).toString());
    	
    %>
</body>
</html>