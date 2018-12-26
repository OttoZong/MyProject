<%@page import="tw.com.lccnet.bean.Customer.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- java 註解 --%>
<!-- html 註解 -->
	<%--
	
	scope="session" 建構子只有一次傳值.
	scope="request" 建構子可以多次傳值.
	--%>
	<jsp:useBean id="customer" class="tw.com.lccnet.bean.Customer" scope="request"></jsp:useBean>
	
	<jsp:setProperty property="*" name="customer"/>
	
	<jsp:getProperty property="id" name="customer"/>
	<jsp:getProperty property="name" name="customer"/>
	<jsp:getProperty property="age" name="customer"/>
<%--
	***0分程式碼***
	***在web裡面寫java是不好的,給人開後洞***
	Customer cus =(Customer)session.getAttribute("customer");
	
	if(cus==null){
		cus=Class.forName("tw.com.lccnet.bean.Customer").newInstance();
	}
--%>

<%--
	Date date = new Date();
		request.getParameter(arg0);
	String d = date.toString;
	//Class C大寫表示反射.
	Class Clazz = request.getClass();
	System.out.print(clazz);
--%>

</body>
</html>