<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Primeiro Exemplo de JavaScript</title>
	<script type="text/javascript" src="./scripts/codigo.js" charset="utf-8"></script>
	<script type="text/javascript">
		//alert("Olá Mundo!");
		//document.write("<h1>Olá Mundo!</h1>"); // Java reconhece aspas simples também
		
		//Tipos de váriaveis em JS
		var mensagem = "Alô Mundo!"; //Tipo String
		var idade = 33; //Tipo numérica
		var _altura= 1.90; //Tipo Flutuante (float)
		var isVerde = true; //Tipo Booleana (bool)
		var isAzul = false; //Tipo Booleana (bool)
		
		//alert(mensagem);
		//alert(idade);
		
		//imprime1();
		//imprime2();
		//operadoresMatematicos();
		//operadoresLogicos();
		//operadoresComparacao();
		//operadoresCombinados();
		//comandoIf();
		//comandoWhile();
		//comandoFor();
		//comandoSwitchCase();
		//imprimeLista();
		//document.write(dobro(46)); // Também pode ser feito como a imprimeLista(), solicitando dados do usuário.
		
		function abreAlerta(){
			alert('Passei por cima da imagem!');
			
		}
		
		var over = 0;
		var out = 0;
		
		function contOver() {
			over++;
		}
		
		function contOut() {
			out++;
		}
		
		function imprimeAlerta() {
			alert('Entradas: '+over+'\nSaídas: '+out);
		}
		
	</script>

</head>
<body onclick="imprimeAlerta();">
	<!-- Fazendo de forma manual uma lista não numerada -->
	<!--<ul> 
			<li>Algo 1</li>
			<li>Algo 2</li>
			<li>Algo 3</li>
			<li>Algo 4</li
	    </ul>
	 -->

<img alt="Imagem" src="imagem.jpg" onMouseOver='contOver();' onMouseOut="contOut()">
<!-- Sempre verificar se a opção 'onMouseOver' é sensitive case para alguns navegadores
O ideal é que se utilize um padrão único, inclusive para usar aspas duplas ou simples.
Assim, usa-se como padrão igual ao escrito em 'onMouseOver', portanto com case sensitive e aspas simples -->

</body>
</html>