<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String productId = request.getParameter("productId");
    	String productName = request.getParameter("productName");
    	String total = request.getParameter("total");
    	int total2 = Integer.parseInt(total);
    	String uId = request.getParameter("uId");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= uId %>님의 결제 내역은 아래와 같습니다.
<hr>
주문 물건의 id: <%= productId %> <br>
주문한 물건명: <%= productName %> <br>
주문 총금액: <%= total %> <br>
</body>
</html>