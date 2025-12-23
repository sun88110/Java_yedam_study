package com.yedam.java.ch0204;

import java.util.Scanner; //JDK 내장 라이브러리

public class ScannerCommonExample {

	public static void main(String[] args) {
		// 표준입력장치를 통해 값을 읽어들이는객체
		Scanner scanner = new Scanner(System.in);
		
		
		String inputData = scanner.nextLine(); // nextLine() : 읽어들이는 메서드
		System.out.println(inputData);
		
		System.out.println("프로그램 종료");
		scanner.close();
	}

}