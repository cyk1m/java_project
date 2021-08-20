<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
//미리 만들어서 넣어놓은 객체: 내장된 객체
//window, location, console, history, document
	result = confirm('배가 고프신가요??') //confirm, alert는 window객체
	if(result){
		alert('밥 먹으러 갑시다!!')
	}
	console.log('내가 콘솔에 찍혀요.') //console객체
	document.write('내가 body부분에 찍혀요.')
	location.href = 'http://www.naver.com'

//  js에는 equals가 없다!!
// 	n1 = '100' //String
// 	n2 = 100   //int
// 	alert(n1 == n2) //타입에 상관없이 값 비교 가능. true
// 	alert(n1 === n2) //타입도 동일한지 비교 가능. false
</script>
</head>
<body>

</body>
</html>