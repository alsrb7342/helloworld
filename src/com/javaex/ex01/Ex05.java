package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args){
		
		
		final double pi = 3.14;
		
		//일반적인 경우
		double result01 = pi*5*5;
		System.out.println(result01);
		
		//pi값을 병경하는 경우
		//pi = 3.141519;  //상수로 정의되면 오류발생
		double result02 = pi*5*5;
		System.out.println(result02);
		
		System.out.println(pi);
		
		//상수정의
		final double PI = 3.14;
		
		
		double result03 = PI*5*5;
		System.out.println(result03);
		
		int num1 = 1;
		float num2 = 1.0F;
		float result = num1 + num2;
		System.out.println(result);
		
		int num3 = 4;
		float num4 = 5.5F;
		float result04 = num3+num4;
		System.out.println(result04);
		
		
		
	}

}
