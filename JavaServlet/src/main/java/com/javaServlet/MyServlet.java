package com.javaServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet Cofig 
 * Servlet Context*/
public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		//ServletContext eg in web.xml contextparam
//		PrintWriter out=response.getWriter();
//		out.print("Hi");
//		
//		ServletContext context=getServletContext();
//		String str=context.getInitParameter("name");
//		out.print(str);
//		String str1=context.getInitParameter("phone");
//		out.print(str1);
//		
		
		
		//ServletConfig in webxml intiparam.
		PrintWriter out=response.getWriter();
		out.print("Hi");
		
		ServletConfig config=getServletConfig();
		String str=config.getInitParameter("name");
		out.print(str);
		String str1=config.getInitParameter("phone");
		out.print(str1);
	}

}
