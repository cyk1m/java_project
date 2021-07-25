<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- jsp엔 무조건 이 줄이 있어야한다! -->
<!-- 1. 서버로 전송된 데이터를 받아야 함. -->
<%
	// html 위에 자바 코드 써줌(<%로 시작)
	// HttpServletRequest request = new HttpServletRequest(); (톰캣에서 이부분은 해줌)
		String id = request.getParameter("id"); //id가 회원가입.html의 파라미터와 같은 이름이어야한다!!
		String pw = request.getParameter("pw"); //String(무조건! 외부입력이니까)으로 선언한 변수와 파라미터 변수명과 맞춰주는 것이 좋다!
		String name = request.getParameter("name"); 
		String tel = request.getParameter("tel");
%>
<!-- 2. DB에 받은 것을 넣어야 함 (new DAO) -->
<!-- 3. DB처리가 잘 되었는지 확인하는 메시지를 클라이언트에게 보내줘야 함 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "yellow">
회원 정보가 잘 도착하였음.<br>
서버에 도착한 id는 <%= id %><br>
서버에 도착한 pw는 <%= pw %><br>
서버에 도착한 이름은 <%= name %><br>
서버에 도착한 전화번호는 <%= tel %><br>
</body>
</html>