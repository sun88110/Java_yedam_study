package com.yedam.test;

import java.util.Scanner;

public class Exam223 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			boolean run = true;
			int studentNum = 0;
			int[] scores = null;
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
					scores = new int[studentNum];
					break;
				case "2":
					if(studentNum == 0) {
						break;
					}
					for(int i = 0; i < studentNum; i++) {
						System.out.print("scores" + "[" + i + "] > ");
						scores[i] = Integer.parseInt(scanner.nextLine());
					}
					break;
				case "3":
					if(studentNum == 0) {
						break;
					}
					for(int i = 0; i < studentNum; i++) {
						System.out.println("scores" + "[" + i + "] > " + scores[i] );
					}
					break;
				case "4":
					if(studentNum == 0) {
						break;
					}
					for(int i= 0; i < studentNum; i++) {
						if(scores[i] > best) {
							best = scores[i];
						}
						avg += scores[i];
					}
					System.out.println("최고 점수> " + best);
					System.out.println("평균 점수> "+ avg/scores.length);
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