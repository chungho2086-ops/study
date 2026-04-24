package quiz.quzi1;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		
		 // 문제8
        // Up/Down 게임
        // 1~10까지 어떤 정답이 있을 때(random)
        // 사용자의 입력에 따라(Scanner)
        // 정답보다 큰 숫자면 Down
        // 정답보다 작은 숫자면 Up
        // 정답과 같으면 "정답"
		
		Scanner sc = new Scanner(System.in);
		
		int answer = (int)(Math.random() * 10) + 1;
		
		int count = 0; // 횟수
		
		while (true) {
			System.out.print("숫자 입력: ");
			int user = sc.nextInt();
			count++;
			
			if (user > answer) {
				System.out.println("Down");
			} else if (user < answer) {
				System.out.println("Up");
			} else {
				System.out.println("정답");
				System.out.println(count + "번 만에 맞췄습니다");
				break;
			}
		}

	}

}
