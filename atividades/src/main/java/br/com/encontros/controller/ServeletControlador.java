package br.com.encontros.controller;

import java.io.IOException;
//import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.encontros.model.Encontro;
import br.com.encontros.model.SistemaEncontros;

/**
 * Servlet implementation class ServeletControlador
 */
@WebServlet("/ServeletControlador")
public class ServeletControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		SistemaEncontros sistema = (SistemaEncontros) getServletContext().getAttribute(ContextListener.SISTEMA_ENCONTROS);
		
		String resposta = "encontros.jsp";
		
		if ("cadastrar".equals(acao)) {
			resposta = "cadastrar.jsp";
			
		} else if ("confirmarCadastro".equals(acao)) {
			Encontro e = new Encontro();
			e.setNomePessoa(request.getParameter("nomePessoa"));
			e.setMotivo(request.getParameter("motivo"));
			e.setLocal(request.getParameter("local"));
			//e.setData(new Date());
			
			sistema.adicionar(e);
			
			request.setAttribute("lista", sistema.listarEncontros());
			resposta = "listar.jsp";
			
		} else if ("listar".equals(acao)) {
			
			request.setAttribute("lista", sistema.listarEncontros());
			resposta = "listar.jsp";
		}
		
		request.getRequestDispatcher(resposta).forward(request, response);
		
		
		
	}

}
