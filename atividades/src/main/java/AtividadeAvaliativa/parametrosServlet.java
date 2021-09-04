package AtividadeAvaliativa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class parametrosServlet
 */
@WebServlet("/parametrosServlet")
public class parametrosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public parametrosServlet() {
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
        saida.write("<form action=parametrosServlet method=post>");
        saida.write("<label for=\"primeiroNome\">Primeiro Nome </label>");
        saida.write("<input id=\"primeiroNome\" name=\"primeiroNome\" type=\"text\"><br><br>");
        saida.write("<label for=\"ultimoNome\">Último Nome </label>");
        saida.write("<input id=\"ultimoNome\" name=\"ultimoNome\" type=\"text\"><br><br>");
        saida.write("<input type=\"submit\">");
        saida.write("</form>");
        saida.write("</Body></HTML>");
        saida.close();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	PrintWriter saida = response.getWriter();
        
        String primeiroNome = request.getParameter("primeiroNome");
        String ultimoNome = request.getParameter("ultimoNome");

        
        saida.write("<HTML><Body>");
        saida.write("<div style=display:flex;justify-content:center;align-items:center;>");
        saida.write("<h1>Hello, "+ primeiroNome +" "+ ultimoNome + "! Tudo bem?! </h1>"); 
        saida.write("</div>");
        saida.write("</Body></HTML>");
        saida.close();
    }
}
    