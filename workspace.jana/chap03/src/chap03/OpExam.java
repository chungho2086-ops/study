package chap03;

public class OpExam {

	public static void main(String[] args) {
		
		int X = 10;
		
		X++;
		System.out.println("x; "+ X);
		
		X = 10;
		X = X + 1;
//		X = 1 + X;
		// 나한테 + 1 해서 다시 나한테 저장할때
		// 줄여쓰는 형태
		X += 1;
		
		// 니누기 할 때 0으로 나누지 않도록 조심
		int b = 10;
//		int c= b / 0;
		double d = 7.3;
		double e = d / 0;
		System.out.println("d/0: "+ e); // Infinity
		
		// 나머지
		int f = 10 % 3;
		System.out.println(f);
		// 특징: 0부터 ~ 나머지 하는 숫자보다ㅣ 하나 작은 것만 나온다
		
		/*
		 * 숫자 149
		 * --------
		 * 출력 결과
		 * ----------
		 * "백의 자리 : 1"
		 * "십의 자리 : 4"
		 * "일의 자리 : 9"
		 */
		// %를 한번 이상 활용해서 풀어보자
		
		int num = 149;
		
		int one = num % 10;
		int ten = (num / 10) % 10;
		int hundred= num / 100;
		
		System.out.println("백의자리: " + hundred);
		System.out.println("십의자리: " + ten);
		System.out.println("일의자리: " + one);
		
		System.out.println(0.1);
		System.out.println(0.1f);
		System.out.println(0.1 == 0.1f);
		// 소수점은 근사치로 저장된다
		// 그나마 같은 타입으로 변환해서 비교하면 수월하다
		
		String s1 = "s1";
		String s2 = "s1";
		System.out.println(s1.equals(s2));
		// 글씨는 무조건 equals()로 비교한다
		System.out.println("asdfa".equals(s1));
		
		int c1 = 22;
		int c2 = 4;
		System.out.println("몫 : "+(c1/c2));
		System.out.println("나머지 : "+ (c1%c2));
		
		// 문제 1
		// 난 돈이 10000원 있음
		// 1. 4500원 짜리 쌍화차를 최대 몇 잔 살수 있는가?
		// 2. 그리고 남는 돈은?
		
		//문제2
		//올영에서 꿀홍차가 8000원인데
		//15% 세일! 그렇다면 가격은?
		
		//문제 1
		int money = 10000;
		int 쌍화차 = 4500;
		
		int 최대잔수 = money / 쌍화차;
		int 남은돈 = money / 쌍화차;
		
		System.out.println("최대잔수: " + 최대잔수);
		System.out.println("남은돈: " + 남은돈);
		
		// 문제 2
		int 꿀홍차 = 8000;
		double 세일 = 0.15;
		
		int 할인가격 = (int)(꿀홍차 * (1 - 세일));;
	    System.out.println("할인가격: " + 할인가격);
	    
	    // 문제 3-0
	    // 1234를 10의 자리 이하 버림
	    // 결과 : 1200
	    
	    // 문제 3-0
	    int 숫자 = 1234;
	    int 결과 = (숫자 / 100) * 100;
	    System.out.println(결과);
	    
	    
	    //문제 3
	    double v1 = 1000;
	    double v2 = 794.0;
	    System.out.println(v1 /v2); // 1.2594458438287153
	    // v1 / v2를 소수점 3자리까지만 출력하시오
	    // 오칙 연산만 plz
	    // 결과 : 1.259
	    
	    
	    
	    // 문제 4
	    // 17000이 있을때
	    // 5천원 몇장
	    // 1천원 몇장
	    
	    // 문제 4
	    int money1 = 17000;

	    int five = money / 5000;
	    int rest = money % 5000;
	    int one1 = rest / 1000;

	    System.out.println("5천원: " + five + "장");
	    System.out.println("1천원: " + one + "장");
	    
	    
	    int s = 95;
	    String grade = (s > 90 ) ? "A" : "B" ;
	    System.out.println("grade: "+ grade);
	    
	}

}
