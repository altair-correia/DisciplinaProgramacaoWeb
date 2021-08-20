<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agenda</title>
</head>
<body>
	<form action="ServletAgenda" method="post">
		<h2>AGENDA</h2>
		<table border="0" cellpadding="1">
			<tr>
				<td><label>NOME</label></td>
				<td><input type="text" name="nome" /></td>
			</tr>
			<tr>
				<td><label>TELEFONE</label></td>
				<td><input type="text" name="telefone" /></td>
			</tr>
			<tr>
				<td><label>DATA DE NASCIMENTO</label></td>
				<td><input type="text" name="nascimento" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Enviar" /> <input
					type="reset" value="Limpar" /></td>
			</tr>
		</table>
	</form>
</body>
</html>