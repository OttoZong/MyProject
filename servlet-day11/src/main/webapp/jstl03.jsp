<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.*,java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<style>
		.row1{
			background-color:#fff8dc;
		}
		.row1{
			background-color:#f0f0f0;
		}
	</style>
</head>
<body>
	<%
		List<User> users= new ArrayList<User>();
		for(int i = 0;i<8;i++){
			User user = new User();
			user.setUsername("用戶" + i);
			user.setGender("m");
			user.setAge(22 + i);
			users.add(user);
		}
		request.setAttribute("users", users);
	%>
	<table width="60%" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td>用戶名</td><td>性別</td><td>年齡</td>
			<td>index</td><td>count</td>
		</tr>
		<c:forEach items="${users}" var="u"
		varStatus="s">
			<tr class="row${s.index % 2 + 1 }">
				<td>${u.username}</td>
				<td>${u.gender}</td>
				<td>${u.age}</td>
				<td>${s.index}</td>
				<td>${s.count}</td>				
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>