<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	$('#b3').click(function() {
		contentTag = $('#content')
		contentValue = $('#content').val()
		result1Tag = $('#result1')
		result1Tag.append('<font color=blue>' + contentTag.val() + '</font><br>')
		contentTag.val('')
	})
});
// 이렇게 써도 동일한 결과됨
// $(function() {
// 	$('#b3').click(function() {
// 	     result1Tag = $('#result1')
// 	     result1Tag.append('<font color=blue>' + $('#content').val() + '</font><br>')
//     	 $('#content').val('')
//    })
// });
	
</script>
</head>
<body>
	댓글입력:	<input id='content'>
	<button id=b3>댓글달기</button>
	<hr color=red>
	<div id='result1'></div>
</body>
</html>