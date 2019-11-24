<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록보기</title>
</head>
<body>
<h1>게시판</h1>
<hr/>
<a href="/board/BoardController?cmd=writeForm">글쓰기</a>
<table border = "1">
<tr>
	<td>ID</td>
	<td>TITLE</td>
</tr>
<c:forEach var="b" items="${boards }">
		<tr>
			<td>${b.id}</td>
			<td><a href = "/board/BoardController?cmd=detail&id=${b.id}">${b.title}</a></td>
		</tr>
</c:forEach>
</table>
</body>
</html>