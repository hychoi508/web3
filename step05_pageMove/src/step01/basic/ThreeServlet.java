package step01.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThreeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  System.out.println("Three Servlet doGet()");
	      process(request, response);
	   }
	   
	//redirect test 예제 : 2-2에서 요청
	/* html에서 Three
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  System.out.println("Three Servlet doPost()");
	      process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			      response.setContentType("text/html;charset=utf-8");
			      PrintWriter out=response.getWriter();
			      String name = request.getParameter("name");
			      
			      
			      out.print("<font color='red'>");
			      out.print(name);
			      out.println("</font>");
			      
			      
			      //servlet API로 web상에서 화면이동 방식 중 하나인 redirect
			      response.sendRedirect("three에서 나오는 글입니다.");
			      
			      
			      
			      
	   }
}

