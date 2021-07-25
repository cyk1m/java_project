<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String title = request.getParameter("title");
    String author = request.getParameter("author");
    String word = request.getParameter("word");
    String kind = request.getParameter("kind");
    String part = request.getParameter("part");
    String date = request.getParameter("date");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>서버에서 받은 값들 정리</h3>
<hr color = "blue">
서버에서 받은 제목 : <%= title %><br>
서버에서 받은 글쓴이 : <%= author %><br>
서버에서 받은 내용 : <%= word %><br>
서버에서 받은 종류 : <%= kind %><br>
서버에서 받은 부서 : <%= part %><br>
서버에서 받은 날짜 : <%= date %><br>

</body>
</html>