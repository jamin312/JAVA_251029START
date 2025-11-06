<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8" />
  <title>게시글 목록</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container-lg py-3">

  <div class="d-flex align-items-center justify-content-between mb-3">
  	<h3 class="mb-0">게시글 목록</h3>
  	<a href="/board/register" class="btn btn-outline-primary btn-sm">글 등록</a>
  </div>

  <c:if test="${empty list}">
    <div class="alert alert-light border text-center">게시글이 없습니다.</div>
  </c:if>

  <!-- 모든 댓글 패널의 공통 아코디언 부모 -->
  <div id="commentsAccordion" class="accordion">

    <c:forEach items="${list}" var="board">
      <article class="card mb-3">
        <div class="card-header d-flex justify-content-between">
          <strong>#<c:out value="${board.bno}"/></strong>
          <span class="ms-2 flex-grow-1"><c:out value="${board.title}" /></span>
          <span class="text-muted ms-2"><c:out value="${board.writer}"/></span>
        </div>

        <div class="card-body">
          <p class="mb-3"><c:out value="${board.content}"/></p>

          <div class="btn-group btn-group-sm" role="group" aria-label="actions">
          
  			<!-- 댓글 토글 버튼 -->
  				<button type="button"
          			class="btn btn-outline-primary"
          			data-bs-toggle="collapse"
          			data-bs-target="#replies-${board.bno}"
          			aria-expanded="false"
          			aria-controls="replies-${board.bno}">
    				댓글 보기
				</button>

  				<!-- 상세 보기: a 태그도 버튼처럼 -->
  				<a href="/board/modify?bno=${board.bno}" class="btn btn-outline-primary">
    				상세 보기
  				</a>
			</div>
        </div>

        <!-- 댓글 영역: 게시글 바로 아래에 출력, 아코디언(한 번에 하나만 열림) -->
        <div id="replies-${board.bno}"
             class="accordion-collapse collapse"
             data-bs-parent="#commentsAccordion">
          <div class="accordion-body border-top">
            <c:if test="${empty board.reply}">
              <div class="text-muted">댓글이 없습니다.</div>
            </c:if>
            <c:if test="${not empty board.reply}">
              <ul class="list-group list-group-flush">
                <c:forEach items="${board.reply}" var="reply">
                  <li class="list-group-item d-flex justify-content-between">
                    <div>
                      <strong>#<c:out value="${reply.rno}"/></strong>
                      <span class="ms-2"><c:out value="${reply.reply}"/></span>
                    </div>
                    <span class="text-muted"><c:out value="${reply.replyer}"/></span>
                  </li>
                </c:forEach>
              </ul>
            </c:if>
          </div>
        </div>

      </article>
    </c:forEach>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
