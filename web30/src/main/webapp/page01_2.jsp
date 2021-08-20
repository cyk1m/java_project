<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//쿠키 세션 정리문제
    	//쿠키 바로삭제는 setMaxAge(0)으로 다시 심는다.
    	//1. 쿠키 객체 2개를 만든다.
    	Cookie c1 =  new Cookie("prefer_category", "운동");
    	Cookie c2 =  new Cookie("prefer_exercise", "축구");
    	//2. 쿠키를 브라우저에 심는다.
    	c1.setMaxAge(0); //쿠키의 생명. 0(초)으로 하면 바로 죽음
    	response.addCookie(c1);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
브라우저에 쿠키를 심었음.
</body>
</html>