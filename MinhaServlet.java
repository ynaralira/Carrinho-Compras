import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.*; 
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/carrinho")
public class MinhaServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String nomeProduto = request.getParameter("pProduto");
		String quantProduto = request.getParameter("qProduto");
		
		HttpSession session = request.getSession(); 
		Object listProd = session.getAttribute("produtos");
		if (listProd == null) {
			 listProd = new ArrayList<String>();
		}
		session.setAttribute("produtos", listProd);
		((List) listProd).add(nomeProduto); 
		((List) listProd).add(quantProduto);
		
		request.setAttribute("produtos", listProd);
		request.getRequestDispatcher("carrinho.jsp").forward(request, response);

	}
}


