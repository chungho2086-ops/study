package quiz.quzi1;

public class Calculator {
	
	     String log = ""; // 계산을 기록합시당!!!
         
	        // 계산 메소드
		    int calc(int a, String op, int b ) {
			int result = 0;
			
			if (op.equals("+")) {
				result = a +b;
			} else if (op.equals("-")) {
				result = a - b;
			} else if (op.equals("*")) {
				result = a * b;
			} else if (op.equals("/")) {
				result = a / b;
			}
			
			// 계산을 기록한것을 저장합시다 저장안하면 로우킥10대
			log += a + " " + op + " " + b + " = " + result + "\n";
			
			return result;
		}
		
		// 이제 다했으니 출력을해서 잘 나오는지 봐야겠지?
		void showlog() {
			System.out.println("-----계산 기록-----");
			System.out.println(log);
		}
}
