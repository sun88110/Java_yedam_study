package com.yedam.java.ch1102;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		System.out.println(now);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String newDate = sdf.format(now);
		System.out.println(newDate);

		// 문자열=> 날짜로 변환
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String dateStr = "20251231";
		try {
			Date date = format.parse(dateStr);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
