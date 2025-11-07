<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<title>게시글 목록</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
	<div class="container-lg py-3">

		<div class="d-flex align-items-center justify-content-between mb-3">
			<h3 class="mb-0">게시글 목록</h3>
			<a href="/board/register" class="btn btn-outline-primary btn-sm">글
				등록</a>
		</div>

		<c:if test="${empty list}">
			<div class="alert alert-light border text-center">게시글이 없습니다.</div>
		</c:if>

		<!-- 모든 댓글 패널의 공통 아코디언 부모 -->
		<div id="commentsAccordion" class="accordion">

			<c:forEach items="${list}" var="board">
				<article class="card mb-3">
					<div class="card-header d-flex justify-content-between">
						<strong>#<c:out value="${board.bno}" /></strong> <span
							class="ms-2 flex-grow-1"><c:out value="${board.title}" /></span>
						<span class="text-muted ms-2"><c:out
								value="${board.writer}" /></span> <span class="vr mx-2"></span>
						<fmt:formatDate value="${board.regdate}" pattern="yyyy-MM-dd" />

					</div>

					<div class="card-body">
						<p class="mb-3">
							<c:out value="${board.content}" />
						</p>

						<div class="btn-group btn-group-sm" role="group"
							aria-label="actions">

							<!-- 댓글 토글 버튼 -->
							<button type="button" class="btn btn-outline-primary"
								data-bs-toggle="collapse" data-bs-target="#replies-${board.bno}"
								aria-expanded="false" aria-controls="replies-${board.bno}">
								댓글 보기</button>

							<!-- 상세 보기: a 태그도 버튼처럼 -->
							<a href="/board/modify?bno=${board.bno}"
								class="btn btn-outline-primary"> 상세 보기 </a>
						</div>
					</div>

					<!-- 댓글 영역: 게시글 바로 아래에 출력, 아코디언(한 번에 하나만 열림) -->
					<div id="replies-${board.bno}" class="accordion-collapse collapse"
						data-bs-parent="#commentsAccordion">
						<div class="accordion-body border-top">

							<!-- 댓글 입력 행: 가운데 reply, 우측 replyer + 버튼 -->
							<form class="row g-2 align-items-start mb-3" method="post"
								action="/reply/register">
								<input type="hidden" name="bno" value="${board.bno}" />

								<!-- 중간: 댓글 내용 -->
								<div class="col-12 col-md-8">
									<textarea name="reply" rows="3"
										class="form-control form-control-sm" placeholder="댓글을 입력하세요"></textarea>
								</div>

								<!-- 우측: 작성자 -->
								<div class="col-6 col-md-2">
									<input type="text" name="replyer"
										class="form-control form-control-sm" placeholder="작성자">
								</div>

								<!-- 우측 끝: 등록/초기화 버튼 -->
								<div class="col-6 col-md-2 d-grid gap-2">
									<button type="submit" class="btn btn-outline-primary btn-sm"
										formaction="/reply">등록</button>
									<button type="reset" class="btn btn-outline-secondary btn-sm">초기화</button>
								</div>
							</form>

							<!-- 댓글 목록 -->
							<c:choose>
								<c:when test="${empty board.reply}">
									<div class="text-muted">댓글이 없습니다.</div>
								</c:when>
								<c:otherwise>
									<ul class="list-group list-group-flush">
										<c:forEach items="${board.reply}" var="reply">
											<li class="list-group-item">
												<div
													class="d-flex justify-content-between align-items-start">

													<!-- 좌측: 첫 줄(번호 + 내용), 둘째 줄(날짜 | 작성자) -->
													<div class="flex-grow-1 pe-3">
														<!-- 첫 줄: 번호 + 내용(옆으로) -->
														<div class="d-flex align-items-baseline flex-wrap">
															<strong>#<c:out value="${reply.rno}" /></strong> <span
																class="ms-2 text-break"><c:out
																	value="${reply.reply}" /></span>
														</div>

														<!-- 둘째 줄: 날짜 | 작성자 -->
														<div
															class="small text-muted mt-1 d-flex align-items-center flex-wrap">
															<fmt:formatDate value="${reply.replydate}"
																pattern="yyyy-MM-dd HH:mm" />
															<span class="vr mx-2"></span> <span><c:out
																	value="${reply.replyer}" /></span>
														</div>
													</div>

													<!-- 우측: 삭제 버튼 -->
													<form method="post" class="ms-2">
														<input type="hidden" name="rno" value="${reply.rno}" /> <input
															type="hidden" name="bno" value="${board.bno}" />
														<button type="submit"
															class="btn btn-outline-danger btn-sm"
															formaction="/reply/${reply.rno}">삭제</button>
													</form>

												</div>
											</li>
										</c:forEach>
									</ul>
								</c:otherwise>
							</c:choose>

						</div>
					</div>

				</article>
			</c:forEach>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
