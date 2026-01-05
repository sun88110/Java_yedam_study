package com.yedam.java.ch0802.parameter;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		System.out.println();
		driver.drive(new Taxi());
	}

}
