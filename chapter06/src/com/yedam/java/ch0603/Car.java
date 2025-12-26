package com.yedam.java.ch0603;
// 라이브러리 클래스 : 내부에 main 메소드가 없음, 실제 객체를 정의ㄴ
public class Car {
	// 필드 : 객체의 정보(속성)
	//제조사
	String company = "현대자동차";
	// 모델
	String model = "그랜저";
	// 색깔
	String color = "검정";
	// 최대속도
	int maxSpeed;
	// 현재속도
	int currentSpeed; // 임마는 상태 값임
	
	// 생성자 : 리턴타입이 없고 고유이름 대신 클래스명을 대신 사용 
	//		=> 인스턴스 생성 시 초기값 설정이 목적
	public Car(String model, String color) {
		this.company = "현대자동차";
		this.model = model;
		this.color = color;
	}
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}
	public Car(String model, String color, int maxSpeed) {
		this.company = "현대자동차";
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	// => 생성자 오버로딩 : 매개변수의 데이터타입 구성이 다르게 해서
	//				 	다양한 형태의 인스턴스를 만들 수 있는 여러 생성자 지원
	
	// 기본생성자는 클래스 내부에 생성자가 하나도 없을 경우에만 자동추가
}
