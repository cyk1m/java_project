<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% //장바구니 구현 원리
    	session.setAttribute("count", 100); //Object <--변환-- int
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
현재 count: <%= session.getAttribute("count") %>
<hr>
<a href="page04.jsp">카운트값 증가</a>
<a href="page05.jsp">카운트값 확인</a>
</body>
</html>