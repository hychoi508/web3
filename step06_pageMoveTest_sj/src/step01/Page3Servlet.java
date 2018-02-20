package step01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Page3Servlet extends HttpServlet {
	public Page3Servlet() {
		System.out.println("im pg3 constructor");
	}
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("im 3 init");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Page3Servlet doGet()");
		process(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Page3Servlet doPost()");
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		//step02 - Cookie
		/* 1단계 - 저장하고자 하는 데이터로 쿠키 객체 생성. 
		 * 2단계 - client 시스템에 잔존 시간을 초단위로 설정
		 * 3단계 - client 시스템에몰래 저장.
//		 */
//		
//		//1단계
//		Cookie id = new Cookie("id", "tester");
//		Cookie pw = new Cookie("pw", "12345");
//		
//		//2단계 --------------------------- 나아가, 해당 정보는 client가 삭제시 어쩔수 없는 휘발 데이터이다. 
//		id.setMaxAge(60*60*24*365);
//		pw.setMaxAge(60*60*24*365);
//		
//		
//		//3단계
//		response.addCookie(id);
//		response.addCookie(pw);
//		System.out.println("-------------");
//		
//		//그리고 페이지 이동
//		response.sendRedirect("page4");
//		
//		
		
		
		
		
		//step01 - httpSession 학습
		
		
		
		
//		===================================================
		
		/* 로그인~로그아웃까지 어떠한 방식으로 화면 이동을 하더라도, 데이터 유지 기술. 
		 * - 서버 메모리 활용하는 기술
		 * - 세션 개발 기술
		 * - 주요 API : HttpSession
		 * 		데이터 저장 : setAttribute(String key, Object value);
		 * 		데이터 반환 : getAttribute(String key) 
		 *  	데이터 삭제 : void removeAttribute(string Key)
		 * 
		 */
		
		
		
		
		// client 별 개별적으로 생성 및 데이터 관리하는 HttpSession 객체 생성
		// client 자체에 몰래 저장시킨 구분 데이터(고유 ID)로, 서버가 자체적으로 관리 함.  
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession(); // 생성
		System.out.println("page3의 session id: " + session.getId());
		
		
		
		
		
//		//코드로 개발자가 데이터 저장
		session.setAttribute("msg", "하영씨의 상태는 멘붕");
		session.setAttribute("hope", "잘하고 있어");
		
		
		
		response.sendRedirect("page4");
	}
}