<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
</head>
<body>
	<h3>게시글 상세 보기</h3>
	<div>${board.bno}</div>
	<div>작성자: ${board.writer}</div>
	<div>내용 : ${board.content}</div>

	<hr>
	<div id="replyForm">
		<input id="replyer" name="replyer" placeholder="작성자"> <input
			id="reply" name="reply" placeholder="댓글 내용">
		<button type="button" class="btnInsert">댓글 작성</button>
	</div>
	<div id="replyList">
		<div class="row">
			<div class="col">작성자</div>
			<div class="col">댓글 내용</div>
			<div class="col"></div>
		</div>
	</div>

<script>
var bno = ${board.bno};
</script>
<script src="/resources/reply.js"></script>
</body>
</html>