package todo.service;

import java.util.List;

import todo.DAO.TodoDAO;
import todo.DTO.TodoDTO;

public class TodoService {

	public List<TodoDTO> getList() {
		TodoDAO todoDAO = new TodoDAO();
		List<TodoDTO> list = todoDAO.selectAll();
		return list;
	}

	public TodoDTO getTodo(int todo_id) {
		TodoDAO todoDAO = new TodoDAO();
		TodoDTO todoDTO = todoDAO.selectOne(todo_id);
		return todoDTO;
	}

	public int addTodo(TodoDTO todoDTO) {
		TodoDAO todoDAO = new TodoDAO();
		int count = todoDAO.insertTodo(todoDTO);
		return count;
	}

	public int updateTodo(TodoDTO todoDTO) {
		TodoDAO todoDAO = new TodoDAO();
		int count = todoDAO.updateTodo(todoDTO);
		return count;
	}
	
	public int deleteTodo(int todo_id) {
		TodoDAO todoDAO = new TodoDAO();
		int count = todoDAO.deleteTodo(todo_id);
		return count;
	}
	
	
}