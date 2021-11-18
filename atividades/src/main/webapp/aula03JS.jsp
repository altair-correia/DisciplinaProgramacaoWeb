<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aula de Javascript</title>
<script type="text/javascript">
	function logar() {
		var loginInput = document.getElementById("login");
		var senhaInput = document.getElementById("senha");
		var formulario = document.getElementById("formulario");
		
		if (loginInput.value == "") {
			alert("Digite o login");
			
		} else if (senhaInput.value == ""){
			alert("Digite a senha");
			
		} else {
			formulario.action = "TesteLogin"; 
			formulario.submit(); 
		}
		
	}
	
	function limparCampos() {
		document.getElementById("formulario").reset();
	}
	
	function recuperarSenha() {
		var loginInput = document.getElementById("login");
		var link = document.getElementById("esqueceu");
		var caminho = "RecuperarSenhaServlet?usuario="+loginInput.value;
		
		if (loginInput.value == "") {
			alert("Digite o login! Campo não pode ser vazio");
		} else {
			link.href = caminho; 
		}
		
		/*var senhaInput = document.getElementById("senha");
		var link = document.getElementById("esqueceu");
		var caminho = "RecuperarSenhaServlet?usuario="+senhaInput.value;
		
		if (senhaInput.value == ""){
			alert("Digite a senha! Campo não pode ser vazio");
		} else {
			link.href = caminho; 
		}*/
	}
</script>
</head>
<body>
<form id="formulario">
	Login: <input id="login" type="text" name="Login"><br><br>
	Senha: <input id="senha" type="password" name="senha"><br><br>
	<!--img alt="Enviar" src="https://via.placeholder.com/100x40/3498ff/000000/?text=Enviar" onclick="logar()" -->
	<input type="button" value="Enviar" onclick="logar()">
	<input type="button" value="Limpar Campos" onclick="limparCampos()"><br><br>
	<a id="esqueceu" href="#" onclick="recuperarSenha()">Esqueceu a senha?</a>
</form>
</body>
</html>