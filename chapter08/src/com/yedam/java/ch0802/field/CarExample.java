package com.yedam.java.ch0802.field;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.run();
		System.out.println();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontrightTire = new KumhoTire();
		myCar.run();
	}

}
