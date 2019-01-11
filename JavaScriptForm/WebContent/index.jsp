<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function callservlet(methodType){
	document.getElementById("helloworldForm").action="helloservlet";
	document.getElementById("helloworldForm").method=methodType;
	document.getElementById("helloworldForm").submit();
	
}

function showgender(){
	document.getElementById("radioForm").action="helloservlet";
	document.getElementById("radioForm").method='POST';
	document.getElementById("radioForm").submit();
}

function showcheckbox(){
	document.getElementById("checkboxForm").action="helloservlet";
	document.getElementById("checkboxForm").method='POST';
	document.getElementById("checkboxForm").submit();
}

</script>

</head>
<body>
	<form id="helloworldForm">
		UserName:<input type="text" name="username" width="20">
		<button type="button" onclick="callservlet('GET')">doGet</button>
		<button type="button" onclick="callservlet('POST')">doPOST</button>
	
	</form>
	
	<form id="radioForm">		
		Male:<input type="radio" value="male" name="gender" checked="checked">
		Female:<input type="radio" value="female" name="gender">
		<input type="button" value="show" onclick="showgender('POST')">
			
	</form>
	
	<form id="checkboxForm">		
		Language1<input type="checkbox" value="Lang1" name="languages" checked="checked"><br>
		Language2<input type="checkbox" value="Lang2" name="languages" ><br>
		Language3<input type="checkbox" value="Lang3" name="languages" ><br>
		Language4<input type="checkbox" value="Lang4" name="languages" ><br>
		Language5<input type="checkbox" value="Lang5" name="languages" ><br>
		<input type="button" value="show" onclick="showcheckbox('POST')">		
	</form>
	
	
</body>
</html>