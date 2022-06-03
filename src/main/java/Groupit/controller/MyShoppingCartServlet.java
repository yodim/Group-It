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
import Groupit.model.Order;
import Groupit.model.users;

/**
 * Servlet implementation class MyShoppingCartServlet
 */
@WebServlet("/MyShoppingCart")
public class MyShoppingCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private loginDao logdao = new loginDao();
      private ProductDao prodao = new ProductDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyShoppingCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		users user = new users();
		int order_id= 0;
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		try {
			order_id = prodao.GetOrderID(user_id);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			user = logdao.GetUser(user_id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Order> Orders = new ArrayList<Order>();
		Orders = prodao.GetProductsByOrder_id(user_id);
		Float total = prodao.Total_id(order_id);
		request.setAttribute("order_id", order_id);
		request.setAttribute("Orders", Orders);
		request.setAttribute("user", user);
		request.setAttribute("Total", total);
		
		request.getRequestDispatcher("/MyCard.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
