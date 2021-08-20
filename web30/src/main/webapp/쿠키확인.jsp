<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//쿠키 가져오기(브라우저->서버니 request)
    	Cookie[] cookies = request.getCookies();
    	for(Cookie c: cookies){
    		//out: 브라우저에 텍스트로 프린트하고자 하는 경우
    		//out.print(c.getName() + ", " + c.getValue() + "<br>");
    		
    		//Q.쿠키의 이름이 age인 값만 프린트해보세요.
    		if(c.getName().equals("age")){
    			out.print(c.getValue());
    		}
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
쿠키의 개수: <%= cookies.length %>개
</body>
</html>