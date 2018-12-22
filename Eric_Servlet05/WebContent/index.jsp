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
		用戶名:<input type="text" name="username" id="username">
		密碼:<input type="password" name="password" id="password">
		性別:<input type="radio" name="gender" value="male">男
			<input type="radio" name="gender" value="female">女
		<br>鄉鎮:<select name="city">
				<option value="*">--請選擇--</option>
				<option value="A">台北市</option>
				<option value="B">台北縣</option>
				<option value="C">桃園市</option>
				<option value="D">台中市</option>
				<option value="E">台南市</option>
				<option value="F">高雄市</option>
			</select><br>
			
			愛好<input type="checkbox" name="likes" value="sing">唱歌
				<input type="checkbox" name="likes" value="play">運動
				<input type="checkbox" name="likes" value="game">遊戲<br>
			自傳<br><textarea rows="6" cols="60"></textarea><br>
			圖片:<input type="file" name="/image"><br><br>
			<input type="hidden" name="sent" value="u1234">
	</form>
	
</div>


</body>
</html>