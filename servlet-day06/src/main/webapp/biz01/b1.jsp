<%@ page pageEncoding="utf-8" 
contentType="text/html; charset=utf-8"%>
<html>
	<head></head>
	<body style="font-size:30px;">
		b1...<br/>
		<a href="../biz01/b2.jsp">訪問b2</a><br/>
		<a href="<%=request.getContextPath()%>/biz01/b2.jsp">訪問b2(使用絕對路徑)</a>
	</body>
</html>