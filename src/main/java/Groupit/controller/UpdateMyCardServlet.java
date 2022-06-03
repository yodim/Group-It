package Groupit.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Groupit.Dao.ProductDao;

/**
 * Servlet implementation class UpdateMyCardServlet
 */
@WebServlet("/UpdateMyCardServlet")
public class UpdateMyCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ProductDao proDao = new ProductDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMyCardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int Product_id = Integer.parseInt( request.getParameter("P_id"));
		int User_id=Integer.parseInt( request.getParameter("user_id"));
		int Order_id=Integer.parseInt( request.getParameter("order_id"));
		
		proDao.DeleteOrder(Order_id,Product_id);
		
		request.setAttribute("user_id",User_id);
	    request.getRequestDispatcher("MyShoppingCart").forward(request, response);
	}

}
