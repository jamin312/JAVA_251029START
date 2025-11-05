<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board/register.jsp</title>
</head>
<body>
<h3>게시글 등록</h3>
	<form method="post" action="/board/register">
		<label>작성자</label>
		<input name="writer">
		<label>내용</label>
		<input name="title">
		<textarea name="content" placeholder="내용 입력"></textarea>
		<button type="submit">등록</button>
	</form>
</body>
</html>