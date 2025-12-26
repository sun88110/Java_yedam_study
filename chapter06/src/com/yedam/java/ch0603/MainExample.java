package com.yedam.java.ch0603;

public class MainExample {

	public static void main(String[] args) {
		//클래스 내에 생성자가 하나라도 존재한다면 따로 만들어줘야됨  (현재 Car 안에 생성자가 잇음)
		Car BaeCar = new Car("다마스", "금색");
		System.out.println("배진욱의 모델 : " + BaeCar.model + ", " + "색깔 : " + BaeCar.color);
		Car KimCar = new Car("포터2", "은색");
		System.out.println("김현태의 모델 : " + KimCar.model + ", " + "색깔 : " + KimCar.color);
		
		
		Car PakCar = new Car("진농자동차", "무스", "동색");
		System.out.println("박희찬의 제조사 : " + PakCar.company + ", " + "모델 : " + PakCar.model + ", " + "색깔 : " + PakCar.color );
	}
}
