package com.yedam.java.ch1002;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.printf("%d + %d = %d\n", value1, value2, result);
			}
		catch(NumberFormatException e) {
			System.out.println("문자발견");
//		}catch(RuntimeException e) {
//			System.out.println("런타임에러");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("매개매개매개");
//		catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		}finally {
			System.out.println("!!");
		}
	}
}
