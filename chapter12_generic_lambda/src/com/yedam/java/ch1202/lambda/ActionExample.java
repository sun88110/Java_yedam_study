package com.yedam.java.ch1202.lambda;

public class ActionExample {

	public static void main(String[] args) {
		// 매개변수가 하나일 경우 괄호 생략가능
		Action speaker = message -> {
			String persentation = message + "를 발표합니다.";
			System.out.println(persentation);
		};
		
		speaker.speak("안녕하세요");
		
		// 실행하는 코드가 한줄일 경우 중괄호 생략가능
		speaker = message -> System.out.println(message + "를 발표합니다");
		speaker.speak("안녕하세요");
	}

}
