<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	My HomePage

	<%!String makeItLower(String data) {
		return data.toLowerCase();
	}%>

	<%
		int count = 34;
	%>
	<h1>
		나의 나이는
		<%=count%>
		입니다.
	</h1>
	<h2>
		HELLO WORLD를 소문자로 변경하면
		<%=makeItLower("HELLO WORLD")%></h2>
</body>
</html>