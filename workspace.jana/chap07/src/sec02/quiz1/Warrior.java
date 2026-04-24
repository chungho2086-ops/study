package sec02.quiz1;

// Character를 상속받은 전사 클래스
public class Warrior extends Character{
	
	// 전사는 기본 능력치를 정해준다
	Warrior(String name) {
		super(name, 150, 15, 6);
	}
}



