package cadastro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MostraCadastro")
public class MostraCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MostraCadastro() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
		
		HttpSession sessao = request.getSession(true);
		
		String nome = (String) sessao.getAttribute("nome");
		String sobrenome = (String) sessao.getAttribute("sobrenome");
		String rua = (String) sessao.getAttribute("rua");
		String complemento = (String) sessao.getAttribute("complemento");
		String cidade = (String) sessao.getAttribute("cidade");
		String cep = (String) sessao.getAttribute("cep");
		String estado = (String) sessao.getAttribute("estado");
		
		
		String empresa = (String) sessao.getAttribute("empresa");
		String rua_empresa = (String) sessao.getAttribute("rua_empresa");
		String complemento_empresa = (String) sessao.getAttribute("complemento_empresa");
		String cidade_empresa = (String) sessao.getAttribute("cidade_empresa");
		String cep_empresa = (String) sessao.getAttribute("cep_empresa");
		String estado_empresa = (String) sessao.getAttribute("estado_empresa");
		
		resposta.write("<html><head><title>Dados Do Usuario</title></head>");
		resposta.write("<h1 style=text-align:center;>Dados do Usuario</h1>");
		resposta.write("<div style=display:flex;justify-content:center;align-items:center;>");
		resposta.write("<br>Nome: "+ nome);
		resposta.write("<br>Sobrenome: "+ sobrenome);
		resposta.write("<br>Rua: "+ rua);
		resposta.write("<br>Complemento: "+ complemento);
		resposta.write("<br>Cidade: "+ cidade);
		resposta.write("<br>CEP: "+ cep);
		resposta.write("<br>Estado: "+ estado +"<br>");
		resposta.write("<br>Dados da Empresa:<br>");
		resposta.write("<br>Empresa: "+ empresa);
		resposta.write("<br>Rua: "+ rua_empresa);
		resposta.write("<br>Complemento: "+ complemento);
		resposta.write("<br>Cidade: "+ cidade_empresa);
		resposta.write("<br>Estado: "+ estado_empresa);
		resposta.write("</div>");
		resposta.write("</body></html>");
		resposta.close();
						
		
	}
}
	