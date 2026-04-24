package todo.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.DTO.TodoDTO;
import todo.service.TodoService;

@WebServlet("/todo/detail")
public class TodoDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/detail doGet 실행");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		try {
			// "todo_id" 받아서 출력하기
			String todo_id = request.getParameter("todo_id");
			System.out.println("todo_id: "+ todo_id);
			
			int nTodo_id = Integer.parseInt(todo_id);
			
			// nTodo_id를 service --> DAO 까지 보낼꺼임
			TodoService todoService = new TodoService();
			TodoDTO todoDTO = todoService.getTodo(nTodo_id);
			
			System.out.println(todoDTO);
			
			
			PrintWriter out = response.getWriter();
			// "목록으로" a tag
//			out.write("<a href='http://localhost:8080/_proj03_1_todo/todo'>목록으로</a>");
			out.write("<a href='../todo'>목록으로</a>");
			out.write("<br>todo_id:"+ todoDTO.getTodo_id());
			out.write("<br>duedate:"+ todoDTO.getDuedate());
			out.write("<br>done:"+ todoDTO.getDone());
			out.write("<br>content:"+ todoDTO.getContent());
			out.write("<br>ctime:"+ todoDTO.getCtime());
			out.write("<hr>");
			out.println("<a href='" + request.getContextPath() + "/todo/modify?todo_id=" + todoDTO.getTodo_id() + "'>수정페이지로 이동</a>");
			out.println("<form method='post' action='" + request.getContextPath() + "/todo/detail' style='display:inline;'>");
			out.println("<input type='hidden' name='todo_id' value='" + todoDTO.getTodo_id() + "'>");
			out.println("<input type='submit' value='삭제하기'>");
			out.println("</form>");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	// 추가 : 삭제 처리
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/detail doPost 실행");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		try {
			// todo_id 받기
			String todo_id = request.getParameter("todo_id");
			System.out.println("todo_id: " + todo_id);
			
			int nTodo_id = Integer.parseInt(todo_id);
			
			// service --> DAO --> DB 삭제
			TodoService todoService = new TodoService();
			int result = todoService.deleteTodo(nTodo_id);
			
			System.out.println("delete result: " + result);
			
			// 삭제 후 목록으로 이동
			response.sendRedirect(request.getContextPath() + "/todo");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}