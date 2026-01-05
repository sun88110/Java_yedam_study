package com.yedam.java.package3;

import java.util.Scanner;

public class MainExample233 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		Example223[] scores = null;
		Scanner scanner = new Scanner(System.in);
		double best = 0;
		double avg = 0.00;
		
		while (run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택> ");
			String inputData = scanner.nextLine();
			switch (inputData) {
			case "1":
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new Example223[studentNum];
				break;
			case "2":
				if(studentNum == 0) {
					break;
				}
				for(int i = 0; i < studentNum; i++) {
					System.out.print("이름> ");
					String name = scanner.nextLine();
					System.out.print("국어점수> ");
					int korScore = Integer.parseInt(scanner.nextLine());
					System.out.print("수학점수> ");
					int mathScore = Integer.parseInt(scanner.nextLine());
					System.out.print("영어점수> ");
					int engScore = Integer.parseInt(scanner.nextLine());
					
					Example223 student = new Example223(name,korScore,mathScore,engScore);
					scores[i] = student;
				}
				break;
			case "3":
				if(studentNum == 0) {
					break;
				}
				System.out.println("이름 | 국어 | 수학 | 영어");
				for(int i = 0; i < studentNum; i++) {
					scores[i].showInfo();
				}
				break;
			case "4":
				if(studentNum == 0) {
					break;
				}
				
				int korMax = 0;
				String korName = "";
				int mathMax = 0;
				String mathName = "";
				int engMax = 0;
				String engName = "";
				
				for(int i= 0; i < studentNum; i++) {
					Example223 student = scores[i];
					if(korMax < student.getKorScore()) {
						korMax = student.getKorScore();
						korName = student.getName();
					}if(mathMax < student.getMathScore()) {
						mathMax = student.getMathScore();
						mathName = student.getName();
					}if(engMax < student.getEngScore()) {
						engMax = student.getEngScore();
						engName = student.getName();
					}
				}
				System.out.println("최대국어점수 이름 점수 :" + korName + " " + korMax );
				System.out.println("최대수학점수 이름 점수 :" + mathName + " " + mathMax );
				System.out.println("최대영어점수 이름 점수 :" + engName + " " + engMax );
				break;
			case "5":
				System.out.println("정말 종료하시겠습니까? > Y/N");
				String exit = scanner.nextLine();
				if (exit.equalsIgnoreCase("N")) {
				    break;
				} else if (exit.equalsIgnoreCase("Y")) {
				    run = false;
				    break;
				} else {
				    System.out.println("입력을 확인해주시길 바랍니다!");
				    break;
				}
			default:
				System.out.println("메뉴를 잘못 입력했습니다.");
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
