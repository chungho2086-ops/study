package quiz.quzi1;

public class TV {

	boolean power = false;
	
	int volume = 7;
	int channel = 1;
	
	void power() {
		power = !power;
	}
	
	void volumeUp() {
		if (power && volume < 10) {
			volume++;
		}
	}
	
	void voiumeDown() {
		if (power && volume >0) {
			volume--;
		}
	}
	
	void setChannel(int ch) {
		if (power) {
			channel = ch;
		}
	}
	
	void showSatus() {
		System.out.println("전원: " + power);
		System.out.println("볼륨: " + volume);
		System.out.println("채널: " + channel);
	}
	
}
