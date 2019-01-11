<%@ page import="java.util.*,java.text.*" 
contentType="text/html;charset=utf-8"
pageEncoding="utf-8"%>
<html>
	<head></head>
	<body style="font-size: 30px;">
		新年好
		current:
		<%
			Date date2 = new Date();
			SimpleDateFormat sdf =
					new SimpleDateFormat("yyyy-MM-dd");
		%>
		<%=sdf.format(date2) %>
		<br/>
		now:<%
			Date date = new Date();
			out.println(date);
		%>
		<br/>
		now:<%=new Date()%> <br/>
		
		<%
			for (int i = 0; i < 100; i++) {
				out.println("balabala<br/>");
			}
		%>
	</body>
</html>