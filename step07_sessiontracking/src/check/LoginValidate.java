package check;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginValidate extends HttpServlet {
	
	//service는 get과 post 방식 모두다 허용해주는 메소드이다.
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("tester") && pw.equals("77")){
			 HttpSession session = request.getSession();
			  session.setAttribute("id", "tester");
			  out.println("<a href='view.succ'>로그인되었습니다</a>" );
		}else {
			response.sendRedirect("view.fail");
		}
		
		
		
		
		
		
	}

	
}
