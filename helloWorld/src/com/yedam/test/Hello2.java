package com.yedam.test;

import java.util.Scanner;

public class Hello2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			String inputData = scanner.nextLine();
			switch (inputData) {
			case "1":
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
				System.out.print("\n");
				continue;
			case "2":
				System.out.print("출금액> ");
				int value = Integer.parseInt(scanner.nextLine());
				System.out.print("\n");
				if (balance < value) { // 변수에 안담아주면 안됨
					System.out.println("잔고보다 출금액이 많습니다");
				}else {
					balance -= value;
				}
				continue;
			case "3":
				System.out.print("잔액> " + balance);
				System.out.print("\n");
				continue;
			case "4":
				run = false;
				break;
			default:
				System.out.println("메뉴를 잘못 입력했습니다.");
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
