package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		
		
			if(a%3==0 && a>0) {
				System.out.println("3의 배수입니다.");
				}
			else if(a%3!=0 && a>0) {
				System.out.println("3의 배수가 아닙니다.");
			}
			else if(a==0){
				System.out.println("종료");
		}
		
		
		
		
		sc.close();
		
		
		
	}

}
