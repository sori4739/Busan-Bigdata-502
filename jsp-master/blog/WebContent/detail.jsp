<%@page import="models.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>detail 페이지입니다.</h1>
<%-- <%
	User user = (User)request.getAttribute("user");
%>
id : <%= user.getId() %> <br/>
name : <%= user.getName() %> <br/>
email : <%= user.getEmail() %> <br/>
password : <%= user.getPassword() %> <br/> --%>

id : ${user.id}<br/>
name : ${user.name}<br/>
email : ${user.email}<br/>
password : ${user.password}<br/>
</body>
</html>