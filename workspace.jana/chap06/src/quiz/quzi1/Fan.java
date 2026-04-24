package quiz.quzi1;

public class Fan {

	boolean power = false;
	
	// 전원을 켰다
	void powerOn() {
		power = true;
		System.out.println("선풍기 전원이 켜졌습니다");
	}
	
	// 전원을 껐다
	void powerOff() {
		power = false;
		System.out.println("선풍기 전원이 꺼졌습니다");
	}
	
	// 약풍이 나오게하자
	void lightwind() {
		if (power == true) {
			System.out.println("약풍이 나왔습니다");
		} else {
			System.out.println("전원을 키세요");
		}
	}
	
	// 강풍이 나오게 하자
	void gale() {
		if (power == true) {
			System.out.println("강풍이 나왔습니다");
		} else {
			System.out.println("전원을 키세요");
		}
	}

}
