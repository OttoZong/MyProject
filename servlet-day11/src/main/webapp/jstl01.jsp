<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="font-size:30px;">
	<%
		User user = new User();
		user.setUsername("建國");
		user.setGender("m");
		request.setAttribute("user", user);
	%>
	用戶名:${user.username}
	性別:<c:if test="${user.gender == 'm'}">男</c:if>
	</br></br></br>	
	性別:<c:if test="${user.gender == 'm'}">男</c:if>
	<c:if test="${user.gender != 'm'}">女</c:if>
	</br>
	
	性別:<c:if test="${user.gender == 'm'}" var="rs" scope="request">男</c:if>
	<c:if test="${!rs}">女</c:if>

</body>
</html>