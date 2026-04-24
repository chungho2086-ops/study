package sec02.quiz;

public class Naver extends OAuth{
	
	@Override
	boolean 로그인(String id, String pw) {
		
		System.out.println("네이버 로그인 하자");
		
		return super.로그인(id, pw);
	}
}
