package com.yedam.java.ch0302;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// 단항) 증감연산자(++/--)
		int x = 10;
		int y = 10;
		int z = 0;
		
		System.out.println("-----------------------------");
		x++; //11
		++x; //12
		System.out.println("x=" + x); // 12
		
		System.out.println("-----------------------------");
		y--; //9
		--y; //8
		System.out.println("y=" + y); // 8
		
		System.out.println("-----------------------------");
		z = x++; // 12 = 12++
		System.out.println("z=" + z); // 12
		System.out.println("x=" + x); // 13
		
		System.out.println("-----------------------------");
		z = ++x + y++; // 22 = ++13 + 8++;
		System.out.println("z=" + z); // 22
		System.out.println("x=" + x); // 14
		System.out.println("y=" + y); // 9
		
		System.out.println("-----------------------------");
	}

}
