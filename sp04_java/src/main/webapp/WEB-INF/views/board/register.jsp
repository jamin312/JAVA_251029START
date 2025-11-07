<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>board/register.jsp</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    .card{border-radius:.75rem}
    .form-control{border-radius:.5rem}
    .btn{border-radius:999px}
  </style>
</head>
<body>
<div class="container-lg py-4">

  <h3 class="mb-3">게시글 <span class="text-primary"><c:out value="${empty board.bno ? '등록' : '수정'}"/></span></h3>

  <div class="card shadow-sm">
    <div class="card-body">
      <form method="post">
        <input type="hidden" name="bno" value="${board.bno}" />

        <div class="mb-3">
          <label class="form-label">제목</label>
          <input name="title" value="${board.title}" class="form-control" placeholder="제목 입력">
        </div>

        <div class="mb-3">
          <label class="form-label">작성자</label>
          <input name="writer" value="${board.writer}" class="form-control" placeholder="작성자">
        </div>

        <div class="mb-3">
          <label class="form-label">내용</label>
          <textarea name="content" class="form-control" rows="8" placeholder="내용 입력">${board.content}</textarea>
        </div>

        <div class="d-flex gap-2">
          <c:if test="${empty board.bno}">
            <button type="submit" formaction="/board/register" class="btn btn-primary">등록</button>
          </c:if>
          <c:if test="${not empty board.bno}">
            <button type="submit" formaction="/board/modify" class="btn btn-primary" onclick="return confirm('정말 수정하시겠습니까?');">수정</button>
          </c:if>
          <button type="submit" formaction="/board/delete" class="btn btn-outline-danger" onclick="return confirm('정말 삭제하시겠습니까?');">삭제</button>
        </div>
      </form>
    </div>
  </div>

</div>
</body>
</html>
