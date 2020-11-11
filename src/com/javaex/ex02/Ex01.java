package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		
		String name = "최민규";
		
		System.out.println("안녕하세요."); // 안녕하세요 문자열
		System.out.println(str); //메모리 공간의 이름
		
		System.out.print("안녕");
		System.out.print("하세요");
		System.out.println("11/11");
		
		System.out.println(2+5);
		System.out.println(i+5);
		System.out.println(i+d);
		
		double result = i+d;
		System.out.println(result);
		
		System.out.println(str);
		
		String result01 = str+d;
		System.out.println(result01+str);
		
		
		System.out.println(str +" 랑 "+ i);
		
		//char
		
		System.out.println(c);
		System.out.println(c+c); //char는 숫자로 계산됨
		System.out.println(s);
		System.out.println(s+s); 
		
		//제 이름은 최민규 입니다.
		
		System.out.println("제 이름은 " + name + " 입니다.");
		
		
		//안녕하세요
		System.out.println("안녕하세요");
		
		//안녕"하"세요
		String var01 = "하";
		System.out.println("안녕\"하\"세요");
		
		//안녕\하\세요
		System.out.println("안녕\\하\\세요");
		
		//안녕    하세요
		System.out.println("안녕\t하세요");
		
		//안녕
		//하세요
		
		System.out.println("안녕\n하세요");
		
		
		
	}

}
