package com.yedam.java.ch0702.field;

//부모 클래스
public class Tire {
	// 필드
	public int maxRotation;
	public int accumulatedRotaion;
	public String location;

	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메소드
	public boolean roll() {
		++accumulatedRotaion;
		if (accumulatedRotaion < maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation - accumulatedRotaion) + "회");
			return true;
		} else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
}
