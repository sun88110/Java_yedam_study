package com.yedam.java.ch0502;

public class MultiArayExample {

	public static void main(String[] args) {
		// 다차원배열 => 참조타입배열
		String[] strAray = { "신용권", "이자바" };
		for (String text : args) {
			System.out.println(text);
		}
		// 2차원배열
		int[][] intAry = null;
		intAry = new int[][] { { 1, 2 }, { 3, 4, 5 } , {6}};
		for (int i = 0; i < intAry.length; i++) {
			int[] currentAry = intAry[i];
			for (int j = 0; j < currentAry.length; j++) {
				int curVal = currentAry[j];
				System.out.printf("[%d][%d] : %d\n", i, j, curVal);
			}
		}
		intAry = new int[2][0];
		intAry[0] = new int[] {1,2};
		intAry[1] = new int[] {3,4,5};
		for (int i = 0; i < intAry.length; i++) {
			int[] currentAry = intAry[i];
			for (int j = 0; j < currentAry.length; j++) {
				int curVal = currentAry[j];
				System.out.printf("[%d][%d] : %d\n", i, j, curVal);
			}
		}
	}
}
