/**
 * Arquivo separado para códigos Javascript
 */
// Variáveis Globais
var descricao = 'Esta é uma descrição';
const maximo = 100;
//maximo = 200; Erro de dupla atribuição de valor a uma variável

var num = 1;

num = 'Este é um número';

var x = 10;

//alert(descricao); // Variável Global de codigo.js, pode ser usada em qualquer parte do programa.
//alert(num);

function imprime1(){
	var numero1 = 1; // Variável Local da função imprime1().
	
	alert(descricao);
	alert(numero1);
}

function imprime2(){
	var numero2 = 2; // Variável Local da função imprime2().
	
	alert(descricao);
	alert(numero2); //Variável Local da função imprime2().
	// alert(numero1); //Por ser uma variável local da função imprime1(), não pode ser executada e o erro surge no navegador.
}

function operadoresMatematicos(){
	document.write('O valor de x é '+x); 
	//document.write('O valor de x é '+x+'<br>'); // Para pular uma linha pode ser usado assim também:
	document.write('<br>x+5 = '+(x+5));
	document.write('<br>x-5 = '+(x-5));
	document.write('<br>x*5 = '+(x*5));
	document.write('<br>x/5 = '+(x/5));
	document.write('<br>x%8 = '+(x%8)+'<br><br>'); // Mostra o resto da divisão de dois números
}

function operadoresLogicos(){
	var a = true;
	var b = false;
	document.write('a = '+(a)+'<br>');
	document.write('b = '+(b)+'<br>');
	document.write('a && b = '+(a&&b)+'<br>');
	document.write('a || b = '+(a||b)+'<br>');
	document.write('!a = '+(!a)+'<br>');
	document.write('!b = '+(!b)+'<br><br>');
}

function operadoresComparacao(){
	document.write('O valor de x é '+x+'<br>');
	document.write('x == 10? '+(x == 10)+'<br>');
	document.write('x > 10? '+(x > 10)+'<br>');
	document.write('x < 10? '+(x < 10)+'<br>');
	document.write('x >= 10? '+(x >= 10)+'<br>');
	document.write('x <= 10? '+(x <= 10)+'<br>');
	document.write('x != 10? '+(x != 10)+'<br><br>'); //Não se usa, em javascript '<>' para indicar o comparador "diferente".
	
}

function operadoresCombinados(){
	document.write('O valor de x é '+x+'<br>');
	document.write('x += 10 = '+(x += 10)+'<br>');
	document.write('x -= 10 = '+(x -= 10)+'<br>');
	document.write('x *= 10 = '+(x *= 10)+'<br>');
	document.write('x /= 10 = '+(x /= 10)+'<br>');
	document.write('x++ = '+(x++)+'<br>');
	document.write('x-- = '+(x--)+'<br>');
	document.write('++x = '+(++x)+'<br>');
	document.write('--x = '+(--x)+'<br><br>');
}

function comandoIf(){
	var i = prompt("Digite um número: ");
	
	if (i > 10) {
		document.write('Este número é maior que 10');
	} else {
		document.write('Este número é menor ou igual a 10');
	}
}

function comandoWhile(){
	var i = 1;
	
	while (i <= 10) {
		document.write(i+'<br>');
		i++;
	}
}

function comandoFor(){
	document.write('<ul>');
	
	// Fazendo uma lista não numerada de forma automatizada	
	for (var i = 1; i <= 10; i++) {
		document.write('<li>'+i+'</li>');
	}
	document.write('</ul>');
}

function comandoSwitchCase(){
	var numero = prompt('Digite um número entre 1 e 5');
	
	switch (numero) {
	case '1':
		alert('O seu número é 1');
		break;
	case '2':
		alert('O seu número é 2');
		break;
	case '3':
		alert('O seu número é 3');
		break;
	case '4':
		alert('O seu número é 4');
		break;
	case '5':
		alert('O seu número é 5');
		break;
	default:
		alert('Número digitado Inválido!'); //Caso precise quebrar uma linha no comando 'alert' use '\n' e não '<br>'.
		break;
	}
}
	
// Fazendo uma lista não numerada de forma automatizada com quantidade especificada pelo usuário.
function imprimeLista(quantidade){ 
	var quantidade = prompt('Digite a quantidade de tópicos da lista');
	
	document.write('<ul>');
	
		
	for (var i = 1; i <= quantidade; i++) {
		document.write('<li>'+i+'</li>');
	}
	document.write('</ul>');
}

function dobro(valor){
	return valor *2;
}