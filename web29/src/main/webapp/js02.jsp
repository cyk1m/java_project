<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
// 자바 스크립트는 변수에 들어가는 데이터의 타입이 값이 들어갈 때 결정됨!!(선언시x)
	name = prompt('당신의 이름을 입력하세요...')
	age = prompt('당신의 나이를 입력하세요...') //입력하는건 다 String(숫자넣어도)
	age2 = parseInt(age) + 1
	alert('당신의 이름은 ' + name + '이고, 내년 나이는 ' + age2 + '입니다.')
</script>
</head>
<body>

</body>
</html>