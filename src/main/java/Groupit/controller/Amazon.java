package Groupit.controller;

import java.io.IOException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.*;

@WebServlet("/Amazon")
public class Amazon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpRequest irequest = HttpRequest.newBuilder()
				.uri(URI.create("https://amazon-data-scrapper5.p.rapidapi.com/search/mac%20book%20air?apiKey=74a7e88b8346d0cfd4989eee8bb9cf0e"))
				.header("x-rapidapi-host", "amazon-data-scrapper5.p.rapidapi.com")
				.header("x-rapidapi-key", "c74c9ff8c0msh0ac4559af72c437p12cbbdjsn9523d81f17a0")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> iresponse=null;
		try {
			iresponse = HttpClient.newHttpClient().send(irequest, HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(iresponse.body());
		JSONObject products=new JSONObject();
		JSONParser parser = new JSONParser();
		try {
			products = (JSONObject) parser.parse(iresponse.body());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(products);
		request.setAttribute("products", products);

		
		request.getRequestDispatcher("/AmazonPage.jsp").forward(request, response);

	}


}
