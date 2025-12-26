package com.yedam.java.ch0601;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card bae = new Card("12345678", "30/12", 598, "Bae");
		Card kim = new Card("98765432", "30/12", 753, "Kang");
		
		bae.transport("버스");
		bae.payment(15000);
		bae.payment(4500);
		System.out.println("bae > ");
		System.out.println("\t결제대금 : " + bae.amount);
		System.out.println("\t교통사용대금 : " + bae.transportAmount);
		System.out.println("\t카드번호 : " + bae.cardNo);
		
		kim.transport("지하철");
		kim.payment(32000);
		System.out.println("kim > ");
		System.out.println("\t결제대금 : " + kim.amount);
		System.out.println("\t교통사용대금 : " + kim.transportAmount);
		System.out.println("\t카드번호 : " + kim.cardNo);
	}

}
