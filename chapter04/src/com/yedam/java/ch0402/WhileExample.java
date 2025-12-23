package com.yedam.java.ch0402;

public class WhileExample {
	public static void main(String[] args) {
		// while 1) 횟수제한없이 조건에 따라 반복 2) 무한루프를 활용
		// 정수 1 ~ 10까지 출력
		
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		i = 1;
		while(true) {
			if(i > 10) break;
			System.out.println(i);
			i++;
		}
	}
}
