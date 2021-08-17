<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/out.css">
</head>
<body>
	<!-- 화면 구성(divide) -->
	<div id="total">
		<div id="top">
			<!-- 상단 메뉴바를 top.jsp에 따로 만들어 회원가입, 제품정보 등의 페이지에 끼우기 -->
			<!-- 끼워주는 태그 (.html에서는 이 태그를 쓸 수 없다) -->
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
			<form action="insert2.jsp">
				아이디: <input name="id"><br> 제목: <input name="title"><br>
				내용: <input name="content"><br> 작성자: <input
					name="writer"><br>
				<button>게시판 글쓰기 처리</button>
			</form>
			<h3>제품 하나 검색</h3>
			<form action="read3.jsp">
				ID: <input name="id"><br>
				<button>제품 하나 검색 처리</button>
			</form>
			<a href="all3.jsp">제품 모든 목록 가지고 오는 페이지 호출</a>
		</div>
	</div>


</body>
</html>