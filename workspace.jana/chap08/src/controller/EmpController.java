package controller;

import java.util.List;

public class EmpController implements Servlet{
	
	EmpService empService = new EmpServiceImpl();

	@Override
	public String doGet() {
		
		List<Integer> list = empService.getEmpno();
		
		String html = "";
		
		return null;
	}

	@Override
	public String doPost() {
		return null;
	}

}
