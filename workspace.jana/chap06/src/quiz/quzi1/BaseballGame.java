package quiz.quzi1;

import java.util.Scanner;
import java.util.Random;

public class BaseballGame {
	
	private int[] answer;
	private Scanner scanner;
	private int count;
	
	public BaseballGame() {
	        answer = generateNumber();
	        scanner = new Scanner(System.in);
	        count = 0;
   }
	
	public int[] generateNumber() {
        int[] numbers = new int[3];
        Random random = new Random();

        int index = 0;
        while (index < 3) {
            int num = random.nextInt(9) + 1;

            boolean isSame = false;
            for (int i = 0; i < index; i++) {
                if (numbers[i] == num) {
                    isSame = true;
                    break;
                }
            }

            if (!isSame) {
                numbers[index] = num;
                index++;
            }
        }

        return numbers;
    }

   
    public void play() {
        System.out.println("[ 야구 게임을 시작합니다]");

        while (true) {
            System.out.print("숫자 3개를 입력하세요 : ");
            int[] user = new int[3];

            for (int i = 0; i < 3; i++) {
                user[i] = scanner.nextInt();
            }

            count++;
            int strike = checkScore(user);

            if (strike == 3) {
                System.out.println(" 정답을 맞히셨습니다!");
                System.out.println(" 횟수: " + count + "번");
                break;
            }
        }
    }

   
    public int checkScore(int[] user) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (user[i] == answer[j]) {
                    if (i == j) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }

        if (strike == 0 && ball == 0) {
            System.out.println("결과: 아웃");
        } else {
            System.out.print("결과: ");
            if (strike > 0) {
                System.out.print(strike + " 스트라이크 ");
            }
            if (ball > 0) {
                System.out.print(ball + " 볼");
            }
            System.out.println();
        }

        return strike;
    }
}


