package com.yedam.java.ch0605;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj1 = Singleton.geInstance();
		Singleton obj2 = Singleton.geInstance();
		
		if(obj1 == obj2) { //동등비교
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}
	}
	Car myCar = new Car();
	com.yedam.java.ch0605.Car newCar
		= new com.yedam.java.ch0605.Car();
}
