package com.yedam.java.ch0501;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "신용권";
		String str2 = "신용권";
		
		str2 = "이것이 자바다";
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		int[] first = {1,2,3};
		int[] second = first;
		second[1] = 10;
		System.out.println(Arrays.toString(second));

		int[] third = null;
		//System.out.println(third.length);
		
		String name1 = new String("수@은");
		String name2 = new String("수@은");
		System.out.println("진시황: " + name1);
		System.out.println("맛당고: " + name2);
		
		if(name1 == name2) {
			System.out.println("수@은경@단 최고 권위자");	
		}else {
			System.out.println("그것은 진시황의 후예 김현태");
		}
		
		if(name1.equalsIgnoreCase(name2)){
			System.out.println("내가 진시황의 진짜 후예 ★수은☆배진욱☆경단★이오");
		}else {
			System.out.println("사실 진시황의 진짜 후예는 박희찬");
		}
	}

}
