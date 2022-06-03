package Groupit.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Groupit.model.users;

public class usersDao {

    public int registerUser(users user) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO user" +
            "  (firstname, familyname, email, pass, usertype,tel,address,City_id) VALUES " +
            " (?, ?, ?, ?,?,?,?,?);";

        int result = 0;
        
        
        
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
        	
        
            preparedStatement.setString(1, user.getFirstname());
            preparedStatement.setString(2, user.getFamilyname());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getPass());
            preparedStatement.setString(5, user.getUsertype());
            preparedStatement.setString(6, user.getTel());
            preparedStatement.setString(7, user.getAddress());
            preparedStatement.setInt(8, user.getCity_id());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }
 
        public boolean ValidUser(users user) throws ClassNotFoundException {
            String Search_User = "select * from user where email = ? " ;

          
            Class.forName("com.mysql.jdbc.Driver");

            try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(Search_User)) {
            	
              
                preparedStatement.setString(1, user.getEmail());
         

                System.out.println(preparedStatement);
                // Step 3: Execute the query or update query
                ResultSet rs = preparedStatement.executeQuery();
                if(!rs.next())
                	return false;
                
            } catch (SQLException e) {
                // process sql exception
                printSQLException(e);
            }
            return true ;
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