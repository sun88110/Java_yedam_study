package com.yedam.java.ch1201.object;

import java.util.Date;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		box.setContent(new 	Date());
		Date date = (Date) box.getContent();
		box.setContent("홍길동");
		String name = (String) box.getContent();
		box.setContent(1012);
		Integer value = (Integer) box.getContent();
	}
}
