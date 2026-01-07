package com.yedam.java.ch1101.string;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "안녕하세요";

		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);

		try {
			// EUC-KR : 한글, 2byte로 표현 <- 임마는 표준은 아닌 임코딩 기준
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes1.length : " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR"); // 뒤에 작업하는 것도 같은 인코딩 방식
			System.out.println("bytes1->String: " + str2);
			// UTF-8 : 유니코드
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes1.length : " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8"); // 뒤에 작업하는 것도 같은 인코딩 방식
			System.out.println("bytes1->String: " + str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
