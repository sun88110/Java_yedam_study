package com.yedam.java.ch1201.generic;

import java.util.Date;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Date> dateBox = new Box<Date>();
		dateBox.setContent(new Date());
		Date today = dateBox.getContent();
		
		Box<String> strBox = new Box<>();
		strBox.setContent("홍길동");
		String name = strBox.getContent();
		
		Box<Integer> intBox = new Box<>();
		intBox.setContent(1012);
		Integer value = intBox.getContent();
	}

}
