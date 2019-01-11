<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
<script
	  src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function(){
			$('#btnok').click(function(){
				var fillname=$('#fillname').val();
				$.ajax({
					type:"POST" ,
					data:{fillname:fillname},
					url:'ajaxconnection',
					success:function(result){
						$('#result1').html(result);
						
					}
				});
			});
		});
	
	</script>
</head>
<body>
	
	<form >
		
		Name<input type="text" id="fillname"> 
			<input type="button"value="ok" id="btnok"> 
			<span id="result1"></span>
	
	</form>
	
</body>
</html>