package com.yedam.java.ch0402;

public class BreackContinueExample {

	public static void main(String[] args) {
		// continue <=> pass
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 1)
				continue;
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
		}

		// 중첩 반복문에서 break문;
		for (char upper = 'A'; upper <= 'Z'; upper++) {
			boolean isExited = false;
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				// 소문자 g일 경우 반복문을 종료
				if (lower == 'g') {
					isExited = true;
					break;
				}
			}
			if (isExited)
				break;
		}

		// 자바에서 제공하는 레이블
		Outter:for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				// 소문자 g일 경우 반복문을 종료
				if (lower == 'g') {
					break Outter;
				}
			}
		}
	}

}
