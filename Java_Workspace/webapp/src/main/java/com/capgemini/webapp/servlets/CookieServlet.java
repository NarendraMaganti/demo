package com.capgemini.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter pw=resp.getWriter();
	Cookie cookie1=new Cookie("girl", "Anushka");
	cookie1.setMaxAge(60*60*24*7);
	resp.addCookie(cookie1);
	Cookie cookie2=new Cookie("boy", "Mahesh");
	resp.addCookie(cookie2);
	pw.println("<html>");
	pw.println("<body>");
	pw.println("<h1>");
	pw.println("Cookie Created");
	pw.println("</body>");
	pw.println("</html>");
	
	}

}
