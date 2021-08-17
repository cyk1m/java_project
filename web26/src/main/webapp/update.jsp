<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	String name = request.getParameter("name");
    	String tel = request.getParameter("tel");
    	회원Bag bag = new 회원Bag();
    	bag.setId(id);
    	bag.setName(name);
    	bag.setTel(tel);
    	회원DAO2 dao = new 회원DAO2();
    	int result = dao.update(bag);
    	String text = "회원정보 수정에 실패했습니다. 재시도해주세요.";
    	if(result == 1){
    		text = "회원정보 수정을 성공했습니다.";
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
실행 결과는 <%= text %>
</body>
</html>