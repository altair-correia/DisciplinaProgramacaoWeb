package cadastro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTela1Cadastro
 */
@WebServlet("/ServletTela1Cadastro")
public class ServletTela1Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTela1Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	doPost(request, response);
	    }
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
		
		resposta.write("<html>");
		resposta.write("<head>");
		resposta.write("<title>Dados Profissionais</title><link rel=\"stylesheet\" href=\"style.css\">");
		resposta.write("</head>");
		resposta.write("<body>");
		resposta.write("<form action=\"ServletTela2Cadastro\">");
		resposta.write("<h1>Preencha Seus Dados Profissionais:</h1>");
		
// Abaixo, usa-se "request.getParameter" (dentro da tag <form>) para trazer os dados sumbetidos da tela anterior (cadastro.jsp).
// Usa-se, nesse caso, o type=\"hidden\" para manter esses dados trazidos, repassando de forma oculta, sem que o usuário veja.
		
		resposta.write("<input type=\"hidden\" name=\"nome\" value=\"");
		resposta.write(request.getParameter("nome") + "\">");
		resposta.write("<input type=\"hidden\" name=\"sobrenome\" value=\"");
		resposta.write(request.getParameter("sobrenome") + "\">");
		resposta.write("<input type=\"hidden\" name=\"rua\" value=\"");
		resposta.write(request.getParameter("rua") + "\">");
		resposta.write("<input type=\"hidden\" name=\"complemento\" value=\"");
		resposta.write(request.getParameter("complemento") + "\">");
		resposta.write("<input type=\"hidden\" name=\"cidade\" value=\"");
		resposta.write(request.getParameter("cidade") + "\">");
		resposta.write("<input type=\"hidden\" name=\"cep\" value=\"");
		resposta.write(request.getParameter("cep") + "\">");
		resposta.write("<input type=\"hidden\" name=\"estado\" value=\"");
		resposta.write(request.getParameter("estado") + "\">");
		
// Fim  do uso do "hidden", recuperando os dados digitados pelo usuário na tela anterior dentro de campos, para serem enviados
// para a ServletTela2Cadastro.

// Continuação do cadatro, porém agora com os dados da empresa.
		resposta.write("Empresa:<input type=\"text\" name=\"empresa\"> <br>");
		resposta.write("Endereço Profissional: <br>");
		resposta.write("Rua:<input type=\"text\" name=\"ruaEmpresa\"> <br>");
		resposta.write("Complemento:<input type=\"text\" name=\"complementoEmpresa\"> <br>");
		resposta.write("Cidade:<input type=\"text\" name=\"cidadeEmpresa\"> <br>");
		resposta.write("CEP:<input type=\"text\" name=\"cepEmpresa\"> <br>");
		resposta.write("Estado:<input type=\"text\" name=\"estadoEmpresa\"> <br> <br>");
		resposta.write("<input type=\"submit\" value=\"Confirmar\"> <br>");
		resposta.write("</form>");
		resposta.write("</body></html>");
		
	}
}
