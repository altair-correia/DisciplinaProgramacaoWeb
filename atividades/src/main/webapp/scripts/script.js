/**
 * Manipulação de Objetos em JavaScript
 */

//Primeiro Exemplo (tem uso limitado)
function LivroCapa() {
	// Definimos as ações e as propriedades a serem utilizadas
	this.titulo = "Harry Potter"; // o comando 'this' define os atributos do objeto LivroCapa
	this.autor = "J.K. Rowling";
}

var meuLivro = new LivroCapa(); // 'new' serve para criar uma instância do objeto livroCapa

alert(meuLivro.titulo);


// Segundo Exemplo (uso mais completo)
function Livro(titulo, autor) {
	// Novamente, definimos as ações e as propriedades a serem utilizadas
	this.titulo = titulo; // o mesmo comando 'this' define os atributos do objeto Livro
	this.autor = autor;
}

var meuLivro1 = new Livro("Harry Potter", "J.K. Rowling"); // 'new' serve para criar uma instância do objeto livro
var meuLivro2 = new Livro("As Crônicas de Nárnia", "C.S Lewis"); // 'new' serve para criar uma instância do objeto livro

alert(meuLivro1.titulo);
alert(meuLivro2.titulo);


// Terceiro Exemplo (aprofundando mais)
function Livro(titulo, autor) {
	this.titulo = titulo;
	this.autor = autor;
	
	//Obs: Criação de um atributo 'getDescricao' e é inicializado com o valor 'titulo+autor' retornado para a uma função que
	//atribui um valor a 'getDescrição': usando métodos, pois está retornando algo.

	this.getDescricao = function(){return this.titulo +" - "+this.autor}

	//Obs: É possivel atribuir valores sem precisar retornar nada de uma função. Passa-se então parâmetros para a função
	//no 'function()'

	this.adicionarAutor = function(novoAutor){this.autor = this.autor+", "+novoAutor}
}

var meuLivro1 = new Livro("Harry Potter", "J.K. Rowling");
var meuLivro2 = new Livro("As Crônicas de Nárnia", "C.S. Lewis");

//alert(meuLivro1.titulo);
//alert(meuLivro2.titulo);


meuLivro1.adicionarAutor("A.J. Cerqueira"); //Adicionando um novo Autor ao meu Livro

//maneira incorreta: 'alert(meuLivro1.getDescricao);'
alert(meuLivro1.getDescricao()); // maneira correta
alert(meuLivro2.getDescricao());

// Declaração Regular de um Vetor:
var titulos = new Array(); // Como uma boa prática, utiliza-se os nomes das variáveis no plural.
var autores = new Array();

// Declaração Condensada de um Vetor:
var codigos = new Array("65454", "13212");
var autores = new Array("J.K. Rowling", "C.S. Lewis")

// Declaração Literal de um Vetor:
var codigos2 = ["um", "dois", "três"];


//Atribuindo valores, por meio do comando 'for', à variável titulos:
titulos[0] = "Harry Potter";
titulos[1] = "As Crônicas de Nárnia";
autores[0] = "J.K. Rowling"; //Invenção minha... funcionou perfeitamente.
autores[1] = "C.S. Lewis";

for (var i=0; i < 2; i++) {
	document.write(codigos[i]+" - "+titulos[i]+", "+autores[i]+'<br>');
}

document.write("<br>"+"Total de Títulos: "+titulos.length); //'length' é considerado uma propriedade do 'Array' e não um método.
document.write("<br>"+"Total de Autores: "+autores.length); //'length' é considerado uma propriedade do 'Array' e não um método.


// DOM - Document Object Model - observar w3schools

/* Atributos do Objeto Document
anchors[] 	--> <a></a>
forms[] 	--> <form></form>
images[] 	--> <img/>
links[] 	--> <a href=""></a>
domain 		--> Retorna o Domínio
title 		--> <title></title>
url 		--> URL completa

Métodos do Objeto Document
write()					--> escreve um HTML
writeln() 				--> o mesmo que o 'write' e adicionalmente uma quebra de linha no final do texto
getElementById()		-->  
getElementByName()		--> 
getElementByTagName()	--> 
*/




