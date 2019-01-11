<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="ckeditor/ckeditor.js" type="text/javascript"></script>
</head>
<body>
	
	<form action="" method="post" name="form">
		
		<textarea name="content" id="content" rows="10" cols="80"></textarea>
		<input type="submit" value="送出">
	
	</form>
	<script type="text/javascript">
			CKEDITOR.replace('content',{});
	
	</script>
	
</body>
</html>