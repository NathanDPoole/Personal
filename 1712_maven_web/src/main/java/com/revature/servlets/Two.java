package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Two extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Two() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>"
					+"<p>" + request.getParameter("fullname") + "</p>"
					+"</body></html>");
		//response.sendRedirect("welcome.html");
		
		RequestDispatcher r = request.getRequestDispatcher("default.html");
		//r.forward(request, response);
		r.include(request, response);
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
