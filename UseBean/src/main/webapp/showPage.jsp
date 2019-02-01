<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<jsp:useBean id="user" class="tw.ottozong.bean.UserData" scope="session" />
	<jsp:setProperty name="user" property="*" />
	
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>savePage</title>
</head>
<body>


	 You entered:  <%=user.getFirstName() %><%=user.getLastName() %><BR>
	 
	 First Name:<%=user.getFirstName()%><BR> 
	 Last Name:<%=user.getLastName()%><BR> 
	 Age:<%=user.getAge()%><BR>
	<BR><BR><BR>
	
	
	<A HREF="savePage.jsp">Continue</A>

</body>
</html>