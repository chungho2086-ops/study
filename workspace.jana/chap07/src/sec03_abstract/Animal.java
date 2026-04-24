package sec03_abstract;

public abstract class Animal {
	
	void breathe() {
		System.out.println("숨쉬어 숨쉬어");
		
	}
	abstract void sound();
	
	String Kind;
	Animal(){
		System.out.println("Animal 생성자 실행");
	}
}