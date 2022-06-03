package Groupit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Groupit.Dao.loginDao;
import Groupit.model.login;
import Groupit.model.users;



@WebServlet("/Welcome")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private loginDao loginDao;

	public void init() {
		loginDao = new loginDao();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		login login = new login();
		users user = new users();
		login.setEmail(email);
		login.setPass(pass);
		try {
			user =loginDao.validate(login);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if ((user.getFamilyname() != null)  && (user.getUsertype().equals("seller")) ) {
			request.setAttribute("user", user);
			request.getRequestDispatcher("/statistics.jsp").forward(request, response);}
		else if((user.getFamilyname() != null)  && (user.getUsertype().equals("client")) ){
			request.setAttribute("user", user);
			request.getRequestDispatcher("products?category_id=14&session=3").forward(request, response);
			}
		else {
			
			request.setAttribute("errorMessage", "Invalid Email or password");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}
}
