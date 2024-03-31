package com.javaServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//servlet calling another servlet,requestDispachter,send link,url redirecting,httpsession,cookie inn this class
//the movemnt we extend clss with httpservlet the clss becomes a servlet
@WebServlet("/add")
public class AddServlet extends HttpServlet {
	////we should use onlyservice method which has request and response as params
		public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
	//		
	//		////we want to get input from users so
			int i=Integer.parseInt(request.getParameter("num1"));
			int j=Integer.parseInt(request.getParameter("num2"));
			int k=i+j;
	//		//System.out.println("result:"+" "+k);
			PrintWriter out=response.getWriter();
			//out.println("<html><body bgcolor='cyan'>");//if not jsp we should write code like this.
			out.println("Result is:"+" "+k);
			//out.print("</body></html>");
		}


	////sm like srvlet gives doPost method index.html we should use get method only post will not work.vice versa.
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {

		////we want to get input from users so
		int i=Integer.parseInt(request.getParameter("num1"));
		int j=Integer.parseInt(request.getParameter("num2"));
		int k=i+j;
		//System.out.println("result:"+" "+k);
//		PrintWriter out=response.getWriter();
//		out.println("Result is:"+" "+k);
				
		//requestDispacter is an interface first method calling servlet from servlet.
//		request.setAttribute("k", k);
//		RequestDispatcher rd=request.getRequestDispatcher("square");
//		rd.forward(request, response);
	
		//sendDirect second method to call servlet from servlet.
		//response.sendRedirect("square?k="+k);//sessionManagement url rewriting method.
		
		
		//HttpSession example
//		HttpSession session=request.getSession();
//		
//		session.setAttribute("k", k);
//		response.sendRedirect("square");	
		
		//Cookies Eg
		Cookie cookie= new Cookie("k",k +"");
	response.addCookie(cookie);
	response.sendRedirect("square");
		
	}
}
