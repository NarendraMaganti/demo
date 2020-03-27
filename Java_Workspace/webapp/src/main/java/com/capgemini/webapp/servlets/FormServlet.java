package com.capgemini.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fs")
public class FormServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String nam=req.getParameter("nm");
      String e=req.getParameter("em");
      String pswd=req.getParameter("pwd");
      String mobno=req.getParameter("mn");
      PrintWriter out=resp.getWriter();
      out.println("<html>");
      out.println("<body>");
      out.println("<h1>");
      out.println(" Name is: "+nam+"<br>");
      out.println(" Mail id is: "+e+"<br>");
      out.println(" MobileNumber: is "+mobno);
      out.println("</h1> </body> </html> ");
      



	}
	
	

}
