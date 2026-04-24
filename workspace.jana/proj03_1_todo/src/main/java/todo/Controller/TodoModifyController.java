package todo.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date; // 추가 : 날짜 처리를 위해 필요

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.DTO.TodoDTO;
import todo.service.TodoService;

@WebServlet("/todo/modify")
public class TodoModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/modify doGet 실행");

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");

		String todo_id = request.getParameter("todo_id");
		System.out.println("todo_id : " + todo_id);

		int nTodo_id = Integer.parseInt(todo_id);

		// 기존 글 조회
		TodoService todoService = new TodoService();
		TodoDTO todoDTO = todoService.getTodo(nTodo_id);

		// 수정 페이지 출력
		PrintWriter out = response.getWriter();

		out.println("<h1>할 일 수정</h1>");
		out.println("<form method='post' action='" + request.getContextPath() + "/todo/modify'>");
		out.println("<input type='hidden' name='todo_id' value='" + todoDTO.getTodo_id() + "'>");
		out.println("내용 : <input type='text' name='content' value='" + todoDTO.getContent() + "'>");
		out.println("<br>"); // 추가 : 줄바꿈
		out.println("마감일 : <input type='date' name='duedate' value='" + todoDTO.getDuedate() + "'>"); // 추가
		out.println("<br>"); // 추가 : 줄바꿈

		// 수정 버튼 + 삭제 버튼 추가
		out.println("<input type='submit' name='action' value='수정'>");
		out.println("<input type='submit' name='action' value='삭제'>");

		out.println("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/modify doPost 실행");

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");

		// 값 받기
		String todo_id = request.getParameter("todo_id");
		String content = request.getParameter("content");
		String duedate = request.getParameter("duedate"); 
		String action = request.getParameter("action");  

		System.out.println("todo_id : " + todo_id);
		System.out.println("content : " + content);
		System.out.println("duedate : " + duedate); 
		System.out.println("action : " + action);   

		// 형변환
		int nTodo_id = Integer.parseInt(todo_id);

		// service 준비
		TodoService todoService = new TodoService();

		
		// 삭제 
		
		if("삭제".equals(action)) {
			int result = todoService.deleteTodo(nTodo_id);
			System.out.println("삭제 result : " + result);

			// 목록 페이지로 이동
			response.sendRedirect(request.getContextPath() + "/todo");
			return;
		}

		// DTO에 담기
		TodoDTO todoDTO = new TodoDTO();
		todoDTO.setTodo_id(nTodo_id);
		todoDTO.setContent(content);

		// 추가 : 날짜가 있으면 DTO에 넣기
		if(duedate != null && !duedate.equals("")) {
			todoDTO.setDuedate(Date.valueOf(duedate));
		}

		// 수정 실행
		int result = todoService.updateTodo(todoDTO);

		System.out.println("result : " + result);

		// 상세페이지로 이동
		response.sendRedirect(request.getContextPath() + "/todo/detail?todo_id=" + nTodo_id);
	}
}