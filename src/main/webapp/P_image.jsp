<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



<%@page import="java.sql.Blob"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%
int id = Integer.parseInt(request.getParameter("Product_id"));
  
Class.forName("com.mysql.jdbc.Driver");

try (Connection connection = DriverManager
    .getConnection("jdbc:mysql://localhost:3306/stockindb?useSSL=false&serverTimezone=UTC", "root", "root");

    PreparedStatement preparedStatement = connection.prepareStatement("select * from Products where Product_id=? ")) {
    preparedStatement.setInt(1,id);
        
    ResultSet rs = preparedStatement.executeQuery();
    if (rs.next()) {
        Blob blob = rs.getBlob("P_Image");
        byte byteArray[] = blob.getBytes(1, (int) blob.length());
        response.setContentType("image/gif");
        OutputStream os = response.getOutputStream();
        os.write(byteArray);
        os.flush();
        os.close();
    } else {
        System.out.println("No image found with this id.");
    }

} catch (Exception e) {
    // process sql exception
    out.println(e);
}

%>