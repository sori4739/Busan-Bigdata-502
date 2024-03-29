<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%

	User u1 = new User(1,"ssar@nate.com","홍길동");
	User u2 = new User(2,"love@nate.com","하트");
	User u3 = new User(3,"sori@nate.com","소리");
	User u4 = new User(4,"yeah@nate.com","예아");
	User u5 = new User(5,"lilpump@nate.com","릴펌");
	
	ArrayList<User> list = new ArrayList<>();
	list.add(u1);
	list.add(u2);
	list.add(u3);
	list.add(u4);
	list.add(u5);

	
%>
<h1>for를 사용한 table</h1>
<table border = "1">
	<tr>
	<th>번호</th>
	<th>이메일</th>
	<th>이름</th>
	</tr>
	<% for(int i = 0; i<list.size(); i++){%>
	<tr>
		<td><%= list.get(i).getId() %></td>
		<td><%= list.get(i).getEmail() %></td>
		<td><%= list.get(i).getName() %></td>
	</tr>
	<% } %>
</table>
<h1>forEach를 사용한 table</h1>
<table border ="1">
	<tr>
		<th>번호</th>
		<th>이메일</th>
		<th>이름</th>
	</tr>
	<%for(User u :list){%>
		<tr>
		<td><%= u.getId() %></td>
		<td><%= u.getEmail()%></td>
		<td><%= u.getName()%></td>
		</tr>
	<%} %>
</table>

</body>
</html>