package com.yedam.java.ch0502;

public class ArrayTestExample {

	public static void main(String[] args) {
		// 문제 : 1, 4, 9, 2, 5 중 최대값, 최소값 구하기
		int[] numArray = { 1, 4, 9, 2, 5 };
		int max = numArray[0];
		int min = numArray[0];
		float avg = 0;
		for(int i = 0 ; i <= numArray.length-1; i++) {
			int current = numArray[i];
			if(current > max) {
				max = current;
			}
			if(current < min) {
				min = current;
			}
			avg += current;
		}
		avg = avg/numArray.length;
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("평균값 : " + avg);
	}
}
