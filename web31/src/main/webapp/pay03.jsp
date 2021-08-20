<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>주문 정보입니다.</h3>
<hr color="red">
<form action="pay04.jsp">
주문 물건 id: <input type="text" name = "productId"><br>
주문 물건 name: <input type="text" name = "productName"><br>
주문 총금액: <input type="text" name = "total"><br>
주문한 사람 id: <input type="text" name = "uId" value = "summer"><br>
<button>결제하기</button>
<!-- 여기서는 주문 후 주문자 정보 등의 값을 다음 페이지에 넘겨줄 것이라 form과 name을 쓰는 것 -->
<!-- 그래서 여기서는 결제버튼에 onclick으로 함수 호출 안 씀 -->
</form>
</body>
</html>