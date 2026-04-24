package Chap08;

public class Tv extends Display implements RemoteControl, OTT{

	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다");
		
	}
	
	int vol;

	@Override
	public void setVolume(int vol) {
		
		if(vol > RemoteControl.MAX_VOIUME) {
			vol =  RemoteControl.MAX_VOIUME;
		} else if(vol < RemoteControl.MAX_VOIUME){
			vol =  RemoteControl.MIN_VOLUME;
		}
		
		this.vol = vol;
		
		System.out.println("볼륨 변경:"+ this.vol);
		
	}

	@Override
	public void netflix() {
		System.out.println("넷플릭스 시청");
		
	}
	
}
