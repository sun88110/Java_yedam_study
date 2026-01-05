package com.yedam.java.ch1002;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// 특정 클래스 자체에 대한 정보를 가지는 Class 라는 클래스가 있다
		try {
		Class clazz = Class.forName("죽고말꺼다");
		clazz.getMethods(); // 특정 클래스가 갖고있는 메서드 정보자체를 끌어옴
		} catch (ClassNotFoundException e) {
			System.out.println("오이..코노사키와 지고쿠다죠..");
		}
	}

}
