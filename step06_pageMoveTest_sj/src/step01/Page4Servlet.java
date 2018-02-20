package step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Page4Servlet extends HttpServlet {
	public Page4Servlet() {
		System.out.println("im pg4 constructor");
	}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("im 4 init");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Page4Servlet doGet()");
		process(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Page4Servlet doPost()");
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
//      ===================================================

		response.setContentType("text/html;charset=utf-8");		
		PrintWriter out = response.getWriter();
		
		/* 접속된 client로 부터 쿠키 정보 획득
		 * 
		 * 1단계 : 해당 사이트의 해당 project로 생성된 쿠키 정보 획득
		 * 		- web sever와 브라우저가 알아서 해당 정보만 제공
		 * 
		 * 2단계 : key로 구분하면서 데이터(value) 활용 
		 */
//		
		Cookie[] all = request.getCookies();
		
		for(int i=0; i<all.length; i++) {
			if(all[i].getName().equals("id")) {  //객체의 내용값 비교는 ==이 아니라 equals이다. 그리고 getName은 id값 Cookie 정보를 가져오는 역할을 한다. 
				out.println(all[i].getValue());
				
				all[i].setValue(null);
				response.addCookie(all[i]);
				
				break; // 반복문 종료. 
			}
		}	
			
			/* Cookie 하나하나 반환해서 key가 id인 Cookie 검색(page3에서 "response.addCookie(id);"라 쿠키의 id 값을 설정함.)
			 * 현재 알고 있는 데이터는 "id"라는 key라 가정.
//			 * 
//			 */
//		}
		
		
		
// ====================================
		
/* HttpSession session = request.getSession(); ------------ session 데이터를 생성하는 것입니다. 
 *  이것만으로도 가능한 이유는, server로부터 이미 부여 받은 고유 id 값을 비교하면서 동일 id로부터 getSession() 호출시 없을 경우에 생성하고, 이미 존재할 경우에 재사용합니다. 
 * System.out.println("page3의 session id: " + session.getId());
 * 
 * 
 * 
 * session.removeAttribute("hope");
 * 세션에 저장된 데이터를 삭제하는 메소드입니다. 
 * 
 * 
 * 
 
  out.println(session.getAttribute("msg"));
		out.println("im page4입니다.");
 * 
 * 
 * session.invalidate(); 
 * session=null;
 * 세션 삭제 메소드입니다.  삭제가 안먹히면 web.xml의 10분간만 세션 유지하도록 하게 설정함. 이것과 invalidate와 연결되어 있음. 
 */
}
}

