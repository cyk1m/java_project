<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	session.setAttribute("id2", id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(session.getAttribute("id") != null){ %>
받은 id값: <%= session.getAttribute("id2") %>
<% } %>
<form action="news.jsp"><button>News</button></form><br>
<form action="mail.jsp"><button>Mail</button></form><br>
<form action="cafe.jsp"><button>Cafe</button></form><br>
</body>
</html>