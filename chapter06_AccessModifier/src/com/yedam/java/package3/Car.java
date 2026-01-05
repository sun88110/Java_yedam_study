package com.yedam.java.package3;

public class Car {
	// 필드 -> 일반적으로 전부 private로 선언
	private int speed;
	private boolean stop;
	
	//생성자
	
	//메소드 중 getter/setter : 필드에 직접 접근하는 메소드
	// getter/setter를 제외한 기능에 해당하는 메소드 존재
	
	// 필드 speed의 getter/setter 
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		if (speed < 0) { // speed는 음수일 수 없음.
			this.speed = 0;
			return;
		}
		this.speed = speed;
	}
	
	//필드 stop의 getter/setter
	public boolean isStop() {
		return this.stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
