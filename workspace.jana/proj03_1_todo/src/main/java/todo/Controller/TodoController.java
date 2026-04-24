package todo.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.DTO.TodoDTO;
import todo.service.TodoService;

@WebServlet("/todo")
public class TodoController extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo doGet 실행");
		
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		TodoService todoService = new TodoService();
		List<TodoDTO> list = todoService.getList();
		
		PrintWriter out = response.getWriter();
		
		out.println("<h1>Todo 목록</h1>");
		
		// 추가 : 목록 전체를 form으로 감싸기
		out.println("<form method='post' action='" + request.getContextPath() + "/todo'>");
		
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("	<th>선택</th>");    
		out.println("	<th>todo_id</th>");
		out.println("	<th>done</th>");
		out.println("	<th>content</th>");
		out.println("	<th>ctime</th>");
		out.println("</tr>");
		
		for(int i=0; i<list.size(); i++) {
			TodoDTO todoDTO = list.get(i);
			
			out.println("<tr>");
			out.println("	<td><input type='checkbox' name='todo_id' value='" + todoDTO.getTodo_id() + "'></td>"); // 추가
			out.println("	<td>"+todoDTO.getTodo_id()+"</td>");
			out.println("	<td>"+todoDTO.getDone()+"</td>");
			out.println("	<td><a href='" + request.getContextPath() + "/todo/detail?todo_id="+ todoDTO.getTodo_id() +"'>"+todoDTO.getContent()+"</a></td>");
			out.println("	<td>"+todoDTO.getCtime()+"</td>");
			out.println("</tr>");
		}
		
		out.println("</table>");
		
		// 추가 : 삭제 버튼
		out.println("<br>");
		out.println("<input type='submit' value='선택삭제'>");
		
		out.println("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo doPost 실행");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		// 체크된 todo_id 여러 개 받기
		String[] todo_ids = request.getParameterValues("todo_id");
		
		TodoService todoService = new TodoService();
		
		// 체크된 게 있을 때만 삭제
		if(todo_ids != null) {
			for(int i = 0; i < todo_ids.length; i++) {
				int nTodo_id = Integer.parseInt(todo_ids[i]);
				int result = todoService.deleteTodo(nTodo_id);
				System.out.println("삭제 result : " + result);
			}
		}
		
		// 삭제 후 다시 목록으로 이동
		response.sendRedirect(request.getContextPath() + "/todo");
	}

}