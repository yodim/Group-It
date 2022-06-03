package Groupit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Groupit.Dao.ProductDao;
import Groupit.Dao.loginDao;
import Groupit.model.Product;
import Groupit.model.users;

/**
 * Servlet implementation class productpageServlet
 */
@WebServlet("/product")
public class productpageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductDao prodao = new ProductDao();
	loginDao logdao = new loginDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productpageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Product product = new Product();
		int Product_id = Integer.parseInt(request.getParameter("product_id"));
		int session = Integer.parseInt(request.getParameter("session"));
		
		
		product = prodao.GetProduct(Product_id);
		request.setAttribute("product", product);
		if(session==1)
		{
			int user_id = Integer.parseInt(request.getParameter("user_id"));
			users user = new users();
			try {
				user = logdao.GetUser(user_id);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/productPage1.jsp");
			dispatcher.forward(request, response);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/productPage.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
