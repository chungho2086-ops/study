package chap07_quiz;


	public class DaumLogin  extends Login{
		
		  public DaumLogin(String id, String pw) {
			super(id, pw);
			// TODO Auto-generated constructor stub
		}

		public void login(String id, String pw) {
		        boolean result = loginCheck(id, pw);

		        if (result) {
		            System.out.println("다음 로그인 성공");
		        } else {
		            System.out.println("다음 로그인 실패");
		        }
		    }
		
	
}
