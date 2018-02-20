package step01.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class TwoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      System.out.println("Two Servlet doGet()");
		      process(request, response);
		   }
		   
		   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      System.out.println("Two Servlet doPost()");
		      process(request, response);
		   }
		   
		   protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      response.setContentType("text/html;charset=utf-8");
		      PrintWriter out=response.getWriter();
		      
		      
		      
		      
		      
		      
		      
		     
		      String name = request.getParameter("name");
		      out.print("<font color='red'>");
		      out.print(name);
		      out.println("<br>");
		      out.println(request.getAttribute("id")); //setAttibute()로만 저장된 데이터획득 // setAttribute는 getAttribute로만 호환되서 정보 획득
		      out.println("</font>");
		      
	}
		   
		   
		   
	// 반장의 선택 - forward 방식으로 two로 이동
		/* servlet으로 다른 servelt 요청.
		 * url로 요청해야 함.
		 * http://ip:port/project/one에서 two로 이동. 
		 * http://ip:port/project/one -> http://ip:port/project/two
		 * servlet API 이동 
		 */
		   


}
