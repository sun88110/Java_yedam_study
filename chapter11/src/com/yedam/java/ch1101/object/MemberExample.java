package com.yedam.java.ch1101.object;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		
		if(obj1 == obj2) {
			System.out.println("오나지");
		}else {
			System.out.println("소레소레노모노");
		}
		
		if(obj1.equals(obj2)) {
			System.out.println("오나지모노");
		}else {
			System.out.println("소레소레");
		}
	}

}
