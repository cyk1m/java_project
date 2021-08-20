<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/js07.css">
<script type="text/javascript">
	function move() {
		id = prompt('ID를 입력하세요.')
		pw = prompt('PW를 입력하세요.')
		if(id == 'apple' && pw == '1234'){
			alert('일치!!')
			location.href="http://www.naver.com"
		}else {
			alert('불일치!!!!')
			location.href="http://www.daum.net"
		}
	}
	function pay(x) {
		member = prompt('1)일반, 2)vip')
		if(member == '1'){
			alert(x + (x * 0.1))
		}else if (member == '2'){
			alert(x - (x * 0.1))
		}
	}
</script>
</head>
<body>
ID와 PW가 일치 시 네이버로 이동,<br>
불일치 시 다음으로 이동합니다.<br>
<button style="background: red" onclick="move()">@@로그인@@</button><br>
<button style="background: red" onclick="pay(1000)">@@결제@@</button><br>
</body>
</html>