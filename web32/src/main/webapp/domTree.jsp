<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h3 {
	background: olive;
	width: 300px;
	height: 50px;
	font-family: "궁서";
	font-size: 30px;
	font-weight: bold;
	font-style: italic;	
}
#result1{
	background: blue;
	color: white;
	width: 300px;
	height: 50px;
	font-family: "맑은 고딕";
	font-size: 30px;
	font-weight: bold;
	font-style: italic;	
}
.c1{
	background: pink;
}
body ul{ /* body 아래의 자(식)손(자) 중에서 ul들을 찾아라. */
	color: red;
}
body > ul{ /* body "바로 아래"의 자식 중에서 ul을 찾아라. */
	list-style: square;
}
body > #result2 > ul{
	text-decoration: underline;
	list-style: circle;
}
</style>
</head>
<body>
	<h3>좋아하는 과목</h3>
	<ul>
		<li class="c1">컴퓨터</li>
		<li class="c1">영어</li>
		<li class="c1">마케팅</li>
	</ul>
	<div id='result1'>결과가 보여지는 부분</div>
	<div id='result2'>
		<span>나는 결과야1</span>
		<ul>
			<li>오늘은 목요일</li>
			<li>내일은 금요일</li>
		</ul>
	</div>
</body>
</html>