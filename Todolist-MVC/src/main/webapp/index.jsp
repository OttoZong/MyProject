
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<jsp:useBean id="list" class="model.User" scope="session" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>TODOLIST System</title>
</head>
<body>
	<h1>TODOLIST</h1>
	<form method="post" action="list">
          Name: <input type="text" name=username ><br><br>
          
        <input type="submit" name="submit" value="確認">
     </form>


	
</body>
</html>