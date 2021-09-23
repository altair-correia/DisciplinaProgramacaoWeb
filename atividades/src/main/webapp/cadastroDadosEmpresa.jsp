<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dados Empresariais</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
        <main class="container">
            <h2 class="log">Dados Profissionais</h2>
            <form action="ServletCadastro" method="post">
                <div class="input-field">
                    <input type="text" name="empresa" placeholder="Empresa">
                    <div class="underline"></div>
                </div>
                <div class="input-field">
                    <input type="text" name="rua_empresa" placeholder="Rua">
                    <div class="underline"></div>
                </div>
                <div class="input-field">
                    <input type="text" name="complemento_empresa" placeholder="Complemento">
                    <div class="underline"></div>
                </div>
                <div class="input-field">
                    <input type="text" name="cidade_empresa" placeholder="Cidade">
                    <div class="underline"></div>
                </div>
                <div class="input-field">
                    <input type="text" name="cep_empresa" placeholder="CEP">
                    <div class="underline"></div>
                </div>
                <div class="input-field">
                    <input type="text" name="estado_empresa" placeholder="Estado">
                    <div class="underline"></div>
                </div>
                <input type="submit" id="btn-submit" value="Concluir">
            </form>
        </main>

    </body>
</html>