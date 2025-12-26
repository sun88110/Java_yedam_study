package com.yedam.java.ch0604;

public class Car {
	//필드
	int speed;
	
	//생성자
	
	
	//메소드
	int getSpeed() {
		return this.speed;
	}
	
	void keyTurnOn() {
		System.out.println("시동을 겁니다.");
	}
	
	void setSpeed(int speed) {
		this.speed += speed;
		if(speed < 0) {
			this.speed = 0;
		}
	}
	
	void run() {
		for(int i=10; i <= 50; i+=10) {
			this.setSpeed(i);
			System.out.printf("달립니다. (시속: %dkm/h)\n", this.getSpeed());
		}
	}
}
