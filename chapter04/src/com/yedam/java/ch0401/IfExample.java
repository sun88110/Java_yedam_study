package com.yedam.java.ch0401;

public class IfExample {

	public static void main(String[] args) {
		// if문
		int score = 93;
		
		if(score >= 90){
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다.");
		}
		
		// IF ~ ELSE 문 : 조건식이 참과 거짓, 각각 확인
		if(score >= 60) {
			System.out.println("점수가 60점 이상입니다.");
			System.out.println("해당 과목은 통과되었습니다.");
		}else { // 위에 선언된 모든 조건식을 만족하지않는 경우
			System.out.println("점수가 60점 미만입니다.");
			System.out.println("해당 과목은 재수강 대상입니다.");
		}
		
		// IF ~ ELSE IF ~ ELSE 문 : 다중조건문
		if(score >= 90) {
			System.out.println("과목 등급은 A 입니다");
		}else if(score >= 80) {
			System.out.println("과목 등급은 B 입니다");
		}else if(score >= 70) {
			System.out.println("과목 등급은 C 입니다");
		}else if(score >= 60) {
			System.out.println("과목 등급은 D 입니다");
		}else {
			System.out.println("과목 등급은 F 입니다");
		}
		
	}
}
