package Groupit.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Groupit.model.login;
import Groupit.model.users;

public class loginDao {

	public users validate(login login) throws ClassNotFoundException {
		
		users user=new users();
		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection
						.prepareStatement("select * from user where email = ? and pass = ? ")) {
			preparedStatement.setString(1, login.getEmail());
			preparedStatement.setString(2, login.getPass());

			System.out.println(preparedStatement);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while (rs.next())
			{
				user.setUser_id(rs.getInt("User_id"));
				user.setFirstname(rs.getString("firstname"));
				user.setFamilyname(rs.getString("familyname"));
				user.setEmail(rs.getString("email"));
				user.setPass(rs.getString("pass"));
				user.setUsertype(rs.getString("usertype"));
				user.setTel(rs.getString("tel"));
				user.setAddress(rs.getString("address"));
				user.setCity_id(rs.getInt("City_id"));
			}
			

		} catch (SQLException e) {
			// process sql exception
			printSQLException(e);
		}
		return user;
	}
	public users GetUser(int user_id) throws ClassNotFoundException {
		
		users user=new users();
		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection
						.prepareStatement("select * from user where User_id = ? ")) {
			preparedStatement.setInt(1,user_id);
			
			System.out.println(preparedStatement);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while (rs.next())
			{
				user.setUser_id(rs.getInt("User_id"));
				user.setFirstname(rs.getString("firstname"));
				user.setFamilyname(rs.getString("familyname"));
				user.setEmail(rs.getString("email"));
				user.setPass(rs.getString("pass"));
				user.setUsertype(rs.getString("usertype"));
				user.setTel(rs.getString("tel"));
				user.setAddress(rs.getString("address"));
				user.setCity_id(rs.getInt("City_id"));
			}
			

		} catch (SQLException e) {
			// process sql exception
			printSQLException(e);
		}
		return user;
	}
	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
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