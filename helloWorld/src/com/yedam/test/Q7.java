package com.yedam.test;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int ran = (int) (Math.random() * 50) + 1;
		int ans = 0;
		//System.out.println(ran);
		
		while (true) {
			System.out.print("숫자 입력 :  ");
			ans = Integer.parseInt(scanner.nextLine());
			if(ans > ran) {
				System.out.println("down하세요!!");
				continue;
			}else if(ans < ran) {
				System.out.println("up하세요!!");
				continue;
			}else if(ans == ran) {
				System.out.println("축하합니다!!");
				break;
			}
		}
		scanner.close();

	}

}
