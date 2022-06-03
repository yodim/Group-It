package Groupit.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Groupit.Dao.ProductDao;
import Groupit.model.Product;
/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/Demo")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductDao pro = new ProductDao();
	
	
	public DemoServlet() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Product> products=new ArrayList<Product>();
		products=pro.GetProducts();
		request.setAttribute("products", products);
		request.getRequestDispatcher("/NewFile.jsp").forward(request, response);
	}


}
