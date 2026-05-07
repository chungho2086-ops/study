package kr.or.human4.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.human4.dto.EmpDTO;
import kr.or.human4.service.EmpService;

@Controller
public class EmpController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
	
	@Autowired
	EmpService empService;
	
	
	// 화면 열기
	@RequestMapping("/list")
	public String list() {
		
		System.out.println("/list 실행");
		
		return "emp";
	}
	
	
	// 전체조회 ajax
	@ResponseBody
	@RequestMapping("/listAjax")
	public List<EmpDTO> listAjax() {
		
		System.out.println("/listAjax 실행");
		
		List<EmpDTO> list = empService.getEmpList();
		
		System.out.println("listAjax : " + list);
		
		return list;
	}
	
	
	// 검색 ajax
	@ResponseBody
	@RequestMapping("/searchAjax")
	public List<EmpDTO> searchAjax(
			@ModelAttribute EmpDTO empDTO
			) {
		
		System.out.println("/searchAjax 실행");
		
		System.out.println(empDTO);
		
		List<EmpDTO> list = empService.search(empDTO);
		
		System.out.println("searchAjax : " + list);
		
		return list;
	}
	
	
	// 선택조회 ajax
	@ResponseBody
	@RequestMapping("/choiceAjax")
	public List<EmpDTO> choiceAjax(
			@ModelAttribute EmpDTO empDTO
			) {
		
		System.out.println("/choiceAjax 실행");
		
		List<EmpDTO> list = empService.choice(empDTO);
		
		System.out.println("choiceAjax : " + list);
		
		return list;
	}
	
	
	@ResponseBody
	@RequestMapping("/map")
	public Map empmap() {
		
		System.out.println("/map 실행");
		
		Map map = empService.getEmpMap();
		
		System.out.println("/oneMap: map : " + map);
		
		return map;
	}
	
	
	@RequestMapping("/join.do")
	public String join() {
		
		System.out.println("/join.do 실행");
		
		return "join";
	}
	
	
	@RequestMapping("/joinEmp2")
	public String joinEmp2(EmpDTO empDTO) {
		
		System.out.println("/joinEmp2 실행");
		
		logger.info("empDTO: " + empDTO);
		
		empService.insertEmp2(empDTO);
		
		return "redirect:/list";
	}
	
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int empno) {
		
		empService.deleteEmp(empno);
		
		return "redirect:/list";
	}
	
	
	@RequestMapping("/update")
	public String update(EmpDTO dto) {
		
		empService.updateEmp(dto);
		
		return "redirect:/list";
	}
}