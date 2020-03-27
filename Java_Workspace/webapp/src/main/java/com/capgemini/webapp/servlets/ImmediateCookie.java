package com.capgemini.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/delete-cookie")
public class ImmediateCookie extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     Cookie[] cookie=req.getCookies();
     for (Cookie cookie2 : cookie) {
    	 if(cookie2.getName().equals("girl"))
    		 cookie2.setMaxAge(0);
    	 resp.addCookie(cookie2);
		
	}
     
     PrintWriter out=resp.getWriter();
     out.println("<html>");
     out.println("<body>");
     out.println("<h1>");
     out.println("Cookie Deleted");
     out.println("</h1>");
     out.println("</body>");
     out.println("</html>");
	}
	
	

}
