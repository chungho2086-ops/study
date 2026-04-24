package sec02.quiz;

public class OAuthExam {

	public static void main(String[] args) {
		
		Naver naver = new Naver();
		naver.회원가입("chungho2086", "1234");
		
		KaKao KaKao = new KaKao();
		KaKao.회원가입("sangmin2034", "2086");
		
		Tving tv = new Tving();
		
		tv.Tving로그인(naver, "chungho2086", "1234");
		tv.Tving로그인(KaKao, "sangmin2034", "2086");
	}

}
