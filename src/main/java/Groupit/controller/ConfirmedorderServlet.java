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
import Groupit.model.Gorder;
import Groupit.model.users;


/**
 * Servlet implementation class ConfirmedorderServlet
 */
@WebServlet("/Confirmedorder")
public class ConfirmedorderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private loginDao logdao = new loginDao();
	private ProductDao prodao = new ProductDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmedorderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
				users user = new users();
				int user_id = Integer.parseInt(request.getParameter("user_id"));
				ArrayList<Gorder> orders = new ArrayList<Gorder>();
				int total_orders = prodao.count_orders(user_id);
				try {
					orders = prodao.GetOrdersByID(user_id);
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
				
				
				request.setAttribute("total_orders", total_orders);
				request.setAttribute("orders", orders);
				request.setAttribute("user", user);
				
				
				request.getRequestDispatcher("/ConfirmedOrder.jsp").forward(request, response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
