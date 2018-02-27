package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextConfigExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ContextConfigExample() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ServletContext sc1 = getServletContext();
		String str = sc1.getInitParameter("QuarterBack");
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>"
					+"<p> Best Quarterback: " + str + "</p>");
					
		
		ServletConfig sc2 = getServletConfig();
		String str2 = sc2.getInitParameter("WideReciever");
		
		pw.println("<p> Best Wide Reciever : "+str2+ "</p>");
		
		String str3 = (String) sc1.getAttribute("RunningBack");
		
		pw.println("<p> Best Running Back : "+str3+"</p></body></html>");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
