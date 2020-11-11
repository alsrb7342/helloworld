package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		//산술연산자
		System.out.println("산술연산자");
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("=======");
		System.out.println(7.0/2.0);
		int r1 = (int) ((double)53.6 + (double)55.5);
		System.out.println(r1);
	
		//부호연산자
		int var = -3;
		System.out.println(var);
		System.out.println(-var);
		System.out.println(+var);
		
		//증감연산자
		int s1 = 3;
		System.out.println(s1);
		System.out.println(--s1);  //실제 변수 s1값이 변경된다. 7-->8 출력
		System.out.println(s1);
		
		System.out.println(b);
		System.out.println(--b);  //실제 변수 b값이 변경된다. 2-->1 출력
		System.out.println(b);
		
		System.out.println("============");
		System.out.println(a);
		System.out.println(a++);  //늦게 변한다.
		System.out.println(a);
		
		System.out.println(a--);
		System.out.println(a);
		
		int n1 = 4, n2 = 3;
		boolean result = n1 != n2;
		System.out.println(result);
		
		
	}

}
