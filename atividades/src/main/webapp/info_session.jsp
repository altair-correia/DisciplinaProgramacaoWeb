<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar a ID da sess�o do usu�rio:</title>
</head>
<body>
<p>Mostrando a ID da sess�o do usu�rio: <%= session.getId() %> <p>
<%! 
int acessos = 1; 
Date date = new Date();
String first_date = date.toString();
%>

<p>N�mero de Acessos: <%= acessos%></p>
<p>Hor�rio do primeiro acesso: <%=first_date%></p>

<%Date date = new Date();
String last_date = date.toString(); %>

<p>�ltimo acesso: <%= last_date %> </p>

<%acessos += 1; %>

</body>
</html>