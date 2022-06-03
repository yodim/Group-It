package Groupit.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Groupit.Dao.ProductDao;
import Groupit.Dao.loginDao;
import Groupit.model.users;
/**
 * Servlet implementation class ConfirmOrderServlet
 */
@WebServlet("/ConfirmOrder")
public class ConfirmOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ProductDao prodao = new ProductDao();
    private loginDao logindao = new loginDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int User_id=Integer.parseInt( request.getParameter("user_id"));
		int Order_id=Integer.parseInt( request.getParameter("order_id"));
		users user = new users();
		
		
		try {
			user = logindao.GetUser(User_id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int city = user.getCity_id();
		float total= prodao.Total_id(Order_id);
		int Groupe_id = prodao.CheckGroupeId(city);
		
		if (Groupe_id == 0) {
			try {
				prodao.AddGroupe(city);
				int G_id = prodao.CheckGroupeId(city);
				prodao.UpdateOrder_Line(Order_id,G_id);
				prodao.UpdateGroupe(G_id,total);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}else {
			prodao.UpdateOrder_Line(Order_id,Groupe_id);
			prodao.UpdateGroupe(Groupe_id,total);
		}
		
		
		
	
		//if so add order to groupe
		// if not create groupe with new city 
		// add order to new groupe
		
		
		request.setAttribute("user_id",User_id);
	    request.getRequestDispatcher("MyShoppingCart").forward(request, response);
		
	}

}
