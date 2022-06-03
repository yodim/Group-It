package Groupit.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Groupit.model.Gorder;
import Groupit.model.Order;
import Groupit.model.Product;

public class ProductDao {

  

    public int ReigsterProduct(Product product) {
    	String INSERT_USERS_SQL = "INSERT INTO Products" +
                "  (P_name, P_description,P_Entry_date, P_Quantity,P_Image,P_UnitPrice,Category_Id,User_Id) VALUES " +
                " (?, ?,CURRENT_TIMESTAMP(),?,?,?,?,?);";           
    		int result=0;
    	
    		
    		try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            
            try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            	
            
                preparedStatement.setString(1, product.getP_name());
                preparedStatement.setString(2, product.getP_Description());
                preparedStatement.setInt(3, product.getP_Quantity());
                preparedStatement.setBlob(4, product.getP_Image());
                preparedStatement.setFloat(5, product.getP_UnitPrice());
                preparedStatement.setInt(6, product.getCategory_id());
                preparedStatement.setInt(7, product.getUser_id());

                System.out.println(preparedStatement);
                // Step 3: Execute the query or update query
                result = preparedStatement.executeUpdate();

            } catch (SQLException e) {
                // process sql exception
                printSQLException(e);
            }
            return result;
    		}
    
    public int UpdateProduct(Product product) {
    	
    	String Update_sql = " Update products set P_name= ?  , P_description=  ?  ,P_Quantity = ?  ,P_UnitPrice=  ?  ,Category_Id= ?   where  Product_id = ? ";           
    		int result=0;
    	
    		
    		try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            
            try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(Update_sql)) {
            	
            
                preparedStatement.setString(1, product.getP_name());
                preparedStatement.setString(2, product.getP_Description());
                preparedStatement.setInt(3, product.getP_Quantity());
                preparedStatement.setFloat(4, product.getP_UnitPrice());
                preparedStatement.setInt(5, product.getCategory_id());
                preparedStatement.setInt(6, product.getProduct_id());
                

                System.out.println(preparedStatement);
                // Step 3: Execute the query or update query
                result = preparedStatement.executeUpdate();

            } catch (SQLException e) {
                // process sql exception
                printSQLException(e);
            }
            return result;
    		}
