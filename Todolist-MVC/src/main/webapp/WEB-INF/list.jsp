<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="dao.*,model.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table class="table" border="1">
		<tr class="table_header">
			<td>username</td>
			<td>List</td>
			<td>todo</td>

		</tr>
		<c:forEach items="${lists}" var="u" varStatus="s">
			<tr class="row${s.index % 2 + 1}">
				<td>${u.username}</td>
				<td>${u.list}</td>
				<td>${u.todo}</td>
				<td><a href="del.do?id=${u.username}"
					onclick="return confirm('確定刪除${u.username}嗎?');">刪除</a>&nbsp;</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>