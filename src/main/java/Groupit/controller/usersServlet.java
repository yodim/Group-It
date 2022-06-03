package Groupit.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Groupit.Dao.usersDao;
import Groupit.model.VerifyEmail;
import Groupit.model.city;
import Groupit.model.users;

/**
 * Servlet implementation class usersServlet
 */
@WebServlet("/signup_login")
public class usersServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private usersDao userdao = new usersDao();
	
	
	
    
    public usersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<city> cities = new ArrayList<city>();
		cities=city.cities();
		request.setAttribute("cities", cities);	
	
		String firstname = request.getParameter("firstname");
		String familyname = request.getParameter("familyname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String passco = request.getParameter("passco");
		String usertype = request.getParameter("usertype");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		
		
		if (firstname.equals("") || familyname.equals("") || email.equals("") ||pass.equals("") || passco.equals("")|| usertype.equals("") ||tel.equals("") || address.equals("") || city.equals("") )
		{
			request.setAttribute("errorMessage", "Requierd fields are missing ,Try again Please ");
			request.getRequestDispatcher("/signup.jsp").forward(request, response);
		}
		
		users user = new users();
		int City_Id;
		City_Id = Integer.parseInt(city);
		user.setFirstname(firstname);
		user.setFamilyname(familyname);
		user.setAddress(address);
		user.setCity_id(City_Id);
		user.setEmail(email);
		user.setPass(pass);
		user.setUsertype(usertype);
		user.setTel(tel);
		
		
		
		
		try {
			
			if((!pass.equals(passco)))
				{
					request.setAttribute("errorMessage", "Confirmation password is wrong or Email is not valid ");
					request.getRequestDispatcher("/signup.jsp").forward(request, response);
				}
			else if(userdao.ValidUser(user)) {
				request.setAttribute("errorMessage", "You already have an account , please login or try another Email  ");
				request.getRequestDispatcher("/signup.jsp").forward(request, response);
			}
			/*else if (!VerifyEmail.isAddressValid(email))
				{
					request.setAttribute("errorMessage", "Email is not valid ");
					request.getRequestDispatcher("/signup.jsp").forward(request, response);
				}*/
			
			else 
				{
					userdao.registerUser(user);
					request.getRequestDispatcher("/login.jsp").forward(request, response);
				}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	}
