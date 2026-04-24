

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class Redierect extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		System.out.println("/redirect doGet 실행");
		
		String text = request.getParameter("text");
		System.out.println("text: "+ text);
		
		request.setAttribute("item", "롱소드");
		response.getWriter().println("/redirect의 응답 [GET]");
		
		response.sendRedirect("/http://127.0.0.1:8080/proj2_request/another");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/redirect doPostt 실행");
		
		String text = request.getParameter("text");
		System.out.println("text: "+ text);
		
		request.setAttribute("item", "롱소드");
		response.getWriter().println("/redirect의 응답 [GET]");
		
		response.sendRedirect("/http://127.0.0.1:8080/proj2_request/another");
	}

}
