<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>글 수정 화면</h1>
<hr/>
<form action = "/board/BoardController?cmd=update" method="POST">
	<input type = "hidden" name = "id" value = "${board.id }"/>
	<input type ="text" name ="title" value ="${board.title }" placeholder="제목"/><br/>
	<textarea row ="5" cols = "50" name ="content" placeholder="내용">${board.content }</textarea></br>
	<input type ="submit" value ="수정완료"/>
</form>
</body>
</html>