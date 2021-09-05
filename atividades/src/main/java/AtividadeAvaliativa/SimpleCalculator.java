package AtividadeAvaliativa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleCalculator
 */
@WebServlet("/SimpleCalculator")
public class SimpleCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleCalculator() {
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
		saida.write("<form action=SimpleCalculator method=post>");
		saida.write("<label for=\"valor1\">Digite o primeiro valor</label>");
		saida.write("<input id=\"valor1\" name=\"valor1\" type=\"text\"> <br><br>");
		saida.write("<label for=\"valor2\">Digite o segundo valor</label>");
		saida.write("<input id=\"valor2\" name=\"valor2\" type=\"text\"> <br><br>");
		saida.write("<input type=\"submit\">");
		saida.write("</form>");
		saida.write("</Body></HTML>");
		saida.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter saida = response.getWriter();
		
		String valor1 = request.getParameter("valor1"); // Utilizando o request dos dados do formulário
		String valor2 = request.getParameter("valor2");
		
		
		/* Abaixo realiza-se a conversão de uma string recebida do usuário em um número double (mais casas decimais que o float) para
		 * que possa ser executado a soma desses números. Com o método parseDouble, passa-se algum parametro e ele transforma este parâmetro para um double.
		 */
		
		double soma = 0; // Inicializando a variável soma dos valores
		
		double numeroConvertido1 = Double.parseDouble(valor1); 
		double numeroConvertido2 = Double.parseDouble(valor2);  
		
		
		soma = numeroConvertido1 + numeroConvertido2;
		
		saida.write("A soma de "+ numeroConvertido1 +" e "+ numeroConvertido2 +" é igual a "+ soma);
		
	}
	
	
	

}
