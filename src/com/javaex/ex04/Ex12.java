package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		String code = sc.nextLine();
		
		switch(code) {
		case "a":
			System.out.println("모음입니다.");
			break;
		case "e":
			System.out.println("모음입니다.");
			break;
		case "i":
			System.out.println("모음입니다.");
			break;
		case "o":
			System.out.println("모음입니다.");
			break;
		case "u":
			System.out.println("모음입니다.");
			break;
		default:
			System.out.println("자음입니다.");
			break;
		}
		
		
		
		sc.close();
	}

}
