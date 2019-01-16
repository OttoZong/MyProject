<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC - User Management</title>
</head>
<body>
	<form method="post" action="handleRegister.do">
	<h3>用戶註冊</h3>
	<p>用戶名</p>
	<p><input type="text" name="username" />
	<p>密碼</p>
	<p><input type="text" name="password" />
	<p>手機號碼</p>
	<p><input type="text" name="phone" />
	<p>電子郵箱</p>
	<p><input type="text" name="email" />
	<p><input type="submit" value="註冊" />
	</form>
	
	
</body>
</html>