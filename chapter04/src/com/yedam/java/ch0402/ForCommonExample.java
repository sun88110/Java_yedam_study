package com.yedam.java.ch0402;

public class ForCommonExample {

	public static void main(String[] args) {
		// for문 1) 반복횟수 2) 무한루프에 빠질 위험이 적음
		// 정수 1 ~  10까지 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 실수 0.1 ~ 1.0까지 출력
		for(float i = 0.1f; i <= 1.0f;  i += 0.1f ) {
			System.out.println(i);
		}
	}
}
