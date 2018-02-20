package step01.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Step03LoginCheck extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		process(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
		process(request, response);
	}
	/* client가 입력한 id/pw값 획득 -> 유효성 검증
	 * 	유효한 경우 : 안녕하세요 출력
	 * 	무효한 경우 : 넌 누구니? 출력
	 * 
	 * 기능적인 코드 : 요청 데이터 획득 -> 2byte 단위로 출력(한글)하는 객체 획득 -> 검증
	 * -> 상황별 메시지를 client 브라우저로 출력
	 */
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id"); // <input type = "text" name = "id">
		String pw = request.getParameter("pw");
		
		response.setContentType("text/html;charset=utf-8"); // 응답데이터 포멧 설정. 서비스로직이라 부름. 
		PrintWriter out = response.getWriter();
		if(id.equals("tester")) {
			out.println("안녕하세요 " + id);
		}else {
			out.println("넌 누구니?");
		}
	}	

}





/*
 * protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {System.out.println("doPost()");
 * 이거는 doGet과 doPost가 서로 동일해서 복사해서 함수를 넣어준다. 
 * 함수는 아래와 같다. 
 * 	System.out.println("doGet()");
		process(request, response);
 * 
 * 이후, process 함수를 만든다. 
 * id와 pw 값은 String이다. 
 * 
 * 응답 데이터 포멧은 "text/html;charset=utf-8" 이다. -> "포멧이 text와 html이고 한글일 때"라는 뜻이다. 
 * 
 * getWriter()를 쓰면 출력할 수 있는 객체 생성. 나아가서, ""PrintWriter out = response.getWriter();"" 공부. 
 *  --- response.getWriter();   response의 함수를 불러온다는 것. 
 *  --- PrintWriter는 출력할 때 쓰는 함수이고. 
 *  --- PrintWriter out은 out은 변수명. 
 * 
 * 
 * 
 * 
 * 아래와 같이, if 조건절을 넣어서 해준다. 
 * if(id.equals("tester")) {
			out.println("안녕하세요 " + id);
		}else {
			out.println("넌 누구니?");
		}
 * 
 * 
 * 
 * 
 * */

