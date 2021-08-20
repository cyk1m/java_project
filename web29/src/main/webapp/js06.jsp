<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/out.js"></script> <!-- js파일로 script태그 사이 내용(함수)을 밖으로 빼는 방법도 있다! -->
<script type="text/javascript" src="js/out2.js"></script>
<script type="text/javascript">
//스크립트 내 호출한 함수 순차적으로 실행됨
	div() //위에 링크 걸어둔 것에서 함수를 불러올 수 있다.
	alert('나는 html문서에 실행되는 추가된 자바스크립트@@@@')
</script>
</head>
<body>
<button style="background: yellow;" onclick="add(10, 20)">더하기 기능 처리</button>
<button style="background: pink" onclick="minus(100, 200)">빼기 기능 처리</button>
<button style="background: skyblue" onclick="move()">사이트로 이동 기능 처리</button>
</body>
</html>