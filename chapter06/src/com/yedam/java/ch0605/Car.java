package com.yedam.java.ch0605;

public class Car {
	int speed; // 인스턴스 필드
	
	void run(){ // 인스턴스 메소드
		System.out.println(speed + "으로 달립니다.");
		testMethotd();
	}
	
	public static void testMethotd() {};
	// 정적 메소드 : 인스턴스 멤버를 사용불가
	public static void main(String[] args) { // 정적 메소드
		//speed = 60;
		//run();
		testMethotd();
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}
