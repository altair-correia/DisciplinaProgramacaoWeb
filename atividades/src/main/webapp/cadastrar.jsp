<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar Novo Encontro</title>
</head>
<body>
<h3>Cadastrar Novo Encontro</h3>
<form action="ServeletControlador" method="post">
	<input type="hidden" name="acao" value="confirmarCadastro">
	Nome:   <input type="text" name="nomePessoa" value=""><br>
	Motivo: <input type="text" name="motivo" value=""><br>
	Local:  <input type="text" name="local" value=""><br><br>
	<input type="submit" value="Registrar Encontro"><br>
</form>
<br><a href="ServeletControlador">Voltar ao menu principal</a>
</body>
</html>