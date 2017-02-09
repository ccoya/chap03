<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>HTML 문서의 제목</title>
</head>
<body>
<% 
	String BookTitle = "JSP 프로그래밍";
	String author = "최범균";
%>
<b><%= BookTitle %></b> (<%= author %>)입니다.
	

</body>
</html>