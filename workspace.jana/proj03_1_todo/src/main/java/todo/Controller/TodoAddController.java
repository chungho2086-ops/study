package todo.Controller;

import java.io.IOException;
import java.sql.Date; // 🔥 추가 : 날짜 처리를 위해 필요

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.DTO.TodoDTO;
import todo.service.TodoService;

@WebServlet("/todo/add")
public class TodoAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/add 의 doPost 실행");

		// 한글 처리
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");

		String content = request.getParameter("content");
		System.out.println("content: " + content);

		
		String duedate = request.getParameter("duedate");
		System.out.println("duedate: " + duedate);

		
		TodoDTO todoDTO = new TodoDTO();
		todoDTO.setContent(content); // 기존

		//  날짜를 Date 타입으로 변환해서 넣기
		if(duedate != null && !duedate.equals("")) {
			todoDTO.setDuedate(Date.valueOf(duedate));
		}

		
		// service로 DTO를 보냄
		
		TodoService todoService = new TodoService();
		int result = todoService.addTodo(todoDTO);
		System.out.println("result : " + result);

		
		// 목록 페이지로 이동
		
		response.sendRedirect(request.getContextPath() + "/todo");
	}
}