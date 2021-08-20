package atividades;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAgenda
 */
@WebServlet("/ServletAgenda")
public class ServletAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = "Altair Correia";
		int tel = 993273557;
		String dt_nasc = "22/06/1975";
		
		PrintWriter saida = response.getWriter();
		
		saida.write("<HTML><Body>");
		saida.write("<h1 style=text-align:center;>Agenda</h1>");
		saida.write("<div style=display:flex;justify-content:center;align-items:center;>");
		saida.write("<br>Nome: "+ name);
		saida.write("<br>Telefone: "+ tel);
		saida.write("<br>Data de nascimento: "+ dt_nasc);
		saida.write("</div>");
		saida.write("</Body></HTML>");
		saida.close();
	}

}
