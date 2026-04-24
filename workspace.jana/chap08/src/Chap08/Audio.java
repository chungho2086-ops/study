package Chap08;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");
		
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
		
		System.out.println("오디오 변경:"+ this.vol);
		
	}
	

}
