<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //1. 전송된 데이터 받아줘야 함.
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String name = request.getParameter("name");
    	String tel = request.getParameter("tel");
    	//jsp에서 자동 import: 클릭 후, ctrl+shift+m (자바에서는 ctrl+shift+o)
    	회원Bag bag = new 회원Bag();
    	bag.setId(id);
    	bag.setPw(pw);
    	bag.setName(name);
    	bag.setTel(tel);
    	
    	회원DAO2 dao = new 회원DAO2();
    	int result = dao.create(bag); //result = 0 or 1
    	String text = "회원 가입 실패했습니다. 재가입해주세요.";
    	if(result == 1){
    		text = "회원 가입 성공했습니다. 축하드립니다.";
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">
실행 결과는 <%= text %>
</body>
</html>