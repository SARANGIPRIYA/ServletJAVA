package com.javaServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//servlet calling another servlet,requestDispachter,send link,url redirecting,httpsession,cookie inn this class
//@WebServlet("/square")
public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest  request,HttpServletResponse response) throws IOException {
		//for requestdispacther example caling servlet from servlet
//		int k=(int) request.getAttribute("k");
//		k=k*k;
//		PrintWriter out=response.getWriter();
//		out.println("Final Result:"+" "+k);
		
//		//sendredirect example calling servlet from servlet		
//		int k=Integer.parseInt(request.getParameter("k"));
//		k=k*k;
//		PrintWriter out=response.getWriter();
//		out.println("Final Result:"+" "+k);
		
		
		//HttpSession example calling servlet from servlet		
//		HttpSession session=request.getSession();
//		int k=(int) session.getAttribute("k");
//		k=k*k;
//		PrintWriter out=response.getWriter();
//		out.println("Final Result:"+" "+k);
		
		//Cookie example calling servlet from servlet
//		int k=0;
//		Cookie cookies[]=request.getCookies();
//		for(Cookie c:cookies) {
//			if(c.getName().equals("k"))
//				k=Integer.parseInt(c.getValue());
//		}
//		k=k*k;
//		PrintWriter out=response.getWriter();
//		out.println("Final Result:"+" "+k);
//		
	}

}
