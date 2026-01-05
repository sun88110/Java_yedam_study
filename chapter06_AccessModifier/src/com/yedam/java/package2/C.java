package com.yedam.java.package2;

import com.yedam.java.package1.A;
import com.yedam.java.package1.B;

public class C {
	// A a; // default로 선언된 경우 다른 패키지에선 없는 존재
	B b; // public으로 선언된 경우 어디서든 자유롭게 접근 가능
	
	// A a1 = new A(true);
	//A a2 = new A(1);
	//A a3 = new A ("문자열");
	
	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1;
		//a.field3 = 1; //-> private으로 클래스 외부에선 사용 불가
		
		a.method1();
		//a.method2();
		//a.method3(); //-> private으로 클래스 외부에선 사용 불가
	}
}
