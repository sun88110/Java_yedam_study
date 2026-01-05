package com.yedam.java.ch0702.parameter;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		driver.drive(new Taxi());
		driver.drive(new Bus());
	}

}
