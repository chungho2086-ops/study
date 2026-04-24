package quiz.quzi1;

import java.util.Scanner;

public class MemberExam {

    public static void main(String[] args) {

        Member[] members = new Member[2];
        members[0] = new Member("rugby", "9168");
        members[1] = new Member("rugbye", "9167");

        Scanner sc = new Scanner(System.in);

        boolean success = false;

        while (!success) {

            System.out.println("아이디 입력:");
            String inputId = sc.next();

            System.out.println("비밀번호 입력:");
            String inputPw = sc.next();

         
            for (int i = 0; i < members.length; i++) {
                if (members[i].login(inputId, inputPw)) {
                    success = true;
                    break;
                }
            }

            if (!success) {
                System.out.println("다시 로그인 하세요");
            }
        }

        System.out.println("메인 페이지");
        sc.close();
    }
}

