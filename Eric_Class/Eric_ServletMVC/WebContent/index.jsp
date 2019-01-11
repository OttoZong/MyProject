<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript" src="css/bootstrap.css"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
</head>
<body>

	<div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6">選單
			<form action="Serlvet" method="POST">
				<div class="form-group">
					<label for="exampleInputAccess">Access</label> <input type="text"
						class="form-control" id="exampleInputAccess" placeholder="Access">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Email address</label> <input
						type="email" class="form-control" id="exampleInputEmail1"
						placeholder="Email">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Password</label> <input
						type="password" class="form-control" id="exampleInputPassword1"
						placeholder="Password">
				</div>
				<div>
					<label>你喜好的運動</label>
				</div>
				<div class="checkbox">
					<label><input type="checkbox" name="like" value="單車">單車</label> 
					<label><input type="checkbox" name="like" value="重機">重機</label> 
					<label><input type="checkbox" name="like" value="三輪車">三輪車</label>
					<label><input type="checkbox" name="like" value="公車">公車</label> 
					<label><input type="checkbox" name="like" value="捷運">捷運</label>
				</div>


				<button type="submit" class="btn btn-default">登入</button>
				<!-- name="status" value="saveName" -->
				<input type="hidden" name="status" value="saveName">
			</form>
		</div>
	</div>
	<div class="col-md-3"></div>
</body>
</html>