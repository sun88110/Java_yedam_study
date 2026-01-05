package com.yedam.java.ch0801;

import java.util.Scanner;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		RemoteControl rc = null;
		while (true) {
			int selected = Integer.parseInt(sc.nextLine());

			if (selected == 1) { // 페어링 1번 : TV
				rc = new Television();
				rc.turnOn();
			} else if (selected == 2) {
				rc = new Audio();
				rc.turnOn();
				rc.setVolume(12);
			} else {
				break;
			}
		}
		sc.close();
		
		Television tv = new Television();
	}

}
