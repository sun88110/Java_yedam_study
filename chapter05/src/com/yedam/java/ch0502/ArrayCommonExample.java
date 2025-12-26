package com.yedam.java.ch0502;

public class ArrayCommonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = null; // 선언

		intArray = new int[] { 1, 3, 4 }; // 값을 갖고있는
		System.out.println("길이 : " + intArray.length);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(i + " ) " + intArray[i]);
		}
		intArray = new int[5]; // 크기만 지정된
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(i + " ) " + intArray[i]);
		}
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i * 10;
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(i + " ) " + intArray[i]);
		}
	}

}
