package com.yedam.java.ch1401.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		// Stream API : 컬렉션, 배열 등의 데이터 소스로부터 데이터를 받아와서
		//				원하는 형태로 가공하거나 필터링할 수 있는 기능을 제공
		
		List<Integer> evenNumbers = numbers.stream() //stream을 연다
									.filter(n -> n%2 == 0) // 중간연산 여러개를 순차적으로 진행가능
									.collect(Collectors.toList()); // 최종연산, 반환하는 형태 결정
		// 람다식 중 메소드 참조
		evenNumbers.stream().forEach(System.out::println);
	}

}
