<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增產品</title>
</head>
<body>

	<h1>新增產品</h1>
	<form action="nuevproducts" name="frmm" method="POST" id="frm" enctype="multipart/form-data">
		<table>
			<tr>
				<td><label for="">Nombre</label> </td>
				<td><input type="text" name="nombre" id="nombre"></td>
			</tr>
			<tr>
				<td><label for="">Descripcion</label> </td>
				<td><textarea cols="30" rows="6" name="descripcion" id="descripcion"> </textarea> </td>
			</tr>
			<tr>
				<td><label for="">Precio</label> </td>
				<td><input type="text" name="precio" id="precio"></td>
			</tr>
			<tr>
				<td><label for="">Categoria</label> </td>
				<td><input type="text" name="categoria" id="categoria"></td>
			</tr>
			<tr>
				<td><label for="">Detalles</label> </td>
				<td><textarea cols="30" rows="6" name="detalles" id="detalles"> </textarea> </td>
			</tr>
			<tr>
				<td><label for="">Revuews</label> </td>
				<td><textarea cols="30" rows="6" name="revuews" id="revuews"> </textarea> </td>
			</tr>
			<tr>
				<td><label for="">Size</label> </td>
				<td>
					<select name="size" id="size">
						<% for(int i=1;i<=20;i++){ %>
							<option value="<%=i%>" ><%=i%></option>
						<%} %>
					</select>
				</td>
			</tr>
			<tr>
				<td><label for="">Color</label> </td>
				<td><input type="text" name="color" id="color"> </td>
			</tr>
			<tr>
				<td><label for="">Images</label> </td>
				<td><input type="file" name="file[]" id="archivos" multiple> </td>
			</tr>
			<tr>
				<td><label for=""></label> </td>
				<td><input type="Submit" name="Create Product" id="btncreate[rpducto"> </td>
			</tr>
		
		</table>
	
	
	
	
	</form>
	
	
	
	
	
</body>
</html>