package sec02.quiz;

public class Tving {
	
	void Tving로그인(OAuth oauth, String id, String pw) {
		
		if(oauth.로그인(id, pw)) {
			System.out.println("Tving 메인 페이지 표시");
		} else {
			System.out.println("다시 로그인 하세요");
		}
	}
}
