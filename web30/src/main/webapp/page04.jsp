<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%
    	int count = (int)session.getAttribute("count");
 		//Object(참조형,8byte) --강제 변환--> int(4byte)
 		count++;
 		session.setAttribute("count", count); //(세션의 이름, 값) 증가된 변수를 다시 세션으로 잡아야함
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
현재 count: <%= session.getAttribute("count") %>
</body>
</html>