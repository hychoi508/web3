package step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DataTotal extends HttpServlet {
    public DataTotal() {
    	System.out.println("Data Total 생성자");
    }
    /* client가 text area와 hidden tag를 통해서 전송되는 데이터 값을 획득. 
     * 하지만 고려해야할 사항이 있다. 
     * 그것은 한글 포함이다. 
     * 이는, 요청 객체로부터 한글 인코딩 후 데이터를 획득해야만 가능하다. 
     * 
     * client에게 응답시 한글 응답은
     * 한글 인코딩 방식을 응답 객체에 별도로 해야만 한다.
     * 
     * 즉, 인코딩처리를 두 곳에서 해야한다는 의미입니다. 
     * 
     * 
     * 데이터를 먼저 받고, ㅇ니코딩을 하면 의미가 없다. 
     * 데이터 뽑기 전에 반드시 utf-8로 설정한다. 
     */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String msg = request.getParameter("ta");
		String hiddenData = request.getParameter("name");
		System.out.println(msg + " " + hiddenData);
		
		PrintWriter out = response.getWriter();
		out.println(msg + " " + hiddenData);
		
	}

}
