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
		장바구니 내역 들어가는 부분
	</div>
</div>


</body>
</html>