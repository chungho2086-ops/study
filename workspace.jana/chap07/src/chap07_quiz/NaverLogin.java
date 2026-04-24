package chap07_quiz;

public class NaverLogin  extends Login{
	
	  public NaverLogin(String id, String pw) {
		super(id, pw);
		// TODO Auto-generated constructor stub
	}

	public void login(String id, String pw) {
	        boolean result = loginCheck(id, pw);

	        if (result) {
	            System.out.println("네이버 로그인 성공");
	        } else {
	            System.out.println("네이버 로그인 실패");
	        }
	    }
	
}
