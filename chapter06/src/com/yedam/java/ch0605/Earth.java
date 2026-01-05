package com.yedam.java.ch0605;

public class Earth {
	// 불변성을 가진 데이터 => 상수 (기본타입)
	// 정적필드 + final, 이름 = 대문자 + 스네이크 표기법
	static final double EARTH_RADIUS = 6400;
	final static double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	
	//인스턴스 필드 + final => 인스턴스 별로 고정값을 가져야하는 경우
	final String name;
	//public Earth() {}; //임마는 final로 선언된 name의 값을받을 수 없어서 에러가 터짐
					     //그렇다면 public Earth() {};는 언제쓸 수 있느냐 ? 무조껀 name이 채워져있을때
	public Earth(String name){
		this.name = name;
	}
}
