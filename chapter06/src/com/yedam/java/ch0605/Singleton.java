package com.yedam.java.ch0605;

public class Singleton {
	//정적 필드
	//기본적으로 자기 자신을 필드로 가짐
	private static Singleton singleton = new Singleton();
	//외부에서 new 연산자 호출 막음
	//생성자
	private Singleton() {}
	//정적 메소드에서 본인 스스로 반환
	//정적 메소드 
	static Singleton geInstance() {
		return singleton;
	}
}
