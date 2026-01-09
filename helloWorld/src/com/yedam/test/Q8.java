package com.yedam.test;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------------");
			System.out.print("선택 : ");
			String inputData = scanner.nextLine();
			switch (inputData) {
			case "1":
				System.out.print("예금액 : ");
				balance += Integer.parseInt(scanner.nextLine());
				continue;
			case "2":
				System.out.print("출금액 : ");
				int value = Integer.parseInt(scanner.nextLine());
				if (balance < value) {
					System.out.println("잔액이 부족합니다!");
					System.out.println("출금 가능액 : " + balance + "원");
				}else {
					balance -= value;
				}
				continue;
			case "3":
				System.out.print("현재 잔액 : " + balance + "원");
				System.out.print("\n");
				continue;
			case "4":
				run = false;
				break;
			default:
				System.out.println("메뉴를 잘못 입력했습니다.");
			}
		}
		System.out.println("이용해 주셔서 감사합니다!");
		scanner.close();
	}
}

