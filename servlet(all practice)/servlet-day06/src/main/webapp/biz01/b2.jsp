<%@ page pageEncoding="utf-8" 
contentType="text/html; charset=utf-8"%>
<html>
	<head></head>
	<body style="font-size:30px;">
		b2...<br/>
		<a href="../biz01/b1.jsp">訪問b1</a><br/>
		<a href="<%=request.getContextPath()%>/biz01/b1.jsp">訪問b1(使用絕對路徑)</a>
	</body>
</html>