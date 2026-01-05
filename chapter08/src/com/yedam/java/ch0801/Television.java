package com.yedam.java.ch0801;

public class Television implements RemoteControl{
	//필드
	private int volume ;
	
	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다.");
	}
	//생성자
	//메소드
	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME ;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
}
