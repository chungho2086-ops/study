package quiz.quzi1;

public class Member {
	
	String id;
	String pw;
	
	Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	boolean login(String inputId, String inputPw) {
		if (id.equals(inputId) && pw.equals(inputPw)) {
			return true;
		}
		return false;
	}
}
