<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% //스크립트릿: 자바 코드의 일부분
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String id2 = "root"; //디비에 있는거라 치고(DAO쓰기 복잡해서 일단)
    	String pw2 = "pass";
    	String result = "로그인 실패";
    	if(id.equals(id2) && pw.equals(pw2)){
			result = "로그인 성공";
			//로그인 성공하고 나서, id를 세션으로 잡아주어야 한다.
			//세션도 내장된 객체로 제공된다.
			//자바의 내장된(Built-in): 미리 객체를 만들어서 제공되는 객체!
			//					    request, response, session, out, application
			//자바스크립트의 내장된 객체: location, window, document, history, console
			//HttpSession session = new HttpSession();
			session.setAttribute("id", id); //브라우저가 닫히기 전까지 세션값을 꺼내쓸 수 있다.
    	}else{
    		out.print("재로그인해주세요<br>"); //자바 안에서 html을 출력하고자하는 경우 out을 쓴다.
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
로그인 결과: <%= result %> <!-- 표현식(expression): 출력용 -->
<!-- 세션 잡혔는지 아닌지 체크하고자 하는 경우 세션이 null인지를 체크  -->
<!-- id세션이 잡혀있다는 것은(!=null) 로그인이 성공했다는 의미로 해석!! -->
<% if(session.getAttribute("id") != null){ %>
	세션 id값은: <%= session.getAttribute("id") %>
	<a href="logout.jsp">로그아웃 처리</a>
<% } %>
</body>
</html>