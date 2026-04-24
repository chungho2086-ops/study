package sec02.quiz;

public class OAuth {
	
	String id;
	String pw;
	
	// 회원가입
	boolean 회원가입(String id, String pw) {
		this.id = id;
		this.pw = pw;
		
		return true;
	}
	
	// 회원
	boolean  회원check(String di, String pw) {
		
		if(this.id.equals(id) && this.pw.equals(pw)) {
			return true;
		} else {
			return false;
		}
	}
	
	// 로그인
	boolean 로그인(String id, String pw) {
		return 회원check(id, pw);
	}
}
