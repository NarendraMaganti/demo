package com.capgemini.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add-app-attr")
public class AddApplicationAttributeServlet extends HttpServlet {
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context=getServletContext();
         context.setAttribute("context-obj",new Object());
         PrintWriter out=resp.getWriter();
         out.println("<html>");
         out.println("<body>");
         out.println("<h1>");
         out.println("context Object added");
         out.println("</h1>");
         out.println("</body>");
         out.println("</html>");
         
         
         
         
         
	}
}
