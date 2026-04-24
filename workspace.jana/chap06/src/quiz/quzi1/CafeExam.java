package quiz.quzi1;

import java.util.Scanner;

public class CafeExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cafe cafe = new Cafe("별다방");
		
		while (true) {
			System.out.println("\n1. 주문하기");
			System.out.println("2. 다시 처음부터");
			System.out.println("0. 종료");
			System.out.println("메뉴를 선택해주세요");
			
			int menu = sc.nextInt();
			
			if (menu == 0) {
				System.out.println("메뉴 선택이 종료 되었습니다");
			}
			
			if (menu == 2) {
				cafe.reset();
				continue;
			}
			
			if (menu == 1) {
				cafe.reset();
				
				System.out.println("커피 종류를 선택해주세요");
				System.out.println("1. 아메리카노");
				System.out.println("2. 카푸치노");
				System.out.println("메뉴를 선택해주세요");
				cafe.selectCoffeeType(sc.nextInt());
				
				System.out.println("상세 선택");
				System.out.println("1. 2샷 추가 (+300");
				System.out.println("2. 시럽추가 (+500");
				System.out.println("3. 없음");
				System.out.println("선택");
				cafe.selectCoffeeType(sc.nextInt());
				
				cafe.printOrder();
				
				System.out.println("최종 가격 : " + cafe.getTota1price() + "원");
			}
		}
		
	}

}
