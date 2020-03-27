package com.capgemini.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/readcookie")
public class ReadCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Cookie[] cookie=req.getCookies();
    PrintWriter out=resp.getWriter();
    out.println("<html>");
	out.println("<body>");
	for(Cookie ck:cookie) {
		out.println("<h1>");
		out.println(ck.getName());
		out.println(":");
		out.println(ck.getValue());
		out.println("</h1>");
	}
	out.println("</body>");
	out.println("</html>");
	
	}
}
