package com.capgemini.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/get-attr")
public class GetRequestAttribute extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Object obj1=req.getAttribute("attr1");
    PrintWriter out=resp.getWriter();
    out.println("<html>");
    out.println("<body>");
    out.println("<h1>");
    out.println(obj1);
    out.println("</h1>");
    out.println("</body>");
    out.println("</html>");
	}
}
