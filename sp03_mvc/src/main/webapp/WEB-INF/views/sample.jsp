<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/sample.jsp</title>
</head>
<body>
<form action="/sample/ex01">
	<label>이름</label>
	<input name="name">
	<label>나이</label>
	<input name="age">
	<label>생일</label>
	<input name="birth" type="date">
	<label>프로필</label>
	<input name="profile" type="file">
	<button>등록</button>
</form>
</body>
</html>