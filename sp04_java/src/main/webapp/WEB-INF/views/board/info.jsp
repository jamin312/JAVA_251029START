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
let bno = ${board.bno};

getList(); // 댓글 전체 조회
add(); // 댓글 등록
remove(); // 댓글 삭제

/* ----------------------------------------------- 
댓글 전체 조회
-------------------------------------------------*/
function getList() {
fetch(`http://localhost:81/board/\${bno}/reply`)
.then((res) => res.json())
.then((datas) => {
	let reply = document.querySelector("#replyList");
	for(data of datas){
		let newTag = `<div class="row" data-rno="\${data.rno}">
			<div class="col">\${data.replyer}</div>
			<div class="col">\${data.reply}</div>
			<div class="col"><button class ="btn btn-danger btnDelete me-3">삭제</button>
							<button class ="btn btn-success btnUpdate me-3">수정</button></div>
		</div>`;
		
		reply.insertAdjacentHTML("beforeend", newTag);
	}
});
}; // end getList

/* ----------------------------------------------- 
댓글 삭제
-------------------------------------------------*/

function remove() {$("#replyList").on("click", ".btnDelete", (e) => {
	const rno = ($(e.target).closest(".row").data("rno"));
	fetch(`/reply/\${rno}`, {method: 'DELETE'})
	.then(res => res.text())
	.then(result => {
		console.log(result + "건 삭제됨")
		$(e.target).closest(".row").remove();
	});
	
})
} // end test

/* ----------------------------------------------- 
댓글 등록
-------------------------------------------------*/

function add() {
$(".btnInsert").on("click", e => {
	// 인풋 태그 값을 콘솔에 출력
	const replyer = $("[name='replyer']").val();
	const reply = $("[name='reply']").val();
	fetch(`/reply`, {
		method: 'POST',
		// {reply, replyer} == {reply:reply, replyer:replyer} 축약형
		  body: JSON.stringify({
		    replyer: `\${replyer}`,
		    reply: `\${reply}`,
		    bno: `\${bno}`,
		  }),
		  headers: {
		    'Content-type': 'application/json; charset=UTF-8',
		  },
	})
	.then(res => res.json())
	.then(response => {
		console.log("등록 성공" + response);
		
/* 		let data = response.data;
		
		let reply = document.querySelector("#replyList");
		let newTag = `<div class="row" data-rno="\${data.rno}">
			<div class="col">\${data.replyer}</div>
			<div class="col">\${data.reply}</div>
			<div class="col"><button class ="btn btn-danger btnDelete me-3">삭제</button>
							<button class ="btn btn-success btnUpdate me-3">수정</button></div>
		</div>`;
		reply.insertAdjacentHTML("afterend", newTag); */
		location.reload(true);
		}); // end of then
	})
};

</script>
</body>
</html>