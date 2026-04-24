package chap04;

import java.util.Scanner;

public class BreakExam_05 {

	public static void main(String[] args) {
		
		int count = 0;
		while(true) {
			int num = (int) (Math.random()*6)+1;
			System.out.println("주사위: "+ num);
			if(num == 6) {
				break;
			}
			count++;
		}
		System.out.println("게임종료 : 총 :"+ count);
		
		// 총 5명이 순차적으로 주사위를 던져서
		// 각자 6명이 나올 때 까지 6이 나오면 다음사람
		for(int i=1; i<=5; i++) {
			
			while(true) {
				int num = (int) (Math.random()*6)+1;
				System.out.println("주사위: "+ num);
				
				if(num == 6) {
					break; // while 소속이라서 while 중단
				}
			}
		}
		
		// 총 4층의 주차건물이 있음
		// 각 층에는 10대의 자리가 있음
		// 내 차는 1층 첫번째부터 17번째에 있음
		int count2 = 0;
		boolean flag = false;
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<10; j++) {
				count2++;
				System.out.println(i +", "+ j);
				if(count2 == 17) {
					System.out.println("!!!!!!!!!!");
					flag = true;
					break;
				}
			}
			
			if(flag) {
				break;
			}
		}
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		// 문제1
		// 은행 ATM 만들기
		// 1-1 : 책 814p 처럼 만들기
		// 1-2
		//      예금 : 음수 불가
		//      출금 : 음수 불가 + 찬고초과 불가
		//      메뉴 외 선택 불가
		
		// 문제 1-1
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		int menu;
		
		while (true) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.println("선택> ");
			
			menu = sc.nextInt();
			
			if (menu == 1) {
				System.out.print("예금액> ");
				int input = sc.nextInt();
				money += input;
				
			} else if (menu == 2) {
				System.out.println("출금액> ");
				int input = sc.nextInt();
				money -= input;
				
			} else if (menu == 3) {
				System.out.println("잔고>" + money);
				
			} else if (menu == 4) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		// 문제 1-2
		Scanner sc1 = new Scanner(System.in);
		

		int money1 = 0;
		int menu1;
		
		while (true) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.println("선택> ");
			
			menu = sc.nextInt();
			
			if (menu < 1 || menu > 4) {
				System.out.println("메뉴를 다시 선택 하세요");
				continue;
			}
			
			if (menu == 1) {
				System.out.println("예금액> ");
				int input = sc.nextInt();
				
				if (input < 0) {
					System.out.println("음수불가");
				} else {
					money += input;
				}
			} else if (menu == 2) {
				System.out.println("출금액> ");
				int input = sc.nextInt();
				
				if (input < 0) {
					System.out.println("음스불가");
				} else if (input > money) {
					System.out.println("잔고가부족합니다");
				} else {
					money -= input;
				}
			} else if (menu == 3) {
				System.out.println("잔고>" + money);
				
			} else if (menu == 4) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
