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
			$('#sent').click(function(){
				var AllTest=$('#username','#password','#gender','#city','#likes','#/image').val();
				$.ajax({
					type:"POST" ,
					data:{AllTest:AllTest},
					url:'AllTest',
					success:function(result){
						$('#result1').html(result);
						
					}
				});
			});
		});
	
	</script>
</head>
<body>
<div>

	<form action="" method="post">
		�Τ�W:<input type="text" name="username" id="username">
		�K�X:<input type="password" name="password" id="password">
		�ʧO:<input type="radio" name="gender" value="male">�k
			<input type="radio" name="gender" value="female">�k
		<br>�m��:<select name="city">
				<option value="*">--�п��--</option>
				<option value="A">�x�_��</option>
				<option value="B">�x�_��</option>
				<option value="C">��饫</option>
				<option value="D">�x����</option>
				<option value="E">�x�n��</option>
				<option value="F">������</option>
			</select><br>
			
			�R�n<input type="checkbox" name="likes" value="sing">�ۺq
				<input type="checkbox" name="likes" value="play">�B��
				<input type="checkbox" name="likes" value="game">�C��<br>
			�۶�<br><textarea rows="6" cols="60"></textarea><br>
			�Ϥ�:<input type="file" name="/image"><br><br>
			<input type="hidden" name="sent" value="u1234">
	</form>
	
</div>


</body>
</html>