public int UpdateOrder_Line(int order_id,int Groupe_id) {
    	
    	String Update_sql = " Update orders set Order_Statue = 'CONFIRMED' , Groupe_id = ? where  Id_commande = ? ";           
    		int result=0;
    	
    		
    		try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            
            try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(Update_sql)) {
            	
            
              
                
                preparedStatement.setInt(1,Groupe_id );
                preparedStatement.setInt(2,order_id);
                
                

                System.out.println(preparedStatement);
                // Step 3: Execute the query or update query
                result = preparedStatement.executeUpdate();

            } catch (SQLException e) {
                // process sql exception
                printSQLException(e);
            }
            return result;
    		}
    
    public int UpdateImage(Product product) {
    	String Update_image = "Update products set P_Image= ?   where  Product_id = ? ";           
    		int result=0;
    	
    		
    		try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            
            try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(Update_image)) {
            	
            
            	preparedStatement.setBlob(1, product.getP_Image());
                preparedStatement.setInt(2, product.getProduct_id());
                

                System.out.println(preparedStatement);
                // Step 3: Execute the query or update query
                result = preparedStatement.executeUpdate();

            } catch (SQLException e) {
                // process sql exception
                printSQLException(e);
            }
            return result;
    		}
    	
    public int DeleteProduct(int id) {
    	String Update_image = "delete from products where  Product_id = ? ";           
    		int result=0;
    	
    		
    		try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            
            try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(Update_image)) {
            	
                preparedStatement.setInt(1, id);
                

                System.out.println(preparedStatement);
                // Step 3: Execute the query or update query
                result = preparedStatement.executeUpdate();

            } catch (SQLException e) {
                // process sql exception
                printSQLException(e);
            }
            return result;
    		}
    public int DeleteOrder(int order_id,int product_id) {
    	String Update_image = "delete from order_line where Id_commande= ? and Product_id = ?  ";           
    		int result=0;
    	
    		
    		try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            
            try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(Update_image)) {
            	
                preparedStatement.setInt(1, order_id);
                preparedStatement.setInt(2, product_id);
                

                System.out.println(preparedStatement);
                // Step 3: Execute the query or update query
                result = preparedStatement.executeUpdate();

            } catch (SQLException e) {
                // process sql exception
                printSQLException(e);
            }
            return result;
    		}
    public ArrayList<Product> GetProducts(){
    		String Search_products = "Select * from Products ;" ;
    		ArrayList<Product> products= new ArrayList<Product>();
    	
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            
            try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(Search_products)) {
            	
            	ResultSet rs = preparedStatement.executeQuery();
            	while(rs.next())
            	{
            	Product product = new Product();
            	product.setProduct_id(rs.getInt("Product_id"));
            	product.setP_name(rs.getString("P_name"));
            	product.setP_Entry_Date(rs.getString("P_Entry_date"));
            	product.setP_UnitPrice(rs.getFloat("P_UnitPrice"));
            	product.setUser_id(rs.getInt("User_id"));
            	products.add(product);
                
            	}
                System.out.println(preparedStatement);
                // Step 3: Execute the query or update query
                

            } catch (SQLException e) {
                // process sql exception
                printSQLException(e);
            }
            if (products. isEmpty())
            	System.out.println("list is empty");
            return products;
    		}
    public ArrayList<Order> GetProductsByOrder_id(int user_id){
		String Search_products = "Select order_line.Product_id,P_name,P_UnitPrice,Quantity_Ordred,Price,Line_date from order_line LEFT JOIN Products on order_line.Product_id = Products.Product_id where ID_commande = ? " ;
		ArrayList<Order> General_Order= new ArrayList<Order>();
		int commande_id = 0;
		try {
			commande_id = GetOrderID(user_id);
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(Search_products)) {
        	preparedStatement.setInt(1, commande_id);
        	ResultSet rs = preparedStatement.executeQuery();
        	
        	while(rs.next())
        	{
        	Order order = new Order();
        	order.setOrder_id(commande_id);
        	order.setDate(rs.getString("Line_date"));
        	order.setP_name(rs.getString("P_name"));
        	order.setQunatity(rs.getInt("Quantity_Ordred"));
        	order.setPrice(rs.getFloat("Price"));
        	order.setUnit_Price(rs.getFloat("P_UnitPrice"));
        	order.setProduct_id(rs.getInt("Product_id"));
        	General_Order.add(order);
        	}
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        if (General_Order. isEmpty())
        	System.out.println("list is empty");
        return General_Order;
		}
    public Float Total_id(int commande_id){
		String Total_sql = "select sum(Price) as Total from order_line where Id_commande = ? " ;
		Float total = Float.parseFloat("0");
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(Total_sql)) {
        	preparedStatement.setInt(1, commande_id);
        	
        	 ResultSet  rs = preparedStatement.executeQuery();
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
           while (rs.next())
           {
        	   total = rs.getFloat("Total");
           }
           
            
        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
      
        return total;
		}
    public int count_orders(int user_id){
		String Total_sql = "select count(id_commande) as count from Orders where user_id = ? " ;
		int total = 0;
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(Total_sql)) {
        	preparedStatement.setInt(1, user_id);
        	
        	 ResultSet  rs = preparedStatement.executeQuery();
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
           while (rs.next())
           {
        	   total = rs.getInt("count");
           }
           
            
        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
      
        return total;
		}
    public Product GetProduct(int Product_id){
		String Search_product = "Select * from products where Product_id = ? " ;
		Product product = new Product();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(Search_product)) {
        	preparedStatement.setInt(1, Product_id);
        	ResultSet rs = preparedStatement.executeQuery();
        	
        	while(rs.next())
        	{
        	
        	product.setProduct_id(Product_id);
        	product.setP_name(rs.getString("P_name"));
        	product.setP_Entry_Date(rs.getString("P_Entry_date"));
        	product.setP_UnitPrice(rs.getFloat("P_UnitPrice"));
        	product.setP_Description(rs.getString("P_description"));
        	product.setP_Quantity(rs.getInt("P_Quantity"));
        	product.setUser_id(rs.getInt("User_id"));
            
        	}
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
       
        return product;
		}
    
    
    
    public ArrayList<Product> GetProducts(int User_id) throws ClassNotFoundException{
		String Search_products = "Select * from Products where User_id = ? ;" ;
		ArrayList<Product> products= new ArrayList<Product>();
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");
        	
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(Search_products)) {
        	preparedStatement.setInt(1,User_id);
        	
        	ResultSet rs = preparedStatement.executeQuery();
        	while(rs.next())
        	{
        	Product product = new Product();
        	product.setCategory_id(rs.getInt("Category_id"));
        	product.setProduct_id(rs.getInt("Product_id"));
        	product.setP_name(rs.getString("P_name"));
        	product.setP_Entry_Date(rs.getString("P_Entry_date"));
        	product.setP_Description(rs.getString("P_description"));
        	product.setC_Name(C_Name(product.getCategory_id()));
        	product.setP_Quantity(rs.getInt("P_Quantity"));
        	product.setP_UnitPrice(rs.getFloat("P_UnitPrice"));
        	product.setUser_id(User_id);
        	products.add(product);
            
        	}
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        if (products. isEmpty())
        	System.out.println("list is empty");
        return products;
		}
    public ArrayList<Product> GetProductsByCategory(int Category_id) throws ClassNotFoundException{
		String Search_products = "Select * from Products where Category_id = ? ;" ;
		ArrayList<Product> products= new ArrayList<Product>();
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");
        	
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(Search_products)) {
        	preparedStatement.setInt(1,Category_id);
        	
        	ResultSet rs = preparedStatement.executeQuery();
        	while(rs.next())
        	{
        	Product product = new Product();
        	
        	product.setProduct_id(rs.getInt("Product_id"));
        	product.setP_name(rs.getString("P_name"));
        	product.setP_Entry_Date(rs.getString("P_Entry_date"));
        	product.setP_UnitPrice(rs.getFloat("P_UnitPrice"));
        	product.setUser_id(rs.getInt("User_id"));
        	products.add(product);
            
        	}
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        if (products. isEmpty())
        	System.out.println("list is empty");
        return products;
		}
    	
    public int AddOrder(int User_id) throws ClassNotFoundException{
		String Add_Product = " insert into Orders(Order_Date,Order_Statue,User_id,Groupe_id) values (CURRENT_TIMESTAMP(),'ON HOLD',?,1) " ;
		
		int result = 0;
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");
        	
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(Add_Product)) {
        	preparedStatement.setInt(1,User_id);
        	
        	result =preparedStatement.executeUpdate();
       
        	
    
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        	return result;
		}
    
    public int GetOrderID(int user_id) throws ClassNotFoundException{
		String GetOrderID = " select * from Orders where Order_Statue like 'ON HOLD' and User_id = ? " ;
		
		int result = 0;
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");
        	
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(GetOrderID)) {
        	preparedStatement.setInt(1,user_id);
        	
        	ResultSet rs =preparedStatement.executeQuery();
        	if(rs.next());
        	result = rs.getInt("Id_commande");
    
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        	return result;
		}
   
    
    public ArrayList<Gorder> GetOrdersByID(int user_id) throws ClassNotFoundException{
		String GetOrdersByID = " select * from Orders where Order_Statue like 'CONFIRMED' and User_id = ?  " ;
		ArrayList<Gorder> General_Order= new ArrayList<Gorder>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");
        	
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(GetOrdersByID)) {
        	preparedStatement.setInt(1,user_id);
      
        	
        	ResultSet rs =preparedStatement.executeQuery();
        	while(rs.next())
        	{
        	Gorder order = new Gorder();
        	order.setOrder_id(rs.getInt("id_commande"));
        	order.setOrder_Date(rs.getString("Order_Date"));
        	order.setPrice(Total_id(order.getOrder_id()));
        	order.setOrder_Statue(rs.getString("Order_Statue"));
        	order.setGroupe_id(rs.getInt("Groupe_id"));
        	General_Order.add(order);
        	}
            System.out.println(preparedStatement);
            

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        	return General_Order;
		}
    
    
    public int AddProductToOrder(int commande_id,int Product_id,int Quantity_Ordred,Float price) throws ClassNotFoundException{
		String Add_Product = " insert into order_line(id_commande,Product_id,Quantity_Ordred,Price,Line_date) values (? ,? ,?,?,CURRENT_TIMESTAMP())" ;
		
		int result = 0;
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");
        	
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(Add_Product)) {
        	
        	preparedStatement.setInt(1,commande_id);
        	preparedStatement.setInt(2,Product_id);
        	preparedStatement.setInt(3,Quantity_Ordred);
        	preparedStatement.setFloat(4,price*Quantity_Ordred );
        	
        	
    
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        	return result;
		}
    public String C_Name(int Category_id) throws ClassNotFoundException {
		String C_Name="null";
    	String Search_C_Name = "select * from Category where Category_id = ? " ;
           
        
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(Search_C_Name)) {
        	
        
            preparedStatement.setInt(1,Category_id);
            

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();
            
            rs.next();
            C_Name = rs.getString("C_Name");
            

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        System.out.println(C_Name);
        return C_Name;
    }
    
    
    
    public int CheckGroupeId(int City_id){
		String Search_groupe = "Select * from groupes where City_id = ? and G_total < 5000 " ;
		int Groupe_id = 0 ;
		try {		
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(Search_groupe)) {
        	preparedStatement.setInt(1,City_id);
        	ResultSet rs = preparedStatement.executeQuery();
        	
        	while(rs.next())
        	{
        	Groupe_id = rs.getInt("Groupe_id");
        	}
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
       
        return Groupe_id;
		}
    	
    
    	public int AddGroupe(int City_id) throws ClassNotFoundException{
		String Add_Groupe = " insert into groupes(G_Total,City_id) values (?,?) " ;
		
		int result = 0;
		Float price = (float) 0;
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");
        	
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(Add_Groupe)) {
        	preparedStatement.setFloat(1,price);
        	preparedStatement.setInt(2,City_id);
        	result =preparedStatement.executeUpdate();
       
        	
    
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        	return result;
		} 
    	
    	public int UpdateGroupe(int groupe_id,Float Total) {
        	
        	String Update_sql = " Update groupes set G_total = G_total + ?   where  Groupe_id = ? ";           
        		int result=0;
        	
        		
        		try {
    				Class.forName("com.mysql.jdbc.Driver");
    			} catch (ClassNotFoundException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
                
                try (Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

                    // Step 2:Create a statement using connection object
                    PreparedStatement preparedStatement = connection.prepareStatement(Update_sql)) {
                	
                
                  
                    preparedStatement.setFloat(1,Total);
                    preparedStatement.setInt(2,groupe_id);
                    

                    System.out.println(preparedStatement);
                    // Step 3: Execute the query or update query
                    result = preparedStatement.executeUpdate();

                } catch (SQLException e) {
                    // process sql exception
                    printSQLException(e);
                }
                return result;
        		}
    
    
    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}