<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action = "/Script/HomeController" method = "Get">
<input type = "text" name = "email"/><br/>
<input type = "submit" value = "����"/>
</form>
<form action = "/Script/HomeController" method = "POST">
<input type = "text" name = "email"/><br/>
<input type = "submit" value = "����"/>
</form>
</body>
</html>