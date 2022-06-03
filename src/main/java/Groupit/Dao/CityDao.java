package Groupit.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Groupit.model.city;



public class CityDao {
	
	public List<city> cities() throws ClassNotFoundException {
		List<city> cities= new ArrayList<city>();
		String City_sql = "select * from city " ;
        
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(City_sql)) {
        	

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next())
            {
            	city City = new city(rs.getInt("City_id"),rs.getString("City_name"));
            	cities.add(City);
            }
            
            

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return cities;
	}
	
	public int City_id(String City_name) throws ClassNotFoundException {
		int C_id=0 ;
		String City_id_sql = "select * from city where City_name like ?  " ;
           
        
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(City_id_sql)) {
        	
        
            preparedStatement.setString(1,City_name);
            

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();
            
            rs.next();
            C_id=rs.getInt("City_id");
            System.out.println(C_id);

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return C_id;
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
