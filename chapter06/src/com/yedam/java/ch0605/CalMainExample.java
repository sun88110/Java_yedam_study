package com.yedam.java.ch0605;

public class CalMainExample {

	public static void main(String[] args) {
		System.out.println("PI : " + Calculator.pi);
		int result = Calculator.plus(10, 5);
		System.out.println(" + : " + result);
		result = Calculator.minus(10, 5);
		System.out.println(" - : " + result);
		
		Calculator cal = new Calculator();
		System.out.println(cal.type);
		Calculator.pi = 3.14;
		System.out.println("PI : " + Calculator.pi);
	}

}
