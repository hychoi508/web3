package step01.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class FourServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  System.out.println("Four Servlet doGet()");
	      process(request, response);
	}
	
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  System.out.println("Four Servlet doPost()");
	      process(request, response);
	}
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html;charset=utf-8");
	      PrintWriter out=response.getWriter();
	      String name = request.getParameter("msg");
	      
	      out.print("<font color='yellow'>");
	      out.print(name);
	      out.println("</font>");
	      
	      out.println("four");
	}
	

}
