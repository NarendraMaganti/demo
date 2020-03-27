package com.capgemini.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/createcookie")
public class CreateCookieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		Cookie cookie1 = new Cookie("name", "ileana");
		cookie1.setMaxAge(60*60*24*7);
		resp.addCookie(cookie1);
		Cookie cookie2 = new Cookie("character", "madhu");
		resp.addCookie(cookie2);
		
		
		out.println("<html>"
				+"<body>"
				+"<h1>cookie created</h1>"
				+"</body>"
				+"</html>");

	}

}
