package com.javaex.ex04;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int code;
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		code = sc.nextInt();
		
		if(code%3==0) {
			System.out.println("A팀입니다.");
		}
		else if(code%3==1) {
			System.out.println("B팀입니다.");
		}
		else if(code<0) {
			System.out.println("잘못입력하셨습니다.");
		}
		else {
			System.out.println("C팀입니다.");
		}
		
		
		sc.close();
	}

}
