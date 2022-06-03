package Groupit.controller;

import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import Groupit.Dao.ProductDao;
import Groupit.model.Product;



/**
 * Servlet implementation class P_Infos_Servlet
 */
@WebServlet("/UpdateProduct")
@MultipartConfig(maxFileSize = 16177216)//1.5mb
public class UpdateProductServlet extends HttpServlet {
	private ProductDao productdao = new ProductDao();

    
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProductServlet() {
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
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Product product = new Product();
		InputStream iso = new InputStream() {
			
			@Override
			public int read() throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
		};
        int User_id = Integer.parseInt(request.getParameter("user_id"));
        int Product_id = Integer.parseInt(request.getParameter("Product_id"));
        int Category_id = Integer.parseInt(request.getParameter("Category_id"));
		String P_name = request.getParameter("P_name");
		String P_description = request.getParameter("P_description");
		int P_Quantity = Integer.parseInt(request.getParameter("P_Quantity")) ;
        Part part = request.getPart("image");
        
        if (part != null ) {iso = part.getInputStream();}
        
        float P_UnitPrice = Float.parseFloat(request.getParameter("P_UnitPrice")) ;
        
        product.setProduct_id(Product_id);
        product.setP_name(P_name);
        product.setP_Description(P_description);
        product.setP_Quantity(P_Quantity);
        product.setP_Image(iso);
        product.setP_UnitPrice(P_UnitPrice);
        product.setCategory_id(Category_id);
        
        productdao.UpdateProduct(product);
         
        if( part != null ) {productdao.UpdateImage(product);}
        
        request.setAttribute("user_id",User_id);
        request.getRequestDispatcher("manageProducts").forward(request, response);
        
        
        }
		
	}


