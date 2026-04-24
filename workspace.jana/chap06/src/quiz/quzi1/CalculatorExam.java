package quiz.quzi1;

class CalculatorExam {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator(); // 계산기 생성자
		
		cal.calc(20, "+", 10);
		cal.calc(30, "-", 20);
		cal.calc(50, "*", 30);
		
		cal.showlog();

	}

}
