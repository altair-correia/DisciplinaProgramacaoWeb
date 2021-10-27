<%@page import="br.com.encontros.model.Encontro"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Encontros</title>
</head>
<body>
<h3>Lista de Encontros:</h3><br>

<table border="1">
	<tr>
		 <td>Nome</td>
		 <td>Local</td>
		 <td>Motivo</td>
		 <td>Data</td>
	</tr>
	<%
		List<Encontro> lista = (List<Encontro>) request.getAttribute("lista");
		for(Encontro encontro : lista){
			
	%>
	<tr>
		 <td><%= encontro.getNomePessoa() %></td>
		 <td><%= encontro.getLocal() %></td>
		 <td><%= encontro.getMotivo() %></td>
		 <!-- <td> encontro.getData().toLocaleString() %></td> -->
	</tr>
	<%
		}
	%>
	
</table>
<br><br>
<a href="ServeletControlador">Voltar ao menu principal</a>
</body>
</html>