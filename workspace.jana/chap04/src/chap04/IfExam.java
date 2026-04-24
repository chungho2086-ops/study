package chap04;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		
		int score = 90;
		
		boolean over90 = score >= 90;
		
	    {
			System.out.println("항상 실행되는 실행 블럭");
		}
	    // 만약
	    if(over90) {
	   	    	System.out.println("90 이상입니다");
	    }
	    
//	    if(over90) System.out.println("90 이상입니다");
	    
	    if(score < 90) {
	    	System.out.println("90 미만입니다");
	    }
	    
	    // 정 반대 일 경우 !를 활용하는 것도 좋다
	    if( !(score >= 90) ) {
	    	System.out.println("90 미만입니다");
	    }
	    
	    
	    if( score >= 90 ) {
	   	    	System.out.println("90 이상입니다");
	    } else { // 그렇지 않으면
	    	System.out.println("90 미만입니다");
	    }
	    // else가 있으면 무조건 하나는 실행되는게 보장된다
	    
	    score = 95;
	    
	    if( score >= 90) {
	    	System.out.println("90 이상");
	    } 
	    // 이전과 관계 없이 무조건 다시 판단
	    if( (score >= 100)  && (score >= 80) ){
	    	System.out.println("80 ~ 100");
	    }
	    System.out.println("------------");	           
	    if( score >= 90 ) {
	    	System.out.println("90 이상");
//      }else if( (score < 100) && (score >= 80) ) {
//	    }else if( (score < 90) && (score >= 80) ) {	
	    } else if(score >= 80 ) {
	    	// * 위의 if나 else if가 거짓일 때만 판단한다
	    	System.out.println("90미만 80이상");
	    }  else if(score >= 70 ) {
	    	System.out.println("80미만 70이상");
	    } else {
	    	System.out.println("70 미만");
	    }
	    
	    // 97점이면
	    //      90점이상
	    //      95점이상
	    // 92점이면
	    //        90이상
	    
	    if( score >= 95 ) {
	    	System.out.println("90이상");
	    	System.out.println("95이상");
	    } else if (score >= 90) {
	    	System.out.println("90이상");
	    }
	    	  
	    if( score >= 90) {
//	    	System.out.println("90이상");
	    	if( score >= 95) {
	    		System.out.println("95이상");
	    	}
	    }
	    
	    if( score >= 90
	    	&& score >= 95 ) {
	    	System.out.println("95이상");
	    }
	    
	    int x = 3;
