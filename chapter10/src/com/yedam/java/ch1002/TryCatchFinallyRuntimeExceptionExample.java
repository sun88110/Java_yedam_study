package com.yedam.java.ch1002;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (Exception e) {
			System.out.println("히토노 유메와 오와라나이!!!!");
			return;
		}finally { // 무조껀 실행하도록 보장됨 return이 있어도 무시하고 실행함
			System.out.println("신데시맛탄다!");
		}
	}

}
