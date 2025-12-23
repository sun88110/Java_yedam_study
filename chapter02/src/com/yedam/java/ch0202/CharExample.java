package com.yedam.java.ch0202;

public class CharExample {

	public static void main(String[] args) {
		// char ; 유니코드
		int val = 65;
		char c1 = 65;
		
		System.out.println(val);
		System.out.println(c1);
		
		char c2 = (char)(c1 + 1);
		System.out.println(c2);
		
		int v2 = 'C';
		char c3 = 'C';
		System.out.println(v2);
		System.out.println(c3);
		
		String str = "CA";
		char[] cAry = str.toCharArray();
		System.out.println(cAry[0] + ", " + cAry[1]);
	}

}
