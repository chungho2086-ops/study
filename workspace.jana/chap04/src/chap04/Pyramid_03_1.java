package chap04;

import java.util.Scanner;

public class Pyramid_03_1 {

	public static void main(String[] args) {
/*
 * ___+___
 * __+++__
 * _+++++_
 * +++++++		
 */
		// 1단계
		// +++++
		
		// 2단계
		// +_+_+_+_+_
		
		// 3단계
		// +++++
		// +++++
		// +++++
		
		// 4단계
		// 11111
		// 22222
		// 33333
		// 44444
		// 55555
		
		// 5단계
		// 1
		// 22
		// 333
		// 4444
		// 55555
		
		// 6단계
        // +
        // ++
        // +++
        // ++++
        // +++++
        
        // 7단계
        // 11111
        // 2222
        // 333
        // 44
        // 5
        
        // 8단계
        // +____
        // ++___
        // +++__
        // ++++_
        // +++++
        
        // 9단계
        // ____+
        // ___++
        // __+++
        // _++++
        // +++++
        
        // 10단계
        // ____+
        // ___+++
        // __+++++
        // _+++++++
        // +++++++++
        
        // 11단계
        // ____+____
        // ___+++___
        // __+++++__
        // _+++++++_
        // +++++++++
        
        // 12단계
        // 입력 받은 줄 수 대로 출력
        
		// 1단계
		for(int i=1; i<=5; i++) {
			System.out.print("+");
		}
		// 2단계
		for(int i=1; i<=8; i++) {
			if(i % 2 == 1) System.out.print("+");
			else System.out.print("-");
		}
		// 3단계
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("+");				
			}
			System.out.println();
		}
		// 4단계
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
			    System.out.print(i);
			}
			System.out.println();
		}
		// 5단계
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		// 6단계
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("+");
			}
			System.out.println();
		}
		// 7단계
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
			    System.out.print(i);
			}
			System.out.println();
		}
		// 8단계
		for(int i=1; i<=5; i++) {
			for(int s=1; s<=5-i; s++) {
				System.out.print("");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("+");
			}
			System.out.println();
		}
		// 9단계
		for(int i=1; i<=5; i++) {
			
			for(int s = 1; s <= 5 - i; s++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("+");
			}
			System.out.println();
		}
		// 10단계
		for(int i=1; i<=5; i++) {
			
			for(int s=1; s<=5-i; s++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("+");
			}
			System.out.println();
		}
		// 11단계
		for(int i=5; i>=1; i--) {
			
			for(int s=1; s<=5-i; s++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("+");
			}
			System.out.println();
		}
		// 12단계
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("+");
			}
			System.out.println();
		}
	}

}
