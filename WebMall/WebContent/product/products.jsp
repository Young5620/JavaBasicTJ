<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="/_header.jsp" %>

<div class="alert alert-secondary" role="alert">
<div class="container">
	<h1 class="display-3">제품목록</h1>
</div>
</div>

<%
	ArrayList<ProductDTO> products = (new ProductDAO()).getList();
%>
	<!-- ArrayList<costomerDTO> costomers = (new CostomerDAO()).getList();
	ArrayList<BoardDTO> boards = (new BoardDAO()).getList(); -->
<div class="container">
<div class="row" align="center"></div>
<!-- <반복문설정> 시작 -->
<div class="col-md-4">
	<img src="사진명" style="width:100%">
	<h3>제품명</h3>
	<p>제품가격</p>원
	<p>상세보기</p>
</div>
<!-- <반복문설정> -->
</div>
<hr>


<%@ include file="/_footer.jsp" %>

</body>
</html>