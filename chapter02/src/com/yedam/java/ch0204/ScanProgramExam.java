package com.yedam.java.ch0204;

import java.util.Scanner;

public class ScanProgramExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputData = null;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.printf("입력된 문자열: %s \n", inputData);
			if(inputData.equals("q")) {
				break;
			}
		}
		scanner.close();
	}

}
