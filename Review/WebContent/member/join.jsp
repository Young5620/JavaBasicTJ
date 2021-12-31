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

<div class="alert alert-info" role="alert">
  회원 가입
</div>
<div class="container">
<form action="joincheck.jsp">
  <div class="row mb-3">
    <label for="inputEmail3" class="col-sm-2 col-form-label">이름</label>
    <div class="col-sm-10">
      <input type="text" name="name" class="form-control" id="inputName">
    </div>
  </div>
  <div class="row mb-3">
    <label for="inputEmail3" class="col-sm-2 col-form-label">이메일</label>
    <div class="col-sm-10">
      <input type="email" name="email" class="form-control" id="inputEmail">
    </div>
  </div>
  <div class="row mb-3">
    <label for="inputEmail3" class="col-sm-2 col-form-label">아이디</label>
    <div class="col-sm-10">
      <input type="text" name="id" class="form-control" id="inputId">
    </div>
  </div>
  <div class="row mb-3">
    <label for="inputPassword3" class="col-sm-2 col-form-label">비밀번호</label>
    <div class="col-sm-10">
      <input type="password" name="ps" class="form-control" id="inputPassword">
    </div>
  </div>
  <fieldset class="row mb-3">
    <legend class="col-form-label col-sm-2 pt-0">성별</legend>
    <div class="col-sm-10">
      <div class="form-check">
        <input class="form-check-input" type="radio" name="gender" id="gridRadios1" value="남성" checked>
        <label class="form-check-label" for="gridRadios1">
          남자
        </label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio" name="gender" id="gridRadios2" value="여성">
        <label class="form-check-label" for="gridRadios2">
          여자
        </label>
      </div>
    </div>
  </fieldset>
  <button type="submit" class="btn btn-primary">회원가입</button>
</form>
</div>
<%@ include file="/_footer.jsp" %><!-- / 절대경로로 지정 -->
</body>
</html>