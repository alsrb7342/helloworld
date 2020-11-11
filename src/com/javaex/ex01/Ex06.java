package com.javaex.ex01;

public class Ex06 {
	
	public static void main(String[] args) {
		
		//확인
		float v1 = 12.5F;
		float v2 = v1;
		System.out.println(v1);
		System.out.println(v2);
		
		//자동형변환
		int num01 = 3;
		double num02 = 2.5;
		double result = num01+num02;
		System.out.println(result);
		
		//자동형변환2
		long num03 = 123456L;
		float num04 = 1.1F;
		float result01 = num03+num04;
		System.out.println(result01);
		
		//////////////////////////////////////////////////
		//강제형변환
		float var01 = 12.5F;
		int var02 = (int)var01;
		System.out.println(var02);
		
		int var00 = (int)12.5;
		System.out.println(var00);
		
		int i = (int)1122.42323;
		System.out.println(i);
		
		float a = (int)12.55F;
		System.out.println(a);
		byte b = 10;
		int b1 = (int)b;
		System.out.println(b1);
		
		//강제형변환: 확대변환
		
		double a1 = 5.56;
		int a2 = (int)a1;
		System.out.println(a2);	
		
		//강제형변환: 축소변환(정상)
		
		int a3 = 3;
		byte a4 = (byte)a3;
		System.out.println(a4);
		
		//강제형변환: 축소변환(비정상)
		
		int a5 = 123023290;
		byte a6 = (byte)a5;
		System.out.println(a6);
		
		//강제형변환: 실수-->정수(소수점 이하 없어짐)
		double v11 = 5.57;
		int v22 = (int)v11;
		System.out.println(v22);
		
		//강제형변환: 정수-->실수(소수점 생김)
		int c1 = 5;
		double c2 = (double)c1;
		System.out.println(c2);
		
	
	}

}
