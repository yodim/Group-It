package Groupit.controller;

import java.io.IOException;
import java.util.ArrayList;


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
 * Servlet implementation class productsServlet
 */
@WebServlet("/products")
public class productsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ProductDao prodao = new ProductDao();
    private loginDao logdao = new loginDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	
    	ArrayList<Product> products = new ArrayList<Product>();
    	
		int category_id = Integer.parseInt(request.getParameter("category_id"));
		int session_id =Integer.parseInt(request.getParameter("session"));
		
		
		if(category_id != 14 )
		{
			try {
			products = prodao.GetProductsByCategory(category_id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
		else {products = prodao.GetProducts(); }
		request.setAttribute("products", products);
		
		if(session_id==3) 
		{
			request.getRequestDispatcher("/products1.jsp").forward(request, response);
		}
		if(session_id==1) 
		{
			users user= new users();
			int user_id=Integer.parseInt(request.getParameter("user_id"));
			try {
				user = logdao.GetUser(user_id);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			request.setAttribute("user", user);
			request.getRequestDispatcher("/products1.jsp").forward(request, response);
		}
		
		request.getRequestDispatcher("/products.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
