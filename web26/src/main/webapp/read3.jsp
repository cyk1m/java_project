<%@page import="shop.db.ProductDAO"%>
<%@page import="shop.dto.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	//DB처리하는 DAO에 주면서 탈퇴하는 SQL문을 만들어 전송
    	
    	//가방을 만들어서 데이터를 넣자.
    	ProductDTO dto = new ProductDTO();
    	dto.setId(id);
    	
    	//DAO를 만들어서 탈퇴요청!!
    	ProductDAO dao = new ProductDAO();
    	ProductDTO dto2 = dao.read(dto);
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="olive">
<h3>제품정보 검색 결과입니다.</h3>
<hr>
<table border=1>
<tr>
<td>아이디</td>
<td>제품명</td>
<td>내용</td>
<td>가격</td>
</tr>
<tr>
<td><%= dto2.getId() %></td>
<td><%= dto2.getName() %></td>
<td><%= dto2.getContent() %></td>
<td><%= dto2.getPrice() %></td>
</tr>
</table>
</body>
</html>