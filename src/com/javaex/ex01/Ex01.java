package com.javaex.ex01;

public class Ex01 {
	
	public static void main(String[] args) {
	
		
		byte myAge;
		myAge = 25;
		System.out.println(myAge);
		
		myAge = 26;
		System.out.println(myAge);
		
		
		//정수형
		
		//자료형(int 를 정확하게 써야한다.)
		int var01 = 3;
		double var02 = -3.4;
		
		//메모리 크기 확인
		int var03 = 12345678;
		//byte var04 = 12345678; //범위를 벗어남
		//short var05 = 12345678; //범위를 벗어남
		long var06 = 12345678l;
		System.out.println(var02);
		
		//long형
		//int var07 = 2147483648; //int 의 범위보다 큰값
		
		long var08 = 2147483648l; //long 형에 대입이 안됨??? --> L 기호를 붙여야함
		
		long var09 = 2147483647l;
		
		
	}
	

}
