package chap07_quiz;

public class Login {
	
	  String id;
	  String password;

	    // 생성자
	    public Login(String id, String pw) {
	        this.id = id;
	        this.password = pw;   
	    }

	    // 로그인 체크
	    boolean loginCheck(String id1, String pw1) {
	        if (this.id.equals(id1) && this.password.equals(pw1)) {
	        
	            return true;
	        } else {
	            return false;
	          
	        }
	    }

	    // 로그인 결과
	    public void login(String id, String pw) {
	        boolean result = loginCheck(id, pw);

	        if (result) {
	            System.out.println("로그인 성공");
	        } else {
	            System.out.println("로그인 실패");
	        }
	    }
	}