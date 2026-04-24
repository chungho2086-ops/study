package chap02;


import java.io.IOException;
import java.util.Scanner;

public class KeyCodleExam {

	public static void main(String[] args)  {
		
		System.out.println(1);
		System.out.println(2);
		
		System.out.print(3);
		System.out.print(4);
		
		System.out.println(5);
		System.out.println(); // <br>처럼 걍 엔터
		System.out.println(6);
		
		String name = "송상민";
		int age = 25;
		System.out.printf("이름: %s, 나이: $d\n", name, age);
		System.out.println();
		
		//////////////////////
		// 입력
//	    int KeyCode;
	    
//	    try {
//			KeyCode = System.in.read();
//		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		// 이클립스 단축키
		/*
		 * 한줄 지우기 : Ctrl + d
		 * 한줄 복사 : Ctrl + Alt + 위 아래 방향키
		 * 한줄 이동 : Alt + 위 아래 방향키
		 * 주석 단축키 : Ctrl + /
		 * 자동 정렬 : Ctrl + Shift + f
		 * import 자동 : Ctrl + Shift + o
		 */
		
		Scanner scanner = new Scanner(System.in);
		// 엔터까지의 모든 글씨
		String inputDate = scanner.nextLine();
		System.out.println("inputDate: "+ inputDate);
		
//		// 엔터쳤을 때 첫번째 뜨이쓰기 까지만
//		inputDate = Scanner.next();
//		System.out.println("inputDate: "+ inputDate);
		
		
		
		//문제
		// 나이를 입력하고 + 1 해서 출력		
		System.out.println("25");
		String age2 = scanner.nextLine();
		int age3 = Integer.parseInt(age2);
		
		int age4 = scanner.nextInt();
		
		System.out.println("내년엔 "+ (age3 + 1) +"살 입니다");
	}
}
