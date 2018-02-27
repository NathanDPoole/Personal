package com.revatue.servelets;

import java.io.IOException;
import java.io.PrintWriter;
//import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/irreleventname") 
//URL mapping is here not in web.xml because the URL doesn't match the servlet name
//Annotation names can't be the same as names listed in web.xml
public class PrintWriterExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public PrintWriterExample() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.println("<html><body>");
		pw.println("<h2>Comming from Print Writher example</h2>");
		
		Enumeration<String> myHeaders = request.getHeaderNames();
		
		while (myHeaders.hasMoreElements()) {
			String name = myHeaders.nextElement();
			pw.println("<p>" + name + " : "+ myHeaders.nextElement() + " : " + request.getHeader(name) + "</p>");
		}
		
		
		pw.println("</body></html>");
		
		
		
		
		pw.close();
	}

}
