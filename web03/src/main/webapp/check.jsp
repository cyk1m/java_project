<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String id2 = "root";
	String pw2 = "1234";
	String result = "로그인 실패@@@"; //else체크 안 해도 되니 이게 더 좋은 코드
	if(id.equals(id2) && pw.equals(pw2)){
		result = "로그인 성공!!!";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 완료 페이지</title>
</head>
<body bgcolor="lime">
회원정보가 잘 도착했습니다.<br>
서버에 도착한 id는 <%= id %><br>
서버에 도착한 pw는 <%= pw %><br>
<hr> <!-- <hr>은 가로줄 -->
로그인 결과는 <%= result %>
</body>
</html>