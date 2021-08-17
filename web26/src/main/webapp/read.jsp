<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	//DB처리하는 DAO에 주면서 탈퇴하는 SQL문을 만들어 전송
    	
    	//가방을 만들어서 데이터를 넣자.
    	회원Bag bag = new 회원Bag();
    	bag.setId(id);
    	
    	//DAO를 만들어서 탈퇴요청!!
    	회원DAO2 dao = new 회원DAO2();
    	회원Bag bag2 = dao.read(bag); //변수명은 상관x
//     	ResultSet rs = dao.read(bag);
//     	String text = "회원 정보 검색 요청에 실패했습니다. 재시도해주세요.";
//     	if(rs == 1){
//     		text = "회원 정보 검색을 성공했습니다.";
//     	}
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<%-- 처리 결과는 <%= text %> --%>
<h3>회원정보 검색 결과입니다.</h3>
<hr>
검색된 id는 <%= bag2.getId() %><br>
검색된 pw는 <%= bag2.getPw() %><br>
검색된 name는 <%= bag2.getName() %><br>
검색된 tel는 <%= bag2.getTel() %><br>
</body>
</html>