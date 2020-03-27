package com.capgemini.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		HttpSession session=req.getSession(false);
		if(session!=null) {
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");
		out.println("This is a home page");
		out.println("<a href='./logout'>Logout</a>");
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
		}
		else {
		RequestDispatcher rd = req.getRequestDispatcher("login.html");
		rd.forward(req, resp);
		}

	}

}
