package AtividadeAvaliativa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPaginaAgenda
 */
@WebServlet("/ServletPaginaAgenda")
public class ServletPaginaAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPaginaAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter saida = response.getWriter();
		
		saida.write("<HTML><Body>");
		saida.write("<form action=ServletAgenda>");
		saida.write("<label for=\"nome\">Nome</label>");
		saida.write("<input id=\"nome\" type=\"text\">");
		saida.write("<label for=\"telefone\">Telefone</label>");
		saida.write("<input id=\"telefone\" type=\"text\">");
		saida.write("<label for=\"dta_nascimento\">Data de Nascimento</label>");
		saida.write("<input id=\"dta_nascimento\" type=\"text\">");
		saida.write("<input type=\"submit\" value=\"Enviar\">");
		saida.write("</form>");
		saida.write("</Body></HTML>");
		saida.close();
	}

}
