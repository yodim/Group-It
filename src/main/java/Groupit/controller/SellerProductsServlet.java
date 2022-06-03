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
import Groupit.model.Category;
import Groupit.model.Product;
import Groupit.model.users;

/**
 * Servlet implementation class manageProducts
 */
@WebServlet("/manageProducts")
public class SellerProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ProductDao productdao;
    private loginDao logdao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SellerProductsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Product> products= new ArrayList<Product>();
		productdao = new ProductDao();
		logdao= new loginDao();
		ArrayList<Category> Categories = new ArrayList<Category>();
		Categories= Category.Categories();
		users user = new users();
		int User_id=Integer.parseInt(request.getParameter("user_id"));
		try {
			user = logdao.GetUser(User_id);
			products=productdao.GetProducts(User_id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("user", user);
		request.setAttribute("Categories", Categories);
		request.setAttribute("products", products);
		request.getRequestDispatcher("/manageProducts.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
