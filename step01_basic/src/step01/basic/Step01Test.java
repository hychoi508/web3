/* 학습내용 
 * 1. servelet 개발 스펙 학습
 * 2. http 프로토콜 활용 
 * 	: w2c에서 제시 -> 서버 벤더사&언어는 지원 -> 언어 사용하는 개발자는 활용 
 * 3. client의 요청 방식별 처리 능력 
 * 	1. get 요청방식 
 * 	2. post 요청방식 
 * 4. 동작
 * 	client - 브라우저로 요청 
 * 		-> web container[web server = was = servlet engine] -> 
 * 	server - 브라우저로 응답(브라우저)
 */


package step01.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// url요청시 kpc로 요청 설정. 
/* 한글 데이터 출력 - 인코딩 설정, 2byte 출력(~Writer)  
 * 파란색 글씨 - html tag로 
 */
public class Step01Test extends HttpServlet {
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("doGet()");
      
      response.setContentType("text/html;charset=utf-8");
      PrintWriter out = response.getWriter();
      out.println("<font color='blue'>안녕하세요</font>");
   }

   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  System.out.println("doPost()");
   }

}