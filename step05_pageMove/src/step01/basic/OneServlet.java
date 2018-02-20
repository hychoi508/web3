package step01.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OneServlet extends HttpServlet {

	public OneServlet() {
//       System.out.println("OneServlet 생성자");
//    }      
//    
//    public void init() {
//       System.out.println("모든 user가 공유하는 자원 초기화 로직이 있다면 재정의 권장");
//    }
    }
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("One Servlet doGet()");
      process(request, response);
      
   }
   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("One Servlet doPost()");
      process(request, response);
   }
   
   //한글로 안녕하세
   /*
    *  String get parameter
    */
   protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html;charset=utf-8");
      PrintWriter out=response.getWriter();
      
      String name = request.getParameter("name"); // web query string 값 반환 
      if(name != null && name.equals(""))  {
    	out.println("전송된 데이터값은" + name + "입니다.");
      }else {
    	out.println("전송된 데이터는 하나도 없네요.");
      }
    		  
      out.println();
      
      request.setAttribute("id", "kpc id");
      
      RequestDispatcher rd = request.getRequestDispatcher("two");
      rd.forward(request, response);
   }
   
   
  
 }
   
   
   
//   public void destroy() {
//      System.out.println("공유자원이 혹여 있었다 할 경우 자원 반환 로직");
//   }

