<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DEMO Page</title>
</head>
<body>

	<form method="POST" 
		action="newproduct" name="todolist" id="todolist" enctype="multipart/form-data">
		<h3>TODOLIST</h3>
		<p>你要做的事情(LIST)</p>
		<p><input type="text" name="todo" />
		
		<p>你要做的事情(DOTO)</p>
		<p><input type="text" name="list" />
		
		<p><input type="submit" name="CreateNewList" value="新增"/>
	</form>

</body>
</html>