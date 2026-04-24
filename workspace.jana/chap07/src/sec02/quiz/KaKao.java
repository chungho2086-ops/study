package sec02.quiz;

public class KaKao extends OAuth{
	
	@Override
	boolean 로그인(String id, String pw) {
		
		System.out.println("카카오 로그인 하자");
		
		return super.로그인(id, pw);
	}
}
