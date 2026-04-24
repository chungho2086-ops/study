package quiz.quzi1;

public class Emp {
	
	// 사원의 기본 정보
	int empNo; // 사번
	String name; // 이름
	String position; // 직급
	int salary; // 연봉
	int bossNo; // 상사의 사번
	
	// 생성자
	// 사원을 만들 때 필요한 정보를 한번에 받는다
	Emp(int empNo, String name, String position, int salary, int boss) {
		this.empNo = empNo;
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.bossNo = bossNo;
	}
	
	// 사원 한명의 정보를 출력하는 메소드
	void printEmp() {
		System.out.println("사번: " + empNo);
		System.out.println("이름: " + name);
		System.out.println("직급: " + position);
		System.out.println("연봉: " + salary);
		System.out.println("상사의 사번: " + bossNo);
		System.out.println("-------------------------");
	}
}
