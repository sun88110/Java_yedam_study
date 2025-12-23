package com.yedam.java.ch0203;

public class ByOperationExample {
	public static void main(String[] args) {
		// 정수연산
		
		// 1) int 보다 밑의 타입을 기준으로 연산 => int 자동변환
		byte x = 30;
		byte y = 50;
		//byte z = (byte)(x + y);
		int z = x + y;
		
		// 2) long 타입이 포함될 경우 모든 long으로 자동변환
		int a = 100;
		long b = 150L;
		long c = a + b;
	}
}
