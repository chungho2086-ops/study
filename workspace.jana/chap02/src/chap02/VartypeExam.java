package chap02;

public class VartypeExam {

	public static void main(String[] args) {
		
		byte b1;
		b1 = 127;
		System.out.println("b1: "+ b1);
//		b1 = 128;
		
		char c1 = 65;
		System.out.println("c1: "+ c1);
		char c2 = 65 + 2;
		System.out.println("c2: "+ c2);
		char c3 = 'B';
		System.out.println("c3 - c1: "+ (c3 - c1));
		
		
		// l또는 l을 붙이면 명시적인 long
		long l1 = 2200000000L;
		long l2 = 30;
		
		String s1 = "송상민";
	    System.out.println("s1: "+ s1);
	    
	    String s2 = "송\"상민\"";
	    System.out.println("s2: "+ s2);
	    
	    String s3 = "\\송\t상\n민";
	    System.out.println("s3: "+ s3);
	    
	    System.out.println("글씨"+3);
	    System.out.println("글씨"+ 3 + 2); // 글씨 32
	    System.out.println("글씨"+ (3 + 2)); // 글씨 5
	    System.out.println(3 + 2 + "글씨"); // 5글씨
	    
//	    int a = 3.14;
	    
	    float f1 = 3.14f;
	    System.out.println("f1: "+ f1);
	    
	    double d1 = 3.14;
	    System.out.println("d1: "+ d1);
	    
	    float f2 = 0.1234567890123f;
	    System.out.println("f2: "+ f2);
	    //float의 정밀도 : 소수점 7자리
	    
	    double d2 = 0.12345678901234567890;
	    System.out.println("d2: "+ d2);
	    // double의 정미도 : 소수점 16자리
	    
	    double d3 = 5e3;
	    System.out.println("d3: "+ d3);
	    
	    boolean stop = true;
	    boolean start = false;
	    System.out.println("stop: "+ stop);
	    
	    //문제1
	    String age = "25";  // 나이를 숫자로 정렬
	    System.out.println("나이: " + age);
	    
	   // 문제2
	   boolean license = false;
	   System.out.println("운전면허: " + "있다");
	   
	   // 문제3
	   int count = 1;
	   System.out.println(count);
	   
	   // 문제4
	   String name = "송상민";
	   System.out.println(name);
	   
	   // 문제5
	   double py = 3.3;
	   System.out.println(py * 5);
	   
	   // 문제6-1
	   int x = 3;
	   int y = 4;
	   System.out.println(x + ">" + y + "결과는" + (x > y));
	   
	   // 문제6-2
	   int X = 4;
	   int Y = 3;
	   System.out.println(x + ">" + y + "결과는" + (x > y));
	   
	   // 문제 7
	   int num = 149;
	   int hundred = num / 100;
	   int ten = (num / 10) % 10;
	   int one = num % 10;
	   System.out.println("백의자리: " + hundred);
	   
	   
	   //문제 8
	   int 회식비 = 43000;
	   int 참석인원 = 4;
	   int 인당금액 = 회식비 / 참석인원 ;
	   System.out.println(43000 / 4);
	   
	   // 8-1 문제
	   int 회식비1 = 43000;
	   int 참석인원1 = 4;
	   int 인당금액1 = 회식비1 / 참석인원1;
	
	   System.out.println("인당금액: " + 인당금액1 + "원");
	   
	   // 8-2 문제
	   int 회식비2 = 43000;
	   int 참석인원2 = 4;
	   
	   int 인당금액2 = 회식비2 / 참석인원2;
	   int 만원단위 = (인당금액 / 10000) * 10000;
	   System.out.println(만원단위);
	   
	   //8-2-1 문제
	   int 회식비3 = 43000;
	   int 참석인원3 = 4;
	   
	   int 인당금액3 = 회식비3 / 참석인원3;
	   int 만원단위3 = (인당금액 / 10000) * 10000;
	   
	   int collected = 만원단위 * 참석인원3;
	   int 주최자 = 회식비3 - 참석인원3;
	   
	   System.out.println(주최자);
	   
	   // 문제 9
	   String left = "오예스";
	   String right = "사탕";
	   
	   String temp = left;
	   left = right;
	   right = temp;
	   
	   System.out.println("left: " + left);
	   System.out.println("riht: " + right);
	   
	   int 사과개수 = 12;
	   int 사람수 = 3;
	   int 인당사과 = 사과개수 / 사람수;
	   System.out.println(인당사과);
	   
	   int 사탕개수 = 10;
	   int 사람수1 = 3;
	   
	   int 나머지 = 사탕개수 % 사람수1;
	   System.out.println(나머지);
	   
	   int 연필개수 = 25;
	   int 학생수 = 4;
	   int 인당연필 = 연필개수 / 학생수;
	   System.out.println(인당연필);
	}

}
