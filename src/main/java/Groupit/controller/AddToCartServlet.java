package Groupit.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Groupit.Dao.ProductDao;

/**
 * Servlet implementation class AddToCartServlet
 */
@WebServlet("/MyCart")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductDao prodao = new ProductDao();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCartServlet() {
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
		
		
		Float P_UnitPrice = Float.parseFloat(request.getParameter("P_UnitPrice"));
		int productQuantity = Integer.parseInt(request.getParameter("P_Quantity"));
		int Product_id = Integer.parseInt(request.getParameter("Product_id"));
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		
		int Order_id=0;
		
		try {
			Order_id = prodao.GetOrderID(user_id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if (Order_id != 0) {
			try {
				prodao.AddProductToOrder(Order_id, Product_id, productQuantity, P_UnitPrice);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
	
			try {
				prodao.AddOrder(user_id);
				Order_id= prodao.GetOrderID(user_id);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				prodao.AddProductToOrder(Order_id, Product_id, productQuantity, P_UnitPrice);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		request.setAttribute("user_id", user_id);
		request.getRequestDispatcher("products?session=1&category_id=14").forward(request, response);
		
		
	}

}
