package com.yedam.java.ch0401;

public class SwitchExample {

	public static void main(String[] args) {
		// Math.random() : 0 <= x < 1 , x는 실수
		int time= (int) (Math.random() * 4) + 8; // 8,9,10,11
		System.out.println("[현재시간 : " + time + " 시]");

		switch(time) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("아침회의를 합니다");
			break;
		case 10:
			System.out.println("업무를 봅니다");
			break;
		default:
			System.out.println("외근을 나갑니다");
		}
		char grade = 'b';
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("해당 등급은 점수가 90점 이상입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("해당 등급은 점수가 80점 이상입니다.");
			break;
		case 'C':
		case 'c':
			System.out.println("해당 등급은 점수가 70점 이상입니다.");
			break;
		case 'D':
		case 'd':
			System.out.println("해당 등급은 점수가 60점 이상입니다.");
			break;
		default:
			System.out.println("해당 등급은 점수가 60점 미만입니다.");
		}
		
		int score = 63;
		switch(score/10) {
		case 9:
			System.out.println("과목 등급은 A 입니다");
			break;
		case 8:
			System.out.println("과목 등급은 B 입니다");
			break;
		case 7:
			System.out.println("과목 등급은 C 입니다");
			break;
		case 6:
			System.out.println("과목 등급은 D 입니다");
			break;
		default:
			System.out.println("과목 등급은 F 입니다");
		}
	}
	
}
