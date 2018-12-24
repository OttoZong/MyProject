<%@ page pageEncoding="utf-8"
contentType="text/html; charset=utf-8"%>
<%@ page import="dao.*,entity.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>listUsers</title>
		<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
		<link rel="stylesheet" type="text/css"
			href="css/style.css" />
	</head>
		<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<p>
							2009/11/20
							<br />
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						用户列表
					</h1>
					<table class="table">
						<tr class="table_header">
						<td>
							ID
						</td>
						<td>
							用戶名
						</td>
						<td>
							密碼
						</td>
						<td>
							電話
						</td>
						<td>
							操作
						</td>
					</tr>
					<%
						UserDAO dao = new UserDAO();
						List<User> users = 
								dao.findAll();
						for(int i = 0; i<users.size(); i ++){
							User u = users.get(i);
						%>
						<tr class="row<%=i % 2 + 1%>">
							<td>
								<%=u.getId()%>
							</td>
							<td>
								<%=u.getUsername()%>
							</td>
							<td>
								<%=u.getPwd()%>
							</td>
							<td>
								<%=u.getPhone()%>
							</td>
							<td>
								<a href="listUsers.html">删除</a>&nbsp;
							</td>
						</tr>
						<%
						}
					%>
					</table>
					<p>
					 <input type="button"
					 class="button"
					 value="添加用戶"
					 onclick="location='addUser.jsp'"/>
					</p>
				</div>
			</div>
			<%@ include file="footer.jsp" %>
		</div>
	</body>
	
</html>