<%@ page pageEncoding="utf-8" 
contentType="text/html; charset=utf-8"%>
<html>
	<head></head>
	<body style="font-size:30px;">
		<form action="<%=request.getContextPath()%>/path">
			用戶姓名:<input name="uname"/>
			<input type="submit" value="Confirm"/>
		</form>
	</body>
</html>