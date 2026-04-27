package kr.or.human2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human2.dao.MemberDAO;
import kr.or.human2.dao.MemberDAOImpl;
import kr.or.human2.dao.MemberDAOImpl2;
import kr.or.human2.service.MemberService;
import kr.or.human2.service.MemberServiceImpl;

@Controller
public class MemberController {
	
	MemberController(){
		System.out.println("MenberController 생성자 실행");
	}
	// 브라우저
	// Controller 
	// Service
	// DAO
	// 다시 Controller
	// JSP 화면
	
	// 코드 기준
	///member 요청
//	 → MemberController
//	 → MemberServiceImpl
//	 → MemberDAOImpl
//	 → List 가져옴
//	 → home.jsp 보여줌
//	MemberController에서 memberService.getList2()를 호출하고 있어.
//	MemberServiceImpl은 memberDAO.select()를 실행해서 DAO 쪽 데이터를 가져와.
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/member")
	String listMember() {
		System.out.println("/member 실행");
		// 주도권을 내가 가지고 있어서 이후 Autowired가 안된다
//		MemberService memberService = new MemberServiceImpl();	
//		MemberDAO memberDAO =new MemberDAOImpl();
//		MemberDAO memberDAO =new MemberDAOImpl2();
//		List list = memberService.getList(memberDAO);
		
		// 주도권을 spring에게 준상태
		List list = memberService.getList2();
		System.out.println("list :" + list);
			
		return "home";
	}
	
}
