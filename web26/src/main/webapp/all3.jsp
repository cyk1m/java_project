<%@page import="shop.dto.ProductDTO"%>
<%@page import="shop.db.ProductDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	ProductDAO dao = new ProductDAO();
    	ArrayList<ProductDTO> list = dao.read();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
전체 제품 목록의 개수: <%= list.size() %>개<br>
<hr color="green">
<table border=1>
	<tr bgcolor="yellow">
		<th>아이디</th>
		<th>제목</th>
		<th>내용</th>
		<th>작성자</th>
	</tr>
<%
	for(ProductDTO dto : list){ //for-each를 더 선호!
%>
	<tr bgcolor="pink">
		<td><%= dto.getId() %></td>
		<td>
		<a href="http://localhost:8889/web26/read3.jsp?id=<%= dto.getId() %>">
		<%= dto.getName() %>
		</a>
		</td>
		<td><%= dto.getContent() %></td>
		<td><%= dto.getPrice() %></td>
	</tr>
<% } %>
</table>
</body>
</html>