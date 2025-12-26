package com.yedam.java.ch0601;

public class Card {
	//필드	
	//카드종류 : 마스터, 비자, 국내용
	String type;
	//카드사	 : 신한, 카카오, 국민, 삼성, 현대
	String company;
	//카드번호
	String cardNo;
	//유효기간 : 년/월
	String period;
	//CVC
	int cvc;
	//사용자 영문명
	String userName;
	// 결제대금
	int amount = 0;
	// 교통대금
	int transportAmount = 0;
	
	Card(String cardNo, String period, int cvc, String userName){
		this.type = "마스터";
		this.type = "삼성";
		this.cardNo = cardNo;
		this.period = period;
		this.cvc = cvc;
		this.userName = userName;
	}
	// 결제
	void payment(int price) {
		this.amount += price;
	}
	// 지급
	void bill() {
		this.amount = 0;
	}
	// 교통카드
	void transport(String type) {
		if(type.equals("버스")){
			this.transportAmount += 1500;
		}else {
			this.transportAmount += 2000;
		}
	}
}
