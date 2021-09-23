<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dados Pessoais</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	
	<form action="ServletTela1Cadastro">
	<h1>Preencha seus dados pessoais:</h1>
		Nome: <input type="text" name="nome">
		Sobrenome: <input type="text" name="sobrenome"> <br> <br>
		Endereço Residencial: <br> <br>
		Rua: <input type="text" name="rua"> <br>
		Complemento: <input type="text" name="complemento"> <br>
		Cidade: <input type="text" name="cidade"> <br>
		CEP: <input type="text" name="cep"> <br>
		Estado: <input type="text" name="estado"> <br> <br>
		<input type="submit" value="Próxima Tela">
	</form>
</body>
</html>