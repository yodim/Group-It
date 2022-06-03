package Groupit.controller;

import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Groupit.model.city;


/**
 * Servlet implementation class indexServlet
 */
@WebServlet("/signup")
public class indexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

    public indexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<city> cities = new ArrayList<city>();
		cities=city.cities();
		
		request.setAttribute("cities", cities);
		
		int id = Integer.parseInt(request.getParameter("session_id"));
		if(id==0)
		{
			request.setAttribute("errorMessage", "To buy products and have more options, Please signup or login if you already have an account ");
		}
		request.getRequestDispatcher("/signup.jsp").forward(request, response);
	}

}