//	    if(/* 완성하시오 */) {
//	    if( x % 2 == 0) {
	    if( x % 2 != 1) {	
	    	System.out.println("짝수");
	    } else {
	    	System.out.println("홀수");
	    }
	    
	    // 랜덤
	    double random1 = Math.random();
	    System.out.println("random1 : "+ random1);
	    
	    // Math.random();
	    // 0 <= Math.random(); < 1
	    // 0 ~ 0.999999999999
	    
	    // 0과1을 구하는 방식
	    // 정교한 방식
	    // 0*2 <= Math.random()*2 < 1*2
	    // 0 ~ 1.999999999999
	    // int로 형변환 해서 정수만 남기기
	    double rand2 = Math.random(); // 0~0.99999
	    double temp1 = rand2 * 2; // 0~1.99999
	    int result = (int) temp1;
	    System.out.println("랜덤 홀짝");
	    if(result == 0) {
	    	System.out.println("짝수");
	    } else {
	    	System.out.println("홀수");
	    }
	    
        // 1~6까지 구하기(주사위)
	    // 0*6 <= Math.random()*6 < 1*6
	    // 0 ~ 5.99999999999999
	    // int로 바꾸고
	    // +1 하면 1 ~ 6
	    rand2 = Math.random();
	    double temp2 = rand2 * 6; // 0~5.999999999999
	    int result0 = (int)temp2; // 0~5
	    result = result0 + 1; // 1~6
	    System.out.println("주사위 결과 : "+ result);
	    
	    // 5~10까지 구하기
	    
	    rand2 = Math.random();
	    double temp3 = rand2 * 6;  // 0~5.99999999999 
	    int result1 = (int) temp2; // 0~5
	    result = result0 + 5;       // 5~10  
	    System.out.println("5~10 : " + result);
	    
	    // 변수로 범위를 잡아서 보편화
	    int min = 5;
	    int max = 10;
	    rand2 = Math.random();
	    temp2 = (int) (rand2 * (max - min + 1)) + min;
	    
	    // 쉬운 방식
	    rand2 = Math.random();
	    temp2 = rand2 * 100000;
	    result0 = (int) temp2;
	    result= (result0 % 6) + 1;
	    
	    // 로또 번호
	    // 1~45까지 6개의 숫자를 랜덤으로 뽑아서 제출 하시오
	    // 단,중복이 없이
	    
	    min = 1;
	    max = 45;
	    double rand2_1 = Math.random();
	    double rand2_2 = Math.random();
	    double rand2_3 = Math.random();
	    double rand2_4 = Math.random();
	    double rand2_5 = Math.random();
	    double rand2_6 = Math.random();
	    int temp2_1 = (int) (rand2_1 * (max - min + 1)) + min;
	    int temp2_2 = (int) (rand2_2 * (max - min + 1)) + min;
	    int temp2_3 = (int) (rand2_3 * (max - min + 1)) + min;
	    int temp2_4 = (int) (rand2_4 * (max - min + 1)) + min;
	    int temp2_5 = (int) (rand2_5 * (max - min + 1)) + min;
	    int temp2_6 = (int) (rand2_6 * (max - min + 1)) + min;
	    System.out.println("로또번호1 " + temp2_1);
	    System.out.println("로또번호2 " + temp2_2);
	    System.out.println("로또번호3 " + temp2_3);
	    System.out.println("로또번호4 " + temp2_4);
	    System.out.println("로또번호5 " + temp2_5);
	    System.out.println("로또번호6 " + temp2_6);
	    
	    
	    // 임의의 수를 입력받아
	    // 문제 1
	    // "양수", 0,  "음수" 판단하여 출력
	    // 문제 2
	    // 홀수인지 짝수인지 판단하여 출력
	    
	    // 문제3
	    // 임의의 두 수 x, y를 받아서
	    // 둘중에 큰 값 출력
	    
	    // 문제4
	    // 임의의 money를 입력 받아서
	    // 7000원 이상이면 "택시타자" 출력
	    // 7000~3000 사이면 "버스타자" 출력
	    // 3000원 미만이면 "걸어가자" 출력
	    
	    // 문제 5
	    // '가위', '바위', '보' 입력 받아서
	    // 5-1 컴퓨터는 항상 '바위'만 낼 경우
	    // 5-2 컴퓨터도 random으로
	    // '이겼다', '비겼다', '졌다' 출력
	    
	    // 문제 6
	    // 임의 세수 x, y, z를 받아서
	    // z가 x~y 사이에 있는지(포함) 판단
	    
	    // 문제 7
	    // 몇월을 입력 받아서
	    // 계절 출력
	    // 13, -1 입력하면 "정확히 입력해주세요" 출력
	    
	    // 문제 8
	    // 임의의 수를 입력받아서 다음과 같이 출력
	    // 예: 125
	    // 입력한 수는 100보다 크고, 양수이고, 홀수입니다.
	    
	    // 문제 9
	    // 온도를 입력받아서
	    // 예: -3
	    // 영하 3도 입니다
	    // 예: 5
	    // 영상 5도 입니다
	    
	    // 응용문제
	    // 문제 10
	    // 시, 분을 입력받아서 35분 후의 시, 분을 출력
	    // 3, 51을 입력받으면
	    // 4, 26분 출력
	    
	    // 문제 11
	    // 두자리 숫자를 입력받아서 
	    // 10의 자리와 1의 자리가 같은지 판단
	    // 예: 77 => 같음, 94 => 다름
	    
	    // 문제 12
	    // 1~99까지 369게임
	    // 임의의 수를 받아서 3,6,9 숫자가 있으면 "박수" 출력
	    // 없으면 그 숫자 그대로 출력
	    // 예: 33 => 박수, 31=> 박수, 12 => 12, 14 => 14
	    
	    // 문제 13
	    // 사각형의 한쪽 모서리 : x1:10, y1:20
	    // 반대편 모서리 : x2:90, y2:100
	    // 입력받은 두 수를 좌표로 하는 점이 사각형에 겹치는가
	    
	    
	    // 문제 1
	    Scanner sc = new Scanner(System.in);
      
        System.out.print("숫자: ");
        int num = sc.nextInt();
    
        if (num > 0) {
            System.out.println("양수");
        } else if (num == 0) {
            System.out.println("0");
        } else {
            System.out.println("음수");
        }

        sc.close();
        
        // 문제2
        int num1 = 7;
        
        if (num % 2 == 0) {
        	System.out.println("짝수");
        } else {
        	System.out.println("홀수");
        }
        
        // 문제 3
        int X = 10;
        int Y = 5;
        
        if (x > Y) {
        	System.out.println(x);       	
        } else {
        	System.out.println(Y);
        }
        
        // 문제 4
        int money = 5000;
        if (money >= 7000) {
        	System.out.println("택시타자");
        } else if (money >= 3000) {
        	System.out.println("버스타자");
        } else {
        	System.out.println("걸어가자");
        }
        
        // 문제 5
        String user = "가위";
        
        int r = (int)(Math.random() * 3);
        String com = "";
        
        if (r == 0) com = "가위";
        if (r == 1) com = "바위";
        if (r == 2) com = "보";
        
        System.out.println("나 : " + user);
        System.out.println("컴퓨터 : " + com);
        
        if (user.equals(com)) {
        	System.out.println("비겼다");
        }
        else if (user.equals("가위") && com.equals("보")) {
        	System.out.println("이겼다");
        }
        else if (user.equals("바위") && com.equals("가위")) {
        	System.out.println("이겼다");
        }
        else if (user.equals("보") && com.equals("바위")) {
        	System.out.println("이겼다");
        }
        else {
        	System.out.println("졌다");
        }
        
        // 문제 6
        int a =7;
        int b =10;
        int c =17;
        if(a>=b) {
        	
        }
        if( a <= c && c <= b) {
        	System.out.println("포함");
        } else {
        	System.out.println("포함아님");
        }
    }
	   
}


