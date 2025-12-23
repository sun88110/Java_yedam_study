package com.yedam.test;

public class Hello {
	// 외부의 전역 리턴타입 메서드 이름(매게변수)
	public static void main(String[] args) {
		// 자바 실행의 메인 메서드
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

		// 183page number3
		while (true) {
			int ran = (int) (Math.random() * 6) + 1;
			int ran1 = (int) (Math.random() * 6) + 1;
			System.out.println(ran + ran1);
			if(ran + ran1 == 5) {
				System.out.println(ran + ran1);
				break;
			}
		}
	}
}
