package quiz.quzi1;

public class Emp_EmpEableExam {

	public static void main(String[] args) {
		
		EmpTable table = new EmpTable();
		
		// 사원 3명 생성
		Emp e1 = new Emp(2002, "송상민", "사원", 3500, 1000);
		Emp e2 = new Emp(2002, "송종민", "대리", 3600, 2000);
		Emp e3 = new Emp(2002, "송신실", "차장", 5000, 3000);
		
		// 사원 테이블에 사원 추가
		table.addEmp(e1);
		table.addEmp(e2);
		table.addEmp(e3);
		
		// 전체 사원 출력
		System.out.println("전체 사원 정보");
		table.printAll();
		
		// 문제 5-1 실행
		System.out.println("연봉 2000 이상 사원");
		table.prinOver5000();
		
		// 문제 5-2 실행
		System.out.println("사원 2002의 상사");
		table.prinBoss(2002);
	}
}
