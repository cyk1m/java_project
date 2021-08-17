<%@page import="shop.dto.게시판Bag"%>
<%@page import="shop.db.게시판DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	//DB처리하는 DAO에 주면서 탈퇴하는 SQL문을 만들어 전송
    	
    	//가방을 만들어서 데이터를 넣자.
    	게시판Bag bag = new 게시판Bag();
    	bag.setId(id);
    	
    	//DAO를 만들어서 탈퇴요청!!
    	게시판DAO dao = new 게시판DAO();
    	게시판Bag bag2 = dao.read(bag);
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<h3>회원정보 검색 결과입니다.</h3>
<hr>
<table>
<tr>
<td>검색된 id는 </td>
<td><%= bag2.getId() %></td>
</tr>
<tr>
<td>검색된 title는 </td>
<td><%= bag2.getTitle() %></td>
</tr>
<tr>
<td>검색된 content는 </td>
<td><%= bag2.getContent() %></td>
</tr>
<tr>
<td>검색된 writer는 </td>
<td><%= bag2.getWriter() %></td>
</tr>
</table>
</body>
</html>