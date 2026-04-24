package chap04;

import java.util.Scanner;

public class ForExam_03 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			sum = sum + i;
//			sum += i;
		}
		System.out.println(sum);
		
		for(int j=1; j<10; j++) {
			System.out.println(j);
		}
		
		// 1+1+1+1+1
		// 1씩 더하는 것을 5번 하고싶다
		int sum1 = 0;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		System.out.println(sum1);
		
		// 시작 값
		// 종료 조건
		int sum2 = 0;
		for(int j=1; j<=5; j++) {
			sum2 = sum2 + 1;
		}
		System.out.println(sum2);
		
		// 1~5까지 합을 구하기
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		
		sum = 0;
		int k = 1;
		sum = sum + k;
		k++;		
		sum = sum + k;
		k++;
		sum = sum + k;
		
//		for(k=1; k<=5;) {
		for(k=1; k<=5; k++) {
			sum = sum + k; // k == 1
//			k++;
		}
		/*
		 * 반복문 만드는 원리
		 * 
		 * 1. 반복 되는 것 찾기
		 *    Ctrl+c, v 했을 때 바뀌지 않는 것 찾기
		 *    
		 * 2. 반복 되지 않는것의 
		 *    2-1. 규칙(패턴) 찾기
		 *    2-2. 변수로 바뀌서 더 이상 바귀지 않게 만들기
		 *    
		 * 3. 시작 값 파악
		 * 4. 종료 조건 파악
		 */   
		
		 // 깜짝퀴즈
		// 구구단 2단 출력
		// 2 x 1 = 2
		// 2 x 2 = 4
				
			for (int i = 1; i <= 9; i++) {
				System.out.println("2 x " + i + " = " + (2 * i));
			}				
			
			// 10부터 1까지 출력
			// 10부터 2가지 짝수만 출력
		    
			for(int i = 10; i >= 1; i--) {
				System.out.println(i);
			}
			for(int I = 10; I >= 2; I -= 2) {
				System.out.println(I);
			}
			
			// 문제1
			for (int I = 1; I <= 5; I++) {
			
				if (I % 2 == 0) {
					System.out.println(I + ": 짝수");
				} else {
					System.out.println(I + ": 홀수");
				}
			// 문제 2
				int sum3 = 0;
				int count = 0;
				
				for (int i = 1; i <= 100; i++) {
					
					if (i % 2 == 1) {
						sum3 += i;
						count++;
					}
				}
				System.out.println("홀수 합: " + sum3);
				System.out.println("홀수 개수: " + count);
			}
			// 문제 3
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자 입력: ");
			int num = sc.nextInt();
			
			int sum4 = 0;
			
			for (int i = 1; i <= num; i++ ) {
				sum += i;
			}
			System.out.println("합: " + sum);
			
			// 문제 4
			for (int i = 1; i <= 10; i++) {
				System.out.print(i + " ");
				
				if (i % 3 == 0) {
					System.out.println();
				}
			}
			// 문제 5
			for (int dan = 2; dan <= 9; dan++) {
							
				for (int i = 1; i <= 9; i++) {
					System.out.println(dan + " x " + i + " = " + (dan * i));
					System.out.println();
				}
			}
			// 문제 6 
			// 1~100까지 더하기
			int sum5 = 0;
			
			for (int i = 1; i <= 100; i++) {
				sum = sum + i;
				System.out.println("합: " + sum);
			}
			// 문제2
	        // 구구단 단마다 옆으로 출력
	        // 2x1=2 2x2=4...
	        
	        // 문제3
	        // 구구단 3단씩 옆으로 출력
	        // 2x1=2 3x1=3 4x1=4
	        // 2x2=4 3x2=6 4x2=8
	        // 2x3=6...
	        
	        // 문제4
	        // 주사위 2개를 굴려서
	        // 나올 수 있는 모든 조합 출력
	        // [1,1] [1,2] [6,6]
	        
	        // 문제5
	        // 주사위 2개를 굴려서
	        // 합 별로 출력
	        // 합2 : [1,1]
	        // 합3 : [1,2] [2,1]
	        
	        // 문제6
	        // 주사위 2개를 굴려서 나올 조합에서
	        // 중복 없이 출력
	        // 예: [1,2] [2,1] 중복이라서 [1,2] 
			
			// 문제 2
			for (int dan = 2; dan <= 9; dan++) {
				for (int i = 1; i <= 9; i++) {
					System.out.print(dan + "x" + i + "=" + (dan * i) + "  ");
				}
				System.out.println();
			}
			// 문제 3
			for (int start = 2; start <= 8; start += 3) {
				for (int i = 1; i <= 9; i++) {
					 for (int dan = start; dan < start + 3 && dan <= 9; dan++) {
						 System.out.print(dan + "x" + i + "=" + (dan * i) + "  ");
					}
					 System.out.println();
				}
				 System.out.println();
				 // 문제 4
				 for (int i = 1; i <= 6; i++) {
					 for (int j = 1; j <= 6; j++) {
						 System.out.print("[" + i + "," + j + "]");
					 }
					 // 문제 5
					 for (int sum3 = 2; sum3 <= 12; sum3++) {
						 System.out.println("합" + sum + ": ");
						 
						 for (int i2 =1; i2 <= 6; i2++) {
							 for (int j = 1; j <= 6; j++) {
								 if (i + j == sum) {
									 System.out.println("[" + i + "," + j + "] ");
								 }
							 }
						 }
						 System.out.println();
					 }
					 // 문제 6
					 for (int i3 = 1; i3 <= 6; i3++) {
						 for (int j = i + 1; j <= 6; j++) {
							 System.out.println("[" + i + "," + j + "] ");
						 }
					 }
				 }
			}
	}	
}
			
	
	  

