<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<jsp:useBean id="user" class="tw.ottozong.bean.UserData" scope="session" />
	
	
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>savePage</title>
</head>
<body>
    
      <form method="post" action="showPage.jsp">
          First name: <input type="text" name=firstName ><br>
          Last Name: <input type="text" name=lastName ><br>
          Age: <input type="text" name=age ><br>
        <input type="submit" name="submit" value="Save">
     </form>
	
	
	<A HREF="showPage.jsp">Continue</A>

</body>
</html>