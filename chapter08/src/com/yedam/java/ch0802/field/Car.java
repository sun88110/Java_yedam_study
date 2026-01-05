package com.yedam.java.ch0802.field;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontrightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontrightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
