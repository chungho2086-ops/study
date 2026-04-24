package quiz.quzi1;

public class EmpTable {
    
	// 사원을 최대 10까지 저장하는 배열이다
	Emp[] emps = new Emp[10];
	int count = 0; // 현재 저장된 사원 수
	
	// 사원 추가 메소드
	void addEmp(Emp e) {
		
		// 방어코드1
		if (count >= emps.length) {
			System.out.println("사원 수 초과");
			return;
			}
		
		// 방어코드2(중복이 안되게하는 방어 코드
		for (int i = 0; i < count; i++) {
			if (emps[i].empNo == e.empNo) {
				System.out.println("이미 존재하는 사번입니다");
				return;
			}
		}
		
		emps[count] = e;
		count++;
	}
	
	// 모든 사원 정보 출력
	void printAll() {
		for (int i = 0; i < count; i++) {
			emps[i].printEmp();
		}
	}
	// 문제 6-1
	// 연봉이 5000 이상인 사원 출력
	void prinOver5000() {
		for (int i = 0; i < count; i++) {
			if (emps[i].salary >= 5000) {
				emps[i].printEmp();
			}
		}
	}
	// 문제 6-2 
	// 사원의 상사 정보 출력
	void prinBoss(int empNo) {
		int bossNo = 0; // 상사의 사번을 저장하는 변수
		
		for (int i = 0; i < count; i++) {
			if (emps[i].empNo == empNo) {
				bossNo = emps[i].bossNo;
			}
		}
		
		for (int i = 0; i < count; i++) {
			if (emps[i].empNo == bossNo) {
				System.out.println("상사의 사번");
				emps[i].printEmp();
			}
		}
	}

}
